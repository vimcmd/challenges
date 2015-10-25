package Games.snake.java;

import java.nio.charset.Charset;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.input.Key;

public class Application {

    public static void main(String[] args) {
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();

        Point p1 = new Point(5, 6);
        p1.Draw(terminal);

        Point p2 = new Point(3, 4, '#');
        p2.Draw(terminal);

//        Draw(terminal, p1);
//        Draw(terminal, new Point(4, 3));

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

}
