/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.dependent;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author vdoxx
 */
public class TaskCumThread1 implements Callable<Integer> {

    int one,two;
   public TaskCumThread1(int paramOne,int paramTwo){
        this.one=paramOne;
        this.two=paramTwo;
    }
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getThreadGroup().getName()+Thread.currentThread().getName());
        System.out.println("Thread1 going to sleep for 5 seconds "+ LocalDateTime.now().toString());
        //Thread.sleep(5000);
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Thread1 woke up at                   "+ LocalDateTime.now().toString());
        return this.one+this.two;
    }

}
