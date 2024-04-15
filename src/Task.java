import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 1;
        int end = 9;
        int[] result = getSubArrayBetween(numbers, start, end);
        System.out.print("[");
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[result.length - 1] + "]");
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int lengthOfNewMassive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                lengthOfNewMassive++;
            }
        }
        int[] result = new int[lengthOfNewMassive];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                result[counter] = numbers[i];
                counter++;
            }
        }
        return result;
    }
}
