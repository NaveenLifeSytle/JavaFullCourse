public class BinarySearchRecursion {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };

        // Length of array
        int n = arr.length;

        // Custom element to be checked
        // whether present or not
        int target = 40;

        // Calling above method
        int result = binarySearch(arr, 0, n - 1, target);

        // Element present
        if (result == -1)

            // Print statement
            System.out.println("Element not present");

            // Element not present
        else

            // Print statement
            System.out.println("Element found at index "
                    + result);
    }

   static int binarySearch(int arr[], int start, int end, int target) {
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
        if (end >= start ) {

            int mid=(start+end)/2;

            // If the element is present
            // at the middle itself
            if (arr[mid] == target)
                return mid;

            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > target)
                return binarySearch(arr, start, mid - 1, target);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, end, target);
        }

        // We reach here when element is not present in
        // array
        return -1;
    }
}

    //soreted list la thaan itha panna mudiyum
    //oru value ah kandhupidikkanum half half ah split
    //panni based on the condition

    // middle = (start+end)/2

