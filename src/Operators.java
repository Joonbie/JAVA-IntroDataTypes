public class Operators {

    //create a add method for Operators class
    public int add(int a, int b) {
        return a + b;
    }

    //create a subtract method for Operators class
    public int subtract(int a, int b) {
        return a - b;
    }

    //create a multiplication method for Operators class
    public int multiply(int a, int b) {
        return a * b;
    }

    //create a division method for Operators class
    public float divide(float a, float b) {
        return a / b;
    }

    //create a modulus method for Operators class
    public int modulus(int a, int b) {
        return a % b;
    }

    // create a method to negate an integer passed in
    public int negate(int a) {
        return -a;
    }

    // create a method to set a passed value to positive
    public int positve(int a) {
        return +a;
    }

    // create a method to increment the passed in param
    public int increment(int a) {
        // return a++; ----->post increment
        return ++a; // pre increment
    }

    public int decrement(int a) {
        // return a-- post decrement
        return --a; // pre decrement
    }


    // create a method to apply the not operation on the param
    public boolean not(boolean a) {
        return !a;
    }

    // Static method to display arithmetic operations' result
    public static void displayResults(int data) {
        System.out.println(data);
    }

    public static void displayFloatResults(float data) {
        System.out.println(data);
    }

    public static void displayBooleanResults(boolean data) {
        System.out.println(data);
    }

}




