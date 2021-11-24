/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author vdoxx
 */
public class HeapMemoryErrorExample {

    public static void main(String args[]) {

        int i = 0;
        Map<Person, Integer> mapReference = new LinkedHashMap<Person, Integer>();

        while (true) {
            Person newPerson=new Person(i);
            if(mapReference.containsKey(newPerson)){
                System.out.println("already had  "+i);
            }else{
                mapReference.put(newPerson, i);
                System.out.println("added "+i);
            }
            i++;
            
        }
       // System.out.println("main method completed ");
    }
        
}

class Person {

    int adhaarNumber;

    Person(int adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

    @Override
    public int hashCode() {
        return adhaarNumber; //To change body of generated methods, choose Tools | Templates.
    }
    
}
