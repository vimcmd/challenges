package Games.snake.java;

import java.util.LinkedList;

public class Obstacle extends Figure {

    public Obstacle(int x, int y, char ch, boolean horizontal, int length) {
        pointList = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            pointList.add(new Point(x, y, ch));

            if (horizontal) {
                x += 1;
            } else {
                y += 1;
            }
        }
    }

    public Obstacle(int x, int y, boolean horizontal, int length) {
        this(x, y, '#', horizontal, length);
    }

}
