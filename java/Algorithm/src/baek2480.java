import java.util.Scanner;

public class baek2480 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stChange = input.split(" ");
        int a = Integer.parseInt(stChange[Math.toIntExact(0)]);
        int b = Integer.parseInt(stChange[Math.toIntExact(1)]);
        int c = Integer.parseInt(stChange[Math.toIntExact(2)]);

        if (a == b){
            if(a == c){
                System.out.println(10000+(a * 1000));
            } else {
                System.out.println(1000 + (a * 100));
            }
        } else if (b == c){
            System.out.println(1000 +(b * 100));
        } else {
            System.out.println((Math.max(Math.max(a,b),c)*100));
        }
    }
}
