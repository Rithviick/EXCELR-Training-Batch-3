import java.util.*;

public class He001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Set<Integer> seen = new HashSet<>();
        int mex = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            seen.add(arr[i]);
            while (seen.contains(mex)) {
                mex++;
            }
            result.append(mex).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
