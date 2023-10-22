//Write a program using different data types//
import java.util.Scanner;

public class Different {
    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    class GetInputFromUser{


        public static void main(String[] args) {
            // Press Alt+Enter with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            //Using Scanner for getting Input from User
            Scanner in = new Scanner(System.in);
            String s =in.nextLine();
            System.out.printf("You entered string"+s);
            int a = in.nextInt();
            System.out.println("You entered integer"+a);
            float b= in.nextFloat();
            System.out.println("You entered float"+b);





            // Press Shift+F10 or click the green arrow button in the gutter to run the code.


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.


        }
    }
}
