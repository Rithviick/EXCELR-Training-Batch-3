import java.util.Arrays;

public class Demo064 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35};

        if (numbers.length > 1) {
            int temp = numbers[0];
            numbers[0] = numbers[numbers.length - 1];
            numbers[numbers.length - 1] = temp;
        }

        System.out.println("Array after swapping: " + Arrays.toString(numbers));
    }
}
