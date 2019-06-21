/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author vdoxx
 */
public class LambdaExpression {

    public static void main(String[] args) {
        List eastCoastStatesList = Arrays.asList("Connecticut", "Delaware", "Pensylvania", "RhodeIsland", "NewYork", "NorthCarolina", "SouthCarolina", "Georgia", "Florida");
        Stream eastCoastStatesListStream = eastCoastStatesList.stream();
        StatesWithCPredicate statesWithCPredicate = new StatesWithCPredicate();
//        boolean allMatches=eastCoastStatesListStream.allMatch(statesWithCPredicate);
//        System.out.println("allMatches:"+allMatches);
//        
        StatesPrintConsumer printStates = new StatesPrintConsumer();
        Stream eastCoastStatesListStreamStartingWithLetterC = eastCoastStatesListStream.filter(statesWithCPredicate);
        eastCoastStatesListStreamStartingWithLetterC.forEach(printStates);
        
         Stream eastCoastStatesListStreamStartingWithLetterD = eastCoastStatesList.stream().filter(new StatesWithDPredicate());
        eastCoastStatesListStreamStartingWithLetterD.forEach(System.out::println);

    }

}
