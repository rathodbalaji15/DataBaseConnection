package com.tererity.dataBaseConnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection1 conn= new Connection1();
        conn.dataConnection();
    }
}
