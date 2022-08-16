import java.util.Scanner;
//Write a Java program to print the area and perimeter of a circle.
public class A2 {
    public static void main(String[] args) {
        double radius;
        System.out.print("please enter the value of radius : ");
        Scanner in =new Scanner(System.in);
        radius=in.nextDouble();
        System.out.println("The area of a circle = "+(3.14*radius*radius));
        System.out.println("The perimeter of a circle = "+(2*radius*3.14));
    }
}
