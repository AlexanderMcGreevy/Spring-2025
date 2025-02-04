package src.controller;

import src.view.ExampleForm;
import src.view.ExampleView;

public class ExampleController {
    private ExampleView view;

    public ExampleController(ExampleForm exampleForm) {
        this.view = view;

        this.view.getExampleForm().getSubmitButton().addActionListener(e -> {
            System.out.println(this.view.getExampleForm().getNameTF().getText());
        }

    }
}



