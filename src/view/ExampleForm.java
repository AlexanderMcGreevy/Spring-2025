package src.view;

import javax.swing.*;

public class ExampleForm {
    private JPanel mainPanel;
    private JTextField enterYourNameTextField;
    private JButton submitButton;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTextField getText() {
        return enterYourNameTextField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public ExampleForm getNameTF() {
        return enterYourNameTextField;
    }
}
