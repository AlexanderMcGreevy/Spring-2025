package src.gui_lab;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class ShippingView extends JFrame {

    ShippingForm form;
    ShippingQueue queue;

    public ShippingView() {


        form = new ShippingForm();//.getMainPanel();
        //initialize the queue for the gui
        initQueue();
        //handle the event handlers for the buttons
        handleEvents();
        this.setContentPane(form.getMainPanel());
        this.pack();
        this.setVisible(true);

    }
    private void handleEvents() {
        form.getAddButton().addActionListener(e-> {
            queue.addOrder(new Order(null, null, LocalDateTime.now().getMinute() % 4));
            initQueue();
        });

        form.getRemoveButton().addActionListener(e ->{
                Order shippedOrder = (Order) queue.removeItem();
                if (shippedOrder != null) {
                    form.getDetailsTF.setText("Shipped Item: "+ shippedOrder.getOrderNumber());
                }
                else{
                    form.getDetailsTF.setText("No more orders on the shipping queue");
                }
                initQueue();
        });
        form.getExitButton().addActionListener(e->System.exit(0));

        form.getRetrieveButton().addActionListener(e->{
            int index = form.getQueueCB().getSelectedIndex();
            form.getDetailsTF().setText("Details: "+ queue.getShippingQueue().get(index));
        });

    }

    private void initQueue() {
        LinkedList<Order> orders = queue.getShippingQueue();
                form.getQueueCB().setModel(new DefaultComboBoxModel(orders.toArray()));
    }

    public static void main(String[] args) {
        new ShippingView();
    }
}
