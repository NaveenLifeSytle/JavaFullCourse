public class powOf2 {
    public static void main(String[] args) {
        int num=8;
        boolean ans=(num & (num-1)) ==0;
        if(ans){
            System.out.println("the given num is pow of 2");
        }else
            System.out.println("is not pow of 2");
    }
}
