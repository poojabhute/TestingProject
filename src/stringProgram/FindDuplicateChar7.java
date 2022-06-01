package stringProgram;

public class FindDuplicateChar7
{
	public static void main(String[] args)
	{
		String a= "beautiful beach";
		
		
		char b[]=a.toCharArray();
		System.out.println("Duplicate character in the given string");
		
		for(int i=0;i<=a.length();i++)
		{
		    int count=1;
			
			for(int j=i+1;j<a.length();j++)
			{
				if(b[i]==b[j])  
				{
					count++;
					
					System.out.print(b[j] +" ");
					System.out.println(count);
					break;
				}
			}
				
		}
		
	}

}
