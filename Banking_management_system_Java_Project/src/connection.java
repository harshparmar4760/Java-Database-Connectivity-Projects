import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class connection {

    Connection connection;
    Statement statement;

    public connection(){
        try {
            connection = DriverManager.getConnection("jbdc:mysql://localhost:3306/bank_management_system","root","harshpar");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
