//Write a program for Swapping two variables with help of third variable.//
public class swapping
{
    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import com.sun.jdi.Value;

import java.util.*;
    class GFG{
        static void swapValuesUsingThirdVariable(int a, int b) {
            // Press Alt+Enter with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            int c = a;
            a = b;
            b = c;

            System.out.println("Value of a is" + a + "Value of b is"+b);

        }
        public static void main(String[] args)
        {
            int a=10,b=20;
            swapValuesUsingThirdVariable(a,b);


            // Press Shift+F10 or click the green arrow button in the gutter to run the code.


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.

        }
    }

}
