import java.util.Scanner;
public class arraySortedUserInput {
    public static void main(String[] args) {
        int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        size=sc.nextInt();
        int a[]=new int[size];
        for(i=0;i<size;i++)
        {
            System.out.println("Enter Number:");
            a[i]=sc.nextInt();
        }
        for(i=0;i<size-1;i++)
        {
            if(a[i]>a[i+1])
            {
                System.out.println("Array is sorted");
                break;
            }
            else
            {
                System.out.println("Array is not sorted");
                break;
            }
        }
    }
}
//Time Complexity: O(N)
//Space Complexity: O(1)