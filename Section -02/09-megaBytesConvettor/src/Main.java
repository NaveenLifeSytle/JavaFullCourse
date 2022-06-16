import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number in kb");
		int kb=sc.nextInt();

		MegaBytesConverter.printMegaBytesAndKiloBytes(kb);
		
	}

}
