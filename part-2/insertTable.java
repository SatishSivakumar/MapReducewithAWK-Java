import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;
import java.io.Reader;
import java.util.zip.GZIPInputStream;
class insertTable
{

public static void main(String args[])
{
try{
int check=1;
String strLine=null;
Class.forName("com.mysql.jdbc.Driver");
Scanner sc = new Scanner(System.in);
Connection conn1 = null;
Statement stmt = null;
String table = null;
String url1 = "jdbc:mysql://127.0.0.1/maxtempAnalysis";
String user = "root";
String password = "safestsystemever";
conn1 = DriverManager.getConnection(url1, user, password);
if (conn1 != null) {
System.out.println("Connected to the database!");
}

	
while(check<=4)
{
	if(check==1)
		{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("/vagrant_data/1990.gz"))));

while((strLine = br.readLine()) != null)
{

int stationID = Integer.parseInt(strLine.substring(4,10));

int temp=0;
int wabnID = Integer.parseInt(strLine.substring(10,14));
if (strLine.charAt(87) == '+') 
{ 
       temp = Integer.parseInt(strLine.substring(88, 92));
} 
else 
{
       temp = Integer.parseInt(strLine.substring(87, 92));
}

String year = strLine.substring(15, 19);
int month= Integer.parseInt(strLine.substring(19,20));
int date=Integer.parseInt(strLine.substring(21,22));
int observHour=Integer.parseInt(strLine.substring(23,26));
int latitude=Integer.parseInt(strLine.substring(28,33));
int longitude=Integer.parseInt(strLine.substring(34,40));
int elevationMetrics=Integer.parseInt(strLine.substring(46,50));
String windDirection=strLine.substring(56,59);
int visibilityDistance=Integer.parseInt(strLine.substring(78,83));
int atmPressure=Integer.parseInt(strLine.substring(98,102));
if(temp != 9999)
{
String query = "INSERT INTO scenarioone (year,temperature,stationID,wabnID,month,date,observHour,latitude,longitude,elevationMetrics,windDirection,visibilityDistance,atmPressure) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
PreparedStatement prpStmt = conn1.prepareStatement(query);
System.out.println("Inserting in scenarioone in 1990");
prpStmt.setString(1,year);
prpStmt.setInt(2,temp);
prpStmt.setInt(3,stationID);
prpStmt.setInt(4,wabnID);
prpStmt.setInt(5,month);
prpStmt.setInt(6,date);
prpStmt.setInt(7,observHour);
prpStmt.setInt(8,latitude);
prpStmt.setInt(9,longitude);
prpStmt.setInt(10,elevationMetrics);
prpStmt.setString(11,windDirection);
prpStmt.setInt(12,visibilityDistance);
prpStmt.setInt(13,atmPressure);
prpStmt.executeUpdate();
prpStmt.close();
String query1 = "INSERT INTO scenariotwo (year,temperature,stationID,wabnID,month,date,observHour,latitude,longitude,elevationMetrics,windDirection,visibilityDistance,atmPressure) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
PreparedStatement prpStmt1 = conn1.prepareStatement(query1);
System.out.println("Inserting in scenariotwo in 1990");
prpStmt1.setString(1,year);
prpStmt1.setInt(2,temp);
prpStmt1.setInt(3,stationID);
prpStmt1.setInt(4,wabnID);
prpStmt1.setInt(5,month);
prpStmt1.setInt(6,date);
prpStmt1.setInt(7,observHour);
prpStmt1.setInt(8,latitude);
prpStmt1.setInt(9,longitude);
prpStmt1.setInt(10,elevationMetrics);
prpStmt1.setString(11,windDirection);
prpStmt1.setInt(12,visibilityDistance);
prpStmt1.setInt(13,atmPressure);
prpStmt1.executeUpdate();
prpStmt1.close();
String query2 = "INSERT INTO scenariothree (year,temperature,stationID,wabnID,month,date,observHour,latitude,longitude,elevationMetrics,windDirection,visibilityDistance,atmPressure) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
PreparedStatement prpStmt2 = conn1.prepareStatement(query2);
System.out.println("Inserting in scenariothree in 1990");
prpStmt2.setString(1,year);
prpStmt2.setInt(2,temp);
prpStmt2.setInt(3,stationID);
prpStmt2.setInt(4,wabnID);
prpStmt2.setInt(5,month);
prpStmt2.setInt(6,date);
prpStmt2.setInt(7,observHour);
prpStmt2.setInt(8,latitude);
prpStmt2.setInt(9,longitude);
prpStmt2.setInt(10,elevationMetrics);
prpStmt2.setString(11,windDirection);
prpStmt2.setInt(12,visibilityDistance);
prpStmt2.setInt(13,atmPressure);
prpStmt2.executeUpdate();
prpStmt2.close();
}
}
check++;
System.out.println("1990 data inserted successfully");
br.close();
	}
	else if(check==2)
	{
			System.out.println("Inside 1991 check");
			BufferedReader br = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("/vagrant_data/1991.gz"))));
while((strLine = br.readLine()) != null)
{
int stationID = Integer.parseInt(strLine.substring(4,10));
int wabnID = Integer.parseInt(strLine.substring(10,15));
int temp=0;
if (strLine.charAt(87) == '+') 
{ 
       temp = Integer.parseInt(strLine.substring(88, 92));
}
else 
{
       temp = Integer.parseInt(strLine.substring(87, 92));
}
String year = strLine.substring(15, 19);
int month= Integer.parseInt(strLine.substring(19,21));
int date=Integer.parseInt(strLine.substring(21,23));
int observHour=Integer.parseInt(strLine.substring(23,27));
int latitude=Integer.parseInt(strLine.substring(28,34));
int longitude=Integer.parseInt(strLine.substring(34,41));
int elevationMetrics=Integer.parseInt(strLine.substring(46,51));
String windDirection=strLine.substring(56,60);
int visibilityDistance=Integer.parseInt(strLine.substring(78,84));
int atmPressure=Integer.parseInt(strLine.substring(98,103));
if(temp != 9999){
String query = "INSERT INTO scenariothree (year,temperature,stationID,wabnID,month,date,observHour,latitude,longitude,elevationMetrics,windDirection,visibilityDistance,atmPressure) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
PreparedStatement prpStmt = conn1.prepareStatement(query);
System.out.println("Inserting in scenariothree in 1991");
prpStmt.setString(1,year);
prpStmt.setInt(2,temp);
prpStmt.setInt(3,stationID);
prpStmt.setInt(4,wabnID);
prpStmt.setInt(5,month);
prpStmt.setInt(6,date);
prpStmt.setInt(7,observHour);
prpStmt.setInt(8,latitude);
prpStmt.setInt(9,longitude);
prpStmt.setInt(10,elevationMetrics);
prpStmt.setString(11,windDirection);
prpStmt.setInt(12,visibilityDistance);
prpStmt.setInt(13,atmPressure);
prpStmt.executeUpdate();
prpStmt.close();
}}
	check++;
	System.out.println("1991 data inserted successfully");
br.close();
	}
	else if(check==3)
	{
			
						BufferedReader br = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("/vagrant_data/1992.gz"))));

while((strLine = br.readLine()) != null)
{

int stationID = Integer.parseInt(strLine.substring(4,10));
int wabnID = Integer.parseInt(strLine.substring(10,15));
int temp=0;
if (strLine.charAt(87) == '+')
 { 
       temp = Integer.parseInt(strLine.substring(88, 92));
 } 
 else 
 {
       temp = Integer.parseInt(strLine.substring(87, 92));
 }
String year = strLine.substring(15, 19);
int month= Integer.parseInt(strLine.substring(19,21));
int date=Integer.parseInt(strLine.substring(21,23));
int observHour=Integer.parseInt(strLine.substring(23,27));
int latitude=Integer.parseInt(strLine.substring(28,34));
int longitude=Integer.parseInt(strLine.substring(34,41));
int elevationMetrics=Integer.parseInt(strLine.substring(46,51));
String windDirection=strLine.substring(56,60);
int visibilityDistance=Integer.parseInt(strLine.substring(78,84));
int atmPressure=Integer.parseInt(strLine.substring(98,103));
if(temp != 9999)
{
String query = "INSERT INTO scenariotwo (year,temperature,stationID,wabnID,month,date,observHour,latitude,longitude,elevationMetrics,windDirection,visibilityDistance,atmPressure) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
PreparedStatement prpStmt = conn1.prepareStatement(query);
System.out.println("Inserting in scenariotwo in 1992");
prpStmt.setString(1,year);
prpStmt.setInt(2,temp);
prpStmt.setInt(3,stationID);
prpStmt.setInt(4,wabnID);
prpStmt.setInt(5,month);
prpStmt.setInt(6,date);
prpStmt.setInt(7,observHour);
prpStmt.setInt(8,latitude);
prpStmt.setInt(9,longitude);
prpStmt.setInt(10,elevationMetrics);
prpStmt.setString(11,windDirection);
prpStmt.setInt(12,visibilityDistance);
prpStmt.setInt(13,atmPressure);
prpStmt.executeUpdate();
prpStmt.close();
String query1 = "INSERT INTO scenariothree (year,temperature,stationID,wabnID,month,date,observHour,latitude,longitude,elevationMetrics,windDirection,visibilityDistance,atmPressure) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
PreparedStatement prpStmt1 = conn1.prepareStatement(query1);
System.out.println("Inserting in scenariothree in 1992");
prpStmt1.setString(1,year);
prpStmt1.setInt(2,temp);
prpStmt1.setInt(3,stationID);
prpStmt1.setInt(4,wabnID);
prpStmt1.setInt(5,month);
prpStmt1.setInt(6,date);
prpStmt1.setInt(7,observHour);
prpStmt1.setInt(8,latitude);
prpStmt1.setInt(9,longitude);
prpStmt1.setInt(10,elevationMetrics);
prpStmt1.setString(11,windDirection);
prpStmt1.setInt(12,visibilityDistance);
prpStmt1.setInt(13,atmPressure);
prpStmt1.executeUpdate();
prpStmt1.close();
}
}
check++;
System.out.println("1992 data inserted successfully");
br.close();
}
	else if(check==4)
	{

			
							BufferedReader br = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("/vagrant_data/1993.gz"))));

while((strLine = br.readLine()) != null)
{

int stationID = Integer.parseInt(strLine.substring(4,10));
int wabnID = Integer.parseInt(strLine.substring(10,15));
int temp=0;
if (strLine.charAt(87) == '+') 
{
       temp = Integer.parseInt(strLine.substring(88, 92));
} 
else 
{
       temp = Integer.parseInt(strLine.substring(87, 92));
}

String year = strLine.substring(15, 19);
int month= Integer.parseInt(strLine.substring(19,21));
int date=Integer.parseInt(strLine.substring(21,23));
int observHour=Integer.parseInt(strLine.substring(23,27));
int latitude=Integer.parseInt(strLine.substring(28,34));
int longitude=Integer.parseInt(strLine.substring(34,41));
int elevationMetrics=Integer.parseInt(strLine.substring(46,51));
String windDirection=strLine.substring(56,60);
int visibilityDistance=Integer.parseInt(strLine.substring(78,84));
int atmPressure=Integer.parseInt(strLine.substring(98,103));
if(temp != 9999){
String query = "INSERT INTO scenariothree (year,temperature,stationID,wabnID,month,date,observHour,latitude,longitude,elevationMetrics,windDirection,visibilityDistance,atmPressure) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
PreparedStatement prpStmt = conn1.prepareStatement(query);
System.out.println("Inserting in scenariothree in 1993");
prpStmt.setString(1,year);
prpStmt.setInt(2,temp);
prpStmt.setInt(3,stationID);
prpStmt.setInt(4,wabnID);
prpStmt.setInt(5,month);
prpStmt.setInt(6,date);
prpStmt.setInt(7,observHour);
prpStmt.setInt(8,latitude);
prpStmt.setInt(9,longitude);
prpStmt.setInt(10,elevationMetrics);
prpStmt.setString(11,windDirection);
prpStmt.setInt(12,visibilityDistance);
prpStmt.setInt(13,atmPressure);
prpStmt.executeUpdate();
prpStmt.close();
}
}
check++;
System.out.println("1993 data inserted successfully");
br.close();
}
}
System.out.println("All data inserted successfully");
conn1.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
