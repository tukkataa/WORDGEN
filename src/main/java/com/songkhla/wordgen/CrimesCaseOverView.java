/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.json.simple.JSONObject;
import java.util.Properties;
/**
 *
 * @author Petpilin
 */
public class CrimesCaseOverView extends javax.swing.JDialog {

    /**
     * Creates new form CrimesCaseView
     */
    
     JFrame frame = new JFrame();
        JDialog dialog = new JDialog(frame);//frame is owner
        JFrame facc = (JFrame)(dialog.getParent());
      JDatePickerImpl DateAcceptSearch;

    public CrimesCaseOverView(JFrame parrent) {
                super(parrent,true);

        initComponents();
        ImageIcon img = new ImageIcon("D://Master//WD.png");
        setIconImage(img.getImage());
        setTitle("ระบบสำนวนอิเล็คทรอนิกส์ (CRIMES)");
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        jTable1.setOpaque(false);
        jTable1.getTableHeader().setFont(new Font("TH SarabunPSK",Font.BOLD,20));
        UtilDateModel model = new UtilDateModel();
//            model.setValue(Calendar.getInstance().getTime());
            Properties p = new Properties();        
            p.put("text.today", "Today");
            p.put("text.month", "Month");
            p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
         DateAcceptSearch = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        DateAcceptSearch.setTextEditable(true);
        DateAcceptSearch.setBackground(Color.WHITE);
        jPanelAcceptDate.setLayout(new FlowLayout());
        jPanelAcceptDate.add(DateAcceptSearch);    

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
        jLabel1 = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearchCase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSearchAcc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSearchSus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanelAcceptDate = new javax.swing.JPanel();
        jButtonSearch = new javax.swing.JButton();
        jButtonClearSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1270, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(4, 93, 179));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMaximumSize(new Dimension(1280, 720));
        jPanel1.setMinimumSize(new Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ข้อมูลคดีอาญา");

        jButtonDelete.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDelete.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("ลบ");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonEdit.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEdit.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEdit.setText("แก้ไข");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(51, 51, 51));
        jButtonAdd.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("เพิ่ม");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonAdd))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jTable1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "เลขที่คดี", "ผู้ร้องทุกข์", "ผู้ต้องหา", "ข้อหา", "วันที่รับคำร้องทุกข์", "วันที่รับแจ้งเหตุ", "ผลคดีชั้นพนักงานสอบสวน", "สถานะผู้ต้องหา", "Title 9"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(77, 0, 0));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel3.setText("สมุดคุมคดีอาญา");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel4.setText("เลขคดี/ปี");

        txtSearchCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCaseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel5.setText("ผู้ร้องทุกข์");

        txtSearchAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchAccActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel6.setText("ผู้ต้องหา");

        txtSearchSus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSusActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel7.setText("วันที่รับคำร้องทุกข์");

        jPanelAcceptDate.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelAcceptDateLayout = new javax.swing.GroupLayout(jPanelAcceptDate);
        jPanelAcceptDate.setLayout(jPanelAcceptDateLayout);
        jPanelAcceptDateLayout.setHorizontalGroup(
            jPanelAcceptDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelAcceptDateLayout.setVerticalGroup(
            jPanelAcceptDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jButtonSearch.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonSearch.setText("ค้นหา");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonClearSearch.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonClearSearch.setText("ล้างข้อมูล");
        jButtonClearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchCase, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtSearchSus, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelAcceptDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(87, 87, 87)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClearSearch))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtSearchAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearchCase, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchAcc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearchSus, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonClearSearch)
                                .addComponent(jButtonSearch))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanelAcceptDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1273, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()>=0){
            try{
                String crimecaseId = jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0)+"";
                String sql = "Delete from CrimeCase WHERE CaseId='"+crimecaseId+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);

                //            rs.close();
                stmt.close();
                RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void txtSearchCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCaseActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()>=0){
            try{
                String crimecaseid = jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0)+"";

                String sql="select crimecase.*,charge.*,ActionsCase.* from crimecase "
                        + "left join charge on crimecase.ChargeCodeCase=charge.ChargeCode "
                        + "left join ActionsCase on crimecase.ActionCodeCase=ActionsCase.ActionCode "
                        + "where CaseId='"+crimecaseid+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("ExSql : "+sql);
                if(rs.next()){
                    JSONObject data = new JSONObject();
                    data.put("CaseId", rs.getString("CaseId"));
                    data.put("CaseType", rs.getString("CaseType"));                          
                    data.put("crimecaseno", rs.getString("crimecaseno"));
                    data.put("crimecaseyears", rs.getString("crimecaseyears"));
                    data.put("ChargeCode", rs.getString("ChargeCode"));
                    data.put("ChargeName", rs.getString("ChargeName"));
                    data.put("CaseRequestDate", rs.getString("CaseRequestDate"));
                    data.put("CaseRequestTime", rs.getString("CaseRequestTime"));
                    data.put("CaseAcceptDate", rs.getString("CaseAcceptDate"));
                    data.put("CaseAcceptTime", rs.getString("CaseAccepTime"));
                    data.put("DailyNumber", rs.getString("DailyNumber"));
                    data.put("CrimeLocation", rs.getString("CrimeLocation"));
                    data.put("CrimeLocationDistrict", rs.getString("CrimeLocationDistrict"));
                    data.put("CrimeLocationAmphur", rs.getString("CrimeLocationAmphur"));
                    data.put("CrimeLocationMoo", rs.getString("CrimeLocationMoo"));
                    data.put("CrimeLocationRoad", rs.getString("CrimeLocationRoad"));
                    data.put("CrimeLocationSoi", rs.getString("CrimeLocationSoi"));
                    data.put("CrimeLocationProvince", rs.getString("CrimeLocationProvince"));
                    data.put("AccureandOther", rs.getString("AccureandOther"));
                    data.put("SuspectandOther", rs.getString("SuspectandOther")); 
                    data.put("WitnessandOther", rs.getString("WitnessandOther"));
                     data.put("Investigator_Result", rs.getString("Investigator_Result"));
                     data.put("TypeCourt", rs.getString("TypeCourt"));
                    data.put("PoliceNameCase", rs.getString("PoliceNameCase"));
                     data.put("AssetList", rs.getString("AssetList"));
                      data.put("AssetCode", rs.getString("AssetCode"));
                       data.put("RecordInvestCase", rs.getString("RecordInvestCase"));
                     data.put("ActionCrimes", rs.getString("ActionCrimes"));
                     data.put("ActionCode", rs.getString("ActionCode"));
                      data.put("OccuredDate", rs.getString("OccuredDate"));
                     data.put("OccuredTime", rs.getString("OccuredTime"));
                     data.put("StatusKnowSuspect", rs.getString("StatusKnowSuspect"));  
                        data.put("Invest_SendtoDepartment", rs.getString("Invest_SendtoDepartment"));     
                      data.put("TotalAcc", rs.getString("TotalAcc"));
                     data.put("TotalSus", rs.getString("TotalSus"));  
                        data.put("TotalWitness", rs.getString("TotalWitness"));        
                      data.put("Investigator_Number", rs.getString("Investigator_Number"));
                     data.put("Invest_SendCaseDate", rs.getString("Invest_SendCaseDate"));
                     data.put("Prosecutor_Result", rs.getString("Prosecutor_Result"));  
                      data.put("CapitalCrimeCaseNumber", rs.getString("CapitalCrimeCaseNumber"));      
                        facc.removeAll();
                    CrimesCaseEdit cce =new CrimesCaseEdit(facc,data);
                    cce.pack();
                     cce.setLocationRelativeTo(null);                   
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
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        CrimesCaseEdit cce =new CrimesCaseEdit(facc,null);
        cce.pack();
        cce.setLocationRelativeTo(null);
        cce.setVisible(true);
        RefreshData();
    }//GEN-LAST:event_jButtonAddActionPerformed
 
    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        RefreshData();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void txtSearchAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchAccActionPerformed

    private void txtSearchSusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchSusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchSusActionPerformed

    private void jButtonClearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearSearchActionPerformed
        // TODO add your handling code here:
        
        RefreshData();
    }//GEN-LAST:event_jButtonClearSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        Change look Jtable From Nimbus to Windows
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrimesCaseOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrimesCaseOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrimesCaseOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrimesCaseOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                CrimesCaseOverView aa=  new CrimesCaseOverView();
//                    aa.setVisible(true);
//                    aa.setSize ( 1264, 728 );
//        aa.setMinimumSize ( new Dimension ( 1264, 728 ) );
//        aa.setMaximizedBounds ( new Rectangle ( 1264, 728 ) );
            }
        });
        
    }
    
    public void RefreshData(){
        try{
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
        String sql = "select crimecase.*,Charge.* from crimecase left join Charge on"
                + " Charge.ChargeCode=crimecase.ChargeCodeCase "+getFilterCondition();
//                + "left join Person on Person.caseIdPerson = CrimeCase.CaseId "+getFilterCondition();

        ResultSet rs = stmt.executeQuery(sql);
            System.out.println("Sqll : "+sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();
            row.add(rs.getString("CaseId"));
            row.add(rs.getString("crimecasenoyear"));
            row.add(rs.getString("AccureandOther"));
            row.add(rs.getString("SuspectandOther"));
            row.add(rs.getString("ChargeName"));
//            row.add("-");
            row.add(rs.getString("CaseAcceptDate"));
            row.add(rs.getString("CaseRequestDate"));
            row.add(rs.getString("Investigator_Result"));
//            row.add(rs.getString("StatusSuspect"));
            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector();
        ColumnName.add("ลำดับ");
        ColumnName.add("คดีที่");
        ColumnName.add("ผู้ร้องทุกข์");
        ColumnName.add("ผู้ต้องหา");
        ColumnName.add("ข้อหา");     
        ColumnName.add("วันที่รับคำร้องทุกข์");
        ColumnName.add("วันที่รับแจ้งเหตุ");
        ColumnName.add("ผลคดีชั้นพนักงานสอบสวน");
//        ColumnName.add("สถานะผู้ต้องหา");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            tabledata,
            ColumnName
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private String getFilterCondition(){
        HashMap<String,String> filter = new HashMap<String,String>();
        if(txtSearchCase.getText().trim().length()>0){
            filter.put("crimecasenoyear", txtSearchCase.getText().trim());       
        }
         if(txtSearchAcc.getText().trim().length()>0){
            filter.put("AccureandOther", txtSearchAcc.getText().trim());       
        }
         if(txtSearchSus.getText().trim().length()>0){
            filter.put("SuspectandOther", txtSearchSus.getText().trim());       
        }
        String[] key = filter.keySet().toArray(new String[0]);
        String result="";
        for(int i=0;i<key.length;i++){
            if(i==0){
                result=" and ";
            }
            if(i==key.length-1){
                result+= " "+key[i]+" LIKE '%"+filter.get(key[i])+"%'";
            }else{
                result+= " "+key[i]+" LIKE '%"+filter.get(key[i])+"%' or ";
            }
            System.out.println(result);
        }
        
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearSearch;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAcceptDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSearchAcc;
    private javax.swing.JTextField txtSearchCase;
    private javax.swing.JTextField txtSearchSus;
    // End of variables declaration//GEN-END:variables
}
