//WAP to display first letter in alphabetical order
//Input= hello i am java developer
//output=am developer hello i java

import java.util.Arrays;
class FirstLetterAlphabetInString
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		String s2[]=s1.split(" ");
		Arrays.sort(s2);
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s2.length;i++)
		{
			sb.append(s2[i]);
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}