/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */

package UserInterface.CustomerRole;

import Business.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Deepak
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Product product;
    
  
    /** Creates new form CreateProductJPanel */
    public ViewProductDetailJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        
        nameField.setText(p.getName());
        priceField.setText(String.valueOf(p.getPrice()));
        idField1.setText(String.valueOf(p.getProductId()));
        
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
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        idField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 18));
        nameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 159, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel3.setText("Product Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        priceField.setEditable(false);
        priceField.setFont(new java.awt.Font("Tahoma", 0, 18));
        priceField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 159, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18));
        backButton1.setText("<< BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        idField1.setEditable(false);
        idField1.setFont(new java.awt.Font("Tahoma", 0, 18));
        idField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(idField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 159, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField idField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
    
}
