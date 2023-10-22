public class Main {
    public static void main(String[] args) {
        int a,b=0,c=0;
        int d=3;
        b=d/2;
        if (d==0&&d==1){
            System.out.println(d+"is not a prime number");

        }
        else {
            for (a=2;a<=b;a++)
            {
                if (d%a==0){
                    System.out.println(d+"is not prime number");
                    c=1;
                    break;
                }
            }
       if (c==0)
       {
           System.out.println(d+"is prime number");
       }
        }
