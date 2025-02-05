public class Demo063 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35};

        if (numbers.length > 0) {
            int sum = numbers[0] + numbers[numbers.length - 1];
            System.out.println("Sum of first and last element: " + sum);
        } else {
            System.out.println("Array is empty.");
        }
    }
}
