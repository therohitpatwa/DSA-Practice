
class QuickSort {

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static int partition(int[] nums, int start,
            int end) {
        int mid = start + (end - start) / 2;
        int i = start;
        int j = end;
        int pivot = nums[mid];
        while (i <= j) {
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    public static void quickSort(int[] arr, int start,
            int end) {  
        if (start >= end) {
            return;
        }
        int pivotIdx = partition(arr, start, end);
        quickSort(arr, start, pivotIdx - 1);
        quickSort(arr, pivotIdx, end);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 8, 7, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
