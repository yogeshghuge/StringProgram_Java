//WAP to find pallindrome name from whole string 
//input=hello nayan and nitin where is naman
//output=nayan nitin naman

import java.util.Arrays;
class PallindromeNameInString
{
	public static void main(String args[])
	{
		/*String s1="hello nayan and nitin where is naman";
		String s2[]= s1.split(" ");
		for(int i=0; i<s2.length;i++)
			if(s2[i].equalsIgnoreCase(new StringBuilder(s2[i]).reverse().toString()))
				System.out.println(s2[i]);
		*/
	
		
		
		String s1="hello nayan and nitin where is naman";
		String s2[]= s1.split(" ");
		for(int i=0; i<s2.length;i++)
		{
			String temp=s2[i];
			StringBuilder sb=new StringBuilder(temp);
			StringBuilder sbr=sb.reverse();
			String rword=sbr.toString();
			if(temp.equalsIgnoreCase(rword))
					System.out.println(temp);
		}
		


		
	}
}