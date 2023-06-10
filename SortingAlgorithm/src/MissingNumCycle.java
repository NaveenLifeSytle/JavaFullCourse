import java.util.Arrays;

public class MissingNumCycle {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(misiingNum(arr));

    }

    private static int misiingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]) {
                return j;
            }

        }
        return arr.length;

        }


        static void swap ( int[] arr, int max, int index){
            int temp = arr[max];
            arr[max] = arr[index];
            arr[index] = temp;

        }

    }