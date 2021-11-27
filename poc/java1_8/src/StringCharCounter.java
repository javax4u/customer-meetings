
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vdoxx
 */
public class StringCharCounter {

    public static void main(String[] args) {
        String tempString = "hi i am rupesh";
        char[] charArray = tempString.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        Integer temp;
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(charArray[i])) {
                temp = map.get(charArray[i]);
                map.put(charArray[i], temp++);
            } else {
                map.put(charArray[i], 1);
            }

        }
        System.out.println("char count map " + map);
        // sort it by value
        ///pick the second by index

        List<Character> charList = "hi i am rupesh".chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        long distinctCount = charList.stream().distinct().count();
        System.out.println("total Count " + charList.stream().count());
        System.out.println("distinctCount " + distinctCount);

        Map<Character, Long> mapCount = charList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("mapCount:"+mapCount);
    }

}
