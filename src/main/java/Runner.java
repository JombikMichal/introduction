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
        printers.add(new Triangle(3));
        printers.add(new Tree(3));
        printers.add(new Rectangle(3,4));
        printers.add(new MultiplicationTable(5,10));
        printers.add(new SandGlass(3));
        printers.add(new Prime(7));
        printers.add(new Fibonacci(7));
        printers.add(new FizzBuzz(5));
        printers.add(new ToBinary(9));
        printers.add(new FromBinary("1001"));

        for (Printer p : printers){
            p.print();
        }
    }
}
