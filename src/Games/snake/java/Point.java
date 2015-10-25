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

    // TODO add checkIntersection method,

    public void Draw(Terminal terminal) {
        terminal.moveCursor(this.x, this.y);
        terminal.putCharacter(this.ch);
        terminal.moveCursor(0, 0);
    }

}
