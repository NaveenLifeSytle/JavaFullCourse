import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("the dog is barking or not(true or false)");
		boolean isBarking=sc.nextBoolean();
		
		System.out.println("enter the timing for wake up");
            int time=sc.nextInt();
		
		
		boolean isdogBarking= BarkingDog.shouldWakeUp( isBarking, time);
		if(isdogBarking) {
			System.out.println("danger ahed...please wake up");
		}
		else {
			System.out.println("keep calm and do ur works");
		}
	}

}
