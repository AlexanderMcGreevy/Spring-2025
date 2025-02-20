package src.lock;

import javax.swing.*;

public class LockGUI {
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JButton SUBMITButton;
    private JButton resetButton;
    public JLabel label1;

    public LockGUI() {
        resetButton.addActionListener(e -> {
            spinner1.setValue(0);
            spinner2.setValue(0);
            spinner3.setValue(0);
            label1.setText("Lock is closed");
        });

        SUBMITButton.addActionListener(e -> {
            int secret1 = (int) spinner1.getValue();
            int secret2 = (int) spinner2.getValue();
            int secret3 = (int) spinner3.getValue();

            IDialLock lock = new LockImpl(secret1, secret2, secret3);
            if (lock.pull()) {
                label1.setText("Lock is open");
            } else {
                label1.setText("Lock is closed");
            }
        });
    }

    // Main method to run the GUI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Lock GUI");
            frame.setContentPane(new LockGUI().createContentPane());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }

    // Create ContentPane from the form
    private JPanel createContentPane() {
        JPanel panel = new JPanel();
        panel.add(spinner1);
        panel.add(spinner2);
        panel.add(spinner3);
        panel.add(SUBMITButton);
        panel.add(resetButton);
        panel.add(label1);
        return panel;
    }
}
