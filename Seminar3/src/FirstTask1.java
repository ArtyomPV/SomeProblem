import java.util.Scanner;

public class FirstTask1 {
    int n;
    int[] a;

    FirstTask1(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
    }
}
