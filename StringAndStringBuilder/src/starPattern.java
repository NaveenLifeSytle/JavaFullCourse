public class starPattern {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
       // pattern3(5);
       // pattern4(5);
       // pattern5(5);
//        pattern7(5);
       pattern8(4);

    }
    static void pattern1(int num){
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        for (int i=1;i<=num;i++){
            System.out.println();
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
        }
    }
    static void pattern2(int num){
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        for (int i=1;i<=num;i++){
            System.out.println();
            for (int j=1;j<=num;j++){
                System.out.print("* ");
            }
        }
    }
    static void pattern3(int num){
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        for (int i=num;i>=1;i--){
            System.out.println();
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
        }
    }
    static void pattern4(int num){
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
        for (int i=1;i<=num;i++){
            System.out.println();
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        }
    }
    static void pattern5(int num){
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
        for (int i=1;i<=2*num;i++){
            int col= num<i ? 2*num-i:i;

            System.out.println();

            for (int j=1;j<=col;j++){
                System.out.print("* ");
            }
        }

    }

    static  void pattern6(int num){
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        for (int i=1;i<=2*num;i++){
            int col= num<i ? 2*num-i:i;
            int noOfSpaces=num>=i?num-i:i-num;
            System.out.println();
            for (int k=1;k<=noOfSpaces;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=col;j++){
                System.out.print("* ");
            }
        }

    }
    static  void pattern7(int num) {

        for(int i=1;i<=2*num;i++){
int ans=num>=i?i:2*num-i;

            for(int space=num-ans;space>=1;space--){
                System.out.print("  ");
            }
            for (int col=ans;col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col=2;col<=ans;col++){
                System.out.print(col+" ");
            }
            System.out.println();        }
    }

    static  void pattern8(int num){
//4 4 4 4 4 4 4
//4 3 3 3 3 3 4
//4 3 2 2 2 3 4
//4 3 2 1 2 3 4
//4 3 2 2 2 3 4
//4 3 3 3 3 3 4
//4 4 4 4 4 4 4
        int n=2*num;
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                int min=(num-Math.min(Math.min(i,j),Math.min(n-i,n-j)))+1;
                if(min==num+1){
                    System.out.print("");
                }else
                System.out.print(min+" ");
            }
            System.out.println();

        }
    }
}
