import java.util.ArrayList;
import java.util.Random;

public class QuizGameSecondThread implements Runnable{

	list.remove(index)
	
	@Override
	public void run() {
	
		int size = 20;
	     ArrayList<Integer> list = new ArrayList<Integer>(size);
	     
	     for(int i = 1; i <= size; i++) {
	         list.add(i);
	     }
	        Random rand = new Random();
	        for(int o = 0; list.size() > 0; o++) {
	            int index = rand.nextInt(list.size());

	        }
		
	}

}
