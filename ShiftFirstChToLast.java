class ShiftFirstChToLast
{
	public static void main(String args[])
	{
		String s1="India";
	/*	
		String s2="";
		for(int i=1; i<s1.length();i++)
			s2+=s1.charAt(i);
		s2+=s1.charAt(0);
		System.out.println(s2);
	*/
	/*
		StringBuilder sb=new StringBuilder();
		for(int i=1; i<s1.length();i++)
			sb.append(s1.charAt(i));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	*/
	/*

		StringBuilder sb=new StringBuilder(s1.substring(1));
		sb.append(s1.charAt(0));
		System.out.println(sb);
		
	*/

		StringBuilder sb=new StringBuilder("India");
		char ch=sb.charAt(0);
		sb.deleteCharAt(0);
		sb.append(ch);
		System.out.println(sb);
	}
}
	