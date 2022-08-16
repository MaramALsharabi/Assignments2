import java.util.Scanner;
//Write a Java program to print the area and perimeter of a rectangle
public class A3 {
    public static void main(String[] args) {
        double length,width;
        System.out.print("please enter the length value : ");
        Scanner in =new Scanner(System.in);
        length=in.nextDouble();
        System.out.print("please enter the width value : ");
        width=in.nextDouble();
        System.out.println("The area of a rectangle = "+(length*width));
        System.out.println("The perimeter of a rectangle = "+(2*(length+width)));

    }
}
