package Games.snake.java;

import com.googlecode.lanterna.terminal.Terminal;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Food
{
    private int mapWidth;
    private int mapHeight;
    private char symbol;

    //    private Random random;

    public Food(Terminal terminal, char symbol)
    {
        this.mapWidth = terminal.getTerminalSize().getColumns();
        this.mapHeight = terminal.getTerminalSize().getRows();
        this.symbol = symbol;
    }

    public Point createFood()
    {
//        int x = random.nextInt((mapWidth - 1) + 1) + 1;
//        int y = random.nextInt((mapHeight -1) + 1) + 1;

        int x = ThreadLocalRandom.current().nextInt(1, this.mapWidth + 1);
        int y = ThreadLocalRandom.current().nextInt(1, this.mapHeight + 1);

        System.out.println("Food point: " + x + ", " + y);

        return new Point(x, y, this.symbol);
    }
}
