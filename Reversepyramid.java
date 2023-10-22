//Write a program to draw Reverse pyramid//
    public class Main {
        public static void main(String[] args) {
            int a=10;
            for (int i=0;i<=a-1;i++){
                for (int j=0;j<=i;j++){
                    System.out.print("");
                }
                for (int k=0;k<=a-1-i;k++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }


            // Press Shift+F10 or click the green arrow button in the gutter to run the code.


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.


        }
    }

