/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate.util;

import java.util.function.Predicate;
import model.States;

/**
 *
 * @author rupesh kumar
 */
public class RepresentativePredicateMoreThan10 implements Predicate<States>{

    @Override
    public boolean test(States arg0) {
        if(arg0.getRepresentativeInt()>10){
          return true;
      }else{
        return  false;
      }
    }
    
}
