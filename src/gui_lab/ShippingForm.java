package src.gui_lab;

import javax.swing.*;
import java.awt.*;

public class ShippingForm {
    public JLabel mainPanel;
    public Label getDetailsTF;
    private JButton addButton;
    private JComboBox comboBox1;
    private JTextField detailsTFTextField;
    private JButton retrieveButton;
    private JButton removeButton;
    private JButton exitButton;

    public JButton getAddButton() {
        return addButton;
    }

    public JComboBox getQueueCB() {
        return comboBox1;
    }

    public JTextField getDetailsTF() {
        return detailsTFTextField;
    }

    public JButton getRetrieveButton() {
        return retrieveButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JLabel getMainPanel() {
        return mainPanel;
    }
}