import java.util.ArrayList;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		 int size = 20;
	     ArrayList<Integer> list = new ArrayList<Integer>(size);
	     
	     for(int i = 1; i <= size; i++) {
	         list.add(i);
	     }
	        Random rand = new Random();
	        while(list.size() > 0) {
	            int index = rand.nextInt(list.size());
	            System.out.println("Selected: "+list.remove(index));
	        }
	     
	}

}
