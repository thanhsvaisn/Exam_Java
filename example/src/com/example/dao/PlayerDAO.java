package com.example.dao;
import com.example.model.Player;
import db.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {
    public List<Player> getAllPlayers() throws SQLException {
        List<Player> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM player");
        while (rs.next()) {
            Player p = new Player();
            p.setPlayerId(rs.getInt("player_id"));
            p.setName(rs.getString("name"));
            p.setFullName(rs.getString("full_name"));
            p.setAge(rs.getString("age"));
            p.setIndexId(rs.getInt("index_id"));
            list.add(p);
        }
        return list;
    }

    public void insertPlayer(Player player) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO player (name, full_name, age, index_id) VALUES (?, ?, ?, ?)");
        pstmt.setString(1, player.getName());
        pstmt.setString(2, player.getFullName());
        pstmt.setString(3, player.getAge());
        pstmt.setInt(4, player.getIndexId());
        pstmt.executeUpdate();
    }
}