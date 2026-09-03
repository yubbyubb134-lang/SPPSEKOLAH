package CONFIG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    public static Connection getKoneksi() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/db_spp";
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url, user, password);
    }
}