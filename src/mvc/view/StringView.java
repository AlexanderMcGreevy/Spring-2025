package src.mvc.view;

import javax.swing.*;

public class StringView extends JFrame{
    private StringForm form;

    public StringView() {
        this.form = new StringForm();
        JPanel content = form.getMainPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Hello World GUI");
    }
    public StringForm form() {return form;}


    public static void main(String[] args) {
        new StringView().setVisible(true);
    }

}
