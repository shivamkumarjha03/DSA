import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args) {
        int arr1[]={2,5,1,3,0};
        System.out.println("The largest element in the array is:"+findlargestElement(arr1));
        int arr2[]={8,1,5,2,4};
        System.out.println("The largest element in the array is:"+findlargestElement(arr2));
    }
    static int findlargestElement(int arr[])
    {
        int max=arr[0];
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
//Time Complexity= O(n)
//Space Complexity=O(1)