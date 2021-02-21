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
	 ArrayList<Integer> lis = new ArrayList<Integer>(size);
     ArrayList<Integer> list = new ArrayList<Integer>(size);
     
     for(int i = 1; i <= size; i++)
     {list.add(i);}

     Random rand = new Random();
     for(int i = 0; i <= size; i++) {
         int index = rand.nextInt(list.size());
         lis.add(i, list.remove(index));}
     
     for (Integer integer : lis) {
		System.out.println(integer);
	}
     
     
	}
     
     
}
	
 


