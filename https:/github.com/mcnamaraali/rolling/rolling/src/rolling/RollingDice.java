package rolling;
import java.security.SecureRandom;

public class RollingDice {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
	
		int frequency1 = 0; //count of 1s rolled
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
		
		//tally counts for 5,000,000 rolls of a die
		for(int roll = 1; roll <= 5_000_000; roll++) {
			int face = 1 + randomNumbers.nextInt(6);
			
		//use face value 1-6 to determine which counter to increment	
		switch (face) {
			case 1:
				++frequency1; //increment the 1s counter
				break;
			case 2:
				++frequency2;
				break;
			case 3:
				++frequency3;
				break;
			case 4:
				++frequency4;
				break;
			case 5:
				++frequency5;
				break;
			case 6:
				++frequency6;
				break;
				
			}
		}
		
		System.out.println("Face\tFrequency"); //output headers
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1,frequency2,
				frequency3,frequency4,frequency5,frequency6);

	}

}
