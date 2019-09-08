package inheritanceByExtends;

import org.junit.Test;

public class TestCases extends ReusableComponents
{
	protected void launchApplication()
	{
		System.out.println("RC :Launch Application from TC ");
	}
	//******************Test Cases****************
	@Test
	 public void composeAndSendAnEmail()
	{
		System.out.println("#####Test Case :composeAndSendAnEmail ");
		launchApplication();
		loginToApplication();
		goToInbox();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void replyToAnEmail()
	{
		System.out.println("#####Test Case :replyToAnEmail ");
		launchApplication();
		loginToApplication();
		goToInbox();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case :forwardAnEmail ");
		launchApplication();
		loginToApplication();
		goToInbox();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case :deleteAnEmail ");
		launchApplication();
		loginToApplication();
		goToInbox();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	
			

}
