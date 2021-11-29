
/**
 *
 * @author rupesh kumar
 */
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.States;
import util.StatesDaoJava7;

public class StateCRUD {

    public static void main(String[] args) {
        List<States> resultList = StatesDaoJava7.initStates();
        System.out.println("ALL states : " + resultList);

        // select * from User userVar where userVar.name like 'A%'
        Predicate<States> stateWhereClause = userTemp -> userTemp.getName().startsWith("A");
        List filterredResultList = resultList.stream().filter(stateWhereClause).collect(Collectors.toList());

        System.out.println("\n------------------");
        String timeZoneParamter = "Pacific Time Zone";
        System.out.println("Filter with timeZone " + timeZoneParamter);
        System.out.println("------------------");
        Predicate<States> stateWhereClauseByTime = (userTemp) -> userTemp.getTimeZOne().equalsIgnoreCase(timeZoneParamter);
        List<States> filteredStatesByTimeZone = resultList.stream().filter(stateWhereClauseByTime).collect(Collectors.toList());
        filteredStatesByTimeZone.forEach(x -> System.out.println(x.getName() + "-" + x.getTimeZOne()));

        System.out.println("\n------------------");
        System.out.println("GroupBy By timeZone");
        System.out.println("------------------");
        Map<String, Long> groupedByStatesNameAndTimeZone = resultList.stream().collect(Collectors.groupingBy(stateTemp -> stateTemp.getTimeZOne(), Collectors.counting()));
        System.out.println(groupedByStatesNameAndTimeZone);

        System.out.println("\n------------------");
        System.out.println("Count names starting with letter A");
        System.out.println("------------------");
        Long countOfAllStateStartingWithA = resultList.stream().filter(temp -> temp.getName().startsWith("A")).count();
        System.out.println("" + countOfAllStateStartingWithA);

        System.out.println("\n------------------");
        System.out.println("select two columns");
        System.out.println("------------------");
        Map<String, String> nameAndTimezoneMap = resultList.stream().collect(Collectors.toMap(x -> x.getName(), state -> state.getTimeZOne()));
        System.out.println("" + nameAndTimezoneMap);

        System.out.println("\n------------------");
        System.out.println("select two columns");
        System.out.println("------------------");
        Function<States, String> nameProvider = state -> state.getName();
        Function<States, String> timezoneProvider = stateTemp -> stateTemp.getFormationYear();
        Map<String,String> nameAndTimezoneCollector = resultList.stream().collect(Collectors.toMap(nameProvider, timezoneProvider));
        System.out.println("" + nameAndTimezoneCollector);
        
        System.out.println("\n------------------");
        System.out.println("sort list by representatives");
        System.out.println("------------------");
        
        System.out.println("\n------------------");
        System.out.println("sort map by key");
        System.out.println("------------------");
        
        System.out.println("\n------------------");
        System.out.println("sort map by value");
        System.out.println("------------------");
        
        System.out.println("\n------------------");
        System.out.println("Filter a map by key");
        System.out.println("------------------");
        
         System.out.println("\n------------------");
        System.out.println("Filter a map by value");
        System.out.println("------------------");
        

    }

}
/**
 * output run: run: ALL states : [Alabama, Alaska, Arizona, Arkansas,
 * California, Colorado, Connecticut, Delaware, Florida, Georgia, Hawaii, Idaho,
 * Illinois, Indiana, Iowa, Kansas, Kentucky, Louisiana, Maine, Maryland,
 * Massachusetts, Michigan, Minnesota, Mississippi, Missouri, Montana, Nebraska,
 * Nevada, New Hampshire, New Jersey, New Mexico, New York, North Carolina,
 * North Dakota, Ohio, Oklahoma, Oregon, Pennsylvania, Rhode Island, South
 * Carolina, South Dakota, Tennessee, Texas, Utah, Vermont, Virginia,
 * Washington, West Virginia, Wisconsin, Wyoming]
 *
 * ------------------ Filter with timeZone Pacific Time Zone ------------------
 * California-Pacific Time Zone Nevada-Pacific Time Zone Oregon-Pacific Time
 * Zone Washington-Pacific Time Zone
 *
 * ------------------ GroupBy By timeZone ------------------ {Mountain Time
 * Zone=7, Alaska Time Zone=2, Pacific Time Zone=4, Central Time Zone=15,
 * Eastern Time Zone=22}
 *
 * ------------------ Count names starting with letter A ------------------ 4
 *
 * ------------------ select two columns ------------------ {North
 * Carolina=Eastern Time Zone, Indiana=Eastern Time Zone, Wyoming=Mountain Time
 * Zone, Utah=Mountain Time Zone, Arizona=Mountain Time Zone, Montana=Mountain
 * Time Zone, Kentucky=Eastern Time Zone, Kansas=Central Time Zone,
 * California=Pacific Time Zone, Florida=Eastern Time Zone, Delaware=Eastern
 * Time Zone, Pennsylvania=Eastern Time Zone, Mississippi=Central Time Zone,
 * Iowa=Central Time Zone, Texas=Central Time Zone, Illinois=Central Time Zone,
 * Connecticut=Eastern Time Zone, Georgia=Eastern Time Zone, Virginia=Eastern
 * Time Zone, Maryland=Eastern Time Zone, Idaho=Mountain Time Zone,
 * Vermont=Eastern Time Zone, Oregon=Pacific Time Zone, Tennessee=Eastern Time
 * Zone, Oklahoma=Central Time Zone, Maine=Eastern Time Zone, Alabama=Central
 * Time Zone, Arkansas=Central Time Zone, Washington=Pacific Time Zone, South
 * Carolina=Eastern Time Zone, Nebraska=Central Time Zone, West Virginia=Eastern
 * Time Zone, Massachusetts=Eastern Time Zone, Colorado=Mountain Time Zone,
 * Missouri=Central Time Zone, Alaska=Alaska Time Zone, North Dakota=Central
 * Time Zone, Wisconsin=Central Time Zone, Nevada=Pacific Time Zone, Rhode
 * Island=Eastern Time Zone, New York=Eastern Time Zone, South Dakota=Central
 * Time Zone, Hawaii=Alaska Time Zone, Minnesota=Central Time Zone, New
 * Jersey=Eastern Time Zone, Michigan=Eastern Time Zone, New Mexico=Mountain
 * Time Zone, New Hampshire=Eastern Time Zone, Louisiana=Central Time Zone,
 * Ohio=Eastern Time Zone} BUILD SUCCESSFUL (total time: 0 seconds)
 *
 */
