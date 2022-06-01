package stringProgram;

public class NoOfVowelsNConsonent4
{
	public static void main(String[] args)
	{
		String a="gauravbhute";
		int Vcount=0;
		int Ccount=0;
		for(int i=0;i<a.length();i++) 
		{
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
			{
				Vcount++;
			}
			else if(a.charAt(i)>='a' && a.charAt(i)<='z')
			{
				Ccount++;
			}
		}
		
		System.out.println("No. of Vowels are - " +Vcount);
		System.out.println("No. of Consonent are - " +Ccount);
		
		
	}

}
