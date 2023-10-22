//Write a program using different data types//
import java.util.Scanner;
 class GetInputFromUser{


        public static void main(String[] args) {
            
            //Using Scanner for getting Input from User
            Scanner in = new Scanner(System.in);
            String s =in.nextLine();
            System.out.printf("You entered string"+s);
            int a = in.nextInt();
            System.out.println("You entered integer"+a);
            float b= in.nextFloat();
            System.out.println("You entered float"+b);


        }
    }

