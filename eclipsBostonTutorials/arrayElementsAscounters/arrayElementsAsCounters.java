// video 31

package tutorials;
import java.util.Random;


public class arrayElementsAsCounters {

	public static void main(String[] args) {
		// array elements as counters:
		Random dice = new Random();
		int freq[] = new int[7];
		
		// this rolls the dice 1000 times and then adds up the amount of times that each face is rolled. 
		for(int i = 1; i < 1000; i++) {
			// I don't understand this line of code:
			++freq[1 + dice.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		// this is going to output our array:
		for(int x = 1; x < freq.length; x++) {
			System.out.println(x + "\t" + freq[x]);
		}	
	}
}
