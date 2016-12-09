/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author BaZinGa
 */
public class NetBankingPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetBankingPanel
     * @param parentFrame
     * @param companyName
     */
    public NetBankingPanel(JFrame parentFrame,String companyName) {
        initComponents();
        this.parentFrame=parentFrame;
        this.companyName=companyName;
        this.buttonGroup=new ButtonGroup();
        this.buttonGroup.add(this.sbiRadioButton);
        this.buttonGroup.add(this.iciciRadioButton);
        this.buttonGroup.add(this.hdfcRAdioButton);
        
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
        jLabel2 = new javax.swing.JLabel();
        sbiRadioButton = new javax.swing.JRadioButton();
        iciciRadioButton = new javax.swing.JRadioButton();
        hdfcRAdioButton = new javax.swing.JRadioButton();
        bankComboBox = new javax.swing.JComboBox();
        payButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PAY VIA NET-BANKING");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SELECT YOUR BANK:");

        sbiRadioButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sbiRadioButton.setText("State Bank India");
        sbiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbiRadioButtonActionPerformed(evt);
            }
        });

        iciciRadioButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iciciRadioButton.setText("ICICI Bank");
        iciciRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iciciRadioButtonActionPerformed(evt);
            }
        });

        hdfcRAdioButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hdfcRAdioButton.setText("HDFC Bank");
        hdfcRAdioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hdfcRAdioButtonActionPerformed(evt);
            }
        });

        bankComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Other Banks", "Punjab National Bank", "Kotak Mahindra Bank", "Bank Of Maharashtra","U.C.O bank" }));
        bankComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankComboBoxActionPerformed(evt);
            }
        });

        payButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        payButton.setText("Pay Now");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sbiRadioButton)
                            .addComponent(hdfcRAdioButton)
                            .addComponent(iciciRadioButton))))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(payButton)
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sbiRadioButton))
                .addGap(18, 18, 18)
                .addComponent(iciciRadioButton)
                .addGap(18, 18, 18)
                .addComponent(hdfcRAdioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(bankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sbiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbiRadioButtonActionPerformed
        // TODO add your handling code here:
        this.bankComboBox.setSelectedIndex(0);
        this.revalidate();
        this.repaint();
        this.selectedBank="State Bank Of India";
    }//GEN-LAST:event_sbiRadioButtonActionPerformed

    private void iciciRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iciciRadioButtonActionPerformed
        // TODO add your handling code here:
        this.bankComboBox.setSelectedIndex(0);
        this.revalidate();
        this.repaint();
        this.selectedBank="ICICI Bank";
    }//GEN-LAST:event_iciciRadioButtonActionPerformed

    private void bankComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankComboBoxActionPerformed
        // TODO add your handling code here:
        switch (this.bankComboBox.getSelectedIndex()) {
            case 1:
                this.buttonGroup.clearSelection();
                this.revalidate();
                this.repaint();
                this.selectedBank="Punjab National Bank";
                break;
            case 2:
                this.buttonGroup.clearSelection();
                this.revalidate();
                this.repaint();
                this.buttonGroup.setSelected(this.buttonGroup.getSelection(), false);
                this.selectedBank="Kotak Mahindra Bank";
                break;
            case 3:
                this.buttonGroup.clearSelection();
                this.revalidate();
                this.repaint();
                this.buttonGroup.setSelected(this.buttonGroup.getSelection(), false);
                this.selectedBank="Bank Of Maharashtra";
                break;
            case 4:
                this.buttonGroup.clearSelection();
                this.revalidate();
                this.repaint();
                this.buttonGroup.setSelected(this.buttonGroup.getSelection(), false);
                this.selectedBank="UCo Bank";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_bankComboBoxActionPerformed

    private void hdfcRAdioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hdfcRAdioButtonActionPerformed
        // TODO add your handling code here:
        this.revalidate();
        this.repaint();
        this.bankComboBox.setSelectedIndex(0);
        this.selectedBank="HDFC Bank";
    }//GEN-LAST:event_hdfcRAdioButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
        System.out.println(this.selectedBank);
        if(this.selectedBank==null){
            JOptionPane.showMessageDialog(this,"Select A Bank First !");
        }
        else{
            try(MongoClient mongoClient = new MongoClient("localhost",27017)) {
                DB db=mongoClient.getDB("rpu");
                DBCollection dBCollection=db.getCollection("payments");
                BasicDBObject basicDBObject=new BasicDBObject("CompanyName",this.companyName);
                SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd:MM:yyyy");
                Date date=new Date();
                basicDBObject.append("dateofPayment",simpleDateFormat.format(date));
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(Calendar.DAY_OF_MONTH ,1);
                date=calendar.getTime();
                basicDBObject.append("dateofExpiry",simpleDateFormat.format(date));
                basicDBObject.append("PaymentMethod","NetBanking");
                dBCollection.insert(basicDBObject);
                dBCollection=db.getCollection("AllRegisteredCompanies");
                basicDBObject=new BasicDBObject("$set",new BasicDBObject("accountType","Paid"));
                BasicDBObject findBy=new BasicDBObject("company_name",this.companyName);
                dBCollection.update(findBy, basicDBObject);
                JOptionPane.showMessageDialog(this, "Payment SucccessFul using "+this.selectedBank);
                this.setVisible(false);
                CompanyPage companyPage=new CompanyPage(this.companyName,"Paid");
                companyPage.setVisible(true);
                this.parentFrame.setVisible(false);
                this.parentFrame.dispose();
            }catch(Exception e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_payButtonActionPerformed
    
    private JFrame parentFrame;
    private String selectedBank,companyName;
    ButtonGroup buttonGroup;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bankComboBox;
    private javax.swing.JRadioButton hdfcRAdioButton;
    private javax.swing.JRadioButton iciciRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton payButton;
    private javax.swing.JRadioButton sbiRadioButton;
    // End of variables declaration//GEN-END:variables
}