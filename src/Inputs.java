import java.util.Scanner;

    public class Inputs {
        Scanner scanner=new Scanner(System.in);
        public int inputs() {
            String input = scanner.next();
            switch (input) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
                    return Integer.parseInt(input);
                default:
                    System.out.println("Invalid input!!");
            }
            return 100;
        }
    }
