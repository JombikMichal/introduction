public class FizzBuzz {
    private final int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void print(){
        /**
            * Given number n print the following:
            * Fizz if n is divisible by 3
            * Buzz if n is divisible by 5
            * FizzBuzz if n is divisible by 3 and 5
        * */
        if(n % 15 == 0){
            System.out.println("FizzBuzz");
            return;
        }
        if(n % 3 == 0){
            System.out.println("Fizz");
            return;
        }
        if(n % 5 == 0){
            System.out.println("Buzz");
            return;
        }
    }
}
