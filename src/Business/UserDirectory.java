/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class UserDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public static final String ADMIN_ROLE = "Admin";
    public static final String SUPPLIER_ROLE = "Supplier";
    public static final String CUSTOMER_ROLE = "Customer";
    
    public UserDirectory(){
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
 
    public UserAccount authenticate (String username, String password){
       UserAccount userAccount = null;
       for(UserAccount ua : userAccountList){
           if(ua.getUserName().equals(username)&& ua.getPassword().equals(password)){
               userAccount=ua;
               break;
           }
       }
       return userAccount;
    }
    
    public UserAccount createAndAddUserAccount(){
        UserAccount ua = new UserAccount();
        userAccountList.add(ua);
        return ua;
    }
}
