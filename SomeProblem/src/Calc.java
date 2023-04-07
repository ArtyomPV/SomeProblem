import java.util.Scanner;

public class Calc {
    static String data;


    public static String enterData(){
        Scanner sc = new Scanner(System.in);
        data = sc.next();
        sc.close();
        System.out.println(data);
        return data;
    }
}
