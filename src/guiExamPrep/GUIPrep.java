package src.guiExamPrep;

import javax.swing.*;
import java.awt.*;

public class GUIPrep {
    private JPanel panel1;
    private JButton addButton1;
    private JButton turnRedButton1;
    private JButton addButton;
    private JButton clearButton1;
    private JButton exitButton1;
    private JButton turnRedButton;
    private JButton clearButton;
    private JButton exitButton;
    private JPanel fieldPanel;
    private JPanel buttPan1;
    private JPanel ButtPan2;

    public GUIPrep() {
        assert turnRedButton1 != null;
        turnRedButton1.addActionListener(e -> fieldPanel.setBackground(Color.RED));
        assert turnRedButton != null;
        turnRedButton.addActionListener(e -> fieldPanel.setBackground(Color.RED));
        addButton.addActionListener(e -> {
            JLabel label = new JLabel("Form"+fieldPanel.getComponentCount());
            fieldPanel.add(label);
            fieldPanel.revalidate();
            fieldPanel.repaint();
        });
        addButton1.addActionListener(e -> {
            JLabel label = new JLabel("Form"+fieldPanel.getComponentCount());
            fieldPanel.add(label);
            fieldPanel.revalidate();
            fieldPanel.repaint();
        });
    }


    public JPanel getPanel1() {
        return panel1;
    }

    public JButton getAddButton1() {
        return addButton1;
    }

    public JButton getTurnRedButton1() {
        return turnRedButton1;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getClearButton1() {
        return clearButton1;
    }

    public JButton getExitButton1() {
        return exitButton1;
    }

    public JButton getTurnRedButton() {
        return turnRedButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JPanel getFieldPanel() {
        return fieldPanel;
    }

    public JPanel getButtPan1() {
        return buttPan1;
    }

    public JPanel getButtPan2() {
        return ButtPan2;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GUIPrep guiPrep = new GUIPrep();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(guiPrep.getPanel1());
        frame.setVisible(true);

    }
}
