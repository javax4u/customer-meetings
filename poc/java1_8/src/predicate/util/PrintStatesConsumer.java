/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate.util;

import java.util.function.Consumer;
import predicate.States;

/**
 *
 * @author vdoxx
 */
public class PrintStatesConsumer implements Consumer<States>{

    @Override
    public void accept(States temp) {
        System.out.println(temp.getName() + "\t" + temp.getAbbreviation() + "\t" + temp.getPopulationInt() + "\t" + temp.getRepresentative());
    }

    @Override
    public Consumer<States> andThen(Consumer<? super States> arg0) {
        System.out.println("and then called");
        return Consumer.super.andThen(arg0); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
