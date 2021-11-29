/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author rupesh kumar
 */
public class ConcurrentHashmapSolution {

    public static void main(String[] args) {
        Map<String, String> draft1 = new ConcurrentHashMap<String, String>();
        draft1.put("1", "one");
        draft1.put("2", "one");
        draft1.put("3", "one");
        draft1.put("removeMe", "removeMe");

        System.out.println(draft1);
        //draft1.
        for (Iterator iterator = draft1.entrySet().iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            String string = next.toString();
            if (string.equalsIgnoreCase("removeMe=removeMe")) {
                iterator.remove();
                System.out.println("deleted " + string);
            }

        }
        System.out.println(draft1);

        //draft1.
        for (Iterator iterator = draft1.entrySet().iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            String string = next.toString();
            draft1.put("4", "4");//Exception in thread "main" java.util.ConcurrentModificationException
            System.out.println("added 4,4");
        }
        System.out.println(draft1);
    }
}
