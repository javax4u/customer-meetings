/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.completablefuture;

import threads.dependent.*;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 *
 * @author rupesh kumar
 */
public class TaskCumSupplier2 implements Supplier<String> {

    String one,two;
     public TaskCumSupplier2(String paramOne,String paramTwo){
        this.one=paramOne;
        this.two=paramTwo;
    }
    public String call()  {
        try{
        System.out.println(" Thread2 going to sleep for 5 seconds "+ LocalDateTime.now().toString());
        Thread.sleep(5000);
        System.out.println(" Thread2 woke up at                   "+ LocalDateTime.now().toString());
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        return this.one+this.two;
    }

    @Override
    public String get() {
      return call();
    }

}
