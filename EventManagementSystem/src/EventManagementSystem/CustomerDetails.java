package EventManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SOUVON
 */
public class CustomerDetails extends javax.swing.JFrame {

    Connection connection;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String query,cusName,cusPhone,cusAddress,cusEmail,cusPassword;
    int q, i, id, deleteItem;
    public CustomerDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        soC = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cusNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CusIdTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cusEmailTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cusPhoneTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cusAddressTF = new javax.swing.JTextField();
        cusResetBtn = new rojerusan.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        cusResetBtn2 = new rojerusan.RSButtonMetro();
        cusUpdate = new rojerusan.RSButtonMetro();
        event = new rojerusan.RSButtonMetro();
        crt = new rojerusan.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(136, 84, 208));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Details");

        searchTF.setForeground(new java.awt.Color(109, 109, 109));
        searchTF.setText("Search....");
        searchTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTFKeyReleased(evt);
            }
        });

        soC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Customer Name", "Email", "Phone", "Address" }));
        soC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(soC, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Customer Name");

        cusNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Customer Id");

        CusIdTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Customer Email");

        cusEmailTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Address");

        cusPhoneTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Phone No");

        cusAddressTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cusResetBtn.setText("RESET");
        cusResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusResetBtnActionPerformed(evt);
            }
        });

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Customer Email", "Phone NO", "Address"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerTableMousePressed(evt);
            }
        });
        customerTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        cusResetBtn2.setText("Back");
        cusResetBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusResetBtn2ActionPerformed(evt);
            }
        });

        cusUpdate.setText("UPDATE");
        cusUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusUpdateActionPerformed(evt);
            }
        });

        event.setText("Event");
        event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventActionPerformed(evt);
            }
        });

        crt.setText("Create");
        crt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cusPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(cusEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(CusIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(cusNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cusAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cusResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cusResetBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(cusUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                    .addComponent(crt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CusIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cusNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cusEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cusPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cusAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusResetBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(crt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cusUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusUpdateActionPerformed
        // TODO add your handling code here:
        
         try {
            sqlConnect co = new sqlConnect();
            co.connectDB();
            Restaurant cc;
            if(CusIdTF.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(this,"ID field is required");
               return;
            } 
            
            query="Select *from Customer where C_ID = "+CusIdTF.getText();
               
            co.resultSet = co.statement.executeQuery(query);
             while(co.resultSet.next()){
            cusName=co.resultSet.getString("C_Name");
            cusPhone=co.resultSet.getString("C_Phone");
            cusEmail=co.resultSet.getString("C_Email");
            cusAddress=co.resultSet.getString("C_Address");
            
            }
           
            
            if(!(cusNameTF.getText().isEmpty()))
                cusName=cusNameTF.getText();
            if(!(cusPhoneTF.getText().isEmpty()))
                cusPhone=cusPhoneTF.getText();
            if(!(cusEmailTF.getText().isEmpty()))
                cusEmail=cusEmailTF.getText();
            if(!(cusAddressTF.getText().isEmpty()))
                cusAddress=cusAddressTF.getText();
            
            
            query="Update Customer set C_Name = '"+cusName+"' ,C_Phone = '"+cusPhone+"' ,C_Address = '"+cusAddress
                    + "' where C_ID = "+CusIdTF.getText();
            
            Statement st =co.connection.createStatement();
            st.executeUpdate(query);
          
          
            JOptionPane.showMessageDialog(this,"Customer Updated successfully!"); 
            query="Select *from Customer";
            show_Cus();
            
            
           
            }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Failed to Update Customer");
        
       }  
    }//GEN-LAST:event_cusUpdateActionPerformed

    private void cusResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusResetBtnActionPerformed
        // TODO add your handling code here:
        query="Select * from Customer";
        CusIdTF.setText("");
        cusNameTF.setText("");
        cusEmailTF.setText("");
        cusPhoneTF.setText("");
        cusAddressTF.setText("");
        show_Cus();
    }//GEN-LAST:event_cusResetBtnActionPerformed

    private void searchTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTFKeyReleased
        // TODO add your handling code here:
         if(searchTF.getText().isEmpty())
         {
            query="Select *from Customer"; 
            show_Cus();
            return; 
         }
            
        String so = soC.getSelectedItem().toString();
        if (!(searchTF.getText().isEmpty())) {
            if (so.equals("ID") && searchTF.getText().charAt(searchTF.getText().length() - 1) >= '0' && searchTF.getText().charAt(searchTF.getText().length() - 1) <= '9') {
                query = "Select *from Customer where C_ID = " + searchTF.getText();
            }
         else if (so.equals("Customer Name"))
            query = "Select *from Customer where C_Name like '" + searchTF.getText() + "%'";
        else if (so.equals("Phone"))
            query = "Select *from Customer where C_Phone like '" + searchTF.getText() + "%'";
        else if (so.equals("Email"))
            query = "Select *from Customer where C_Email like '" + searchTF.getText() + "%'";
        else if (so.equals("Address"))
            query="Select *from Customer where C_Address like '"+searchTF.getText()+"%'";
        else
            query="Select *from Customer";
       
            
        }
        
        show_Cus();
    }//GEN-LAST:event_searchTFKeyReleased

    private void soCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soCActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        // TODO add your handling code here:
        int n= customerTable.getSelectedRow();
        TableModel Model = customerTable.getModel();
        CusIdTF.setText(Model.getValueAt(n,0).toString());
        cusNameTF.setText(Model.getValueAt(n,1).toString());
        cusEmailTF.setText(Model.getValueAt(n,2).toString());
        cusPhoneTF.setText(Model.getValueAt(n,3).toString());
        cusAddressTF.setText(Model.getValueAt(n,4).toString());
        
    }//GEN-LAST:event_customerTableMouseClicked

    private void cusResetBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusResetBtn2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdminPanel().setVisible(true);
    }//GEN-LAST:event_cusResetBtn2ActionPerformed

    private void customerTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_customerTableMousePressed

    private void customerTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTableKeyPressed

    private void eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventActionPerformed
        // TODO add your handling code here:
        if(customerTable.getSelectedRow()==-1)
        {
             JOptionPane.showMessageDialog(this,"Select a customer!!!");
             return;
        }
        int n= customerTable.getSelectedRow();
        TableModel Model = customerTable.getModel();
        String cid=Model.getValueAt(n,0).toString();
        this.dispose();
        new CustomerHome(cid).setVisible(true);
    }//GEN-LAST:event_eventActionPerformed

    private void crtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crtActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new addNewCustomer().setVisible(true);
    }//GEN-LAST:event_crtActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }
    
    public ArrayList<Customer> customerList(){
        ArrayList<Customer> customerList=new ArrayList<>();
        sqlConnect co = new sqlConnect();
        co.connectDB();
        
        try {
            co.resultSet = co.statement.executeQuery(query);
            Customer cus;

            while (co.resultSet.next()) {
                cus=new Customer(co.resultSet.getInt("C_ID"),co.resultSet.getString("C_Name"),co.resultSet.getString("C_Email")
                ,co.resultSet.getString("C_Address"),co.resultSet.getString("C_Phone"));
                customerList.add(cus);
                
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return customerList;
    }
    
    public void show_Cus(){
        ArrayList<Customer>list=customerList();
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        model.setRowCount(0);
        Object[] row =new Object[5];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getCus_ID();
            row[1]=list.get(i).getCus_Name();
            row[2]=list.get(i).getCus_Email();
            row[3]=list.get(i).getCus_Phone();
            row[4]=list.get(i).getCus_Address();
            model.addRow(row);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CusIdTF;
    private rojerusan.RSButtonMetro crt;
    private javax.swing.JTextField cusAddressTF;
    private javax.swing.JTextField cusEmailTF;
    private javax.swing.JTextField cusNameTF;
    private javax.swing.JTextField cusPhoneTF;
    private rojerusan.RSButtonMetro cusResetBtn;
    private rojerusan.RSButtonMetro cusResetBtn2;
    private rojerusan.RSButtonMetro cusUpdate;
    private javax.swing.JTable customerTable;
    private rojerusan.RSButtonMetro event;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchTF;
    private javax.swing.JComboBox<String> soC;
    // End of variables declaration//GEN-END:variables

}