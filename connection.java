import java.sql.*;

public class connection {

    public static String getTableData(String tableName) throws SQLException, ClassNotFoundException {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("select * from " + tableName);

            ResultSetMetaData rsmd = rs.getMetaData();
            int colCount = rsmd.getColumnCount();

            StringBuilder b = new StringBuilder("<CustomerDetails>\n");

            while (rs.next()) {
                b.append("<Customer>");
                for (int i = 1; i <= colCount; i++) {
                    String columnName = rsmd.getColumnName(i);
                    b.append('<').append(columnName).append('>');
                    b.append(rs.getObject(i));
                    b.append("</").append(columnName).append('>');
                }
                b.append("</Customer>\n");
            }
            b.append("</CustomerDetails>");
            return b.toString();
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            if (rs != null)
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            if (st != null)
                try {
                    st.close();
                } catch (SQLException e) {
                }
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                }
        }
    }

    public static void main(String[] args) throws Exception {
        String str = getTableData("cuslogin");
        System.out.println(str);
    }
}