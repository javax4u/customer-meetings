/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vdoxx
 */
public class StatesDaoJava7 {

    public static List<States> initStates() {
        List returnMe=new ArrayList();
        States temp;
        String[] stateNames = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
        String[] stateAbbreviation={"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
        String[] stateBirthDate={"Dec 14, 1819","Jan 3, 1959","Feb 14, 1912","Jun 15, 1836","Sep 9, 1850","Aug 1, 1876","Jan 9, 1788","Dec 7, 1787","Mar 3, 1845","Jan 2, 1788","Aug 21, 1959","Jul 3, 1890","Dec 3, 1818","Dec 11, 1816","Dec 28, 1846","Jan 29, 1861","Jun 1, 1792","Apr 30, 1812","Mar 15, 1820","Apr 28, 1788","Feb 6, 1788","Jan 26, 1837","May 11, 1858","Dec 10, 1817","Aug 10, 1821","Nov 8, 1889","Mar 1, 1867","Oct 31, 1864","Jun 21, 1788","Dec 18, 1787","Jan 6, 1912","Jul 26, 1788","Nov 21, 1789","Nov 2, 1889","Mar 1, 1803","Nov 16, 1907","Feb 14, 1859","Dec 12, 1787","May 29, 1790","May 23, 1788","Nov 2, 1889","Jun 1, 1796","Dec 29, 1845","Jan 4, 1896","Mar 4, 1791","Jun 25, 1788","Nov 11, 1889","Jun 20, 1863","May 29, 1848","Jul 10, 1890"};
        String[] population={"48,74,747","7,39,795","70,16,270","30,04,279","3,95,36,653","56,07,154","35,88,184","9,61,939","2,09,84,400","1,04,29,379","14,27,538","17,16,943","1,28,02,023","66,66,818","31,45,711","29,13,123","44,54,189","46,84,333","13,35,907","60,52,177","68,59,819","99,62,311","55,76,606","29,84,100","61,13,532","10,50,493","19,20,076","29,98,039","13,42,795","90,05,644","20,88,070","1,98,49,399","1,02,73,419","7,55,393","1,16,58,609","39,30,864","41,42,776","1,28,05,537","10,59,639","50,24,369","8,69,666","67,15,984","2,83,04,596","31,01,833","6,23,657","84,70,020","74,05,743","18,15,857","57,95,483","5,79,315"};
        String[] representatives={"7","1","9","4","53","7","5","1","27","14","2","2","18","9","4","4","6","6","2","8","9","14","8","4","8","1","3","4","2","12","3","27","13","1","16","5","5","18","2","7","1","9","36","4","1","11","10","3","8","1"};
        String[] timeZone={"Central Time Zone","Alaska Time Zone","Mountain Time Zone","Central Time Zone","Pacific Time Zone","Mountain Time Zone","Eastern Time Zone","Eastern Time Zone","Eastern Time Zone","Eastern Time Zone","Alaska Time Zone","Mountain Time Zone","Central Time Zone","Eastern Time Zone","Central Time Zone","Central Time Zone","Eastern Time Zone","Central Time Zone","Eastern Time Zone","Eastern Time Zone","Eastern Time Zone","Eastern Time Zone","Central Time Zone","Central Time Zone","Central Time Zone","Mountain Time Zone","Central Time Zone","Pacific Time Zone","Eastern Time Zone","Eastern Time Zone","Mountain Time Zone","Eastern Time Zone","Eastern Time Zone","Central Time Zone","Eastern Time Zone","Central Time Zone","Pacific Time Zone","Eastern Time Zone","Eastern Time Zone","Eastern Time Zone","Central Time Zone","Eastern Time Zone","Central Time Zone","Mountain Time Zone","Eastern Time Zone","Eastern Time Zone","Pacific Time Zone","Eastern Time Zone","Central Time Zone","Mountain Time Zone"};
        for (int i=0;i<stateAbbreviation.length;i++) {
            temp=new States();
            temp.setName(stateNames[i]);
            temp.setAbbreviation(stateAbbreviation[i]);
            temp.setFormationYear(stateBirthDate[i]);
            temp.setPopulation(population[i]);
            temp.setRepresentative(representatives[i]);
            temp.setTimeZOne(timeZone[i]);
            returnMe.add(temp);
        }
        return returnMe;
    }
}
