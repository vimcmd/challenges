package Games.snake.java;

import com.googlecode.lanterna.terminal.Terminal;

import java.util.List;


public abstract class Figure
{
    protected List<Point> pointList;

    public void draw(Terminal terminal)
    {
        for (Point p : pointList)
        {
            p.draw(terminal);
        }
    }
}
