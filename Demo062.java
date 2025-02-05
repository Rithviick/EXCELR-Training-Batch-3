public class Demo062 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35};

        if (numbers.length >= 2) {
            System.out.println("First element: " + numbers[0]);
            System.out.println("Second element: " + numbers[1]);
            System.out.println("Last element: " + numbers[numbers.length - 1]);
        } else {
            System.out.println("Array does not have enough elements.");
        }
    }
}
