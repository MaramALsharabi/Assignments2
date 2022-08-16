import java.util.Scanner;
// Write a Java program to swap two variables.
public class A5 {
    public static void main(String[] args) {
        int x,y;
        System.out.print("please enter (X) value : ");
        Scanner input =new Scanner(System.in);
        x=input.nextInt();
        System.out.print("please enter (Y) value : ");
        y=input.nextInt();
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("After swapping X = "+x+"\t Y = "+y);

    }
}

