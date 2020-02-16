package connector;
import java.sql.*;
import java.util.logging.Level;

public class MySqlConnector {
    //https://remotemysql.com/phpmyadmin/index.php?db=iLQs9OkNRq
    private String username = "iLQs9OkNRq";
    private String password = "Esr223CnI8";
    private String jdbcDriver = "com.mysql.jdbc.Driver";
    private String databaseUrl = "jdbc:mysql://remotemysql.com:3306/iLQs9OkNRq?autoReconnect=true&useSSL=false";
    private Connection connect;
    private Statement statement;


    public MySqlConnector() {
        connect();
    }

    private void connect(){
        try
        {
            Class.forName(jdbcDriver);
            connect=DriverManager.getConnection(databaseUrl, username, password); 
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
    private boolean checkConnection(){
        try {
            if(this.connect == null || this.connect.isClosed()){
                this.connect();
            }
            return true;
        } catch (Exception e) {
                System.err.println(e);
                return false;
        }
    }
    
    public int updateOrInsert(String query){
        try{
            if(checkConnection()){
                statement=connect.createStatement();
                int resultSet = statement.executeUpdate(query);
                this.connect.close();
                return resultSet;    
                }else{
                    throw new Exception("Connection ");
                }
            }catch(Exception ex){
                return -1;
            }
    }
    
    public boolean delete(String query){
        boolean result = false;
        try{
            if(checkConnection()){
                statement=connect.createStatement();
                result = statement.execute(query);
                this.connect.close();
            }else{
                result = false;
            }
        }catch(Exception ex){
            result = false;
        }
        return result;
    }
    
    public void close(){
            try {
                if(this.connect != null && !this.connect.isClosed()){
                    this.connect.close();
                } 
            }
            catch (SQLException ex) {
            }
    }
    
    public ResultSet runQuery(String query){
            try{
                if(checkConnection()){
                statement=connect.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                return resultSet;    
                }else{
                    throw new Exception("Connection ");
                }
            }catch(Exception ex){
                return null;
            }
    }
}
