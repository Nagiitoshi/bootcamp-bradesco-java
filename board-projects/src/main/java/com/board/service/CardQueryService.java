package com.board.service;

import lombok.AllArgsConstructor;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import com.board.dto.CardDetailsDTO;
import com.board.persistence.dao.CardDAO;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }

}