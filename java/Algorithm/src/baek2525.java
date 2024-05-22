import java.util.Scanner;

public class baek2525 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int input2 = scanner.nextInt();
        String[] stChange = input.split(" ");
        int a = Integer.parseInt(stChange[Math.toIntExact(0)]);
        int b = Integer.parseInt(stChange[Math.toIntExact(1)]);

        b = b + input2;

        while (b >= 60) {
            if (b >= 60) {
                b = b - 60;
                a = a + 1;
                if (a < 0) a = 23;
                if (a > 23) a = 0;

            }
        }
        System.out.println(a+" "+b);
    }
}
