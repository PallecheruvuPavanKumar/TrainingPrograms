import java.util.Scanner;

public class SwappingOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
        System.out.println("Before Swapping A value is :"+a);
        System.out.println("Before Swapping B value is :"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("A value is :"+a);
        System.out.println("B value is :"+b);

    }
}
