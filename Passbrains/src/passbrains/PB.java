package passbrains;

import passbrains.TestExpertReg;

public class PB 
{
	
	public static void main(String[] args) 
	{
	    
		TestProfReg();
	}
	
	private static void TestProfReg()
	{
         int x=0;
	    
		TestExpertReg testerexp = new TestExpertReg();
		
		testerexp.prerequisite();
		testerexp.joinTesterExpert();
		testerexp.TesterExpertInput();
		x= testerexp.TesterRegCheck();
		
		if (x==1)
		{
			System.out.println(" Tester Professional Registrations successfully =  " + Integer.toString(x));  	
		}
		else
		{
			System.out.println(" Tester Professional Registrations has failed   =  " + Integer.toString(x));
		}

	}
		
}	
	

