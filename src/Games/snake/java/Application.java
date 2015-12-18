package Games.snake.java;

import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;

public class Application
{
    // TODO: move to main() with terminal size as args
    final static SwingTerminal terminal = new SwingTerminal(120, 30);
    final static Screen screen = new Screen(terminal);

    public static void main(String[] args) throws InterruptedException
    {

        screen.startScreen();
        terminal.getJFrame().setLocationRelativeTo(null); // this will center JFrame window
        terminal.getJFrame().setResizable(false);
        terminal.getJFrame().addWindowListener(new java.awt.event.WindowAdapter()
                                               {
                                                   public void windowClosing(java.awt.event.WindowEvent event)
                                                   {
                                                       screen.stopScreen();
                                                       System.exit(0);
                                                   }
                                               }
        );

        Snake snake = new Snake(new Point(1, 1), 15);

        while (true)
        {
            Obstacle.drawBorders(terminal);

            Key key = terminal.readInput();
            snake.move(key);
            snake.draw(terminal);

            {
                screen.refresh();
                terminal.setCursorVisible(false);
                Thread.sleep(100);
            }
        }
    }

}
