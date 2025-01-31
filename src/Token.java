import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Token implements IMover, MouseListener
{
    public String tokenName;
    public String figure;

    public Token(String tokenName, String figure) {
        this.tokenName = tokenName;
        this.figure = figure;
    }

    public String getTokenName() {
        return tokenName;
    }

    public String getFigure() {
        return figure;
    }


    @Override
    public void moveSpaces() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
