//Write a program to draw triangle using for loop//
public class triangle {
    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

        public static void main(String[] args) {
            // Press Alt+Enter with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            //i is for rows and j is for columns
            int i, j, p = 8;
            for (i = 0; i < p; i++) {
                for (j = 2 * (p - i); j >= 0; j--) {
                    System.out.print(" ");
                }
                for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }

                System.out.println();

                // Press Shift+F10 or click the green arrow button in the gutter to run the code.


                // Press Shift+F9 to start debugging your code. We have set one breakpoint
                // for you, but you can always add more by pressing Ctrl+F8.
            }
        }
    }

