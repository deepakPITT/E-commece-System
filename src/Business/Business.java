/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Deepak
 */
public class Business {
    
    private UserDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private SupplierDirectory supplierDirectory;
    private MasterOrderList masterOrderList;
    
    public Business(){
        userAccountDirectory = new UserDirectory();
        personDirectory = new PersonDirectory();
        supplierDirectory = new SupplierDirectory();
        masterOrderList = new MasterOrderList();
        createAdminAccount();
    }
    
    private void createAdminAccount (){
        Person person = new Person();
        person.setName("Admin");
        
        UserAccount adminAccount = userAccountDirectory.createAndAddUserAccount();
        adminAccount.setUserName("admin");
        adminAccount.setPassword("admin");
        adminAccount.setRole(userAccountDirectory.ADMIN_ROLE);
        adminAccount.setPerson(person);
    }

    public UserDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }
}
