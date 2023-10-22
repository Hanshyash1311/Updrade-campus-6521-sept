//Write a program to draw triangle using for loop//
public class Main{           
public static void main(String[] args) {
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

            }
        }
    }

