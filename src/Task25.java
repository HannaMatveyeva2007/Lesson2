public class Task25 {
    public static void main(String... args) {
        double num1 = 3.14;
        double num2 = 11.0;
        if (num1 - (int) num1 == 0) {
            System.out.println("num1 is integer");
        } else {
            System.out.println("num1 is double");
        }
        if (num2 - (int) num2 == 0) {
            System.out.println("num2 is integer");
        } else {
            System.out.println("num2 is double");
        }
    }
}