/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package UserInterface.AdministrativeRole;

import Business.PersonDirectory;
import Business.SupplierDirectory;
import Business.UserDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  Deepak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    private SupplierDirectory supplierDir;
    private UserDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, SupplierDirectory supplierDir, UserDirectory userDirectory, PersonDirectory personDirectory1) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDir = supplierDir;
        this.userAccountDirectory=userDirectory;
        this.personDirectory=personDirectory1;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managesuppliersButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ManagePersonjButton1 = new javax.swing.JButton();
        ManageUserAccountjButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        managesuppliersButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managesuppliersButton1.setText("Manage Suppliers >>");
        managesuppliersButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managesuppliersButton1ActionPerformed(evt);
            }
        });
        add(managesuppliersButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 260, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Aminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        ManagePersonjButton1.setText("Manage Person");
        ManagePersonjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagePersonjButton1ActionPerformed(evt);
            }
        });
        add(ManagePersonjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 260, -1));

        ManageUserAccountjButton2.setText("Manage User Account");
        ManageUserAccountjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageUserAccountjButton2ActionPerformed(evt);
            }
        });
        add(ManageUserAccountjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void managesuppliersButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managesuppliersButton1ActionPerformed
        ManageSuppliersJPanel msjp = new ManageSuppliersJPanel(userProcessContainer, supplierDir);
        userProcessContainer.add("ManageSuppliersJPanel", msjp);
        
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managesuppliersButton1ActionPerformed

    private void ManagePersonjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagePersonjButton1ActionPerformed
        // TODO add your handling code here:
        ManagePersonJPanel msjp = new ManagePersonJPanel(personDirectory, userProcessContainer);
        userProcessContainer.add("ManageSuppliersJPanel", msjp);
        
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManagePersonjButton1ActionPerformed

    private void ManageUserAccountjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageUserAccountjButton2ActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel msjp = new ManageUserAccountJPanel(userAccountDirectory, userProcessContainer,personDirectory);
        userProcessContainer.add("ManageSuppliersJPanel", msjp);
        
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageUserAccountjButton2ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManagePersonjButton1;
    private javax.swing.JButton ManageUserAccountjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managesuppliersButton1;
    // End of variables declaration//GEN-END:variables
    
}
