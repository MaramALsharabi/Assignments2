import java.util.Scanner;
// Write a program that reads a number and displays the square, cube, and fourth power. Use the Math.
// pow method only for the fourth power
public class A8 {
    public static void main(String[] args) {
        double num;
        System.out.print("please enter a number : ");
        Scanner in =new Scanner(System.in);
        num=in.nextDouble();
        System.out.println("the square = "+num*num);
        System.out.println("the cube = "+num*num*num);
        System.out.println("the fourth power = "+Math.pow(num,4));
    }
}

