package recursionBasic;

public class CountOfZero {
    public static void main(String[] args) {
        System.out.println(countOfZero(1200670));
    }
static int countOfZero(int num){

        return helper(num,0);
}
    static int helper(int num,int count){
        if(num%10==num){
            return count;

        }

        if(num%10==0){
            return helper(num/10,count+1);
        }
       return helper(num/10,count);



    }
}
