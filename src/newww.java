import java.util.*;

import static java.lang.System.out;

public class newww {
    public static void main(String[] args) {
    /*int i,j;
    for(i=1;i<=5;i++){
        for(j=1;j<=i;j++){
            System.out.print(" * ");
        }
            System.out.println(" ");
       }*/
    /*2nd
        int i,j,k,r=6;
        for(i=1;i<=r;i++){
            for(j=1;j<=r-i;j++) {
            System.out.print("  ");
          }
            for(k=1;k<=(2*i-1);k++) {
                System.out.print(" *");
            }
            System.out.println();
        }*/

        //palindrom or not//
        /*int n ,sum = 0, temp;
        int r = 127;
        temp = r;
        while (r > 0) {
            n = r % 10;
            sum = sum * 10 + n;
            r= n % 10;
             if (r == sum) {
                System.out.println("number is palindrom");
            } else {
                System.out.println("number is not palindrom");
            }
        } */
        //NON PRIMITIVE//
       /* int i;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for(i=0;i<=10;i++)
            System.out.println(arr[i]);*/

        /* int i,size;
        System.out.println("enter size");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        */
        /*name or age
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String n=sc.nextLine();
        System.out.println("enter age");
        String p=sc.next();
        System.out.println("enter your name is:"+n);
        System.out.println("enter your age is:"+p);*/

       /*CURRENCY COVERTER
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value in INR:");
        float a=sc.nextFloat();
        float u=a/79;
        float p=a/111;
        float z=a/70;
        System.out.println("us$="+u);
        System.out.println("pound="+p);
        System.out.println("zen="+z);*/

        /*MANGO(reversal of string)
        int i;
        String re="";
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String a=sc.nextLine();
        for(i=0;i<a.length();i++) {
            ch=a.charAt(i);
            re = ch + re;
        }
        System.out.println("re="+re);*/

        //error defiend//
        /*Scanner c=new Scanner(System.in);
        try {
            int i;
            int[] arr = new int[5];
            for (i = 0; i <= 10; i++) {
                arr[i]=c.nextInt();
            }
        }
        catch(Exception e){
            System.out.println("");
            }

        int a=76;
        double x= Math.sqrt(121);
        System.out.println(x);*/

       /* int a = 2;
        int b = 5;
       sum(a,b);
    }
    public static void sum ( int a, int b)

    {
        int sum = a + b;
        System.out.println("sum is =" + sum);
    }*/


    }
}

