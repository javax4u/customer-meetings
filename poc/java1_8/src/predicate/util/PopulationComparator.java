/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate.util;

import java.util.Comparator;
import predicate.States;

/**
 *
 * @author vdoxx
 */
public class PopulationComparator implements Comparator<States>{
    public int compare(States state1,States state2){
        return state1.getPopulationInt().compareTo(state2.getPopulationInt());
    }



    
}
