import java.sql.*;

public class StudentManagerSystem {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/java14_0308?useSSL=false&characterEncoding=utf8";
        Connection connection = DriverManager.getConnection(url, "root", "");

        {
            String sql = "SELECT DISTINCT(course_id) AS course_id FROM schedules WHERE begin_at BETWEEN '2020-03-08 00:00:00' AND '2020-03-09 00:00:00'";
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt("course_id"));
            }

            rs.close();

            statement.close();
        }

        {
            String sql = "SELECT score FROM exams WHERE student_id = 3";
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt("score"));
            }

            rs.close();

            statement.close();
        }

        connection.close();
    }
}
