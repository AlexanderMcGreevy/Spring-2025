package src.mvc.model;

public class StringWrapperModel {
    private String text = "This is the initial text";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String reverseText() {
        return new StringBuilder(text).reverse().toString();
    }
}
