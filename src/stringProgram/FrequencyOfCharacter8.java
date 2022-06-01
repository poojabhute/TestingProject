package stringProgram;

public class FrequencyOfCharacter8
{
	public static void main(String[] args)
	{
		String a="Perfect Life";
		
		int frequency[]=new int[a.length()];
		
		char b[]=a.toCharArray();  //string to char array
		
		for(int i=0;i<a.length();i++)
		{
			frequency[i] = 1;                    //Bcoz characters are available at least one time in String
			for(int j=i+1;j<a.length();j++)      //to start position from 1 st index i.e 0,1 
			{
				if(b[i]==b[j])                   //check b[0]==b[1]-f /b[0]==b[2]-f/--------till b[0]==b[11]---false 
					                             //check b[1]==b[2]-f/b[1]==b[3]-f/b[1]==b[4]-"T"
				{
					frequency[i]++;              //frequency=2
					
					b[j]='0';                   //bcoz now i.e b[j]=4    
				}
					
			}
		}
		for(int i=0;i<frequency.length;i++)
		{
			if(b[i]!=' ' && b[i]!='0')
			{
				System.out.println(b[i] + "-" +frequency[i]);
			}
		}
		
	}

}
