import java.util.Scanner;

public class CustomLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "Rithvick";
        String correctPassword = "Password";
        String username, password;

        while (true) {
            System.out.print("Enter Username: ");
            username = scanner.nextLine();
            System.out.print("Enter Password: ");
            password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Hello Rithvick");
                break;
            } else {
                System.out.println("Invalid Username or Password. Please try again.");
            }
        }
        
        scanner.close();
    }
}