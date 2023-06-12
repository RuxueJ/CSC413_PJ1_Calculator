package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    private int value;
    /**
     * construct operand from string token.
     */
    public Operand(String token) throws InvalidTokenException {
        if(Operand.check(token)){
            this.value = Integer.parseInt(token);
        }else{
            throw new InvalidTokenException(token + " is invalid token");
        }
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.value = value;
    }

    /**
     * return value of operand
     */
    public int getValue() {
        return value;
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try {
            Integer.parseInt(token);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws InvalidTokenException {
        try{
            Operand op = new Operand("123");
            System.out.println(op.getValue());
            Operand op1 = new Operand("qwqe");
            System.out.println(op1.getValue());
            System.out.println(Operand.check("123"));
            System.out.println(Operand.check("qwe"));
        }catch(InvalidTokenException e){
            System.out.println(e.getMessage());
        }

    }
}
