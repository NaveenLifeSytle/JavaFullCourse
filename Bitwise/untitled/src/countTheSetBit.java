public class countTheSetBit {
    public static void main(String[] args) {
        int num=975;
        System.out.println(Integer.toString(num,2));

        setCount(num);
        setCount2(num);
        int count=0;
        while(num> 0){
            if((num & 1)!=0){
                count++;
            }
           num= num>>1;

        }
        System.out.println(count);
    }

    //2nd way
    static  void setCount(int n){
        int count=0;

        while (n>0){
            count++;
            n=n- (n & -n);
        }
        System.out.println(count);
    }static  void setCount2(int n){
        int count=0;

        while (n>0){
            count++;
            n=n & (n-1);
        }
        System.out.println(count);
    }

}
