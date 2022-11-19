public class GCD {
    public static void main(String[] args) {
        int n1 = 366, n2 = 66;
        int hcf = hcf(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    }

    public static int hcf(int n1, int n2)//366 66
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2); //66 366%66 = 36   66 36 66 30
        else                         //n2      n1
            return n1;
    }
}
