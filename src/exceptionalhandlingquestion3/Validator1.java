package exceptionalhandlingquestion3;

public class Validator1 {
	public static boolean validatepassword(String password) throws IncorrectPasswordException
	{  
		int flag = 0;
	
		char [] string=password.toCharArray();
        int length=string.length;
	    for(int i=0;i<length;i++)
	    {
	    	int ascii= (int) string[i];
	    
	    if(ascii>=65 && ascii<=90)
		{
			flag=1;
			
		}
		else
		{
			flag=0;
		}
	    }
	    if(flag==1)
	    	return true;
	    else
	    	throw new IncorrectPasswordException("Incorrect password");
	    
	}
	

}
