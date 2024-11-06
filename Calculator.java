package Day10;

public class Calculator {
    int previous; 

    int add(int num1, int num2) {
        int sum = num1 + num2;
        previous = sum;
        return sum;
    }

    void add(int add) {
        previous += add;
    }

    int subtract(int num1, int num2) {
        int difference = num1 - num2;
        previous = difference;
        return difference;
    }

    int divide(int num1, int num2) {
        int quotient = num1 / num2;
        previous = quotient;
        return quotient;
    }

    int multiply(int num1, int num2) {
        int product = num1 * num2;
        previous = product;
        return product;
    }

    int power(int num1, int num2) {
        int pow = num1;
        for (int i = 1; i < num2; i++) {
            pow *= num1;
        }
        previous = pow;
        return pow;
    }

}
