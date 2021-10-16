/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AngelKun
 */
public class Connect {
    
    String url = "C:\\SQLite\\db\\clientadministrator.db";
    Connection connect;
    
    public void connect(){
        try{
            connect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connect != null){
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void close(){
        try{
            connect.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
