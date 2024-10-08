class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x) {
        int mid, low, high;
        low = 0;
        high = r;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (x == arr[mid])
                return mid;
            if (x < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}