import java.sql.Connection;
import java.sql.*;

public class connection {

    public static String getTableData(String tableName) throws SQLException, ClassNotFoundException {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL", "fred", "flintstone");
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM " + tableName);

            ResultSetMetaData rsmd = rs.getMetaData();
            int colCount = rsmd.getColumnCount();

            StringBuilder b = new StringBuilder("<StructureSpecific>\n");

            
            while(rs.next()) {
            	System.out.println(rs.getInt(1));
                b.append("<StructureSpecificData>");
                for (int i = 1; i <= colCount; i++) {
                    String columnName = rsmd.getColumnName(i);
                    System.out.println(columnName);
                    b.append('<').append(columnName).append('>');
                    b.append(rs.getObject(i));
                    b.append("</").append(columnName).append('>');
                }
                b.append("</StructureSpecificData>\n");
            }
            b.append("</StructureSpecific>");
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
        String str = getTableData("DIMENSIONTYPEMASTERS");
        System.out.println(str);
    }
}