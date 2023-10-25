package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{

    //private static final String CONNECTION_STRING = "jdbc:h2:mem:test;DB_CLOSE_ON_EXIT=FALSE";
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost:3306/atruviadb";

    public static void main( String[] args ) throws Exception
    {

//        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING,"root" ,"yop49JZ")) {
//            try(Statement statement = connection.createStatement()) {
//                try(ResultSet resultSet = statement.executeQuery("SELECT * from CUSTOMERS")) {
//
//                    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
//
//                    for(int column = 1, n = resultSetMetaData.getColumnCount(); column <= n; column ++ ) {
//                        System.out.print(resultSetMetaData.getColumnName(column) + "\t");
//                    }
//                    System.out.println();
//
//                    while( resultSet.next()) {
//                        for(int column = 1, n = resultSetMetaData.getColumnCount(); column <= n; column ++ ) {
//                            System.out.print(resultSet.getString(column) + "\t");
//                        }
//                        System.out.println();
//
//                    }
//
//                }
//
//
//            }
//
//
//        }

        try(TableQuery tableQuery = new TableQuery("SELECT * from CUSTOMERS")) {
                    for(int column = 0, n = tableQuery.getColumnCount(); column < n; column ++ ) {
                        System.out.print(tableQuery.getColumnName(column) + "\t");
                    }
                    System.out.println();
                    while( tableQuery.next()) {
                        for(int column = 1, n = tableQuery.getColumnCount(); column < n; column ++ ) {
                            System.out.print(tableQuery.getCellValue(column) + "\t");

                        }
                        System.out.println();

                    }

        }

    }
}
