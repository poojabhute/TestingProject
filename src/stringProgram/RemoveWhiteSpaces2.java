package stringProgram;

public class RemoveWhiteSpaces2
{
public static void main(String[] args) 
{
	String a=" Pooja ";
	int Length=a.length();
	System.out.println("Length with white spaces " +Length);
	
	String a1=a.trim();
	System.out.println("Remove white spaces from the String " +a1);
	
	int Length1=a1.length();
	System.out.println("Length with-out white spaces " +Length1);
}
}
