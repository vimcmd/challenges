package Games.snake.java;

import com.googlecode.lanterna.terminal.Terminal;

import java.util.LinkedList;
import java.util.List;


public class Figure {
    // LinkedList used due to the presence of getLast() and getFirst() methods
    protected LinkedList<Point> pointList;

    public void Draw(Terminal terminal) {
        for (Point p : this.pointList) {
            p.Draw(terminal);
        }
    }
}
