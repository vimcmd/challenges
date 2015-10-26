package Games.snake.java;

import java.nio.charset.Charset;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.TerminalSize;

public class Application {

    public static void main(String[] args) {
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        // TerminalSize screenSize = terminal.getTerminalSize();
        Screen screen = TerminalFacade.createScreen(terminal);
        screen.startScreen();

        initBorders(terminal);

        screen.putString(1, 0, " Press Esc to exit ", Terminal.Color.WHITE, Terminal.Color.BLACK);
        screen.refresh();

//         exit terminal on press Esc key
//         TODO add window.close listener
        while(true) {
            Key key = terminal.readInput();
            if (key != null) {
                if (key.getKind() == Key.Kind.Escape) {
                    // System.exit(0) instead terminal.exitPrivateMode() to completely stop terminal process
                    System.exit(0);
                }
            }
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
