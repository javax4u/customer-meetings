/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author vdoxx
 */
public class StreamToList {
    public static void main(String[] args) {
        Stream<String> states=Stream.of("Connecticut", "Delaware", "Pensylvania", "RhodeIsland", "NewYork", "NorthCarolina", "SouthCarolina", "Georgia", "Florida");
        states.forEach(System.out::println);
       // Stream<String> statesSorted=states.sorted();// throws exception
        
       Stream<String> statesStream=Stream.of("Connecticut", "Delaware", "Pensylvania", "RhodeIsland", "NewYork", "NorthCarolina", "SouthCarolina", "Georgia", "Florida");
       List statesFromStream=statesStream.collect(Collectors.toList());
        System.out.println(statesFromStream);
    }
}
