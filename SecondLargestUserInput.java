import java.util.Scanner;
public class SecondLargestUserInput {
    public static void main(String[] args) {
        int size,i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        size=sc.nextInt();
        int a[]=new int[size];
        for(i=0;i<size;i++)
        {
            System.out.println("Enter Number:");
            a[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            for( j=i+1;j<size;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second Largest number in the array is:"+a[size-2]);
    }
}
//Time Complexity=O(n)
//Space Complexity=O(1)