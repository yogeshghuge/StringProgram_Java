//WAP to find longest palindrome word
//input  - listen nayan eye for an eye makes whole world blind
//output - nayan

class CheckLongestPalindromeWordsFromString
{
	public static void main(String args[])
	{
		String s1 = "listen nayan eye for an eye makes whole world blind";
		String s2[] = s1.split(" ");
		int max = 0;
		String s="";
		for(int i=0; i<s2.length; i++)
		{
			if(s2[i].equalsIgnoreCase(new StringBuilder(s2[i]).reverse().toString()))
			{
				int len = s2[i].length();
				if(max<len)
				{
					max=len;
					s=s2[i];
				}
			}
			
		}
		System.out.println(s);
	}
}