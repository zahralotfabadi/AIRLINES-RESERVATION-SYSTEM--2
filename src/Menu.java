import java.io.IOException;
import java.util.Scanner;
public class Menu {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    Scanner scanner = new Scanner(System.in);
    Inputs inputs = new Inputs();
    Sign sign = new Sign();
    int count = 1;
    int number;

    public void menuFunc() throws IOException {
        while (count == 1) {
            System.out.println(ANSI_CYAN + "\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::" +
                    "\n          WELCOME TO AIRLINE RESERVATION SYSTEM\n" +
                    "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                    "......................MENU OPTIONS........................\n\n" +
                    "< 1 > Sign in \n< 2 > Sign up" + ANSI_RESET);

            number = inputs.inputs();
            if (number == 2) {
                sign.signUp();
            } else if (number == 1) {
                int out = sign.signIn();
                if (out == 0) {
                    count = 0;
                }
            }
        }
    }


}

