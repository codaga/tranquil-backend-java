package org.codaga.tranquil.model;

import org.codaga.tranquil.utils.PostgresConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataObject {
    private PreparedStatement prepStatement;
    private ResultSet   resultSet;
    private PostgresConnection pgConnection;
    protected Connection connection;

    public  DataObject() {
        connection = new PostgresConnection().getConnection();
    }

    public DataObject(PreparedStatement prepStatement, ResultSet resultSet, PostgresConnection pgConnection) {
        this.prepStatement = prepStatement;
        this.resultSet = resultSet;
        this.pgConnection = pgConnection;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public PostgresConnection getPgConnection() {
        return pgConnection;
    }

    public void setPgConnection(PostgresConnection pgConnection) {
        this.pgConnection = pgConnection;
    }

    public PreparedStatement getPrepStatement() {
        return prepStatement;
    }

    public void setPrepStatement(PreparedStatement prepStatement) {
        this.prepStatement = prepStatement;
    }

    public void save(PreparedStatement prepStatement) throws SQLException {
        prepStatement.execute();
    }

}
