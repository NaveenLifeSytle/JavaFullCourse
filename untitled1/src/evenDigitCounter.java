public class evenDigitCounter {
    public static void main(String[] args) {
        int[] arr={100,111,2,22,34,678};
        System.out.println(counter(arr));
        System.out.println(digit2(33534));
    }
    static int counter(int[] arr){
        int count=0;
        for (int element:arr){
            if(even(element)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int element) {
        int count=digit(element);
        if (count%2==0){
            return  true;
        }
        return false;
    }

    private static int digit(int element) {
        int count=0;
        while (0<element){
            count++;
            element=element/10;
        }
        return  count;
    }
    private static int digit2(int element){
        return (int)(Math.log10(element))+1;
    }
}
