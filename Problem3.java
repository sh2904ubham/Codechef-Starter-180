import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long z = sc.nextLong();
        while (z-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (k == 0) {
                if (n == 1) {
                    System.out.println("A");
                    System.out.println("B");
                } else {
                    System.out.println("-1");
                }
                continue;
            }

            if (k == n) {
                StringBuilder s = new StringBuilder();
                for (long i = 0; i < n; ++i) {
                    s.append((char) ('A' + i % 3));
                }
                System.out.println(s);
                System.out.println(s);
                continue;
            }

            long d = n / 2;
            if (k >= d) {
                char[] s = new char[(int) n];
                char[] t = new char[(int) n];
                for (int i = 0; i < n; i++) {
                    s[i] = 'A';
                    t[i] = 'A';
                }

                long diff = n - k;
                for (int i = 1; i < n && diff > 0; i += 2) {
                    s[i] = 'B';
                    t[i] = 'C';
                    diff--;
                }

                if (diff == 0) {
                    for (int i = 0; i < n - 1; i++) {
                        if (s[i] == 'A' && s[i + 1] == 'A') {
                            s[i + 1] = 'B';
                            t[i + 1] = 'B';
                        }
                    }
                } else {
                    s = new char[(int) n];
                    t = new char[(int) n];
                    for (int i = 0; i < n; i++) {
                        if (i % 2 == 0) {
                            s[i] = 'B';
                            t[i] = 'C';
                        } else {
                            s[i] = 'A';
                            t[i] = 'A';
                        }
                    }
                }

                System.out.println(String.valueOf(s));
                System.out.println(String.valueOf(t));
            } else {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
