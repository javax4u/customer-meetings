/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.completablefuture;

import java.time.LocalDateTime;
import java.util.function.Consumer;

/**
 *
 * @author vdoxx
 */
public class TaskCumConsumer implements Consumer<String> {

    String one, two;

    public TaskCumConsumer(String paramOne, String paramTwo) {
        this.one = paramOne;
        this.two = paramTwo;
    }

    public String call() {
        try {
            System.out.println(" Thread3 going to sleep for 5 seconds " + LocalDateTime.now().toString());
            Thread.sleep(5000);
            System.out.println(" Thread3 woke up at                   " + LocalDateTime.now().toString());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "final " + this.one + this.two;
    }

    @Override
    public void accept(String arg0) {
        System.out.println(""+call());
    }

}
