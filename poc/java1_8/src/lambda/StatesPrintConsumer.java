/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.function.Consumer;

/**
 *
 * @author vdoxx
 */
public class StatesPrintConsumer implements Consumer{

    @Override
    public void accept(Object statesName) {
        System.out.println(statesName);
    }

    @Override
    public Consumer andThen(Consumer after) {
        return Consumer.super.andThen(after); //To change body of generated methods, choose Tools | Templates.
    }
    
}
