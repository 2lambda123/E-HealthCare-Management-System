package EHMS;
import EHMS.*;
import java.sql.*;

public class Register 
{

	/***********************************************************************************************/ 
	public void patient_Registration(int pid,String fn,String ln,String G,String cn,int age,String Eid,String BloodGroup,String Address)
	{
		try 
		{
			Connection con=ConnectionProvider.getCon();
			PreparedStatement st=con.prepareStatement("INSERT INTO Patients VALUES ('"+pid+"',?"+",?"+",?"+",?"+",'"+age+"',?"+",?"+",?"+")");
			st.setString(1, fn);
			st.setString(2, ln);
			st.setString(3, G);
			st.setString(4, cn);
			st.setString(5, Eid);
			st.setString(6, BloodGroup);
			st.setString(7, Address);
			st.execute();
			System.out.println("Registered Succesfully!!");
		}
		catch(Exception e)
		{ System.out.println(e.getMessage());} 

	}
	
	/***********************************************************************************************/ 
	public void doctor_Registration(int docid,String fn,String ln,String G,String cn,int age,int ec,String Q,String dt,String ed)
	{
		try 
		{
			Connection con=ConnectionProvider.getCon();
			PreparedStatement st=con.prepareStatement("INSERT INTO Doctors VALUES ('"+docid+"',?"+",?"+",?"+",?"+",'"+age+"','"+ec+"',?"+",?"+",?"+")");
			st.setString(1, fn);
			st.setString(2, ln);
			st.setString(3, G);
			st.setString(4, cn);
			st.setString(5, Q);
			st.setString(6, dt);
			st.setString(7, ed);
			st.execute();
			System.out.println("Doctor Added Successully");
		}
		catch(Exception e)
		{ System.out.println(e.getMessage());}  
	}
	/***********************************************************************************************/ 
}
