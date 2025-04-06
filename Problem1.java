import java.util.*;

class Problem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        {
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n + 1];
                int r = 0;
                for (int i = 1; i <= n; i++) {
                    arr[i] = sc.nextInt();
                    if (i > 0 && i < n) {
                        int left = i - 1;
                        int right = n - i;
                        int p = (left / 2) + (right / 2);
                        int u = arr[i] + p;
                        r = Math.max(r, u);
                    }
                }
                System.out.println(r);
            }
        }
    }
}