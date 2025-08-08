public class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;
        
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int findPeak(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int binarySearch(MountainArray arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) return mid;

            if (isAsc) {
                if (midVal < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (midVal > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}