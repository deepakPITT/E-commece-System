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
public class MasterOrderList {
 
    private ArrayList<Order> orderList;
    
    public MasterOrderList(){
        orderList = new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(Order order){
        orderList.add(order);
    }
}
