package stringProgram;

public class ReverseOfStringCharByChar6
{
	public static void main(String[] args)
	{
	  String a="RAHUL";
	  String reva="";
	  
	  for(int i=a.length()-1;i>=0;i--)
	  {
		  
		  reva=reva+a.charAt(i);
		  
	  }
	  System.out.println("Reverse of Char String char by char is " +reva);
	}

}
