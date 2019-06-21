package hashmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vdoxx
 */
public class HashmapPut {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "A1");
        map.put("2", "A2");
        map.put("2", "A3");
        System.out.println(map);//{1=A1, 2=A3}
        List list = new ArrayList();
        System.out.println(list.add("1"));
        System.out.println(list.add("1"));
        System.out.println(list.add(null));
        System.out.println(list.add(null));
        System.out.println(list);
        Set set = new HashSet();
        System.out.println(set.add("1"));
        System.out.println(set.add("1"));
        System.out.println(set.add(null));
        System.out.println(set.add(null));
        System.out.println(set);

    }

}
