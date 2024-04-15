import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 4;
        int end = 9;
        int[] result = getSubArrayBetween(numbers, start, end);
        System.out.println(Arrays.toString(result));
        System.out.print("[");
        for (int x = 0; x < result.length - 1; x++) {
            System.out.print(result[x] + ", ");
        }
        System.out.print(result[result.length - 1] + "]");
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int lengthOfNewMassive = 0;
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] >= start && numbers[x] <= end) {
                lengthOfNewMassive = lengthOfNewMassive + 1;
            }
        }
        int[] result = new int[lengthOfNewMassive];
        int counter = 0;
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] >= start && numbers[x] <= end) {
                result[counter] = numbers[x];
                counter = counter + 1;
            }
        }
        return result;
    }
}
