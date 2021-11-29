/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.deadlock;

/**
 *
 * @author rupesh kumar
 */
public class ThreadLock {

    static String object1="string 1";
    static String object2=" string 2";

    static class Thread1 extends Thread {

        public void run() {
            synchronized (object1) {
                System.out.println("Thread-1 .. holding lock 1 ....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Thread-1 .. waiting for lock 2 ....");
                 synchronized (object2) {
                     System.out.println("Thread-1 .. holding lock 1 and lock2 ....");
                 }
            }
            System.out.println(" Thread 1 ended ");
        }

    }
     static class Thread2 extends Thread {

        public void run() {
            synchronized (object1) {
                System.out.println("Thread-2 .. holding lock 1 ....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Thread-2 .. waiting for lock 2 ....");
                 synchronized (object2) {
                     System.out.println("Thread-2 .. holding lock 2 and lock 1 ....");
                 }
            }
            
            System.out.println(" Thread 2 ended ");
        }

    }
     public static void main(String[] args) {
        new Thread1().run();
        new Thread2().run();
    }
}
