import java.util.Scanner;
// Write a program that prompts the user for two integers and then prints  • The sum  • The difference  •
// The product  • The average  • The distance (absolute value of the difference)  •
// The maximum (the larger of the two) .The minimum (the smaller of the two)
// Hint: The max and min functions are declared in the Math class.
public class A9 {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("please enter two integer numbers ");
        Scanner in =new Scanner(System.in);
        System.out.println("the first number : ");
        num1=in.nextInt();
        System.out.println("the second number : ");
        num2=in.nextInt();
        System.out.println("The sum = "+(num1+num2));
        System.out.println("The difference = "+(num1-num2));
        System.out.println("The product = "+(num1*num2));
        System.out.println("The average = "+((num1+num2)/2));
        System.out.println("The distance = "+Math.abs(num1-num2));
        System.out.println("The maximum = "+Math.max(num1,num2));
        System.out.println("The minimum = "+Math.min(num1,num2));

    }
}
