public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is sorted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        IsSorted obj = new IsSorted();

        System.out.println(obj.checkSort(new int[]{1, 2, 3, 4})); // true
        System.out.println(obj.checkSort(new int[]{1, 2, 4, 3})); // false
        System.out.println(obj.checkSort(new int[]{7, 7, 7}));    // true
        System.out.println(obj.checkSort(new int[]{1}));          // true
        System.out.println(obj.checkSort(new int[]{}));           // true
    }
}
