//Reduce method : it is used to combine all the value of streams and add them 

//Optional class was introduced in java 8

//It is used to validate if any null pointer exception is there in return value
package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethodReduce {

	public static void main(String[] args) {
	
        List<String> l = Arrays.asList("A","B","C","1","2","3");
        
     Optional<String> reduced   =  l.stream().reduce((value,combinedvalue)->
         {
        	 return value+combinedvalue;
         });
        		
		
		System.out.println(reduced.get());
			
	}

}
