/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.json.simple.JSONObject;
import org.xlsx4j.sml.Col;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JScrollPane;

/**
 *
 * @author Petpilin
 */
public class BailCrimesForm extends javax.swing.JDialog {
    Connection con=null;
    PreparedStatement pst=null;
    DataCase dc =new DataCase();
    JDatePickerImpl DateSearch;


    /**
     * Creates new form BailCrimesForm
     */
    public BailCrimesForm(JFrame parrent) {
                super(parrent,true);
        initComponents();
            ImageIcon img = new ImageIcon("./Master/WD.png");
            setIconImage(img.getImage());
            setTitle("ระบบสำนวนอิเล็คทรอนิกส์ (CRIMES)");
        eventJStatusManage();
        RefreshData();
//        ShowData();
jTableBail.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
jTableBail.setPreferredScrollableViewportSize(Toolkit.getDefaultToolkit().getScreenSize());
        UtilDateModel model = new UtilDateModel();
            model.setValue(Calendar.getInstance().getTime());
            Properties p = new Properties();
            p.put("text.today", "Today");
            p.put("text.month", "Month");
            p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
         DateSearch = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        DateSearch.setTextEditable(true);
        DateSearch.setBackground(Color.WHITE);
//        jPanelDateSearch.setLayout(new FlowLayout());
//        jPanelDateSearch.add(DateSearch);  
        
  
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
        jButton3 = new javax.swing.JButton();
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
        PlaceArrest = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ArrestDate = new javax.swing.JTextField();
        jCheckOnly = new javax.swing.JCheckBox();
        AddEditBail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1270, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(4, 93, 179));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ผู้ต้องหาประกันตัว");

        jButton3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("./Master/home.png"));
        jButton3.setText("เมนูหลัก");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        jTableBail.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jTableBail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "เลขคดี", "คดี", "ผู้ต้องหา", "ศาล", "วันรับคำร้องทุกข์", "วันประกัน", "ครบ 1 เดือน", "ครบ 2 เดือน", "ครบ 3 เดือน", "ครบ 4 เดือน", "ครบ 5 เดือน", "ครบ 6 เดือน", "ครบ 1 ปี"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableBail.setGridColor(new java.awt.Color(0, 0, 0));
        jTableBail.setRowHeight(20);
        jTableBail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBailMouseClicked(evt);
            }
        });
        jTableBail.getTableHeader().setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
        jTableBail.getTableHeader().setOpaque(false);
        jScrollPane1.setViewportView(jTableBail);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        crimecaseno.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        crimecaseno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crimecaseno.setBorder(null);
        crimecaseno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        crimecaseno.setEnabled(false);
        crimecaseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimecasenoActionPerformed(evt);
            }
        });

        jLabel30.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jLabel30.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel30.setText("เลขคดีที่ ");

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel5.setText("ชื่อผู้ต้องหา");

        SuspectFullName.setEditable(false);
        SuspectFullName.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        SuspectFullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SuspectFullName.setBorder(null);

        ChargeName.setEditable(false);
        ChargeName.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        ChargeName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ChargeName.setBorder(null);

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel6.setText("ข้อหา");

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel7.setText("สถานที่จับกุม");

        PlaceArrest.setEditable(false);
        PlaceArrest.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        PlaceArrest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PlaceArrest.setBorder(null);

        jLabel8.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel8.setText("วันที่จับกุม");

        ArrestDate.setEditable(false);
        ArrestDate.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        ArrestDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ArrestDate.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlaceArrest))
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
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ArrestDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChargeName, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
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
                    .addComponent(PlaceArrest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ArrestDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jCheckOnly.setBackground(new java.awt.Color(255, 255, 255));
        jCheckOnly.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jCheckOnly.setText("เฉพาะคดีระหว่างสอบสวน");
        jCheckOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckOnlyActionPerformed(evt);
            }
        });

        AddEditBail.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        AddEditBail.setIcon(new javax.swing.ImageIcon("./Master/edit (1).png"));
        AddEditBail.setText("แก้ไข");
        AddEditBail.setPreferredSize(new java.awt.Dimension(79, 30));
        AddEditBail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEditBailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddEditBail, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(935, 935, 935)
                        .addComponent(jCheckOnly)))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddEditBail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckOnly))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
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

    private void jCheckOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckOnlyActionPerformed
        // TODO add your handling code here:
        RefreshData();
    }//GEN-LAST:event_jCheckOnlyActionPerformed

    private void AddEditBailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEditBailActionPerformed
        // TODO add your handling code here:
        
          if(jTableBail.getSelectedRow()>=0){
            try{
                String crimecaseid = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 0)+"";
                String fullname = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 1)+"";

                String sql="select crimecasenoyear,NoPerson,crimecaseno,Investigator_Result,TypePerson,ArrestDateTimeEnd,BailDate,CourtSuspect,"
                        + "PeopleRegistrationID,PlaceArrest,ArrestDateTime,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,"
                        + "CaseAcceptDate,ChargeCode,ChargeName\n" +
                     "from Person\n" +
                     "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId\n"+
                     "left join Charge on CrimeCase.ChargeCodeCase=Charge.ChargeCode\n"+                  
                     "where TypePerson='ผู้ต้องหา' and crimecasenoyear='"+crimecaseid+"' and FullNamePerson='"+fullname+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("ExSql : "+sql);
                if(rs.next()){
                    JSONObject data = new JSONObject();
                    data.put("CaseId", rs.getString("CaseId"));
                    data.put("crimecaseno", rs.getString("crimecaseno"));
                    data.put("crimecasenoyear", rs.getString("crimecasenoyear"));
                    data.put("ChargeCode", rs.getString("ChargeCode"));
                    data.put("ChargeName", rs.getString("ChargeName"));
                    data.put("FullNamePerson", rs.getString("FullNamePerson"));
                    data.put("CaseIdPerson", rs.getString("CaseIdPerson"));
                    data.put("NoPerson", rs.getString("NoPerson"));
                                        data.put("PlaceArrest", rs.getString("PlaceArrest"));
                    data.put("ArrestDateTime", rs.getString("ArrestDateTime"));
                     data.put("ArrestDateTimeEnd", rs.getString("ArrestDateTimeEnd"));                   
                    data.put("BailDate", rs.getString("BailDate"));
                    data.put("CourtSuspect", rs.getString("CourtSuspect"));

                      JFrame frame = new JFrame();
        JDialog dialog = new JDialog(frame);//frame is owner
        JFrame in = (JFrame)(dialog.getParent());
        in.removeAll();    
                    BailCrimesAdd bca =new BailCrimesAdd(in,data);
                    bca.pack();
                    bca.setLocationRelativeTo(null);
                    bca.setVisible(true);
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

    private void jTableBailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBailMouseClicked
        // TODO add your handling code here:
       
           try{
            String crimecaseid = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 0)+"";
            String fullname = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 1)+"";

            String  sql= "select crimecasenoyear,ChargeName,Investigator_Result,TypePerson,BailDate,"
                    + "PeopleRegistrationID,PlaceArrest,ArrestDateTime,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,"
                    + "CaseAcceptDate \n" +
            "from Person\n" +
            "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "+
            "left join Charge on CrimeCase.ChargeCodeCase=Charge.ChargeCode "  +
            "where TypePerson='ผู้ต้องหา' and  crimecasenoyear='"+crimecaseid+"' and FullNamePerson='"+fullname+"'" ;
            Connection con = ConnectDatabase.connect();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("ExSql : "+sql);
            if(rs.next()){
                crimecaseno.setText(rs.getString("crimecasenoyear"));
                SuspectFullName.setText(rs.getString("FullNamePerson"));
                ChargeName.setText(rs.getString("ChargeName"));
                PlaceArrest.setText(rs.getString("PlaceArrest"));
                ArrestDate.setText(rs.getString("ArrestDateTime"));
            }

            rs.close();
            stmt.close();
            
        }catch(Exception ex){
            ex.printStackTrace();

        }
        
    }//GEN-LAST:event_jTableBailMouseClicked

    private void crimecasenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimecasenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crimecasenoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MainMenuWord.closeAllDialogs();
    }//GEN-LAST:event_jButton3ActionPerformed
 public void eventJStatusManage(){
//     String a= jComboStatus.getSelectedItem()+"";
//     if(a.equals("ประกัน"))
//     {AddEditBail.setVisible(true);}
//     else{AddEditBail.setVisible(false);}
  
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
//                new BailCrimesForm().setVisible(true);
            }
        });
    }
    public void ShowData(){
     if(jTableBail.getSelectedRow()>=0){
            try{
                  String crimecaseid = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 0)+"";
            String fullname = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 1)+"";

            String  sql= "select crimecasenoyear,ChargeName,Investigator_Result,TypePerson,BailDate,"
                    + "PeopleRegistrationID,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,"
                    + "CaseAcceptDate \n" +
            "from Person\n" +
            "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "+
            "left join Charge on CrimeCase.ChargeCodeCase=Charge.ChargeCode "  +
            "where TypePerson='ผู้ต้องหา' and  crimecasenoyear='"+crimecaseid+"' and FullNamePerson='"+fullname+"'" ;
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
        
     }
    
    }
    public void RefreshData(){
        try{
              
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
//        String a=txtCaseNO.getText();
        String sql;
         sql="select CrimeCase.crimecasenoyear crimecasenoyear,CrimeCase.caseacceptdate CaseAcceptDate,Person.arrestdatetimeend ArrestDateTimeEnd,\n" +
"                Person.Fullnameperson FullNamePerson,Person.CourtSuspect CourtSuspect, Person.noperson noperson,Person.BailDate BailDate,Person.StatusBail StatusBail,\n" +
" deli1.deliorder order1,deli1.delidate date1,\n" +
" deli2.deliorder order2,deli2.delidate date2,\n" +
"deli3.deliorder order3,deli3.delidate date3,\n" +
"deli4.deliorder order4,deli4.delidate date4,\n" +
"deli5.deliorder order5,deli5.delidate date5,\n" +
" deli6.deliorder order6,deli6.delidate date6\n" +
"from Person\n" +
"left join DeliverySuspect on Person.NoPerson=deli1.DeliPersonId\n" +
"  left join CrimeCase on Person.caseidperson=CrimeCase.caseid\n" +
"left outer join\n" +
"(select * from DeliverySuspect where deliorder=1) as deli1\n" +
" left outer join\n" +
"(select * from DeliverySuspect where deliorder=2) as deli2 on deli1.delipersonid=deli2.delipersonid\n" +
"  left outer join\n" +
"                (select * from DeliverySuspect where deliorder=3) as deli3 on deli1.delipersonid=deli3.delipersonid\n" +
"                left outer join\n" +
"                (select * from DeliverySuspect where deliorder=4) as deli4 on deli1.delipersonid=deli4.delipersonid\n" +
"                left outer join\n" +
"                (select * from DeliverySuspect where deliorder=5) as deli5 on deli1.delipersonid=deli5.delipersonid\n" +
"                left outer join\n" +
"                (select * from DeliverySuspect where deliorder=6) as deli6 on deli1.delipersonid=deli6.delipersonid\n" +
"where 	Person.StatusBail='ประกัน'			\n" +
"group by Person.NoPerson";
//                sql= "select StatusBail,CaseId,ArrestDateTimeEnd,crimecasenoyear,SueFirstDate,Investigator_Result,TypePerson,BailDate,PeopleRegistrationID,FullNamePerson,StatusSuspect,CaseIdPerson,CaseAcceptDate \n" +
//                     "from Person\n" +
//                     "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "
//                   + "where TypePerson='ผู้ต้องหา' and StatusBail='ประกัน' or StatusSuspect='"+jComboStatus.getSelectedItem()+"'";
      if(jCheckOnly.isSelected())
      {
      sql=sql+" and Investigator_Result='อยู่ระหว่างสอบสวน'";
      
      }
      
        ResultSet rs = stmt.executeQuery(sql);
//          System.out.println("SQL : "+sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();          
            row.add(rs.getString("crimecasenoyear"));
            row.add(rs.getString("FullNamePerson"));
             row.add(rs.getString("CourtSuspect"));
            row.add(rs.getString("CaseAcceptDate"));
            row.add(rs.getString("ArrestDateTimeEnd"));
             row.add(rs.getString("BailDate"));  
//            else if(jComboStatus.getSelectedItem().equals("ส่งฟื้นฟู")){
//             row.add(rs.getString("RestoreDate"));          
//             DateCal=rs.getString("RestoreDate")+"";
//            }

            row.add(rs.getString("date1"));
            row.add(rs.getString("date2"));
            row.add(rs.getString("date3"));
            row.add(rs.getString("date4"));
             row.add(rs.getString("date5"));
            row.add(rs.getString("date6"));
    
      
            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector(); 
         
         ColumnName.add("เลขคดี/ปี");    
         ColumnName.add("ผู้ต้องหา");
         ColumnName.add("ศาล");
         ColumnName.add("วันรับคำร้องทุกข์");
          ColumnName.add("วันสิ้นสุดควบคุมตัว");
           ColumnName.add("วันประกัน");   
          ColumnName.add("ครบส่งตัวครั้งที่ 1");
         ColumnName.add("ครบส่งตัวครั้งที่ 2");
         ColumnName.add("ครบส่งตัวครั้งที่ 3");
         ColumnName.add("ครบส่งตัวครั้งที่ 4");
         ColumnName.add("ครบส่งตัวครั้งที่ 5");
         ColumnName.add("ครบส่งตัวครั้งที่ 6");
//         ColumnName.add("ครบส่งตัวครั้งที่ 1");
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
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            
        });
                jTableBail.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
                @Override
                public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row, int col) {             
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

            //        String status = (String)table.getModel().getValueAt(row, 4);
                       String s2=String.valueOf(value);  
                     int a=  CalculateDateBail(s2);
                    if(col==5 && a<=0||col==6 && a<=0||col==7 && a<=0||col==8 && a<=0||col==9 && a<=0||col==10 && a<=0){
                   
                        setBackground(Color.WHITE);
                        setForeground(Color.RED);
//                        setFont("TH sarabunPSK",th);
                    }
                    else if(col==5 && a>0||col==6 && a>0||col==7 && a>0||col==8 && a>0||col==9 && a>0||col==10 && a>0){
                    setBackground(Color.WHITE);
                    setForeground(Color.BLUE);
                    
                    }

                    else {
                       
                        setBackground(Color.WHITE);
                        setForeground(Color.BLACK);
                    }  
                      
             
                    return this;
           
                }   
            });
jTableBail.getColumnModel().getColumn(1).setMinWidth(135);                
jTableBail.getColumnModel().getColumn(3).setMinWidth(125);
jTableBail.getColumnModel().getColumn(4).setMinWidth(125);
jTableBail.getColumnModel().getColumn(5).setMinWidth(125);

jTableBail.getColumnModel().getColumn(6).setMinWidth(130);
jTableBail.getColumnModel().getColumn(7).setMinWidth(130);
jTableBail.getColumnModel().getColumn(8).setMinWidth(130);
jTableBail.getColumnModel().getColumn(9).setMinWidth(130);
jTableBail.getColumnModel().getColumn(10).setMinWidth(130);
jTableBail.getColumnModel().getColumn(11).setMinWidth(130);


        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
       private String getFilterCondition(){
        HashMap<String,String> filter = new HashMap<String,String>();
        if(DateSearch.getJFormattedTextField().getText().trim().length()>0){
            filter.put("BailDate", DateSearch.getJFormattedTextField().getText().trim());
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

    public int CalculateDateBail(String DateCheck){
       int diffDays =0;   
//       try{
//     
//               Locale lc = new Locale("th","TH");
//           SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy",lc);
//                        SimpleDateFormat  format = new SimpleDateFormat("dd/MM/yyyy",lc);  
//                        String d2Day=dateFormat.format(new Date());
//                        Date dateTo =null;
//                        Date datebail=null;
//                        if(DateCheck == null ||DateCheck.equals("")||DateCheck.equals(null)||DateCheck.equals(" ")){
//                           diffDays=0;
//                        }
//                        else{
//                             dateTo=format.parse(d2Day);
//                          datebail=format.parse(DateCheck);
//                               System.out.println("DateNew : "+datebail);
//                        System.out.println("DateToday : "+dateTo);
//                            long diff = datebail.getTime() - dateTo.getTime();
//                             diffDays = (int)(diff / (24 * 60 * 60 * 1000));                          
//                             System.out.println("Time in Day: " + diffDays + " Days."); 
//                        }
//                
//       }catch(Exception e){
//           e.printStackTrace();
//       
//       }
          return diffDays;               
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEditBail;
    private javax.swing.JTextField ArrestDate;
    private javax.swing.JTextField ChargeName;
    private javax.swing.JTextField PlaceArrest;
    private javax.swing.JTextField SuspectFullName;
    private javax.swing.JTextField crimecaseno;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckOnly;
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
