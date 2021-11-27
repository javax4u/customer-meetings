
/**
 *
 * @author vdoxx
 */
import java.util.List;
import java.util.Map;
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
        Long countOfAllStateStartingWithA = resultList.stream().filter(temp -> temp.getName().startsWith("A")).count();
        System.out.println("" + countOfAllStateStartingWithA);

        

    }

}
/**output
 * run:
ALL states : [Alabama, Alaska, Arizona, Arkansas, California, Colorado, Connecticut, Delaware, Florida, Georgia, Hawaii, Idaho, Illinois, Indiana, Iowa, Kansas, Kentucky, Louisiana, Maine, Maryland, Massachusetts, Michigan, Minnesota, Mississippi, Missouri, Montana, Nebraska, Nevada, New Hampshire, New Jersey, New Mexico, New York, North Carolina, North Dakota, Ohio, Oklahoma, Oregon, Pennsylvania, Rhode Island, South Carolina, South Dakota, Tennessee, Texas, Utah, Vermont, Virginia, Washington, West Virginia, Wisconsin, Wyoming]

------------------
Filter with timeZone Pacific Time Zone
------------------
California-Pacific Time Zone
Nevada-Pacific Time Zone
Oregon-Pacific Time Zone
Washington-Pacific Time Zone

------------------
GroupBy By timeZone
------------------
{Mountain Time Zone=7, Alaska Time Zone=2, Pacific Time Zone=4, Central Time Zone=15, Eastern Time Zone=22}

------------------
Count names starting with letter A
4
 */
