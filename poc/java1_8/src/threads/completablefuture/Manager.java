/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.completablefuture;

import java.util.concurrent.CompletableFuture;
/**
 *
 * @author rupesh kumar
 */

import java.util.concurrent.ExecutionException;

/**
 *
 * @author rupesh kumar
 */

public class Manager {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // list all tasks
        CompletableFuture<Integer> taskCumSupplierOutput1 = CompletableFuture.supplyAsync(new TaskCumSupplier1(1, 1));
        CompletableFuture<String> taskCumSupplierOutput2 = CompletableFuture.supplyAsync(new TaskCumSupplier2("a", "b"));
        // list all labours 
        //configure order of call and start with one shot

        taskCumSupplierOutput2.thenAcceptAsync(new TaskCumConsumer(String.valueOf(taskCumSupplierOutput1.get()), taskCumSupplierOutput2.get()));

    }

}
