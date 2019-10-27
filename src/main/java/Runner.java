import java.util.ArrayList;
import java.util.List;

public class Runner {
    private Runner() {
    }

    private static Runner instance;

    public static synchronized Runner getInstance() {
        if(instance == null) {
            instance = new Runner();
        }
        return instance;
    }

    public static void run(){
        List<Printer> printers =new ArrayList<>();
        printers.add(new HelloWorld());
        printers.add(new Triangle(3));
        printers.add(new Tree(3));
        printers.add(new Rectangle(5,4));
        printers.add(new MultiplicationTable(-5,10));
        printers.add(new SandGlass(3));
        printers.add(new Prime(7));
        printers.add(new Fibonacci(7));
        printers.add(new FizzBuzz(15));
        printers.add(new ToBinary(-4));
        printers.add(new FromBinary("1001"));

        for (Printer p : printers){
            p.print();
            System.out.println();
            System.out.println();
        }
    }
}
