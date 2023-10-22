//Write a program for Swapping two variables with help of third variable.//
import com.sun.jdi.Value;

import java.util.*;
    class GFG{
        static void swapValuesUsingThirdVariable(int a, int b) {
            int c = a;
            a = b;
            b = c;

            System.out.println("Value of a is" + a + "Value of b is"+b);

        }
        public static void main(String[] args)
        {
            int a=10,b=20;
            swapValuesUsingThirdVariable(a,b);


        

        }
    }


