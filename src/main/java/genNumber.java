import java.util.*;
import java.util.stream.Stream;


public class genNumber {
int amountValue;

	public int random(int amountValue, int countInt ) {
		int end = 0;
			this.amountValue = amountValue;

	        ArrayList<Integer> list = new ArrayList<Integer>(this.amountValue);
	        for(int i = 1; i <= this.amountValue; i++) {
	            list.add(i);
	        }

	        Random rand = new Random();
	        while(countInt < amountValue) {
	            int index = rand.nextInt(list.size());
	           
	          return end = list.remove(index);  
	        }
	        return end;
	}	
	
	
	
	
	
	public static void name(String[] args) {
		
	
//		Integer[] rnd = Stream.generate(new Random()::ints)
//        .distinct()
//        .limit(20) // whatever limit you might need
//        .toArray(Integer[]::new);
//		
//		for (Integer integerInList : rnd) {
//			System.out.println(integerInList);
//		}
		
		
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
	
 


