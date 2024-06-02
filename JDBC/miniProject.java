import static java.lang.Class.forName;
import java.sql.*;

class employee{
    int id;
    String fname;


}
class empManager{
    Connection con = null;

    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","NMFPS2002N");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public employee getEmp(int id) throws ClassNotFoundException {
        employee emp = new employee();
        emp.id = id;
        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Fname from employee where emp_no="+id);
            rs.next();
            String Fname = rs.getString(1);
            emp.fname = Fname;
        }catch(Exception e){
            System.out.println(e);
        }
        return emp;
    }
    public void addEmp(employee emp){
        try{
            PreparedStatement pst = con.prepareStatement("INSERT INTO employee values (?,?)");
            pst.setString(1, String.valueOf(emp.id));
            pst.setString(2,emp.fname);
            int count = pst.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}

public class miniProject {
    public static void main(String[] args) throws ClassNotFoundException {
        empManager manager = new empManager();
        manager.connect();

        employee emp = manager.getEmp(1);
        emp.id = 7;
        emp.fname="ManthanSinha1";
        manager.addEmp(emp);
        System.out.println(emp.fname);
    }
}
