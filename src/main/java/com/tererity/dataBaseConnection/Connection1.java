package com.tererity.dataBaseConnection;

import java.sql.*;

public class Connection1 {
    public void dataConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/repo",
                "root","Balaji15051994#");
        System.out.println("Connected");
        Statement st =con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employee");
        while(rs.next()){
            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("salary")+" ");
            System.out.println(rs.getString("Dep_id")+" ");


        }
    }
}
