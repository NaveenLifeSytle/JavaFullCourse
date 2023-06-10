public class findNthBit {
    public static void main(String[] args) {
        int num = 10;

        System.out.println(ithBit(num, 4));


    }
    static int ithBit(int num,int i){
        return ( num & (1<<(i-1))) >> (i-1) ;
    }
}
