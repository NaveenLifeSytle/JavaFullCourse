public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    public static double sqrt( double num){

        double x=num;
        double root;
        while (true){
            root=0.5*(x+(num/x));

            if(Math.abs(root-x) < 0.5){
                break;
            }
            x=root;
        }
return root;
    }
}
