//How do you get the first character of a string? The last character?
// How do you remove the first character? The last character?
public class A7 {
    public static void main(String[] args) {
        String text="Hello";
        System.out.println(text.charAt(0));
        System.out.println(text.substring(text.length()-1));
        System.out.println(text.substring(1));
        System.out.println(text.substring(0,text.length()-1));


    }
}
