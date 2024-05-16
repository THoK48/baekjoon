import java.util.Scanner;

public class baek2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.next();
        char[] charArr = b.toCharArray();
        int case1, case2, case3;
        case1 = charArr[0] - '0';
        case2 = charArr[1] - '0';
        case3 = charArr[2] - '0';

        System.out.println(a * case3);
        System.out.println(a * (case2));
        System.out.println(a * (case1));
        System.out.println(a * Integer.parseInt(b));


    }
}
