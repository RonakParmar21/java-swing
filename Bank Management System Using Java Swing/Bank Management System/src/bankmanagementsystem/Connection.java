package bankmanagementsystem;
import java.sql.*;
public class Connection {
    Statement stm;

    public Connection() {
        try {
            String url = "jdbc:mysql://localhost:3306/bankmanagementsystem";

            String userName = "root";
            String password = "Ronak@21_11";

            java.sql.Connection connection = DriverManager.getConnection(url, userName, password);
            stm = connection.createStatement();

//			c1 = DriverManager.getConnection("jdbc:mysql///bankmanagementsystem", "root", "Ronak@21_11_2003");
//			s = c1.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//	jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "my password come here"