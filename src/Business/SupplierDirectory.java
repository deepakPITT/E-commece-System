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
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory(){
        supplierList = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public Supplier newSupplier(){
        Supplier supp = new Supplier();
        supplierList.add(supp);
        return supp;
    }
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }

}
