public class Arrays1 {
    public static void main(String[] args) {
        int[] arr = { 2, 6, -5, -4, 0, 9 };
        for (int val : arr) {
            if (val >= 0) {
                System.out.println(val);
            }
        }
    }
}
