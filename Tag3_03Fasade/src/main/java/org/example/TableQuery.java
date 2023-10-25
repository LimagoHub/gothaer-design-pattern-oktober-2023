package org.example;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class TableQuery implements AutoCloseable{
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost:3306/atruviadb";
    private final String queryString;
    private Map<String, String> rowCache = null;
    private Connection connection = null;
    private PreparedStatement statement = null;
    private ResultSet resultSet = null;
    private ResultSetMetaData resultSetMetaData = null;

    private int columnCount = -1;

    public TableQuery(final String queryString) {
        this.queryString = queryString;
    }

    public String getColumnName(int column) throws Exception{

        return getResultSetMetaData().getColumnName(column + 1);
    }

    public String getCellValue(int column) throws Exception{
        return getCellValue(getColumnName(column));
    }

    public String getCellValue(String columnName) throws Exception{
        return getRowCache().get(columnName);
    }

    public boolean next() throws Exception{
        if(getResultSet().next()) {
            copyDatabaseRowToCache();
            return true;
        }
        return false;
    }

    private void copyDatabaseRowToCache() throws Exception{
        for(int columnIndex = 0; columnIndex < getColumnCount(); columnIndex ++) {
            getRowCache().put(getColumnName(columnIndex), getResultSet().getString(getColumnName(columnIndex)));
        }
    }

    public int getColumnCount() throws Exception{
        if(columnCount < 0) {
            columnCount = getResultSetMetaData().getColumnCount();
        }
        return columnCount;
    }

    @Override
    public void close() throws Exception {
        if(resultSet != null) resultSet.close();
        if(statement != null) statement.close();
        if(connection != null) connection.close();
        columnCount = -1;
    }

    private String getQueryString() {
        return queryString;
    }

    private Map<String, String> getRowCache() throws Exception{
        if(rowCache == null) {
            rowCache = new HashMap<>();
            for(int columnIndex = 0; columnIndex < getColumnCount(); columnIndex ++){
                rowCache.put(getColumnName(columnIndex), "-- undef --");
            }
        }
        return rowCache;
    }

    private Connection getConnection() throws Exception{
        if(connection == null){
            connection = DriverManager.getConnection(CONNECTION_STRING,"root","yop49JZ");
        }
        return connection;
    }

    private PreparedStatement getStatement() throws Exception{
        if(statement == null){
            statement = getConnection().prepareStatement(getQueryString());
        }
        return statement;
    }

    private ResultSet getResultSet() throws Exception{
        if(resultSet == null) {
            resultSet = getStatement().executeQuery();
        }
        return resultSet;
    }

    private ResultSetMetaData getResultSetMetaData()  throws Exception{
        if(resultSetMetaData == null) {
            resultSetMetaData = getResultSet().getMetaData();
        }
        return resultSetMetaData;
    }
}
