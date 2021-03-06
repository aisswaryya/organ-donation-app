/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Aissw
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form DoctorWorkAreaJPanell
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise) {
        
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        jLbEnterprise.setText(enterprise.getName());
    }

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, DoctorOrganization organization) {
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

        valueLblEnterprise = new javax.swing.JLabel();
        jLbEnterprise = new javax.swing.JLabel();
        jBAddRequest = new javax.swing.JButton();
        JBViewRequest = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();

        valueLblEnterprise.setText("Enterprise");

        jBAddRequest.setText("Add Request");
        jBAddRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddRequestActionPerformed(evt);
            }
        });

        JBViewRequest.setText("View Request");

        jBtnBack.setText("BACK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valueLblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBViewRequest)
                            .addComponent(jBAddRequest))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnBack)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(valueLblEnterprise, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jBAddRequest)
                .addGap(30, 30, 30)
                .addComponent(JBViewRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jBtnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddRequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAddRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBViewRequest;
    private javax.swing.JButton jBAddRequest;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JLabel jLbEnterprise;
    private javax.swing.JLabel valueLblEnterprise;
    // End of variables declaration//GEN-END:variables
}
