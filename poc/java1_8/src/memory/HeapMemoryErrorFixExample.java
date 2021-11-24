/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author vdoxx
 */
public class HeapMemoryErrorFixExample {

    public static void main(String args[]) {

        Map<PersonFix, Integer> mapReference = new LinkedHashMap<PersonFix, Integer>();

        while (true) {
            for (int i = 0; i < 10000; i++) {
                PersonFix newPerson = new PersonFix(i);
                if (mapReference.containsKey(newPerson)) {
                    System.out.println("already had  " + i);
                } else {
                    mapReference.put(newPerson, i);
                    System.out.println("added " + i);
                }
            }
        }

    }
    // System.out.println("main method completed ");
}

class PersonFix {

    Integer adhaarNumber;

    PersonFix(Integer adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

    @Override
    public boolean equals(Object anotherPerson) {
        boolean returnMe = false;
        if (anotherPerson instanceof PersonFix) {
            returnMe = ((PersonFix) anotherPerson).adhaarNumber.equals(this.adhaarNumber);
        }
        return returnMe;
    }

    @Override
    public int hashCode() {
        return adhaarNumber; //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getAdhaarNumber() {
        return adhaarNumber;
    }

}
