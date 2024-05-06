package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class FirstPage{
    public static void main(String[] args) throws Exception{
        try{
            System.out.println("Connecting to database");
            String query = "Select * from names";
            String url = "jdbc:postgresql://localhost:5432/Demo";
            String username = "postgres";
            String password = "Modakap@99";

            
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            rs.next();
            String name = rs.getString(2);
            System.out.println(name);
            con.close();
        }catch (Exception e) {
            System.out.println("Connection Failed due to -->" + e.getMessage());
        }
    }

}