/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.dependent;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;

/**
 *
 * @author vdoxx
 */
public class TaskThread2 implements Callable<String> {

    String one,two;
     public TaskThread2(String paramOne,String paramTwo){
        this.one=paramOne;
        this.two=paramTwo;
    }
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getThreadGroup().getName()+Thread.currentThread().getName());
        System.out.println(" Thread2 going to sleep for 5 seconds "+ LocalDateTime.now().toString());
        Thread.sleep(5000);
        System.out.println(" Thread2 woke up at                   "+ LocalDateTime.now().toString());
        return this.one+this.two;
    }

}
