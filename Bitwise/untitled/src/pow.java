public class pow {
    public static void main(String[] args) {
        int base=3;
        int pow=6;
        int ans=1;
        while (pow>0){
            if((pow & 1)!=0){
                ans*=base;
            }
            base*=base;
          pow=  pow>>1;
        }
        System.out.println(ans);
    }
}
