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

        initBorders(terminal);

        Snake snake = new Snake(new Point(1,1), 4);

        while (true){
            Key key = terminal.readInput();
            snake.handleControl(key);
            snake.Move();
            snake.Draw(terminal);
            screen.refresh();

            Thread.sleep(100);
        }
    }

    public static void initBorders(Terminal terminal) {
        Obstacle borderTop = new Obstacle( 0, 0, '%', true, terminal.getTerminalSize().getColumns() - 1 );
        borderTop.Draw(terminal);

        Obstacle borderBottom = new Obstacle( 0, terminal.getTerminalSize().getRows() - 1, '%', true, terminal.getTerminalSize().getColumns() - 1 );
        borderBottom.Draw(terminal);

        Obstacle borderLeft = new Obstacle(0, 1, '%', false, terminal.getTerminalSize().getRows() - 1);
        borderLeft.Draw(terminal);

        Obstacle borderRight = new Obstacle(terminal.getTerminalSize().getColumns() - 1, 0, '%', false, terminal.getTerminalSize().getRows() );
        borderRight.Draw(terminal);

    }

}
