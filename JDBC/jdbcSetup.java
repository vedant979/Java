//import com.mysql.cj.xdevapi.Result;

import java.sql.*;


public class jdbcSetup {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/university";
        String name="root";
        String pass="NMFPS2002N";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university",name,pass);
        Statement st = con.createStatement();

        int count = st.executeUpdate("create table employee2");
        ResultSet rs = st.executeQuery("select * from employee");
//        rs.next();
        System.out.println(count+" row affected");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
        }
        st.close();
        con.close();
    }
}
