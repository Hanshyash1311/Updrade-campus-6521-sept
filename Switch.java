public class Switch {
    import java.lang.invoke.SwitchPoint;
    public class Main {
        public static void main(String[] args) {

            int a='3';
            switch(a)
            {
                case'1':
                    System.out.println("Halwa");
                    break;
                case'2':
                    System.out.println("Ice cream");
                    break;
                case'3':
                    System.out.println("Mocktails");
                    break;
                case'4':
                    System.out.println("Sweet corn");
                    break;
                case'5':
                    System.out.println("Spring Roll");
                    break;
                default:
                    System.out.println("Invalid");

            }
            System.out.println("Your Choice is" +a);
        }
    }
}
