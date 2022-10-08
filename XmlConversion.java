import java.sql.*;
 
public class XmlConversion {
 
    // Step1: Main driver method
    public static void main(String[] args)
    {
        // Step 2: Making connection using
        // Connection type and inbuilt function on
        Connection con = null;
        PreparedStatement p = null;
        ResultSet rs = null;
 
        con = connection.connectDB();
 
        // Try block to catch exception/s
        try {
 
            // SQL command data stored in String datatype
            String sql = "select * from cuslogin";
			//String sql = "select*from Products for xml raw('Products'),root('ProductDetails')";//
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
 
            // Printing ID, name, email of customers
            // of the SQL command above
            System.out.println("id\t\tname\t\temail");
 
            // Condition check
            while (rs.next()) {
 
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println(id + "\t\t" + name
                                   + "\t\t" + email);
            }
        }
 
        // Catch block to handle exception
        catch (SQLException e) {
 
            // Print exception pop-up on screen
            System.out.println(e);
        }
    }
}