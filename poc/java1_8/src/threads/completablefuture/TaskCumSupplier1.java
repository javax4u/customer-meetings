/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.complatablefuture;

import threads.dependent.*;
import java.time.LocalDateTime;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 *
 * @author vdoxx
 */
public class TaskCumSupplier1 implements Supplier<Integer> {

    int one,two;
   public TaskCumSupplier1(int paramOne,int paramTwo){
        this.one=paramOne;
        this.two=paramTwo;
    }
    public Integer call() {
        try{
        System.out.println("Thread1 going to sleep for 5 seconds "+ LocalDateTime.now().toString());
        //Thread.sleep(5000);
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Thread1 woke up at                   "+ LocalDateTime.now().toString());
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        return this.one+this.two;
    }

    @Override
    public Integer get() {
        return call();
    }

}
