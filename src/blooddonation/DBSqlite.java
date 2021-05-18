/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonation;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Zaryab
 */
public class DBSqlite {
    Connection cin = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:BloodDonnerDB.db");
            System.out.println("Established");
            return con;
        }
        catch(Exception e){
            System.out.println("error" + e);
            return null;
        }
    }
}
