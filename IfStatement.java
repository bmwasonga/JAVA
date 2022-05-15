import java.util.Scanner;

class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scanned = scanner.next();

        if (scanned.equals("Ben")) {
            System.out.println("You guessed correctly");
        } else if (scanned.equals("Peter")) {

            System.out.println("You guessed correctly");

        } else {
            System.out.println("You are soo wrong");

        }

    }
}