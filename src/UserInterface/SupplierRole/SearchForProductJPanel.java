/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */
package UserInterface.SupplierRole;

import Business.Product;
import Business.ProductCatalog;
import UserInterface.CustomerRole.ViewProductDetailJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;



/**
 *
 * @author Deepak
 */
public class SearchForProductJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    ProductCatalog productCatalog;
   
    /** Creates new form CreateProductJPanel */
    public SearchForProductJPanel(JPanel upc, ProductCatalog pcat) {
      
        initComponents();
        userProcessContainer = upc;
        productCatalog = pcat;

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Search for Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 25, -1, 52));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product Id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 116, -1, -1));

        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 145, 250, -1));

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchButton.setText("Search Now >>");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 144, 160, -1));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if(idField.getText().equals("")){
            return;
        }
        Product p = productCatalog.findByID(Integer.parseInt(idField.getText()));
        if(p == null){
            return;
        }
        
        ViewProductDetailJPanel vjp = new ViewProductDetailJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductDetailJPanel",vjp);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
      
}//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
