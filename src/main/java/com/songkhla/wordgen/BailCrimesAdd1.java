/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;
import static com.songkhla.wordgen.CrimesCaseEdit.crimecaseno;
import static com.songkhla.wordgen.SuspectForm.IdPerson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

/**
 *
 * @author Petpilin
 */
public class BailCrimesAdd1 extends javax.swing.JDialog {
    Connection con=null;
    PreparedStatement pst=null;
    DataCase dc =new DataCase();
    String caseId;
    String personId;
    /**
     * Creates new form BailCrimesAdd
     */
    public BailCrimesAdd1(JFrame parrent,JSONObject datain) {
        super(parrent,true);
        initComponents();
            jlabelCaseId.setVisible(false);
        jLabePersonId.setVisible(false);
        refreshAssetData();
        refreshBailSendData();
        caseId=datain.get("InsuCaseId")+"";
        personId=IdPerson();
        jlabelCaseId.setText(caseId);
        jLabePersonId.setText(IdPerson());
        System.out.print("sdffffffff:"+IdPerson());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fXDatePickerInSwingExample1 = new com.songkhla.wordgen.FXDatePickerInSwingExample();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBailAsset = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jButtonAddSue = new javax.swing.JButton();
        jButtonEditSue = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBailSend = new javax.swing.JTable();
        jButtonAddSue1 = new javax.swing.JButton();
        jButtonEditSue1 = new javax.swing.JButton();
        jButtonDelete1 = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jlabelCaseId = new javax.swing.JLabel();
        jLabePersonId = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

        jLabel31.setBackground(new java.awt.Color(255, 204, 204));
        jLabel31.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("ระบุหลักประกัน ในการขอประกันตัว");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTableBailAsset.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jTableBailAsset.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ลำดับ", "รายการทรัพย์สิน", "จำนวน", "ราคา(บาท)", "ราคา(สตางค์)", "รวมมูลค่า(บาท)", "รวมมูลค่า(สตางค์)", "หมายเหตุ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableBailAsset);

        jLabel34.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jLabel34.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("บัญชีทรัพย์สินของผู้ประกันตัว");

        jButtonAddSue.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonAddSue.setText("เพิ่ม");
        jButtonAddSue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddSueActionPerformed(evt);
            }
        });

        jButtonEditSue.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonEditSue.setText("แก้ไข");
        jButtonEditSue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditSueActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonDelete.setText("ลบ");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonAddSue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditSue, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDelete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddSue)
                    .addComponent(jButtonEditSue)
                    .addComponent(jButtonDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));

        jLabel35.setBackground(new java.awt.Color(255, 204, 204));
        jLabel35.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("กำหนดวันเวลาส่งตัวผู้ต้องหา");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel35)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTableBailSend.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jTableBailSend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ครั้งที่", "วันที่ส่งตัว", "เวลา", "สถานที่ส่งตัว"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableBailSend);

        jButtonAddSue1.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonAddSue1.setText("เพิ่ม");
        jButtonAddSue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddSue1ActionPerformed(evt);
            }
        });

        jButtonEditSue1.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonEditSue1.setText("แก้ไข");
        jButtonEditSue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditSue1ActionPerformed(evt);
            }
        });

        jButtonDelete1.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonDelete1.setText("ลบ");
        jButtonDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonAddSue1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditSue1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddSue1)
                    .addComponent(jButtonEditSue1)
                    .addComponent(jButtonDelete1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSave.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonSave.setText("บันทึก");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jlabelCaseId.setText("jLabel2");

        jLabePersonId.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(562, 562, 562))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabelCaseId)
                        .addGap(18, 18, 18)
                        .addComponent(jLabePersonId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelCaseId)
                    .addComponent(jLabePersonId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jButtonSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(77, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("เพิ่ม/แก้ไข การประกันตัวผู้ต้องหา");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddSue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSue1ActionPerformed
        // TODO add your handling code here:
        
        refreshBailSendData();
    }//GEN-LAST:event_jButtonAddSue1ActionPerformed

    private void jButtonEditSue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditSue1ActionPerformed
        // TODO add your handling code here:
        
        JSONObject s = new JSONObject();
        s.put("BailCaseId",caseId );
        s.put("BailPersonId",personId );
        JFrame frame = new JFrame();
        JDialog dialog = new JDialog(frame);//frame is owner
        JFrame bas = (JFrame)(dialog.getParent());
        bas.removeAll();
        DeliverySuspect baa=new DeliverySuspect(bas,s,null);
        baa.setVisible(true);
        refreshBailSendData();
    }//GEN-LAST:event_jButtonEditSue1ActionPerformed

    private void jButtonDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelete1ActionPerformed
        // TODO add your handling code here:
        refreshBailSendData();
    }//GEN-LAST:event_jButtonDelete1ActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:

        con=ConnectDatabase.connect();
        String sql2= "select * from Person";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql2);
            if(!rs.next()){
                String sql="INSERT INTO Person (CauseImprison,ChargeName,NoImprison,NumberImprison,SinceImprison,SinceImprisonTime,"
                + "StatusSueAndPutInJail,SuspectFullName,ToImprison,ToImprisonTime,TotalTime,TotalDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
                pst=con.prepareStatement(sql);
                /*
                pst.setString(1,CauseImprison.getText());
                pst.setString(2,ChargeName.getText());
                pst.setString(3,NoImprison.getText());
                pst.setString(4,NumberImprison.getText());
                // pst.setString(5,PoliceStationName.getText());
                pst.setString(6,SinceImprison.getText());
                pst.setString(7,SinceImprisonTime.getText());
                // pst.setString(8,StatusSueAndPutInJail.getText());
                pst.setString(9,SuspectFullName.getText());
                pst.setString(10,ToImprison.getText());
                pst.setString(11,ToImprisonTime.getText());
                pst.setString(12,TotalTime.getText());
                pst.setString(13,TotalDate.getText());
                //pst.setString(14,crimecaseno.getText());
                */
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Saved successfully");
                pst.close();
            }else{
                String sqlUpdate= "UPDATE Person Set\n "
                + "CauseImprison=?,"
                + "ChargeName=?,"
                + "NoImprison=?,"
                + "NumberImprison=?,"
                + "SinceImprison=?"
                + "SinceImprisonTime=?"
                + "StatusSueAndPutInJail=?"
                + "SuspectFullName=?"
                + "ToImprison=?"
                + "ToImprisonTime=?"
                + "TotalTime=?"
                + "TotalDate=?"
                + "Where IdCardPolice=?";
                /*
                pst=con.prepareStatement(sqlUpdate);
                //pst.setString(1,CauseImprison.getText());
                pst.setString(2,ChargeName.getText());
                pst.setString(3,NoImprison.getText());
                pst.setString(4,NumberImprison.getText());
                // pst.setString(5,PoliceStationName.getText());
                pst.setString(6,SinceImprison.getText());
                pst.setString(7,SinceImprisonTime.getText());
                // pst.setString(8,StatusSueAndPutInJail.getText());
                pst.setString(9,SuspectFullName.getText());
                pst.setString(10,ToImprison.getText());
                pst.setString(11,ToImprisonTime.getText());
                pst.setString(12,TotalTime.getText());
                pst.setString(13,TotalDate.getText());
                //pst.setString(14,crimecaseno.getText());
                */
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Saved successfully");
                System.out.println("SQL : "+sqlUpdate);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("SQL : "+pst);
        }
        setVisible(false);
                
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        refreshAssetData();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonEditSueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditSueActionPerformed
        // TODO add your handling code here:
          if(jTableBailAsset.getSelectedRow()>=0){
            try{
                String BailAssetid = jTableBailAsset.getModel().getValueAt(jTableBailAsset.getSelectedRow(), 0)+"";

                String sql="select BailAssetOrder,BailAssetDetail,BailAssetBath,BailAmount,BailAssetTotal,BailAssetRemark,BailCaseId,BailPersonId\n" +
                     "from BailAsset\n" + 
                    "where BailAssetOrder='"+BailAssetid+"' and BailCaseId='"+caseId+"' and BailPersonId='"+personId+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("ExSql : "+sql);
                if(rs.next()){
                    JSONObject data = new JSONObject();
                    data.put("BailAssetOrder", rs.getString("BailAssetOrder"));
                    data.put("BailAssetDetail", rs.getString("BailAssetDetail"));
                    data.put("BailAssetBath", rs.getString("BailAssetBath"));
                    data.put("BailAmount", rs.getString("BailAmount"));
                    data.put("BailAssetTotal", rs.getString("BailAssetTotal"));
                    data.put("BailAssetRemark", rs.getString("BailAssetRemark"));
                    data.put("BailCaseId", rs.getString("BailCaseId"));
                     data.put("BailPersonId", rs.getString("BailPersonId"));
                    JSONObject data2 = new JSONObject();     
                     data2.put("BailCaseId", rs.getString("BailCaseId"));
                     data2.put("BailPersonId", rs.getString("BailPersonId"));                    
                      JFrame frame = new JFrame();
                    JDialog dialog = new JDialog(frame);//frame is owner
                    JFrame baf = (JFrame)(dialog.getParent());
                    baf.removeAll();
                    BailAssetAdd ba =new BailAssetAdd(baf,data,data2);
                    ba.setVisible(true);
                }

                rs.close();
                stmt.close();
                refreshAssetData();
            }catch(Exception ex){
                ex.printStackTrace();

            }
        }else{

        }
       
    }//GEN-LAST:event_jButtonEditSueActionPerformed

    private void jButtonAddSueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSueActionPerformed
        // TODO add your handling code here:
 

        JSONObject s = new JSONObject();
        s.put("BailCaseId",caseId );
        s.put("BailPersonId",personId );
        JFrame frame = new JFrame();
        JDialog dialog = new JDialog(frame);//frame is owner
        JFrame bas = (JFrame)(dialog.getParent());
        bas.removeAll();
        BailAssetAdd baa=new BailAssetAdd(bas,null,s);
        baa.setVisible(true);
        refreshAssetData();
    }//GEN-LAST:event_jButtonAddSueActionPerformed
    public void refreshAssetData(){
            try{
              
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
//        String a=txtCaseNO.getText();
        String sql;
                sql= "select BailAssetOrder,BailAssetDetail,BailAssetBath,BailAmount,BailAssetTotal,BailAssetRemark,BailCaseId,BailPersonId\n" +
                     "from BailAsset\n"
                   + "where BailCaseId='"+caseId+"' and BailPersonId='"+personId+"'";
    
        ResultSet rs = stmt.executeQuery(sql);
          System.out.println("SQL : "+sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();
            row.add(rs.getString("BailAssetOrder"));
            row.add(rs.getString("BailAssetDetail"));
            row.add(rs.getString("BailAssetBath"));
            row.add(rs.getString("BailAmount"));
            row.add(rs.getString("BailAssetTotal"));
            row.add(rs.getString("BailAssetRemark"));
//            row.add(rs.getString("Age"));
//            row.add(rs.getString("Race"));
//            row.add(rs.getString("Nationality"));
//            row.add(rs.getString("Religion"));
            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector(); 
      
         ColumnName.add("ลำดับ");    
         ColumnName.add("รายการทรัพย์");
         ColumnName.add("จำนวน");
         ColumnName.add("ราคาบาท");
         ColumnName.add("รวมมูลค่า");
         ColumnName.add("หมายเหตุ");
//         ColumnName.add("ครบ 2 เดือน");
         

         System.out.println("SQL : "+sql);
     
        jTableBailAsset.setModel(new javax.swing.table.DefaultTableModel(
            tabledata,
            ColumnName
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
     
        }catch(Exception ex){
            ex.printStackTrace();
        }


    }
 public static String IdPerson(){
         Connection cc=null;
         cc=ConnectDatabase.connect();
            String sqlperson="Select max(NoPerson) noperson from Person";
        int id=0;
        try {
            Statement s=cc.createStatement();
            ResultSet rs=s.executeQuery(sqlperson);
            
            if (rs.next()) {
                id=rs.getInt("noperson"); 
            }
            
            if(id==0){
                id=1;
            }
            else{
                id=id+1;
            }
             return String.valueOf(id);
        
        } catch (Exception e) {
            return null;
//            System.out.println(e);
        } 
    
    }
     public void refreshBailSendData(){
            try{
              
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
//        String a=txtCaseNO.getText();
        String sql;
                sql= "select DeliOrder,DeliDate,DeliTimes,DeliPlace,DeliPersonId\n" +
                     "from DeliverySuspect\n"
                   + "where DeliPersonId='"+personId+"'";
    
        ResultSet rs = stmt.executeQuery(sql);
          System.out.println("SQL : "+sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();
            row.add(rs.getString("DeliOrder"));
            row.add(rs.getString("DeliDate"));
            row.add(rs.getString("DeliTimes"));
            row.add(rs.getString("DeliPlace"));
//            row.add(rs.getString("Age"));
//            row.add(rs.getString("Race"));
//            row.add(rs.getString("Nationality"));
//            row.add(rs.getString("Religion"));
            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector(); 
      
         ColumnName.add("ครั้งที่");    
         ColumnName.add("วันส่งตัว");
         ColumnName.add("เวลา");
         ColumnName.add("สถานที่ส่งตัว");
//         ColumnName.add("ครบ 2 เดือน");
         

         System.out.println("SQL : "+sql);
     
        jTableBailAsset.setModel(new javax.swing.table.DefaultTableModel(
            tabledata,
            ColumnName
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
     
        }catch(Exception ex){
            ex.printStackTrace();
        }


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
            java.util.logging.Logger.getLogger(BailCrimesAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BailCrimesAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BailCrimesAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BailCrimesAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new BailCrimesAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.songkhla.wordgen.FXDatePickerInSwingExample fXDatePickerInSwingExample1;
    private javax.swing.JButton jButtonAddSue;
    private javax.swing.JButton jButtonAddSue1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDelete1;
    private javax.swing.JButton jButtonEditSue;
    private javax.swing.JButton jButtonEditSue1;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabePersonId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableBailAsset;
    private javax.swing.JTable jTableBailSend;
    private javax.swing.JLabel jlabelCaseId;
    // End of variables declaration//GEN-END:variables
}
