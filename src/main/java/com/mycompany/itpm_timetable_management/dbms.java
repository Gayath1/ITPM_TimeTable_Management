/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.itpm_timetable_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class dbms {
    
    public static Connection c;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://remotemysql.com:3306/QoQsk4BeEJ";
            String un="QoQsk4BeEJ";
            String pw="r7p32rsm8e";
             
            c = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/QoQsk4BeEJ", "QoQsk4BeEJ", "r7p32rsm8e");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void iud(String q) throws Exception {
        Statement s = c.createStatement();
        s.executeUpdate(q);
    }

    public static ResultSet search(String q) throws Exception {
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(q);
        return rs;
    }
    
}
