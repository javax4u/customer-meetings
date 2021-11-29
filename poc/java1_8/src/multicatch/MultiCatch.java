/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicatch;

import java.sql.SQLException;

/**
 *
 * @author rupesh kumar
 */
public class MultiCatch {

    public static void main(String[] args) {

        System.out.println("Rupesh" == "Rupesh");

        try {
            // checkDbConnection(2);
            checkDbConnection(3);
        } catch (NullPointerException | SQLException ex) {
            ex.printStackTrace();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

    private static void checkDbConnection(int type) throws NullPointerException, SQLException, RuntimeException {
        if (type == 1) {
            throw new NullPointerException("NullPointerException");
        } else if (type == 2) {
            throw new SQLException("SQLException");
        } else if (type == 3) {
            throw new RuntimeException("RuntimeException");
        }
    }

}
