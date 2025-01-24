//WAP to remove specail character from the string 
//input= hello??? how are you??? i am fine!!!
//output=hello how are you i am fine 

/*class RemoveSpecailCharFromString
{
	public static void main(String argss[])
	{
		String s1=" hello??? how are you??? i am fine!!!";
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if((Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)))
			sb.append(ch);
		}
		System.out.println(sb);
	}
}
*/


//WAP to display specail character from the string 
//input= hello??? how are you??? i am fine!!!
//output=??????!!!

class RemoveSpecailCharFromString
{
	public static void main(String argss[])
	{
		String s1=" hello??? how are you??? i am fine!!!";
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(!(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)))
			sb.append(ch);
		}
		System.out.println(sb);
	}
}

