package Games.snake.java;

import com.googlecode.lanterna.terminal.Terminal;

import java.util.List;


public class Figure {
    protected List<Point> pointList;

    public void Draw(Terminal terminal) {
        for (Point p : this.pointList) {
            p.Draw(terminal);
        }
    }
}
