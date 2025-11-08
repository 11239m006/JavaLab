public class ExceptionalHandling {
 
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught the exception!");
        } 
        finally {
            System.out.println("This will always run.");
        }
    }
}
    

