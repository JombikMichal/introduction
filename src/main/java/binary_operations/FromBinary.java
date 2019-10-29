package binary_operations;

import printers.Printer;

public class FromBinary implements Printer {
    private final String code;
    private String result;

    public FromBinary(String code) throws IllegalArgumentException {
        if(!code.matches("[0-1]+") || code.isEmpty() || code == null){
            throw new IllegalArgumentException(String.format("%s %s %s","Your code",code,"is invalid! This code have to contains only 1 & 0!"));
        }
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getResult() {
        return result;
    }

    @Override
    public void print() {

        /**
         * #11 Reverse of task: #10 Convert a number from decimal representation to binary representation.
         **/

        String reverseCode = new StringBuilder(code).reverse().toString();
        int result = 0;
        for (int i = 0; i < reverseCode.toCharArray().length; i++) {
            result += Character.getNumericValue(reverseCode.toCharArray()[i]) * Math.pow(2, i);
        }
        this.result = String.format("%s %s %s %d", "Your code", code, "in decimal:", result);
        System.out.println(this.result);
    }
}
