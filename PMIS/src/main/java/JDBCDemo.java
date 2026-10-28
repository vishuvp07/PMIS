
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_practice";
        String username = "root";
        String password = "Vishwanath@2003";

        try {
            Connection con = DriverManager.getConnection(
                url, username, password
            );

            System.out.println("MySQL connected successfully!");
             
            
                Statement stmt = con.createStatement();

                int rows = stmt.executeUpdate(
                "INSERT INTO students (id, name, marks) VALUES (2, 'Priya', 90)"
);

System.out.println("Rows inserted: " + rows);
          
ResultSet rs = stmt.executeQuery("SELECT * FROM students");

while (rs.next()) {
    int id = rs.getInt("id");
    String name = rs.getString("name");
    int marks = rs.getInt("marks");

    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Marks: " + marks);
}

            rs.close();
            stmt.close();
            con.close();


        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
