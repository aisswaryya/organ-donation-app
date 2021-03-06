/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabTechnicianOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Aissw
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private LabTechnicianOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, LabTechnicianOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        jLblEnterprise.setText(enterprise.getName());
    }

    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, LabTechnicianOrganization organization) {
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnAddDonor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBtnViewReport = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        valueLbEnterprise = new javax.swing.JLabel();
        jLblEnterprise = new javax.swing.JLabel();
        jBtnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jBtnAddDonor.setText("ADD DONOR");
        jBtnAddDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddDonorActionPerformed(evt);
            }
        });

        jButton2.setText("ADD DIAGNOSIS RESULT");

        jBtnViewReport.setText("VIEW REPORT");

        jButton4.setText("GENERATE MATCH REPORT");

        valueLbEnterprise.setText("ENTERPRISE");

        jBtnBack.setText("BACK");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(valueLbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnBack)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnAddDonor)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnViewReport)
                        .addGap(284, 284, 284))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueLbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addComponent(jBtnAddDonor)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(14, 14, 14)
                .addComponent(jBtnViewReport)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jBtnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void jBtnAddDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddDonorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAddDonorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddDonor;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnViewReport;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblEnterprise;
    private javax.swing.JLabel valueLbEnterprise;
    // End of variables declaration//GEN-END:variables
}
