import java.util.Scanner;
//Write a Java program that takes three numbers as input to calculate and print the average of the numbers
public class A4 {
    public static void main(String[] args) {
        double NUM1,NUM2,NUM3,AVG;
        System.out.println("please enter three numbers");
        System.out.print("first number : ");
        Scanner in =new Scanner(System.in);
        NUM1=in.nextDouble();
        System.out.print("second number : ");
        NUM2=in.nextDouble();
        System.out.print("third number : ");
        NUM3=in.nextDouble();
        AVG=(NUM1+NUM2+NUM3)/3;
        System.out.println("The average = "+AVG);

    }
}
