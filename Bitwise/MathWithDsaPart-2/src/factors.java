import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
factors3(20);
    }
    //0(n)
    static void factors(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }

    }
    //o(sqrt(n))
    static void factors2(int num){
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(num/i==i){
                    System.out.print(i+"00 "+" ");
                }
                else
                System.out.print(i+" " +num/i+" ");
            }

            }
        }

    static void factors3(int num){
        ArrayList list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(num/i==i){
                    System.out.print(i+"00 "+" ");
                }
                else
                    System.out.print(i+" ");
                list.add(num/i);
            }

        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
