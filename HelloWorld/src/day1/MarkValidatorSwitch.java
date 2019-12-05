package day1;

public class MarkValidatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	String markGrade(int mark1)
	 {
		for(int i=1;i<=4;i++)
		{
		   switch(i)
		    {
		    case 1:
			if(mark1>90)
			{
			  return "Grade A";
			}
		    break;
		    case 2:
		    if(mark1>75)
		    {
		    	return "Grade B";
		    }
		    break;
		    case 3:
		    if(mark1>60)
		    {
		    	return "Grade C";
		    }
		    break;
		    
		    case 4:
		      return "Grade D"; 
		    }
		}
	  return null ;
	 }
}
