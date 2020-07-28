package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-06-30 13:03
 */
public class TestJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=UTC","root","123456");
        System.out.println(connection);
    }
}
