/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.dependent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author vdoxx
 */
public class DependentThreads {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        for (int i = 0; i <= 10; i++) {
            testMultiThreadsFuture();
        }
    }

    public static void testMultiThreadsFuture() throws InterruptedException, ExecutionException {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        
        Future<Integer> outputOfTaskCumThread1 = fixedThreadPool.submit(new TaskCumThread1(1, 1));
        while (!outputOfTaskCumThread1.isDone()) {
            // System.out.println(" waiting for thread 1 to produce result ."+resultOfThread1.get());
            //Thread.sleep(2000);
        }
        Future<String> outputOfTaskCumThread2 = fixedThreadPool.submit(new TaskThread2("a", "b"));
        while (!outputOfTaskCumThread2.isDone()) {
            // System.out.println(" waiting for thread 2 to produce result. "+resultOfThread2.get());
            // Thread.sleep(2000);
        }
        Future<String> outputOfTaskCumThread3 = fixedThreadPool.submit(new TaskThread3(outputOfTaskCumThread1.get().toString(), outputOfTaskCumThread2.get()));
        System.out.println("\n\nMain thread completed             " + outputOfTaskCumThread3.get());
fixedThreadPool.shutdown();
        // fixedThreadPool.shutdown();
    }
}
