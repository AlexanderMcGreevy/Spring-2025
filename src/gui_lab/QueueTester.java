package src.gui_lab;

import java.time.LocalDateTime;
import java.util.List;

public class QueueTester {
    public static void main(String[] args) {
        ShippingQueue shipper = new ShippingQueue();
        //Test Added
        shipper.addOrder(new Order(null, LocalDateTime.now(), 1));
        //Test get
        Order finder = (Order) shipper.getItem("0041").get(0);
        System.out.println("Find: " + shipper.getItem("0041"));
        //Test remove
        finder = (Order) shipper.removeItem(finder);
        System.out.println("Remove: " + finder);
        List<Order> ordersFound = shipper.getItem("0041");
        System.out.println("Find: " +
                (ordersFound.size() == 0 ? "NOT FOUND" : ordersFound.get(0)));
    }
}
