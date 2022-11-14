
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        //Scanner sdc = new Scanner(System.in);
      //  System.out.println("enter the numbers");
//        int no1=sdc.nextInt();
//        int no2=sdc.nextInt();

        ExceptionDemo ed=new ExceptionDemo();
      //  ed.calculate(no1,no2);
       // ed.calculate2();

     //   ed.calculate4();
ed.getSalary();
    }
// five keyword . try , catch,finally,throws,throw;

    // throw and catch
    private void calculate(int no1, int no2) throws ArithmeticException {

        try {
            System.out.println(no1 + no2);
            System.out.println(no1 - no2);
            System.out.println(no1 * no2);
            System.out.println(no1 / no2);



        }catch (ArithmeticException   e)
        {

            System.out.println("could not able to calculate num/0.");
        }


    }

    //Exception enna exception trrow agum nu theriya villa enral
    private void calculate2(){

        int[] arr = new int[3];
        try {
            arr[0] = 10;
            arr[1] = 10;
            arr[2] = 10;
            arr[3] = 10;

        } catch (Exception e) {

            System.out.println("something wrong");
        }

    }

//input correct ah irukkura varaikkum again and again print agum;
    private void calculate3() throws ArithmeticException {
        Scanner sdc = new Scanner(System.in);
         System.out.println("enter the numbers");
        int no1=sdc.nextInt();
        int no2=sdc.nextInt();
        System.out.println(no1 + no2);
        System.out.println(no1 - no2);
        System.out.println(no1 * no2);
        try {
            System.out.println(no1 / no2);

        }catch (ArithmeticException   e)
        {

            System.out.println("could not able to calculate num/0.");
            calculate3();
        }


    }


    //finaly- epdi irunthalum finally la kodhukkurathu execute aagum

    private void calculate4() throws ArithmeticException {
        Scanner sdc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int no1=sdc.nextInt();
        int no2=sdc.nextInt();
        System.out.println(no1 + no2);
        System.out.println(no1 - no2);
        System.out.println(no1 * no2);
        try {
            System.out.println(no1 / no2);

     }catch (ArithmeticException   e)
       {
          System.out.println("could not able to calculate num/0.");
          calculate4();
       }
        finally {
            System.out.println("iam finnaly,i am execute always>>>>>");
        }


    }

    // multiple catch for one try
    public void getSalary() {
        Scanner sdc = new Scanner(System.in);
       try {
           System.out.println("enter the numbers 1");
           int no1 = sdc.nextInt();
           System.out.println("enter the numbers 2");
           int no2 = sdc.nextInt();

           int[] sal = new int[5];
           for (int i = 0; i < 10; i++) {
               System.out.println(sal[i]);
           }
       }catch (InputMismatchException ie){
           System.out.println("enter numbers,not alphabets allowed");
           getSalary();

       }
       catch (ArrayIndexOutOfBoundsException ae){
           System.out.println("check ur array length");

       }

    }


}
