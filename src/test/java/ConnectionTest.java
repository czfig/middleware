import connection.DataBaseConnection;

import java.sql.Connection;

/**
 * @author jiang
 * @date 2022/3/2 21:53
 */
public class ConnectionTest {
    public static void main(String[] args) {
        Connection connection = DataBaseConnection.getConnection();
        System.out.println(connection);
        System.out.println("011111");
    }
}
