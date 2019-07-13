/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.List;
import model.States;
import predicate.StatesDaoJava7;

/**
 *
 * @author vdoxx
 */
public class LambdaSample {

    public static void main(String[] args) {
        printAllStatesPopulationWithLambda();
        System.out.println("Main thread ended");
    }

    public static void printAllStatesPopulationWithLambda() {
        List<States> listOfStates = StatesDaoJava7.initStates();
        listOfStates.forEach(name -> System.out.println(name.getPopulation()));
    }

}
