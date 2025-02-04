package boardgame;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BoardLoader {

    public static void main(String[] args) {
        List<BoardLocation> locations=new ArrayList<>();
        locations.add(new BoardLocation("GQ", 0,""));
        locations.add(new PropertyLocation("PA Ave", 24, "",Color.GREEN,300,125));

        locations.forEach(l->{});
    }
}
