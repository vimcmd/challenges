package Games.snake.java;

import com.googlecode.lanterna.terminal.Terminal;

import java.util.LinkedList;


public class Figure {
    // LinkedList used due to the presence of getLast() and getFirst() methods
    protected LinkedList<Point> pointList;

    public void draw(Terminal terminal) {
        for (Point p : this.pointList) {
            p.draw(terminal);
        }
    }
}
