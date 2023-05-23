public class Slider12_2 {
    public static void main(String[] args) {
        try {
            int data = 25;
            if (data % 2 != 0) {
                System.out.println(data + " is old number");
            }
            return;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
