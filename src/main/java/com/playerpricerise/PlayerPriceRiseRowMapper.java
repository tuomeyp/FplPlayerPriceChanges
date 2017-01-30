package com.playerpricerise;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by philiptuomey on 30/01/2017.
 */
public class PlayerPriceRiseRowMapper implements RowMapper{

        public PlayerPriceRise mapRow(ResultSet rs, int rowNum) throws SQLException {
            PlayerPriceRise ppr = new PlayerPriceRise();
            ppr.setId(rs.getString(1));
            ppr.setName(rs.getString(2));
            ppr.setClub(rs.getString(3));
            ppr.setPlayerPosition(rs.getString(4));
            ppr.setStatus(rs.getString(5));
            ppr.setPrice(rs.getString(6));
            ppr.setChanges(rs.getString(7));
            ppr.setDelta(rs.getString(8));
            ppr.setTarget(rs.getString(9));
            return ppr;
        }
}
