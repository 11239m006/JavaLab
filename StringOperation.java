public class StringOperation{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println("Concatenation: " + s1 + " " + s2);
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 1: " + s1.charAt(1));
        System.out.println("Substring (1,4): " + s1.substring(1,4));
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("s1 equals s2? " + s1.equals(s2));
    }
}
