/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.songkhla.wordgen;

import static com.songkhla.wordgen.ListAccused.jTableAccure;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.json.simple.JSONObject;

/**
 *
 * @author Matazz
 */
public class AssetOverView extends javax.swing.JFrame {


    /** Creates new form Asset */
    public AssetOverView() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        RefreshData();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EvidenceRecordNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtCaseNO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAsset = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(77, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ทรัพย์(อาญา)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel1.setText("สมุดยึดทรัพย์ของกลางลำดับที่");

        EvidenceRecordNumber.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        EvidenceRecordNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvidenceRecordNumberActionPerformed(evt);
            }
        });

        jButton1.setBackground(java.awt.SystemColor.windowText);
        jButton1.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("เพิ่ม");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.SystemColor.windowText);
        jButton2.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ลบ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.SystemColor.windowText);
        jButton3.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("แก้ไข");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtCaseNO.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel2.setText("เลขคดี");

        jTableAsset.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jTableAsset.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รายการ", "จำนวน", "เลขคดี"
            }
        ));
        jTableAsset.setGridColor(new java.awt.Color(255, 255, 255));
        jTableAsset.setRowHeight(25);
        jTableAsset.setRowMargin(2);
        jTableAsset.setSelectionBackground(new java.awt.Color(77, 0, 0));
        jScrollPane2.setViewportView(jTableAsset);
        jTableAsset.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EvidenceRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCaseNO, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(585, 585, 585))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EvidenceRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaseNO)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EvidenceRecordNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvidenceRecordNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EvidenceRecordNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         AssetNewEdit  AssetAdd=new AssetNewEdit(this,null);
         AssetAdd.setVisible(true);        
          RefreshData();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           if(jTableAsset.getSelectedRow()>=0){
            try{
                String crimecaseno = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 3)+"";
//                String EvidenceRecordNumber = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 1)+"";
//                String name = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 2)+"";
                String sql = "Delete from Asset WHERE crimecaseno='"+crimecaseno+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);
                

               // System.out.println("SQL : "+sql);
                stmt.close();
                RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        if(jTableAsset.getSelectedRow()>=0){
            try{
                String crimecaseno = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 3)+"";
//                String EvidenceRecordNumber = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 1)+"";
//                String Name = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 2)+"";
                String sql = "select * from Asset where crimecaseno='"+crimecaseno+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery(sql);
                       //  Convert CrimcaseEdit to JFrame   
                     JFrame frame = new JFrame();
                     JDialog dialog = new JDialog(frame);//frame is owner
                    JFrame f = (JFrame)(dialog.getParent());
                     f.removeAll();
                if(rs.next()){
                    JSONObject data = new JSONObject();
                    data.put("EvidenceRecordNumber", rs.getString("EvidenceRecordNumber"));
                    data.put("crimecaseno", rs.getString("crimecaseno"));
                    data.put("Name", rs.getString("Name"));
                             //  Convert CrimcaseEdit to JFrame   
                    //  JFrame frame = new JFrame();
                   //   JDialog dialog = new JDialog(frame);//frame is owner
                   //   JFrame f = (JFrame)(dialog.getParent());
                   //   f.removeAll();
                      
                            AssetNewEdit af=new AssetNewEdit(this,data);
                            af.setVisible(true);    		
                }
              
                rs.close();
                stmt.close();
       //   RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }else{

        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AssetOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssetOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssetOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssetOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssetOverView().setVisible(true);
            }
        });
    }
     public void RefreshData(){
        try{
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
        String sql = "select EvidenceRecordNumber,Amount,DateSequester,DefectMark,PlaceFoundExhibit,Name,Note,OccupantName,OrderAsset,PointFoundCheck,Value,crimecaseno from Asset  "+getFilterCondition();
        ResultSet rs = stmt.executeQuery(sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();
            row.add(rs.getString("Name"));
            row.add(rs.getString("Amount"));
            row.add(rs.getString("Value"));
            row.add(rs.getString("crimecaseno"));
            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector();
        ColumnName.add("ชื่อของกลาง");
        ColumnName.add("จำนวน");
        ColumnName.add("ราคา");
        ColumnName.add("เลขคดี");
    
        jTableAsset.setModel(new javax.swing.table.DefaultTableModel(
            tabledata,
            ColumnName
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
                             System.out.println("SQL : "+sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
      private String getFilterCondition(){
        HashMap<String,String> filter = new HashMap<String,String>();
        if(txtCaseNO.getText().trim().length()>0){
            filter.put("crimecaseno", txtCaseNO.getText().trim());
        }
        
        String[] key = filter.keySet().toArray(new String[0]);
        String result="";
        for(int i=0;i<key.length;i++){
            if(i==0){
                result=" where ";
            }
            if(i==key.length-1){
                result+= " "+key[i]+" LIKE '%"+filter.get(key[i])+"%'";
            }else{
                result+= " "+key[i]+" LIKE "+filter.get(key[i])+"  and ";
            }
          //  System.out.println(result);
        }
        
        return result;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EvidenceRecordNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableAsset;
    private javax.swing.JTextField txtCaseNO;
    // End of variables declaration//GEN-END:variables

}
