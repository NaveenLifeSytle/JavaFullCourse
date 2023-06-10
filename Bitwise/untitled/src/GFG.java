// Java program to find unique element where
// every element appears k times except one

public class GFG {

    static int findUnique(int a[], int n, int k)
    {
        // Create a count array to store count of
        // numbers that have a particular bit set.
        // count[i] stores count of array elements
        // with i-th bit set.
        byte sizeof_int = 4;
        int INT_SIZE = 8 * sizeof_int;//32
        int count[] = new int[INT_SIZE];

        // AND(bitwise) each element of the array
        // with each set digit (one at a time)
        // to get the count of set bits at each
        // position
        int nb,nn;
        for (int i = 0; i < INT_SIZE; i++)
            for (int j = 0; j < n; j++) {
                nb = 1 << i;
                nn=(a[j] & (1 << i));
                if ((a[j] & (1 << i)) != 0)
                    count[i] += 1;
            }
        // Now consider all bits whose count is
        // not multiple of k to form the required
        // number.
        int res = 0;
        for (int i = 0; i < INT_SIZE; i++)
            res += (count[i] % k) * (1 << i);

        // Before returning the res we need
        // to check the occurrence of that
        // unique element and divide it
       res = res / (n % k);

        return res;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 6, 2, 5, 2, 2, 6, 6 };
        int n = a.length;
        int k = 3;
        System.out.println(findUnique(a, n, k));
    }
}

// This code is contributed by 29AjayKumar
