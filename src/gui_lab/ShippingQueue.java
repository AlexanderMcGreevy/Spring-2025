package src.gui_lab;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Uses a Linked List to create a Shipping Queue
 *
 * @author smv159
 */
public class ShippingQueue {

    private LocalDateTime startDate; //The date this queue was started
    private LinkedList<Order> ordersToShip = new LinkedList<Order>();

    public ShippingQueue() {
        this.setStartDate();
        this.buildShippingQueue();
        this.printShippingQueue();
    }

    /**
     * Setter method
     */
    public void setStartDate() {
        this.startDate = LocalDateTime.now();
    }

    /**
     * Helper method, builds a Shipping Queue for testing
     */
    public void buildShippingQueue() {
        //Add a first order to 'seed' the list
        this.ordersToShip.add(new Order(null, this.startDate, 1));
        //This loop adds 40 more test orders
        for (int i = 0; i < 40; i++) {
            this.addOrder(
                    new Order(null, this.startDate.plusMinutes(i%30), i%3));
        }
    }

    /**
     * Adds an {@code Order} to the Shipping Queue in the correct location
     * @param newOrder
     */
    public void addOrder(Order newOrder) {
        boolean orderAdded = false;
        boolean insertDecision = false;
        ListIterator<Order> orderIterator = ordersToShip.listIterator();
        //Loop to determine where to insert the new Order
        while (orderIterator.hasNext()) {
            insertDecision = orderIterator.next().decideToInsert(newOrder);
            if (insertDecision) {
                ordersToShip.add(orderIterator.previousIndex(), newOrder);
                orderAdded = true;
                break;
            }
        }
        //Order not added in loop - i.e., it belongs at end
        if (orderAdded == false) {
            //Add to end of list if not added in loop
            ordersToShip.add(newOrder);
        }
    }

    /**
     * Helper method to output the Shipping Queue, sorted
     */
    public void printShippingQueue() {
        ListIterator<Order> orderIterator = ordersToShip.listIterator();
        while (orderIterator.hasNext()) {
            System.out.println(orderIterator.next().toString());
        }
    }

    /**
     * Add new item to the Shipping Queue
     * @param order
     */
    public void addItem(Object order) {
        addOrder((Order) order);
    }

    /**
     * Remove an item from the Shipping Queue
     * @param objectToRemove
     * @return {@code Order} that is removed, null if not found
     */
    public Object removeItem(Object objectToRemove){
        ListIterator<Order> orderIterator = ordersToShip.listIterator();
        //Loop to determine where to insert the new Order
        while (orderIterator.hasNext()) {
            Order curOrder = orderIterator.next();
            if (curOrder.equals(objectToRemove)) {
                orderIterator.remove();
                return curOrder;
            }
        }
        return null;
    }

    /**
     * Searches for a specific Order
     * @param searchTerm term to find in the OrderNumber
     * @return {@code List} or {@code Order} values
     */
    public List<Order> getItem(String searchTerm) {
        List<Order> orders = new ArrayList<>();

        ListIterator<Order> orderIterator = ordersToShip.listIterator();
        //Loop to determine where to insert the new Order
        while (orderIterator.hasNext()) {
            Order curOrder = orderIterator.next();
            if (curOrder.getOrderNumber().contains(searchTerm)) {
                orders.add(curOrder);
            }
        }
        return orders;
    }

    /**
     * Returns the first item from the Shipping Queue
     * This simulates it shipping the item
     * @return {@code Order}
     */
    public Object removeItem() {
        //Removes the 1st item off the Shipping Queue
        //AKA ships the item
        if (ordersToShip.isEmpty()){
            return null;
        }
        return ordersToShip.pop();
    }

    public LinkedList<Order> getShippingQueue() {
        return ordersToShip;
    }


}
