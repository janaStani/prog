import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[];
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		values = new int[length];
		for(int i = 0; i < length; i++) {
			values[i] = sc.nextInt();
		}
		int evens = 1, odds = 0;
		for(int i = 0; i < length; i++) {
			if(values[i] % 2 == 0) {
				evens = evens * values[i];
			}
			else {
				odds = odds + values[i]*values[i];
			}
		}
		System.out.println(odds - evens);
	}

}
