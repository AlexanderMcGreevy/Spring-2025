package src.mvc.view;

import javax.swing.*;

public class StringForm {
    private JButton reverseBtn;
    private JTextField numTF;
    private JButton addBtn;
    private JLabel txtLbl;
    private JPanel MainPanel;

    public JButton getReverseBtn() {
        return reverseBtn;
    }

    public JTextField getNumTF() {
        return numTF;
    }

    public JButton getAddBtn() {
        return addBtn;
    }

    public JLabel getTxtLbl() {
        return txtLbl;
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }


    public void setReverseBtn(JButton reverseBtn) {
        this.reverseBtn = reverseBtn;
    }

    public void setNumTF(JTextField numTF) {
        this.numTF = numTF;
    }

    public void setAddBtn(JButton addBtn) {
        this.addBtn = addBtn;
    }

    public void setTxtLbl(JLabel txtLbl) {
        this.txtLbl = txtLbl;
    }

    public void setMainPanel(JPanel mainPanel) {
        MainPanel = mainPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
