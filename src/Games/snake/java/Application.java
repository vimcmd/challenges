package Games.snake.java;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.*;
import java.nio.charset.Charset;


public class Application {

    public static void main(String[] args) {
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
    }

}
