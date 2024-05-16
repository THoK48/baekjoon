import java.util.Scanner;

public class baek1330 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] stChange = a.split(" ");
        long A = Long.parseLong(stChange[0]);
        long B = Long.parseLong(stChange[1]);

        if(A < B){
            System.out.println("<");
        }else if(A > B){
            System.out.println(">");
        }else{
            System.out.println("==");
        }

    }
}
