/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import model.States;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import predicate.util.PopulationComparator;
import predicate.util.PrintStatesConsumer;
import predicate.util.RepresentativePredicateMoreThan10;

/**
 *
 * @author vdoxx
 */
public class StatesDaoJava8 {
    
    public static void main(String[] args) {
//        initStates();
        List<States> statesList = StatesDaoJava7.initStates();
        //print all states
        PrintStatesConsumer printStates = new PrintStatesConsumer();
        statesList.forEach(printStates);

//        getAllEastCoastStates();
//        getMostPopulatedState();
        System.out.println("*************  peak by population **********");
        Optional<States> maxPopulatesState = statesList.stream().max(new PopulationComparator());
        System.out.println(maxPopulatesState.get().getName());
        System.out.println("********************************************");
//        getLeastPopulatedStates();
        System.out.println("************** min by population ***********");
        Optional<States> minPopulatesState = statesList.stream().min(new PopulationComparator());
        System.out.println(minPopulatesState.get().getName());
        System.out.println("********************************************");
//        getSortedStatesByName();
//        getSortedStatesByPopulation();
        System.out.println("sorted by population ");
        Stream<States> sortedStream = statesList.stream().sorted(new PopulationComparator());
        sortedStream.forEach(printStates);
//        getSortedStatesByYear();
// states which has representative more than 10
        Stream<States> statesWith10PlusRepresenatative = statesList.stream().filter(new RepresentativePredicateMoreThan10());
         System.out.println("************** states with representative more than 10 **********");
//        statesWith10PlusRepresenatative.forEach(printStates);
        statesWith10PlusRepresenatative.forEach(printStates::accept);
        int numberOfRepresentative=statesList.stream().filter(new RepresentativePredicateMoreThan10()).mapToInt(s->s.getRepresentativeInt()).sum();
        System.out.println("************** sum 0 **********"+numberOfRepresentative);  
        
        System.out.println("*** by timezone ");      
         Map<String, List<States>> groupByPriceMap = statesList.stream().collect(Collectors.groupingBy(States::getTimeZOne));
          System.out.println(groupByPriceMap);     
    }
    
}
