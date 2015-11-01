package Games.snake.java;

import com.googlecode.lanterna.input.Key;
import java.util.LinkedList;

public class Snake extends Figure {

    private Direction direction = Direction.RIGHT;

    public Snake(Point tail, int length) {
        pointList = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            Point p = new Point( tail );
            pointList.add(p);
            p.move(i, direction);
        }
    }

    protected void move() {
        Point tail = ((LinkedList<Point>)pointList).getFirst();
        pointList.remove(tail);
        Point head = getNextPoint();
        pointList.add(head);
        tail.clear();
    }

    public Point getNextPoint() {
        Point head = ((LinkedList<Point>)pointList).getLast();
        Point nextPoint = new Point(head);
        nextPoint.move(1, direction);

        return nextPoint;
    }

    /**
     * changes snake movement direction, based on pressed arrow key, restricts opposite direction
     * @param key Key terminal.readInput() [lanterna lib]
     */
    public void handleControl(Key key) {
        if (key != null) {
            if ( (key.getKind() == Key.Kind.ArrowUp) && (this.direction != Direction.DOWN) ) {
                this.direction = Direction.UP;
            } else if ( (key.getKind() == Key.Kind.ArrowDown) && (this.direction != Direction.UP)  ) {
                this.direction = Direction.DOWN;
            } else if ( (key.getKind() == Key.Kind.ArrowLeft) && (this.direction != Direction.RIGHT)  ) {
                this.direction = Direction.LEFT;
            } else if ( (key.getKind() == Key.Kind.ArrowRight) && (this.direction != Direction.LEFT)  ) {
                this.direction = Direction.RIGHT;
            }
        }
    }
}