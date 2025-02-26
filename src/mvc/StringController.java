package src.mvc;

import src.mvc.model.StringWrapperModel;
import src.mvc.view.StringView;

public class StringController {
    private StringView view;
    private StringWrapperModel model;

    public StringController(StringWrapperModel model, StringView view) {
        this.model = model;
        this.view = view;

        this.view.form().getTxtLbl().setText(this.model.getText());


    }
}
