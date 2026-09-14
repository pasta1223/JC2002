import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the start");int x = scanner.nextInt();
        System.out.print("enter the end");int y = scanner.nextInt();
        if(x>y){
            System.out.println("Error");
        }
        else {
            int sum = 0;
            for (int i = x; i <= y; i++) {
                sum += i;
            }
            System.out.println("Sum from start to end=" + sum);
        }
        scanner.close();
    }
}
