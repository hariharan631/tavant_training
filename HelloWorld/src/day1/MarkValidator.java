package day1;

public class MarkValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 boolean isPass(int mark) 
 {
	 boolean passvalue=false;
	 if(mark>=40)
	 { 
	 System.out.println("Pass");
	 passvalue=true;
	 return passvalue;
	 }
	 else
	 {
		 System.out.println("Fail");
		 passvalue=false;
		 return passvalue;
	 }
	 
 }
 String markGrade(int mark1)
 {
	 isPass(mark1);
	 if(mark1>90)
	 {
		return "Grade A";
	 }
	 else if(mark1>75)
	 {
		 return "Grade B";
	 }
	 else if(mark1>60)
	 {
		 return "Grade C";
	 }
	 else
	 {
		 return "Grade D";
	 }
 }
}
