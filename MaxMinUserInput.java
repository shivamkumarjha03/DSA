import java.util.Scanner;
public class MaxMinUserInput {
    public static void main(String[] args) {
        int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        size=sc.nextInt();
        int a[]=new int[size];
        for (i=0;i<size;i++)
        {
            System.out.println("Enter Number:");
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for (i=0;i<size;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum number in array:"+max);

    }
}
//Time Complexity=O(n)
//Space Complexity=O(1)