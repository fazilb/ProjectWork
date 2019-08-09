package GitHub.Project;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample {
	
	@BeforeTest
	public void Start()
	{
		System.out.println("Start Test...");
	}	
	
    @Test (groups = {"1"})
	public void Browser() throws InterruptedException
	{
    	System.out.println("Test...1");
	}
    
    
   @Test (groups = {"2"})
	public void Home() throws InterruptedException
	{	
	   System.out.println("Test...2");
	}
    
   
   @Test (groups = {"1"})	
  	public void Dashboard() throws InterruptedException
  	{	
  	   System.out.println("Test...3");
  	}

   
    @AfterTest
    public void End ()
   {
    	System.out.println("End Test...");
    }
}
