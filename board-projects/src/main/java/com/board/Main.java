package com.board;

import java.sql.SQLException;

import com.board.persistence.migration.MigrationStrategy;
import com.board.ui.MainMenu;

import static com.board.persistence.config.ConnectionConfig.getConnection;

public class Main {
        public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}