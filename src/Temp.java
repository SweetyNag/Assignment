import java.util.Scanner;
public class Temp{
    public static void main(String[]args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the nos:");
        int a = c.nextInt();
        int b = c.nextInt();
        System.out.println("1.addition 2.subtraction 3.division 4.multiplication");
        System.out.println("enter the choice");
        int ch = c.nextInt();
        switch (ch) {
            case 1: {
                System.out.println("addition is" + (a + b));
                break;
            }
            case 2:{
                System.out.println("subtraction is"+(a-b));
                break;
            }
            case 3:{
                System.out.println("division is"+(a/b));
                break;
            }
            case 4:{
                System.out.println("multiplication is"+(a*b));
                break;
            }
            default:{
                System.out.println("wrong input");
            }

        }
    }
}
