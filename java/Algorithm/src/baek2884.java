import java.util.Scanner;

public class baek2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stChange = input.split(" ");
        int a = Integer.parseInt(stChange[Math.toIntExact(0)]);
        int b = Integer.parseInt(stChange[Math.toIntExact(1)]);
        b = b - 45;
        if (b < 0){
            b = b + 60;
            a = a - 1;
            if(a < 0) a = 23;
        }
        System.out.println(a+" "+b);
    }
}
