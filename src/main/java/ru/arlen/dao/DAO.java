package ru.arlen.dao;

import ru.arlen.entity.LocationInfo;
import ru.arlen.entity.User;

import java.math.BigDecimal;
import java.sql.SQLException;

public interface DAO {
    public boolean isAuth(User user) throws SQLException;
    public int getAppId(User user) throws SQLException;
    public LocationInfo getLocationInfo(int trackingId);
}
