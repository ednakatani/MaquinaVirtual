package MaquinaVirtual;

import java.io.InputStream;
import java.io.PrintStream;

public class IO {

    private InputStream input;
    private PrintStream output;

    public IO(InputStream input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    public void print(String message) {
        output.print(message);
    }
    
}
