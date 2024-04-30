
public class SortedArrayMerger {
    /**
     * Name: Himal Shrestha
     * Class: CSC 229 : Data Structures & Algorithms
     * Extra credit assignment problem two
     * Professor: Moath Alrajab
     */
    public static void mergeArrays(int[] A, int m, int[] B, int n) {
        // Start merging from the end of both arrays
        int a = m - 1; // Index of last element in array A
        int b = n - 1; // Index of last element in array B
        int c = m + n - 1; // Index of last empty position in array A

        // Merge elements from the end until one of the arrays is fully merged
        while (a >= 0 && b >= 0) {
            // Compare elements from both arrays and place the larger one at the end of A
            if (A[a] > B[b]) {
                A[c--] = A[a--];
            } else {
                A[c--] = B[b--];
            }
        }

        // If there are remaining elements in array B, copy them to the beginning of A
        while (b >= 0) {
            A[c--] = B[b--];
        }
    }

    public static void main(String[] args) {
        // Test the mergeArrays function
        int[] A = {1, 3, 5, 0, 0, 0}; // A has buffer space at the end
        int[] B = {2, 4, 6};
        int m = 3; // Size of A
        int n = 3; // Size of B

        mergeArrays(A, m, B, n);

        // Print the merged array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
