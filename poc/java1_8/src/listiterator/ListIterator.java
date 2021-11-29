/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author rupesh kumar
 */
public class ListIterator {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("four");
        System.out.println("" + list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase("four")) {
                iterator.remove();
                            }
        }
        System.out.println("after remove:" + list);
        java.util.ListIterator<String> listIterator = list.listIterator();
        while ( listIterator.hasNext()) {
            if (listIterator.next().equalsIgnoreCase("3")) {
                // iterator.remove();
                listIterator.add("4");//add function is not in iterator . and you can not use listiterator with set
            }
        }
        System.out.println("after add:" + list);
    }
}
