package consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import model.States;
import util.StatesDaoJava7;

/**
 * @author Rupesh
 *
 */
public class ConsumerTest {

    public static void main(String args[]) {

        Consumer<String> logger = x -> x=x+1;
        //logger.accept("Rupesh");

        //Consumer<List<States>> loggerForList = myList -> myList.forEach(tempItem -> System.out.println(tempItem + "=>"));
        //loggerForList.accept(StatesDaoJava7.initStates());
        
        
        Supplier<Double> randomNumberSupplier = () -> Math.random();
        //System.out.println(randomNumberSupplier.get().toString());
        logger.accept(randomNumberSupplier.get().toString());
        
        //Supplier<List<States>> listOfStatesSupplier = () -> StatesDaoJava7.initStates();
        
       // loggerForList.accept(listOfStatesSupplier.get());


    }

}
