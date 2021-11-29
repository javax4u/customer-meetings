/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryresource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rupesh kumar
 */
public class TryResourceTest {

    public static void main(String[] args) {
        String strCurrentLine;

        try (
                BufferedReader br = new BufferedReader(new FileReader(new File("E:\\customer\\tricountiesbank\\Demo\\vdoxx-TriCounties-locations.csv")));
                BufferedReader br2 = new BufferedReader(new FileReader(new File("E:\\customer\\tricountiesbank\\Demo\\TriCountiesSampleData.csv")));) {
            while ((strCurrentLine = br.readLine()) != null) {
                System.out.println("" + strCurrentLine);
            }
             while ((strCurrentLine = br2.readLine()) != null) {
                System.out.println("" + strCurrentLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
