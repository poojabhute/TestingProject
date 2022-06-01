package stringProgram;

public class CountTotalChar3
{
public static void main(String[] args)
{
	String a="How are You";
	int count=0;
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)!=' ')
		{
			count++;
		}
	}
	System.out.println("No. of character available in String " +count);
}
}
