package Games.snake.java;

import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;
import com.googlecode.lanterna.input.Key;

public class Application {

    // Create terminal window with listener to close (X) button
    final static SwingTerminal terminal = new SwingTerminal();;
    final static Screen screen = new Screen(terminal);

    public static void main(String[] args) throws InterruptedException {

        screen.startScreen();
        terminal.getJFrame().addWindowListener(new java.awt.event.WindowAdapter() {
                                                   public void windowClosing(java.awt.event.WindowEvent event) {
                                                       screen.stopScreen();
                                                       System.exit(0);
                                                   }
                                               }
        );

        Obstacle.initBorders(terminal);

        Snake snake = new Snake(new Point(1,1), 4);

        while (true){
            Key key = terminal.readInput();
            snake.handleControl(key);
            snake.move();
            snake.draw(terminal);
            screen.refresh();

            Thread.sleep(100);
        }
    }

}
