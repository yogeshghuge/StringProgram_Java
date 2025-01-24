//WAP to display last character of string to first
//intput= hello i am java developer
//output= ohell i ma ajav rdevelope


import java.util.Arrays;
class ShiftLastCharToFirstOfString
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s2.length;i++)
		{
			String temp=s2[i];
			sb.append(temp.charAt(temp.length()-1));
			sb.append(temp.substring(0,temp.length()-1));
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}