public class Reduce {
    public static void main(String[] args) {
        int number = 100;
        int num_steps = 0;

        while (number != 0) {
            if (number % 2 == 0) {
                // If n is even, divide it by 2.
                number /= 2;
            } else {
                // If n is odd, subtract 1.
                number -= 1;
            }
            num_steps++;
        }

        System.out.println("Steps to reach 0 starting from 100: " + num_steps);
    }
}
