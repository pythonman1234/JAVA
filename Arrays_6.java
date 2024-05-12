
import java.util.Scanner;

public class Arrays_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
            if (arr2[i] != arr1[i]) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
