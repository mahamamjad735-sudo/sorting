package selection;
import java.util.Random;
public class BubbleSort {
	   public static void main(String[] args) {

	        int n = 100000;
	        int[] data = new int[n];

	        Random random = new Random();

	        for (int i = 0; i < n; i++) {
	            data[i] = random.nextInt(1000000);
	        }

	        long start = System.nanoTime();

	        for (int k = 1; k < n; k++) {
	            boolean didSwap = false;

	            for (int ptr = 0; ptr < n - k; ptr++) {
	                if (data[ptr] > data[ptr + 1]) {
	                    int temp = data[ptr];
	                    data[ptr] = data[ptr + 1];
	                    data[ptr + 1] = temp;

	                    didSwap = true;
	                }
	            }

	            if (!didSwap) {
	                break;
	            }
	        }

	        long end = System.nanoTime();

	        long time = end - start;

	        System.out.println("Sorted Array:");

	        for (int i = 0; i < n; i++) {
	            System.out.print(data[i] + " ");
	        }

	        System.out.println("\n\nArray Size: " + n);
	        System.out.println("Execution Time: " + time + " nanoseconds");
	        System.out.println("Execution Time: "
	                + time / 100000000.0 + " milliseconds");
	    }
}
