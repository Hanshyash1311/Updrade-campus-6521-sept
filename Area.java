// Write a program to find the area of triangle.//
import java.util.Scanner;
    
    public class Main {
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.print("Enter the base:");
            int base= scan.nextInt();
            System.out.print("Enter the height:");
            int height= scan.nextInt();
            double area =(0.5)*(base*height);
            System.out.println("The area of triangle is:"+area);




        }
    }

