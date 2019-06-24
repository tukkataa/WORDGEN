/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.json.simple.JSONObject;

/**
 *
 * @author Petpilin
 */
public class BailCrimesForm extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst=null;
    DataCase dc =new DataCase();


    /**
     * Creates new form BailCrimesForm
     */
    public BailCrimesForm() {
        initComponents();
        eventJStatusManage();
        RefreshData();
       
        
  
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBail = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        crimecaseno = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SuspectFullName = new javax.swing.JTextField();
        ChargeName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SuspectFullName2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ArrestDate = new javax.swing.JTextField();
        jCheckOnly = new javax.swing.JCheckBox();
        jComboStatus = new javax.swing.JComboBox<>();
        AddEditBail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(77, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ผู้ต้องหาประกันตัว");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1173, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jTableBail.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jTableBail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "เลขคดี", "คดี", "ผู้ต้องหา", "วันรับคำร้องทุกข์", "วันประกัน", "ครบ 1 เดือน", "ครบ 2 เดือน", "ครบ 3 เดือน", "ครบ 4 เดือน", "ครบ 5 เดือน", "ครบ 6 เดือน", "ครบ 1 ปี"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableBail.setGridColor(new java.awt.Color(0, 0, 0));
        jTableBail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBail);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        crimecaseno.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        crimecaseno.setBorder(null);
        crimecaseno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        crimecaseno.setEnabled(false);

        jLabel30.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jLabel30.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel30.setText("เลขคดีที่ ");

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel5.setText("ชื่อผู้ต้องหา");

        SuspectFullName.setEditable(false);
        SuspectFullName.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        SuspectFullName.setBorder(null);
        SuspectFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuspectFullNameActionPerformed(evt);
            }
        });

        ChargeName.setEditable(false);
        ChargeName.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        ChargeName.setBorder(null);
        ChargeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChargeNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel6.setText("ข้อหา");

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel7.setText("สถานที่จับกุม");

        SuspectFullName2.setEditable(false);
        SuspectFullName2.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        SuspectFullName2.setBorder(null);
        SuspectFullName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuspectFullName2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel8.setText("วันที่จับกุม");

        ArrestDate.setEditable(false);
        ArrestDate.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        ArrestDate.setBorder(null);
        ArrestDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrestDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SuspectFullName2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crimecaseno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SuspectFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ArrestDate))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChargeName))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crimecaseno)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SuspectFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChargeName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SuspectFullName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ArrestDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jCheckOnly.setBackground(new java.awt.Color(255, 255, 255));
        jCheckOnly.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jCheckOnly.setText("เฉพาะคดีระหว่างสอบสวน");
        jCheckOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckOnlyActionPerformed(evt);
            }
        });

        jComboStatus.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jComboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ผัดฟ้องฝากขัง", "ประกัน", "แจ้งข้อหาปล่อยตัว", "แจ้งข้อหาฝากขัง", "ไม่ได้ตัว", "ไม่รู้ตัว", "ฟ้องวาจา", "ส่งฟื้นฟู", "อื่นๆ" }));
        jComboStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboStatusItemStateChanged(evt);
            }
        });
        jComboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStatusActionPerformed(evt);
            }
        });

        AddEditBail.setText("เพิ่ม/แก้ไข");
        AddEditBail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEditBailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddEditBail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckOnly)
                        .addGap(18, 18, 18)
                        .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddEditBail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckOnly)
                        .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1264, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArrestDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrestDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrestDateActionPerformed

    private void SuspectFullName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuspectFullName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuspectFullName2ActionPerformed

    private void ChargeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChargeNameActionPerformed

    private void SuspectFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuspectFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuspectFullNameActionPerformed

    private void jCheckOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckOnlyActionPerformed
        // TODO add your handling code here:
        RefreshData();
    }//GEN-LAST:event_jCheckOnlyActionPerformed

    private void jComboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboStatusActionPerformed
        // TODO add your handling code here:
        RefreshData();
    }//GEN-LAST:event_jComboStatusActionPerformed

    private void jTableBailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBailMouseClicked
        // TODO add your handling code here:

             try{
                String crimecaseid = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 0)+"";
                String fullname = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 1)+"";

                
                String  sql= "select crimecasenoyear,ChargeName,Investigator_Result,TypePerson,BailDate,PeopleRegistrationID,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,CaseAcceptDate \n" +
                     "from Person\n" +
                     "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "+ 
                     "left join Charge on CrimeCase.ChargeCodeCase=Charge.ChargeCode "  +                    
                      "where TypePerson='ผู้ต้องหา' and crimecasenoyear='"+crimecaseid+"' and FullNamePerson='"+fullname+"'" ;
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("ExSql : "+sql);
                if(rs.next()){
                    crimecaseno.setText(rs.getString("crimecasenoyear"));
                    SuspectFullName.setText(rs.getString("FullNamePerson"));
                    ChargeName.setText(rs.getString("ChargeName"));
                    
                    
                }

                rs.close();
                stmt.close();
                RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();

            }
//        ShowData();
        
          
        
    }//GEN-LAST:event_jTableBailMouseClicked

    private void jComboStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboStatusItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboStatusItemStateChanged

    private void AddEditBailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEditBailActionPerformed
        // TODO add your handling code here:
        
          if(jTableBail.getSelectedRow()>=0){
            try{
                String crimecaseid = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 0)+"";

                String sql="select crimecasenoyear,Investigator_Result,TypePerson,BailDate,PeopleRegistrationID,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,CaseAcceptDate \n" +
                     "from Person\n" +
                     "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "
                     + "where TypePerson='ผู้ต้องหา' and CaseId='"+crimecaseid+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("ExSql : "+sql);
                if(rs.next()){
                    JSONObject data = new JSONObject();
                    data.put("CaseId", rs.getString("CaseId"));
                    data.put("crimecaseno", rs.getString("crimecaseno"));
                    data.put("crimecaseyears", rs.getString("crimecaseyears"));
                    data.put("ChargeCode", rs.getString("ChargeCode"));
                    data.put("ChargeName", rs.getString("ChargeName"));
                    data.put("FullNamePerson", rs.getString("FullNamePerson"));
                    data.put("CaseIdPerson", rs.getString("CaseIdPerson"));
                    
                    CrimesCaseEdit cce =new CrimesCaseEdit(this,data);
                    cce.setVisible(true);
                }

                rs.close();
                stmt.close();
                RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();

            }
        }else{

        }
    }//GEN-LAST:event_AddEditBailActionPerformed
 public void eventJStatusManage(){
//     String a= jComboStatus.getSelectedItem()+"";
//     if(a.equals("ประกัน"))
//     {AddEditBail.setVisible(true);}
//     else{AddEditBail.setVisible(false);}
        jComboStatus.addActionListener (new ActionListener () {
                public void actionPerformed(ActionEvent e) {

                }
            });
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
            java.util.logging.Logger.getLogger(BailCrimesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BailCrimesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BailCrimesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BailCrimesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BailCrimesForm().setVisible(true);
            }
        });
    }
    public void ShowData(){
     
            try{
                String crimecaseid = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 0)+"";

                String  sql= "select crimecasenoyear,Investigator_Result,TypePerson,BailDate,PeopleRegistrationID,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,CaseAcceptDate \n" +
                     "from Person\n" +
                     "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "
                     + "where TypePerson='ผู้ต้องหา' and crimecasenoyear='"+crimecaseid+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("ExSql : "+sql);
                if(rs.next()){
                    SuspectFullName.setText(rs.getString("FullNamePerson"));
                }

                rs.close();
                stmt.close();
                RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();

            }
        
  
    
    }
    public void RefreshData(){
        try{
              
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
//        String a=txtCaseNO.getText();
        String sql;
                sql= "select CaseId,crimecasenoyear,Investigator_Result,TypePerson,BailDate,PeopleRegistrationID,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,CaseAcceptDate \n" +
                     "from Person\n" +
                     "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "
                   + "where TypePerson='ผู้ต้องหา' and StatusSuspect='"+jComboStatus.getSelectedItem()+"'";
      if(jCheckOnly.isSelected())
      {
      sql=sql+" and Investigator_Result='อยู่ระหว่างสอบสวน'";
      
      }
        ResultSet rs = stmt.executeQuery(sql);
          System.out.println("SQL : "+sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();
            row.add(rs.getString("CaseId"));            
            row.add(rs.getString("crimecasenoyear"));
            row.add(rs.getString("FullNamePerson"));
            row.add("-");
            row.add(rs.getString("BailDate"));
                row.add("-");
            row.add("-");
            row.add("-");
            row.add("-");
             row.add("-");
            row.add("-");
            row.add("-");
//            row.add(rs.getString("Age"));
//            row.add(rs.getString("Race"));
//            row.add(rs.getString("Nationality"));
//            row.add(rs.getString("Religion"));
            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector(); 
        String StatusSus=jComboStatus.getSelectedItem()+"";
          ColumnName.add("ลำดับคดี");    
       
         ColumnName.add("เลขคดี/ปี");    
         ColumnName.add("ผู้ต้องหา");
         ColumnName.add("วันรับคำร้องทุกข์");
         if(StatusSus.equals("ประกัน")){
           ColumnName.add("วันประกัน");
         }
        else if(StatusSus.equals("ส่งฟื้นฟู")){
           ColumnName.add("วันส่งฟื้นฟู");
         }
         else{
           ColumnName.add("วันส่งตัว");
         }
         ColumnName.add("ครบ 1 เดือน");
         ColumnName.add("ครบ 2 เดือน");
         ColumnName.add("ครบ 3 เดือน");
         ColumnName.add("ครบ 4 เดือน");
         ColumnName.add("ครบ 5 เดือน");
         ColumnName.add("ครบ 6 เดือน");
         ColumnName.add("ครบ 1 ปี");
//         ColumnName.add("ครบ 2 เดือน");
         

         System.out.println("SQL : "+sql);
     
        jTableBail.setModel(new javax.swing.table.DefaultTableModel(
            tabledata,
            ColumnName
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
     
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEditBail;
    private javax.swing.JTextField ArrestDate;
    private javax.swing.JTextField ChargeName;
    private javax.swing.JTextField SuspectFullName;
    private javax.swing.JTextField SuspectFullName2;
    private javax.swing.JTextField crimecaseno;
    private javax.swing.JCheckBox jCheckOnly;
    private javax.swing.JComboBox<String> jComboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBail;
    // End of variables declaration//GEN-END:variables
}