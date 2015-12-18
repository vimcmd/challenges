package Games.snake.java;

import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;

public class Application
{
    // TODO: move to main() with terminal size as args
    final static SwingTerminal terminal = new SwingTerminal(60, 15);
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

        Snake snake = new Snake(new Point(1, 1), 3);

        Food foodCreator = new Food(terminal, '@');
        Point food = foodCreator.createFood();
        food.draw(terminal);


        Point p = new Point(20, 29);
        p.draw(terminal);

        while (true)
        {
            Obstacle.drawBorders(terminal);
            Key key = terminal.readInput();


            if (snake.eat(food))
            {
                food = foodCreator.createFood();
                food.draw(terminal);
            }
            else
            {
                snake.move(key);
            }
            snake.draw(terminal);

            {
//                screen.refresh();
                terminal.setCursorVisible(false);
                Thread.sleep(100);
            }
        }
    }

}
