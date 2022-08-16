//What are the values of the following expressions? In each line, assume that
// String s = "Hello";  String t = "World";
// a. s.length() + t.length()                        b. s.substring(1, 2)
// c. s.substring(s.length() / 2, s.length())        d. s + t
// e. t + s
public class A6 {
    public static void main(String[] args) {
        String s="Hello" ,t = "World";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(s.length() / 2));
        System.out.println(s+t);
        System.out.println(t+s);
    }
}
