package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// check given number is withn 0 to 100 or not
		Predicate<Integer> isGreaterThan10 = x -> x > 10;
		Predicate<Integer> isLessThan100 = y -> y < 100;
		Integer number = 50;
		boolean result = isGreaterThan10.and(isLessThan100).test(50);
                
		System.out.println("number="+number+" result="+result);
                
                List<String> tempString=Arrays.asList("iamrupesh");
                
                
                
               
	}

}


