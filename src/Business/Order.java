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
public class Order {
    
    private static int count=0;
    private int orderID;
    private ArrayList<OrderItem> orderItemList;
    
    public Order(){
        ++count;
        
        orderID = count;
        orderItemList = new ArrayList<>();
    }

    public int getOrderID() {
        return orderID;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public OrderItem createAndAddOrderItem(){
        OrderItem orderItem = new OrderItem();
        orderItemList.add(orderItem);
        return orderItem;
    }
}
