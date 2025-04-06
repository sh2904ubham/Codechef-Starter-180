import java.util.Scanner;

public class Problem2 {

    static final int MOD = 998244353;
    static final int MAX_I = 1005;
    static long[] power = new long[MAX_I];

    static void precomputePowers() {
        power[0] = 1;
        for (int i = 1; i < MAX_I; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }
    }

    static long getAnswer(int i) {
        int i1 = i - 1;
        if (i1 % 4 == 0)
            return power[i1] % MOD;
        if (i1 % 4 == 3)
            return (power[i1 - 1] + power[i1]) % MOD;
        if (i1 % 4 == 2)
            return power[i1] % MOD;
        if (i1 % 4 == 1)
            return (power[i1 - 1] + power[i1]) % MOD;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        precomputePowers();
        int t = sc.nextInt();
        while (t-- > 0) {
            int i = sc.nextInt();
            System.out.println(getAnswer(i));
        }
        sc.close();
    }
}
