package EventManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class EmployeeInfo extends javax.swing.JFrame {
    public Connection connection;
     public Statement statement; 
     String selectedCat,emp_name,emp_phone,emp_salary,selectedSearchOption="Emp_ID",query;
    /**
     * Creates new form EmployeeInfo
     */
    public EmployeeInfo() {
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
        jTextField1 = new javax.swing.JTextField();
        searchOptions = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        empPhoneTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        empNameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        empSalaryTF = new javax.swing.JTextField();
        empCat = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        addEmp = new rojerusan.RSButtonMetro();
        maxx = new rojerusan.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        emp_info_table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        empIDTF = new javax.swing.JTextField();
        del = new rojerusan.RSButtonMetro();
        del1 = new rojerusan.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(10, 61, 98));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Information");

        jTextField1.setForeground(new java.awt.Color(109, 109, 109));
        jTextField1.setText("Search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        searchOptions.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee Id", "Name", "Category" }));
        searchOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Emp Name");

        empPhoneTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Emp Salary");

        empNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        empNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameTFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Emp PhoneNo");

        empSalaryTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        empSalaryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSalaryTFActionPerformed(evt);
            }
        });

        empCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chef", "Waiter", "Photographer" }));
        empCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empCatActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Emp Category :");

        addEmp.setText("UPDATE");
        addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpActionPerformed(evt);
            }
        });

        maxx.setText("Max Salary");
        maxx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxxActionPerformed(evt);
            }
        });

        emp_info_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Emp Name", "Emp PhoneNo", "Emp Salary", "Emp Category"
            }
        ));
        emp_info_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_info_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(emp_info_table);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Emp ID");

        empIDTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        empIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDTFActionPerformed(evt);
            }
        });

        del.setText("DELETE");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        del1.setText("Back");
        del1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(empSalaryTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(empNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(empPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(33, 33, 33)
                            .addComponent(empCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel3))
                    .addComponent(jLabel8)
                    .addComponent(empIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxx, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(del1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empSalaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(empCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maxx, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(del1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empCatActionPerformed
        // TODO add your handling code here:
        selectedCat=empCat.getSelectedItem().toString();
    }//GEN-LAST:event_empCatActionPerformed

    private void addEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpActionPerformed
        // TODO add your handling code here:
        emp_name=empNameTF.getText();
        emp_phone=empPhoneTF.getText();
        emp_salary=empSalaryTF.getText();
        
        
        try {
            sqlConnect co = new sqlConnect();
            co.connectDB();
            Employee emp;
            if(empIDTF.getText().isEmpty()){
            query="insert into Employees (Emp_Name,Emp_Phone,Category,Salary) values (?,?,?,?)";
            PreparedStatement pst=co.connection.prepareStatement(query);
            pst.setString(1, emp_name);
            pst.setString(2,emp_phone);
            pst.setString(3,selectedCat);
            pst.setString(4,emp_salary);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Employee added successfully!");   
            query="Select *from Employees";
            show_emp(1);
                
            }
            else 
            {   
            query="Select *from Employees where Emp_ID = "+empIDTF.getText();
               
            co.resultSet = co.statement.executeQuery(query);
            while(co.resultSet.next()){
            emp_name=co.resultSet.getString("Emp_Name");
            emp_phone=co.resultSet.getString("Emp_Phone");
            selectedCat=co.resultSet.getString("Category");
            emp_salary=co.resultSet.getInt("Salary")+"";
             }
           
            
            if(!(empNameTF.getText().isEmpty()))
                emp_name=empNameTF.getText();
            if(!(empPhoneTF.getText().isEmpty()))
                emp_phone=empPhoneTF.getText();
            if(!(empSalaryTF.getText().isEmpty()))
                emp_salary=empSalaryTF.getText();
            
            
            query="Update Employees set Emp_Name = '"+emp_name+"' ,Emp_Phone = '"+emp_phone+"' , Salary = "+emp_salary+ " where Emp_ID = "+empIDTF.getText();
            
            Statement st =co.connection.createStatement();
            st.executeUpdate(query);
          
          
            JOptionPane.showMessageDialog(this,"Employee Updated successfully!"); 
            query="Select *from Employees";
            show_emp(1);
            
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Failed to add employee");
        }
        
    }//GEN-LAST:event_addEmpActionPerformed
    
     
    private void maxxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxxActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) emp_info_table.getModel();
        model.setRowCount(0);
        show_emp(3);
       
        
    }//GEN-LAST:event_maxxActionPerformed

    private void empNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameTFActionPerformed

    private void empSalaryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSalaryTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empSalaryTFActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here
        
        
        
        
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) emp_info_table.getModel();
        model.setRowCount(0);
        show_emp(2);
       
    }//GEN-LAST:event_jTextField1KeyReleased

    private void searchOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOptionsActionPerformed
        // TODO add your handling code here:
        selectedSearchOption=searchOptions.getSelectedItem().toString();
        if(selectedSearchOption.equals("Employee Id"))
            selectedSearchOption="Emp_ID";
        else if(selectedSearchOption.equals("Name"))
            selectedSearchOption="Emp_Name";
        else if(selectedSearchOption.equals("Employee Id"))
            selectedSearchOption="Emp_ID";
        DefaultTableModel model = (DefaultTableModel) emp_info_table.getModel();
        model.setRowCount(0);
        
    }//GEN-LAST:event_searchOptionsActionPerformed

    private void emp_info_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_info_tableMouseClicked
        // TODO add your handling code here:
         int n= emp_info_table.getSelectedRow();
        TableModel Model = emp_info_table.getModel();
        empIDTF.setText(Model.getValueAt(n,0).toString());
        empNameTF.setText(Model.getValueAt(n,1).toString());
        empPhoneTF.setText(Model.getValueAt(n,2).toString());
        empSalaryTF.setText(Model.getValueAt(n,3).toString());
        
    }//GEN-LAST:event_emp_info_tableMouseClicked

    private void empIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDTFActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
       try {
            sqlConnect co = new sqlConnect();
            co.connectDB();
            query="Delete from Employees where Emp_ID = "+empIDTF.getText();
            Statement st =co.connection.createStatement();
            st.executeUpdate(query);
            
           
       }catch(Exception e){
         e.printStackTrace();
       }
            
        
    }//GEN-LAST:event_delActionPerformed

    private void del1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdminPanel().setVisible(true);
    }//GEN-LAST:event_del1ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInfo().setVisible(true);
               
               
            }
        });
       
        
    }
    public ArrayList<Employee> employeeList(int flag){
        ArrayList<Employee> employeeList=new ArrayList<>();
        sqlConnect co = new sqlConnect();
        co.connectDB();
        String query="";
        String tf1=jTextField1.getText();
        
        try {
            if(flag==1)
                query="SELECT * FROM Employees";
            else if(flag==3)
                query="Select *From Employees where Salary = (Select Max(Salary) from Employees)";
            else 
            {
               
                query="SELECT * FROM Employees where "+selectedSearchOption + " like '%"+tf1+"%'";
            }   
            co.resultSet = co.statement.executeQuery(query);
            Employee emp;

            while (co.resultSet.next()) {
                emp=new Employee(co.resultSet.getInt("Emp_ID"),co.resultSet.getString("Emp_Name"),co.resultSet.getString("Emp_Phone")
                ,co.resultSet.getString("Category"),co.resultSet.getInt("Salary"));
                employeeList.add(emp);
                
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return employeeList;
    }
    public void show_emp(int flag)
    {
        ArrayList<Employee>list=employeeList(flag);
        DefaultTableModel model = (DefaultTableModel) emp_info_table.getModel();
        model.setRowCount(0);
        Object[] row =new Object[6];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getEmp_ID();
            row[1]=list.get(i).getEmp_Name();
            row[2]=list.get(i).getEmp_Phone();
            row[3]=list.get(i).getSalary();
            row[4]=list.get(i).getCategory();
            model.addRow(row);
            
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonMetro addEmp;
    private rojerusan.RSButtonMetro del;
    private rojerusan.RSButtonMetro del1;
    private javax.swing.JComboBox<String> empCat;
    private javax.swing.JTextField empIDTF;
    private javax.swing.JTextField empNameTF;
    private javax.swing.JTextField empPhoneTF;
    private javax.swing.JTextField empSalaryTF;
    private javax.swing.JTable emp_info_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private rojerusan.RSButtonMetro maxx;
    private javax.swing.JComboBox<String> searchOptions;
    // End of variables declaration//GEN-END:variables
}