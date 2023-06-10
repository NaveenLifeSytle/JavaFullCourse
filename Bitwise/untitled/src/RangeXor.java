public class RangeXor {
    public static void main(String[] args) {
        int a=3;
        int b=9;

        int ans=xor(b)^xor(a-1);
        System.out.println(ans);
        //one check for this
        int ans2=0;
        for(int i=a;i<=b;i++){
            ans2^=i;
        }
        System.out.println(ans2);
    }


    private static int xor(int val) {
        if(val%4==0){
            return val;
        }
        if(val%4==1){
            return 1;
        }
        if(val%4==2){
            return val+1;
        }
        return 0;
    }


}
