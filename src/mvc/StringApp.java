package src.mvc;
import src.mvc.model.StringWrapperModel;
import src.mvc.view.StringView;


public class StringApp {
    public static void main(String[] args) {
        StringWrapperModel model = new StringWrapperModel();
        StringView view = new StringView();
        StringController controller = new StringController(model, view);
        view.setVisible(true);
    }
}
