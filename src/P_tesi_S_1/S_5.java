package P_tesi_S_1;

public class S_5 {
    public static void main(String[] args) {


    class MountainArray {
        public static boolean isMountainArray(int[] arr) {
            // A mountain array must have at least 3 elements
            if (arr == null || arr.length < 3) {
                return false;
            }

            // Check that the array first strictly increases and then strictly decreases
            boolean increasing = true;
            for (int i = 1; i < arr.length; i++) {
                if (increasing) {
                    // The array is still increasing
                    if (arr[i] > arr[i - 1]) {
                        continue;
                    } else if (arr[i] == arr[i - 1]) {
                        // Two adjacent elements must not be equal
                        return false;
                    } else {
                        // The array starts decreasing
                        increasing = false;
                    }
                } else {
                    // The array is decreasing
                    if (arr[i] < arr[i - 1]) {
                        continue;
                    } else {
                        // If the array is not strictly decreasing anymore, it's not a mountain array
                        return false;
                    }
                }
            }

            // If the loop finished, it means the array is a mountain array
            return true;
        }

    }
}
}