public class Sqrt {
    public static void main(String[] args) {
        int num=40;
        int p=3;
       double ans= sqrt(num,p);
        System.out.println(ans);
    }

    private static double sqrt(int num, int p) {

        double root=0.0;
        int s=0;
        int end=num;
while (s<end) {
    int mid=s +(end-s)/2;
            if (mid * mid == num) {
                return mid;
               }
             if (mid * mid > num) {
                 end = mid-1;
              }else {
                 s=mid+1;
             }
           }
double incr=0.1;
for (int i=0;i<p;i++){
    while(root*root<=num){
        root=root+incr;
    }
    root=root-incr;
    incr/=10;
}
return  root;
    }
}
