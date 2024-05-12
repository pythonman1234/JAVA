import java.util.Scanner;

public class Arrays_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                ans[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
