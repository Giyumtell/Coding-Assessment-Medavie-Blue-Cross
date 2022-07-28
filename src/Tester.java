import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		int selection = 1;
		Scanner in = new Scanner(System.in);
		CeilingFan fan = new CeilingFan();
		while(selection != 0) {
			System.out.println("------->Tester for Ceiling fan functionalities<-------");
			System.out.println("-1 : pull the speed cord");
			System.out.println("-2 : pull the direction cord");
			System.out.println("-3 : get current status of the fan");
			System.out.println("-0 : End");
			System.out.print("Selection : ");
			selection = in.nextInt();
			switch (selection){
				case 1:
					fan.speedCord();
					break;
				case 2:
					fan.directionCord();
					break;
				case 3:
					System.out.println("\n"+fan.toString()+"\n");
					break;
				default:
					break;
			}
		}
		System.out.println("------->End of testing<-------");
	}
}
