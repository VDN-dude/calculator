import java.math.BigDecimal;
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

            BigDecimal dnum1 = new BigDecimal(snum1);
            BigDecimal dnum2 = new BigDecimal(snum2);

            BigDecimal result;

            switch (type) {

                case "sum":
                    result = dnum1.add(dnum2);
                    break;
                case "sub":
                    result = dnum1.subtract(dnum2);
                    break;
                case "mul":
                    result = dnum1.multiply(dnum2);
                    break;
                case "div":
                    result = dnum1.divide(dnum2);
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