package stringProgram;

public class SepareteIndividualCharFstring9 
{
   public static void main(String[] args)
   {
	 String a="PoojaGauraoBhute";
	 System.out.println("Original String is- " +a);
	 
	 System.out.print("Separated chars from String are- ");
	 for(int i=0;i<a.length();i++) 
	 {
		
		 System.out.print(a.charAt(i) + " ");
	 }
   }
}
