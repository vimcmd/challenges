package Games.snake.java;

import com.googlecode.lanterna.terminal.Terminal;
import java.util.List;
import java.util.ArrayList;

public class Obstacle extends Figure {

    public Obstacle(int startPosX, int startPosY, char ch, boolean horizontal, int length) {
        pointList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            pointList.add(new Point(startPosX, startPosY, ch));

            if (horizontal) {
                startPosX += 1;
            } else {
                startPosY += 1;
            }
        }
    }

    public static void initBorders(Terminal terminal) {
        int lengthX = terminal.getTerminalSize().getColumns();
        int lengthY = terminal.getTerminalSize().getRows();
        char borderCh = '%';

        List<Obstacle> borders = new ArrayList<>();

        borders.add( new Obstacle(0, 0, borderCh, true, lengthX) ); // top
        borders.add( new Obstacle(0, lengthY - 1, borderCh, true, lengthX) ); // bottom
        borders.add( new Obstacle(0, 0, borderCh, false, lengthY) ); // left
        borders.add( new Obstacle(lengthX - 1, 0, borderCh, false, lengthY) ); // right

        for (Obstacle o : borders) {
            o.draw(terminal);
        }


    }

    public Obstacle(int x, int y, boolean horizontal, int length) {
        this(x, y, '#', horizontal, length);
    }

}
