
package watersalesproject;

import connector.MySqlConnector;
import java.sql.ResultSet;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author glsnn
 */
public class NewCustomerPage extends javax.swing.JFrame {
    
    private MySqlConnector mySqlConnector;
    private int customerID = -1;
    
    public NewCustomerPage(DefaultTableModel model, int selectedRow) {
        initComponents();
        mySqlConnector = new MySqlConnector();  
        setValues(model, selectedRow);
    }
    
    public NewCustomerPage() {
        initComponents();
        mySqlConnector = new MySqlConnector();    
    }
    
    private void setValues(DefaultTableModel model, int selectedRow){
        customerID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        TextCustomerFirstName.setText(model.getValueAt(selectedRow, 1).toString());
        TextCustomerLastName.setText(model.getValueAt(selectedRow, 2).toString());
        TextCustomerAddress.setText(model.getValueAt(selectedRow, 3).toString());
        TextCustomerPhone.setText(model.getValueAt(selectedRow, 4).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TextCustomerFirstName = new javax.swing.JTextField();
        TextCustomerLastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextCustomerPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextCustomerAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SaveCustomerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Adı");

        TextCustomerFirstName.setToolTipText("");
        TextCustomerFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCustomerFirstNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Soyadı");

        jLabel3.setText("Telefon");

        TextCustomerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCustomerAddressActionPerformed(evt);
            }
        });

        jLabel4.setText("Adres");

        SaveCustomerButton.setText("Kaydet");
        SaveCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(1, 1, 1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextCustomerLastName)
                            .addComponent(TextCustomerFirstName)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64)
                        .addComponent(TextCustomerPhone))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(SaveCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(TextCustomerAddress)))))
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextCustomerFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextCustomerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(SaveCustomerButton)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCustomerButtonActionPerformed
        int result = 0;
        String textCustomerFirstName = TextCustomerFirstName.getText();
        String textCustomerLastName = TextCustomerLastName.getText();
        String textCustomerAddress = TextCustomerAddress.getText();
        String textCustomerPhone = TextCustomerPhone.getText();
        if((textCustomerFirstName.isEmpty() || textCustomerFirstName == null ) || 
           (textCustomerLastName.isEmpty() || textCustomerLastName == null ) || 
           (textCustomerPhone.isEmpty() || textCustomerPhone == null ) ||
           (textCustomerAddress.isEmpty() || textCustomerAddress == null )){
            JOptionPane.showMessageDialog(this, "Bütün alanların doldurulması zorunludur !", "Uyarı",JOptionPane.PLAIN_MESSAGE);
        }else{
            try {
                if(customerID > -1){
                    String query = "UPDATE `customers` SET `CustomerFirstName`='"+textCustomerFirstName+"',`CustomerLastName`='"+textCustomerLastName+"',`CustomerAddress`='"+textCustomerAddress+"',`CustomerPhone`='"+textCustomerPhone+"' WHERE CustomerID=" + customerID;
                    result = mySqlConnector.updateOrInsert(query);

                }else{
                    String query = "INSERT INTO `customers`( `CustomerFirstName`, `CustomerLastName`, `CustomerAddress`, `CustomerPhone`) VALUES ('"+textCustomerFirstName+"','"+textCustomerLastName+"','"+textCustomerAddress+"','"+textCustomerPhone+"')";
                    result = mySqlConnector.updateOrInsert(query);
                }
            
                if(result > 0){
                    int input = JOptionPane.showOptionDialog(null, "Tebrikler bilgiler kayıt edildi !", "Uyarı", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    if(input == JOptionPane.OK_OPTION){
                        this.setVisible(false);
                        this.dispose();
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Bir hatayla karşılastık. Tekrar deneyiniz !", "Uyarı",JOptionPane.PLAIN_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Bir hatayla karşılastık. Tekrar deneyiniz !", "Uyarı",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_SaveCustomerButtonActionPerformed

    private void TextCustomerFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCustomerFirstNameActionPerformed
        
    }//GEN-LAST:event_TextCustomerFirstNameActionPerformed

    private void TextCustomerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCustomerAddressActionPerformed
        
    }//GEN-LAST:event_TextCustomerAddressActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewCustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCustomerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveCustomerButton;
    private javax.swing.JTextField TextCustomerAddress;
    private javax.swing.JTextField TextCustomerFirstName;
    private javax.swing.JTextField TextCustomerLastName;
    private javax.swing.JTextField TextCustomerPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}