/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Person;
import Business.PersonDirectory;
import Business.UserAccount;
import Business.UserDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepak
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private UserDirectory userAccountDirectory;
    private JPanel userProcessContainer;
    private  PersonDirectory personDirectory;
    
    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageUserAccountJPanel(UserDirectory userDirectory, JPanel jp, PersonDirectory personDirectory1) {
        initComponents();
        this.userAccountDirectory=userDirectory;
        this.userProcessContainer=jp;
        this.personDirectory=personDirectory1;
        populateUserAccountTable();
        populatePersonComboBox();
        populateRoleComboBox();
    }
    
    private void populateUserAccountTable(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        for(UserAccount userAccount : userAccountDirectory.getUserAccountList()){
            Object[] row = new Object[2];
            row[0] = userAccount;
            row[1]=userAccount.getPerson().getName();
            
            model.addRow(row);
        }
    }
    
    private void populatePersonComboBox(){
        PersonjComboBox1.removeAllItems();
        for(Person person : personDirectory.getPersonList()){
            PersonjComboBox1.addItem(person);
        }
    }
    
    private void populateRoleComboBox(){
        RolejComboBox2.removeAllItems();
        RolejComboBox2.addItem(userAccountDirectory.ADMIN_ROLE);
        RolejComboBox2.addItem(userAccountDirectory.SUPPLIER_ROLE);
        RolejComboBox2.addItem(userAccountDirectory.CUSTOMER_ROLE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsernamejTextField1 = new javax.swing.JTextField();
        PasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        PersonjComboBox1 = new javax.swing.JComboBox();
        CreatejButton1 = new javax.swing.JButton();
        BackjButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RolejComboBox2 = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Person"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("Person");

        PersonjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CreatejButton1.setText("Create");
        CreatejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatejButton1ActionPerformed(evt);
            }
        });

        BackjButton1.setText("<<Back");
        BackjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackjButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Manage User Account");

        jLabel5.setText("Role");

        RolejComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(BackjButton1)
                                    .addComponent(jLabel5))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PersonjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(UsernamejTextField1)
                                        .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(RolejComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CreatejButton1))
                                .addGap(241, 241, 241))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UsernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(PersonjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RolejComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreatejButton1)
                    .addComponent(BackjButton1))
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreatejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatejButton1ActionPerformed
        // TODO add your handling code here:
        Person person = (Person) PersonjComboBox1.getSelectedItem();
        String role = (String) RolejComboBox2.getSelectedItem();
        String username = UsernamejTextField1.getText();
        String password = String.valueOf(PasswordField1.getPassword());
        
        UserAccount userAccount = userAccountDirectory.createAndAddUserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setPerson(person);
        
        populateUserAccountTable();
    }//GEN-LAST:event_CreatejButton1ActionPerformed

    private void BackjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackjButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackjButton1;
    private javax.swing.JButton CreatejButton1;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JComboBox PersonjComboBox1;
    private javax.swing.JComboBox RolejComboBox2;
    private javax.swing.JTextField UsernamejTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}