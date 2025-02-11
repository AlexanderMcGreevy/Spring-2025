package src.gui_lab;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Stores the Order details for the Shipping Queue
 * 
 * @author smv159
 */
public class Order {

    private static int ORDER_COUNTER = 0;
    private ArrayList<String> orderItemList;
    private String orderNumber;
    private LocalDateTime orderDate;
    private int shippingPriority;
    
    public Order(ArrayList<String> orderList, LocalDateTime ordered, int priority) {
        orderItemList = orderList == null ? new ArrayList<>() : orderList;
        orderDate = ordered == null ? LocalDateTime.now() : ordered;
        orderNumber = "ABC-" + String.format("%04d",ORDER_COUNTER++);
        shippingPriority = priority;
    }

    /**
     * Getter Method
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Determines if the new {@code Order} should be Inserted before the
     * current {@code Order}
     * @param order
     * @return true if better priority and/or date
     */
    public boolean decideToInsert(Object order){
        boolean decision = false;
        // you will be implementing this in an activity
        //Cast to Order
        //Check priority    -> if < then return true
        if (((Order) order).shippingPriority < this.shippingPriority)
            return true;
        //                  -> if == then check date
        //Check date        -> if < then return true
        if (((Order) order).shippingPriority == this.shippingPriority &&
        ((Order) order).orderDate.isBefore(this.orderDate))
            return true;
        //else
        return decision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return shippingPriority == order.shippingPriority && Objects.equals(orderItemList, order.orderItemList) && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderItemList, orderNumber, orderDate, shippingPriority);
    }

    public String toString() {
        return this.getClass().getSimpleName() +
                ": #" + orderNumber +
                " - " + orderDate +
                " w/ Priority: " + shippingPriority;
    }
}
