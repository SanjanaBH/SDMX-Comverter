import java.sql.*;

public class connection {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cuslogin");
            System.out.println("ID" + "\t\t" + "Name" + "\t\t" + "Email");
            System.out.println(
                    "------------------------------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));
                System.out.println("------------------------------------------------------------------------------------------------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
