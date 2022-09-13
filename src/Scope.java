import java.util.Scanner;
public class Scope {
    public static void main(String[] args) {
       /* 1. Scanner c=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=c.next();
        String rev="";
        int i;
        char ch;
        for (i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);*/

      /* 2. Scanner c=new Scanner(System.in);
        System.out.println("Enter value of X ");
        int x=c.nextInt();
        System.out.println("Enter value of Y");
        int y=c.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Value of X = "+x);
        System.out.println("Value of Y = "+y);*/

        /* 3.  int f = 0, s = 1;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter value of X ");
        int n=c.nextInt();

        while (f <= n) {
            System.out.print(f + ", ");

            int nextTerm = f + s;
            f = s;
            s = nextTerm;
        }*/

        /* 4.String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome"); */

       /* 5.  Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);*/

        /* 6.  int i, fact = 1;
        Scanner c = new Scanner(System.in);
        System.out.println("enter no.");
        int number = c.nextInt();
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);*/


        /* 7.  String str = "1212";
        int num = Integer.parseInt(str);
        System.out.println(num);
        String st = Integer.toString(num);
        System.out.println(st);*/

        /* 8. Scanner c = new Scanner(System.in);
        System.out.println("enter a string");
        String str = c.next();
        System.out.println("enter a char you want to remove ");
        String r = c.next();
        System.out.println(str.replace(r,""));*/

        enum Color {
            RED,
            GREEN,
            BLUE;
        }
        {
            Color c1 = Color.RED;
            System.out.println(c1);
        }
    }
}





