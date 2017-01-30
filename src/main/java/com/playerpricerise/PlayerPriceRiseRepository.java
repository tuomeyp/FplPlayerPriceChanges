package com.playerpricerise;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerPriceRiseRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public PlayerPriceRiseRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<PlayerPriceRise> findAll() {
        return jdbc.query(
                "select id, name, club, playerPosition, status, percentageowned, price, changes, delta, target " +
                        "from PlayerPriceChanges",
                new PlayerPriceRiseRowMapper()
        );
    }

    public PlayerPriceRise findMax() {
        return (PlayerPriceRise) jdbc.queryForObject("select top 1 id, name, club, playerPosition, status, percentageowned, price, changes, delta, target " +
                "from PlayerPriceChanges order by delta desc",
                new PlayerPriceRiseRowMapper());
    }


    public PlayerPriceRise findPlayerByName(String name) {
        return (PlayerPriceRise) jdbc.queryForObject("select * from PlayerPriceChanges where UPPER(name) = UPPER(?)",
                new Object[]{name},
                new PlayerPriceRiseRowMapper());
    }
}