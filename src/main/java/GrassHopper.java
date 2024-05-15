public class GrassHopper {
    public static int findAverage(int[] nums) {
        // Check if the array is empty
        if (nums.length == 0) {
            return 0; // Return 0 if the array is empty
        }

        int sum = 0;

        // Calculate the sum of all numbers in the array
        for (int num : nums) {
            sum += num;
        }

        // Calculate the average by dividing the sum by the number of values in the array
        return sum / nums.length;
    }
}
