/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;


import static com.songkhla.wordgen.ActionPage.ActionCrimes;
import static com.songkhla.wordgen.ActionPage.ActionDetail;
import static com.songkhla.wordgen.ActionPage.ActionNote;
import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.json.simple.JSONObject;

/**
 *
 * @author Petpilin
 */
public class RecordInvestigatorForm extends javax.swing.JDialog {
    Connection con=null;
    PreparedStatement pst=null;
    DataCase dc =new DataCase();
    boolean isInsert=true;
    String idRecord;
    JDatePickerImpl DateRecord;
    /**
     * Creates new form RecordInvestigator
     */
    public RecordInvestigatorForm(JFrame parrent,JSONObject datain) {
        super(parrent,true);
        initComponents();
         ImageIcon img = new ImageIcon("D://Master//WD.png");
            setIconImage(img.getImage());
            setTitle("ระบบสำนวนอิเล็กทรอนิกส์ (CRIMES)");
            caseId.setVisible(false);
         UtilDateModel model2 = new UtilDateModel();
            model2.setValue(Calendar.getInstance().getTime());
            Properties p = new Properties();
            p.put("text.today", "Today");
            p.put("text.month", "Month");
            p.put("text.year", "Year");
          JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p);
        DateRecord = new JDatePickerImpl(datePanel2,new DateLabelFormatter());
        DateRecord.setTextEditable(true);
        DateRecord.setBackground(Color.WHITE);
        jPanelDateRecord.setLayout(new FlowLayout());
        jPanelDateRecord.add(DateRecord); 
          comboInvest();
       if(datain != null){
           
           idRecord=datain.get("IdRecord")+"";
           DateRecord.getJFormattedTextField().setText(datain.get("DateRecord")+"");
           NameInguiry.setSelectedItem(datain.get("NameInguiry")+"");
           DetailRecord.setText(datain.get("DetailRecord")+"");
              
           }
       
       else{
         
       isInsert=true;
       caseId.setText(RecordInvestigatorView.caseId.getText());
       
       }
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        caseId = new javax.swing.JLabel();
        jPanelDateRecord = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DetailRecord = new javax.swing.JTextArea();
        NameInguiry = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(4, 93, 179));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("เพิ่ม/แก้ไข บันทึกพนักงานสอบสวน");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(443, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel9.setText("วันที่ปฏิบัติ");

        jLabel10.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel10.setText("งานที่ปฏิบัติ");

        jLabel11.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel11.setText("พนักงานสอบสวนที่รับผิดชอบ");

        jButtonSave.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButtonSave.setText("บันทึก");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jPanelDateRecord.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        javax.swing.GroupLayout jPanelDateRecordLayout = new javax.swing.GroupLayout(jPanelDateRecord);
        jPanelDateRecord.setLayout(jPanelDateRecordLayout);
        jPanelDateRecordLayout.setHorizontalGroup(
            jPanelDateRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        jPanelDateRecordLayout.setVerticalGroup(
            jPanelDateRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        DetailRecord.setColumns(20);
        DetailRecord.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        DetailRecord.setLineWrap(true);
        DetailRecord.setRows(5);
        jScrollPane1.setViewportView(DetailRecord);

        NameInguiry.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        NameInguiry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(caseId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonSave)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelDateRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameInguiry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caseId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDateRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameInguiry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSave)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
 con=ConnectDatabase.connect();
        if(isInsert){
         String intAc="INSERT into RecordInquiry(DateRecord,NameInguiry,DetailRecord,CaseIdRecord) values(?,?,?,?) ";
//          String intCr="insert into CrimesCase(AnswerSuspect,AnswerAccuse) values(?,?) ";
        try {
           
           pst=con.prepareStatement(intAc);
           pst.setString(1,DateRecord.getJFormattedTextField().getText());
           pst.setString(2, NameInguiry.getSelectedItem()+"");
           pst.setString(3, DetailRecord.getText());
           pst.setString(4, caseId.getText());

            int response = JOptionPane.showConfirmDialog(jPanel1, "ต้องการบันทึกข้อมูล", "ยืนยัน",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if (response == JOptionPane.YES_OPTION) {
                           pst.execute();
                           System.out.println("SQLLLLL : "+intAc);
                         pst.close();
                            setVisible(false); 
                                } 
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
            
        }
          
        }
        else{
                 String intAcUp="UPDATE RecordInquiry set"
                            + " DateRecord=?,"
                            + " NameInguiry=?,"
                            + "DetailRecord=? where IdRecord=?";
//          String intCr="insert into CrimesCase(AnswerSuspect,AnswerAccuse) values(?,?) ";
        try {
           
           pst=con.prepareStatement(intAcUp);
           pst.setString(1, DateRecord.getJFormattedTextField().getText());
           pst.setString(2, NameInguiry.getSelectedItem()+"");
           pst.setString(3, DetailRecord.getText());
           pst.setString(4, idRecord);
            
          
            int response = JOptionPane.showConfirmDialog(jPanel1, "ต้องการบันทึกข้อมูล", "ยืนยัน",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if (response == JOptionPane.YES_OPTION) {
                           pst.execute();
                              System.out.println("SQLLLLL : "+intAcUp);
                         pst.close();
                            setVisible(false); 

                                } 
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Cannot Saved successfully");
            
        }
                
                }
                                    
    }//GEN-LAST:event_jButtonSaveActionPerformed
    public void comboInvest(){
    
     try {

         Connection con2 = ConnectDatabase.connect();
	Statement st = con2.createStatement();
        	String c = "Select InvestName,InvestRank from InvestInformation";
        	ResultSet res = st.executeQuery(c);
	//Vector<Object> v=new Vector<Object>();
	
	if(res.next())
	{
	NameInguiry.addItem(res.getString("InvestRank")+res.getString("InvestName"));	
	}

	
}
catch (Exception d) {  //System.out.println(d);  
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
            java.util.logging.Logger.getLogger(RecordInvestigatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordInvestigatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordInvestigatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordInvestigatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new RecordInvestigatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DetailRecord;
    private javax.swing.JComboBox<String> NameInguiry;
    private javax.swing.JLabel caseId;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDateRecord;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
