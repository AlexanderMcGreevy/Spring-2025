package src.view;
import src.controller.ExampleController;

import javax.swing.*;

public class ExampleView extends JFrame {
    private ExampleForm form;


    public ExampleView(ExampleForm form) {
        this.form = form;
        this.setContentPane(this.form.getMainPanel());

        this.pack();
        this.setVisible(true);

    }
    public ExampleForm getForm() {return this.form;}

    public ExampleForm getExampleForm() { return this.form; }
    }

