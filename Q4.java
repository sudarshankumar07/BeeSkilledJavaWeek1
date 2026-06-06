//Create a program that swaps two numbers without using a third variable
public class Q4 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 40;

        // this can be overflow
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        //using bit operators
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
    }
}
