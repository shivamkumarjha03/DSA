public class arraySorted {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 8, 11, 18, 13};

        boolean isSorted = isArraySorted(arr);
        if(isSorted) {
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted.");
        }
    }

    private static boolean isArraySorted(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n-1; i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}