/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.function.Predicate;

/**
 *
 * @author vdoxx
 */
public class StatesWithDPredicate implements Predicate<String>{

    @Override
    public boolean test(String stateNameStartsWithLetterC) {
        return stateNameStartsWithLetterC.startsWith("D");
    }
    
}
