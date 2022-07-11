
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);  //10
        System.out.println("anotherIntValue = " + anotherIntValue);//10

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);//10
        System.out.println("anotherIntValue = " + anotherIntValue);//10

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));//[0,0,0,0,0]
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));//[0,0,0,0,0]

        anotherArray[0] = 1;

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));//[0,0,0,0,0]
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));//[1,0,0,0,0]

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));//[0,0,0,0,0]
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));//4, 5, 6, 7, 8
    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
