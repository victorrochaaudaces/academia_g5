/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userDao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author victo
 */
public class ConnectionDb {

    public static Connection ConDb() throws Exception {
        Class.forName("org.postgresql.Driver");

        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/academia_g5", "postgres", "125678");
    }

}
