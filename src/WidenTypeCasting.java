public class WidenTypeCasting {

    public static void main(String[] args){

        int i = 100; //declare an integer called i and assign a value of 100

        //automatic type conversion
        long l = i; //declare a variable called l and assigned a value of 100 from 1

        //automatic type conversion
        float f = l; //declare a float called f  and assigned a value of 100 from l

        //Print the outputs of i, l and f
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);
    }
}
