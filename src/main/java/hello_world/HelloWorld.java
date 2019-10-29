package hello_world;

import printers.Printer;

public class HelloWorld implements Printer {

    /**
     * #1 It would not be a proper start without Hello World! program. Just print Hello World! string to the console.
     */
    @Override
    public void print() {
        System.out.println("Hello World!");
    }
}
