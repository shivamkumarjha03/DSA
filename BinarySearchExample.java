import java.util.Scanner;
class BinarySearchExample
{
    public static void main(String args[])
    {
        int i, n, key, array[], first, last, middle;
        //To capture user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n = input.nextInt();
        //Creating array to store the all the numbers
        array = new int[n];
        System.out.println("Enter " + n + " integers");
        //Loop to store each numbers in array
        for (i = 0; i < n; i++)
            array[i] = input.nextInt();
        System.out.println("Enter the search value:");
        key = input.nextInt();
        first = 0;
        last = n - 1;
        middle = (first + last)/2;
        while( first <= last )
        {
            if ( array[middle] < key )
                first = middle + 1;
            else if ( array[middle] == key )
            {
                System.out.println(key + " found at location " + (middle + 1) + ".");
                break;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            System.out.println(key + " is not found.\n");
    }
}