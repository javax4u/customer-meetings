/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import util.StatesDaoJava7;
import model.States;
import predicate.util.PopulationComparator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author vdoxx
 */
public class TestJava7 {

    public static void main(String[] args) {
        System.out.println(" Started TestJava7");
        List<States> statesList = StatesDaoJava7.initStates();
        //print all states
        for (States temp : statesList) {
            System.out.println(temp.getName() + "\t" + temp.getAbbreviation() + "\t" + temp.getPopulationInt() + "\t" + temp.getRepresentative());
        }

//        getAllEastCoastStates();
//        getMostPopulatedState();
        Collections.sort(statesList, new PopulationComparator());
        States temp = statesList.get(statesList.size() - 1);
        System.out.println("Most populates state");
        System.out.println(temp.getName() + "\t" + temp.getAbbreviation() + "\t" + temp.getPopulationInt() + "\t" + temp.getRepresentative());

//        getLeastPopulatedStates();
        temp = statesList.get(0);
        System.out.println("Least populates state");
        System.out.println(temp.getName() + "\t" + temp.getAbbreviation() + "\t" + temp.getPopulationInt() + "\t" + temp.getRepresentative());

//        getSortedStatesByName();
        Collections.sort(statesList, new Comparator<States>() {
            public int compare(States state1, States state2) {
                return state1.getName().compareTo(state2.getName());
            }
        });
        temp = statesList.get(statesList.size() - 1);
        System.out.println("Last alhabatically sorted state");
        System.out.println(temp.getName() + "\t" + temp.getAbbreviation() + "\t" + temp.getPopulationInt() + "\t" + temp.getRepresentative());

//        getSortedStatesByPopulation();
//        getSortedStatesByYear();
    }
}
