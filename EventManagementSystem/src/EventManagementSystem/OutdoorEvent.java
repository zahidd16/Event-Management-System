/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;  
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;



public class OutdoorEvent extends javax.swing.JFrame {
   String  generalQuery="Select *from Restaurant",y="%",initTime="%",initDate="December 31,7000",a="yes",x,z;
   int initCapacity=0,initCost=99999,flag=0;
   Date d;
   String cid,etype;

    /**
     * Creates new form OutdoorEventOrders
     */
    public OutdoorEvent(String cID,String type) {
        initComponents();
        this.cid=cID;
        this.etype=type;
      //  System.out.println(cid);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ccT = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nl_tf = new javax.swing.JTextField();
        c_tf = new javax.swing.JTextField();
        cost_tf = new javax.swing.JTextField();
        time_c = new javax.swing.JComboBox<>();
        nl_c = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDC = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Convention Center List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(284, 284, 284))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        ccT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Convention Center", "Location", "Capacity", "Booking Cost", "Availability"
            }
        ));
        ccT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ccTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ccT);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Search Options");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Capacity (min)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Booking Cost(max)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Time");

        nl_tf.setForeground(new java.awt.Color(102, 102, 102));
        nl_tf.setText("Enter your keyword");
        nl_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nl_tfActionPerformed(evt);
            }
        });
        nl_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nl_tfKeyReleased(evt);
            }
        });

        c_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_tfActionPerformed(evt);
            }
        });
        c_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                c_tfKeyReleased(evt);
            }
        });

        cost_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_tfActionPerformed(evt);
            }
        });
        cost_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cost_tfKeyReleased(evt);
            }
        });

        time_c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afternoon", "Evening" }));
        time_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_cActionPerformed(evt);
            }
        });

        nl_c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convention Center", "Location" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel3.setText("(*required)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel8.setText("(*required)");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nl_tf)
                    .addComponent(c_tf)
                    .addComponent(cost_tf)
                    .addComponent(time_c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nl_c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nl_c, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nl_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cost_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(time_c, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nl_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nl_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nl_tfActionPerformed

    private void c_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_tfActionPerformed

    private void cost_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cost_tfActionPerformed

    private void nl_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nl_tfKeyReleased
        // TODO add your handling code here:
        formatQuery();
      
            
    }//GEN-LAST:event_nl_tfKeyReleased

    private void c_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_tfKeyReleased
        // TODO add your handling code here:
        formatQuery();
    }//GEN-LAST:event_c_tfKeyReleased

    private void cost_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cost_tfKeyReleased
        // TODO add your handling code here:
        formatQuery();
    }//GEN-LAST:event_cost_tfKeyReleased

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseEntered

    private void time_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_cActionPerformed
                // TODO add your handling code here:
          formatQuery();
    }//GEN-LAST:event_time_cActionPerformed

    private void ccTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccTMouseClicked
        // TODO add your handling code here
        int n=ccT.getSelectedRow();
        TableModel Model = ccT.getModel();
        String id=Model.getValueAt(n,0).toString();
        String cost=Model.getValueAt(n, 4).toString();
        String resname=Model.getValueAt(n, 1).toString();
        if(!(Model.getValueAt(n, 5).toString().equals("yes")))
           return; 
        FoodPriceList fpl = new FoodPriceList(id,cost,initDate,z,etype,cid,resname);
       
        this.dispose();
        fpl.setVisible(true);
        
        
    }//GEN-LAST:event_ccTMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new EventType(cid).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void show_convetionCenters()
    {
        ArrayList<Restaurant>list=conventionCenterList();
        DefaultTableModel model = (DefaultTableModel) ccT.getModel();
        model.setRowCount(0);
        Object[] row =new Object[6];
        if(list.isEmpty() && initDate.equals("December 31,7000"))
        {
            
          JOptionPane.showMessageDialog(this,"No such Restaurant found"); 
          return;
          
        }
        if(initDate.equals("December 31,7000"))
            a="N/A";
        if(!(initDate.equals("December 31,7000"))&& flag==1)
        {
            a="no";
            if(list.size()>1)
                a="N/A";
            flag=0;
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getRes_ID();
            row[1]=list.get(i).getRes_Name();
            row[2]=list.get(i).getLocation();
            row[3]=list.get(i).getCapacity();
            row[4]=list.get(i).getBooking_Cost();
            row[5]=a;
            model.addRow(row);
            
        }
        return;
        
        }
        if((!(initDate.equals("December 31,7000"))&& flag==0))
        {   
            
            
            
                
            a="yes";
            if(list.size()>1)
                a="N/A";
            if(list.isEmpty())
            {
                flag=1;
                 formatQuery();
            }
           
            
        }
        
        
        
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getRes_ID();
            row[1]=list.get(i).getRes_Name();
            row[2]=list.get(i).getLocation();
            row[3]=list.get(i).getCapacity();
            row[4]=list.get(i).getBooking_Cost();
            row[5]=a;
            model.addRow(row);
            
        }
        if(model.getRowCount()==0 && initDate.equals("December 31,7000"))
        {
            
          JOptionPane.showMessageDialog(this,"No such Restaurant found"); 
          
        }
        
    }   
 
    private void formatQuery()
    {
        
        x = nl_c.getSelectedItem().toString();
        if(x.equals("Convention Center"))
            x="Res_Name";
        if(!(cost_tf.getText().isEmpty()))
        {
            initCost=Integer.parseInt(cost_tf.getText());
           // System.out.println(initCost+" "+cost_tf.getText());
        }  
        if(!(c_tf.getText().isEmpty()))
        {
            initCapacity=Integer.parseInt(c_tf.getText());
            //System.out.println(initCapacity+" "+c_tf.getText());
        }
        if(!(nl_tf.getText().isEmpty()))
        {
             y=nl_tf.getText()+"%";
        }
       
           
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(initDate);
        if(jDC.getDate()!=null)
        initDate=sdf.format(jDC.getDate());
          
            
        
            
        z= time_c.getSelectedItem().toString();
        //System.out.println();
        if(initDate.equals("December 31,7000")){
           generalQuery= "Select *from Restaurant where "+x+" like '"+y+"' and Capacity >= "+initCapacity+" and Booking_Cost <= "+ initCost; 
          
        }
        else if((!(initDate.equals("December 31,7000"))&& flag==0))
         generalQuery= "Select *from Restaurant where NOT EXISTS (Select R.Res_ID,O.Res_ID from Restaurant as R inner join ConfirmedEvents as O on (R.Res_ID = O.Res_ID) where O.EventTime = '"+z+"' and O.EventDate = '"+initDate+"' and R.Res_Name like '"+y+"') and "
           +x+" like '"+y+"' and Capacity >= "+initCapacity+" and Booking_Cost <= "+ initCost;
        
        else if(!(initDate.equals("December 31,7000"))&& flag==1)
        {
         
          generalQuery= "Select *from Restaurant where EXISTS (Select R.Res_ID,O.Res_ID from Restaurant as R inner join ConfirmedEvents as O on (R.Res_ID = O.Res_ID) where O.EventTime = '"+z+"' and O.EventDate = '"+initDate+"' and R.Res_Name like '"+y+"') and "
           +x+" like '"+y+"' and Capacity >= "+initCapacity+" and Booking_Cost <= "+ initCost;
          
    
        }
        
        show_convetionCenters();
        
    }
     public ArrayList<Restaurant> conventionCenterList(){
        ArrayList<Restaurant> conventionCenterList=new ArrayList<>();
        sqlConnect co = new sqlConnect();
        co.connectDB();
      
        
        try {
          
            System.out.println(generalQuery);
            co.resultSet = co.statement.executeQuery(generalQuery);
            Restaurant cc;

            while (co.resultSet.next()) {
                cc=new Restaurant(co.resultSet.getInt("Res_ID"),co.resultSet.getString("Res_Name"),co.resultSet.getString("Location")
                ,co.resultSet.getInt("Capacity"),co.resultSet.getInt("Booking_Cost"));
                conventionCenterList.add(cc);
                
              
            }
            initCost=99999;
            initCapacity=0;
            y="%";
            a="yes";
            //generalQuery="Select *from Restaurant";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conventionCenterList;
    }
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
            java.util.logging.Logger.getLogger(OutdoorEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutdoorEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutdoorEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutdoorEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutdoorEvent("1","1").setVisible(true);
                
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c_tf;
    private javax.swing.JTable ccT;
    private javax.swing.JTextField cost_tf;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nl_c;
    private javax.swing.JTextField nl_tf;
    private javax.swing.JComboBox<String> time_c;
    // End of variables declaration//GEN-END:variables
}
