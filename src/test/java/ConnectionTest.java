import connection.DataBaseConnection;

import java.sql.Connection;

public class ConnectionTest {
    public static void main(String[] args) {
        Connection connection = DataBaseConnection.getConnection();
        System.out.println(connection);
        System.out.println("011111");
    }
}
