import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Please, write the first number: ");
            String snum1 = scanner.next();
            System.out.print("Please, write the second number: ");
            String snum2 = scanner.next();
            System.out.print("Please, write operation what would you do: ");
            String type = scanner.next();


            double num1 = Double.parseDouble(snum1);
            double num2 = Double.parseDouble(snum2);

            double result;
            switch (type) {
                case "sum":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "mul":
                    result = num1 * num2;
                    break;
                case "div":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Operation not found!");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.print("Want to continue? [Y]es , [N]o : ");
            String next = scanner.next();
            switch (next) {
                case "n":
                    return;
                case "y":
                    break;
            }
        }
    }
}