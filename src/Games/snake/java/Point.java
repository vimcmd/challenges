package Games.snake.java;

import com.googlecode.lanterna.terminal.Terminal;

// TODO can be extended from java.awt.Point
public class Point {
    private int x;
    private int y;
    private char ch;

    public Point(int x, int y, char ch) {
        this.x = x;
        this.y = y;
        this.ch = ch;
    }

    public Point(int x, int y) {
        this(x, y, '#');
    }

    public Point(Point p) {
        this(p.x, p.y, p.ch);
    }

    // TODO add checkIntersection method,
    public void draw(Terminal terminal) {
        terminal.moveCursor(this.x, this.y);
        terminal.putCharacter(this.ch);
        terminal.moveCursor(0, 0);
    }

    public void clear() {
        this.ch = ' ';
        this.draw(Application.terminal);
    }

    public void move(int offset, Direction direction) {
        switch (direction) {
            case LEFT: this.x -= offset;
                break;
            case RIGHT: this.x += offset;
                break;
            case UP: this.y -= offset;
                break;
            case DOWN: this.y += offset;
                break;
        }
    }

    @Override
    public String toString() {
        return this.x + ", " + y + ", " + ch;
    }

}
