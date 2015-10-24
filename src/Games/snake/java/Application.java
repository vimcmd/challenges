package Games.snake.java;

import java.nio.charset.Charset;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.input.Key;


public class Application {

    public static void main(String[] args) {
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();


        // exit terminal on press Esc key
        while(true) {
            Key key = terminal.readInput();
            if (key != null) {
                if (key.getKind() == Key.Kind.Escape) {
                    System.exit(0);
                }
            }
        }

    }

}
