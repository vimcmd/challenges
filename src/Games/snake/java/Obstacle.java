package Games.snake.java;

import com.googlecode.lanterna.terminal.Terminal;

import java.util.ArrayList;
import java.util.List;

public class Obstacle extends Figure
{
    private static final char DEFAULT_OBSTACLE_CHAR = '%';

    public Obstacle(int startPosX, int startPosY, char ch, boolean horizontal, int length)
    {
        pointList = new ArrayList<>();

        for (int i = 0; i < length; i++)
        {
            pointList.add(new Point(startPosX, startPosY, ch));

            if (horizontal)
            {
                startPosX += 1;
            } else
            {
                startPosY += 1;
            }
        }
    }

    public Obstacle(int x, int y, boolean horizontal, int length)
    {
        this(x, y, '#', horizontal, length);
    }

    public static void initBorders(Terminal terminal)
    {
        int lengthX = terminal.getTerminalSize().getColumns();
        int lengthY = terminal.getTerminalSize().getRows();

        List<Obstacle> borders = new ArrayList<>();

        borders.add(new Obstacle(0, 0, DEFAULT_OBSTACLE_CHAR, true, lengthX)); // top
        borders.add(new Obstacle(0, lengthY - 1, DEFAULT_OBSTACLE_CHAR, true, lengthX)); // bottom
        borders.add(new Obstacle(0, 0, DEFAULT_OBSTACLE_CHAR, false, lengthY)); // left
        borders.add(new Obstacle(lengthX - 1, 0, DEFAULT_OBSTACLE_CHAR, false, lengthY)); // right

        for (Obstacle o : borders)
        {
            o.draw(terminal);
        }


    }

}
