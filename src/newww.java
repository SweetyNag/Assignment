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

        int i,size;
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
    }
}
