
package src.lock;

import javax.swing.*;

public class LockGUI {
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JButton SUBMITButton;
    private JButton resetButton;
    private JLabel label1;

    private IDialLock lock; // Persistent lock instance

    public LockGUI() {
        initComponents(); // Ensure GUI components are initialized
        lock = new LockImpl(10, 25, 15);  // Set a predefined lock combination

        resetButton.addActionListener(e -> {
            lock.reset();
            label1.setText("Lock is reset to 0");
        });

        SUBMITButton.addActionListener(e -> {
            lock.right((int) spinner1.getValue());
            lock.left((int) spinner2.getValue());
            lock.right((int) spinner3.getValue());

            if (lock.pull()) {
                label1.setText("Unlocked!");
            } else {
                label1.setText("Still Locked. Try again.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Lock GUI");
            LockGUI lockGui = new LockGUI();
            frame.setContentPane(lockGui.createContentPane());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }

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

    private void initComponents() {
        spinner1 = new JSpinner(new SpinnerNumberModel(0, 0, 39, 1));
        spinner2 = new JSpinner(new SpinnerNumberModel(0, 0, 39, 1));
        spinner3 = new JSpinner(new SpinnerNumberModel(0, 0, 39, 1));
        SUBMITButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        label1 = new JLabel("Lock is closed");
    }
}
