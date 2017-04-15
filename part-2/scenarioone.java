import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;
class scenarioone
{

public static void main(String args[])
{
try{
Class.forName("com.mysql.jdbc.Driver");
Scanner sc = new Scanner(System.in);
Connection conn1 = null;
PreparedStatement stmt = null;
String table = null;
String url1 = "jdbc:mysql://localhost:3306/maxtempAnalysis";
String user = "root";
String password = "safestsystemever";
conn1 = DriverManager.getConnection(url1, user, password);
if (conn1 != null) {
System.out.println("Connected to the database maxtempAnalysis");
}

String select = "SELECT year,max(temperature) from scenarioone group by year;";
stmt=conn1.prepareStatement(select);
System.out.println("Maximum temperature result:");
ResultSet rs = stmt.executeQuery();
while(rs.next())
{
String years=rs.getString("year");
int temps = rs.getInt("max(temperature)");
System.out.format("%s,%s\n",years,temps);
}
conn1.close();
}

catch(Exception e){
e.printStackTrace();
}
}
}
