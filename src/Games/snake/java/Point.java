package Games.snake.java;

import com.googlecode.lanterna.terminal.Terminal;

// TODO can be extended from java.awt.Point
public class Point
{
    private int x;
    private int y;
    private char symbol;

    public Point(int x, int y, char symbol)
    {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    public Point(int x, int y)
    {
        this(x, y, '#');
    }

    public Point(Point p)
    {
        this(p.x, p.y, p.symbol);
    }

    // TODO add checkIntersection method,
    public void draw(Terminal terminal)
    {
        terminal.moveCursor(this.x, this.y);
        terminal.putCharacter(this.symbol);
        terminal.moveCursor(0, 0);
    }

    public char getSymbol()
    {
        return symbol;
    }

    public void setSymbol(char symbol)
    {
        this.symbol = symbol;
    }

    public boolean isHit(Point p)
    {
        return p.x == this.x && p.y == this.y;
    }

    public void clear()
    {
        this.symbol = ' ';
        this.draw(Application.terminal);
    }

    public void move(int offset, Direction direction)
    {
        switch (direction)
        {
            case LEFT:
                this.x -= offset;
                break;
            case RIGHT:
                this.x += offset;
                break;
            case UP:
                this.y -= offset;
                break;
            case DOWN:
                this.y += offset;
                break;
        }
    }

    @Override
    public String toString()
    {
        return this.x + ", " + y + ", " + symbol;
    }

}
