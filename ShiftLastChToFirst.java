class ShiftLastChToFirst
{
	public static void main(String args[])
	{
		String s1="India";
	  /*	
		StringBuilder sb=new StringBuilder();
		sb.append(s1.charAt(4));
		for(int i=0; i<s1.length()-1;i++)
			sb.append(s1.charAt(i));	
		System.out.println(sb);
		
	  */
	/*
		StringBuilder sb=new StringBuilder();
		sb.append(s1.charAt(s1.length()-1));
		for(int i=0; i<s1.length()-1;i++)
			sb.append(s1.charAt(i));
		System.out.println(sb);

	*/


	/*
		char ch=(s1.charAt(s1.length()-1));
		StringBuilder sb=new StringBuilder();
		sb.append(ch+"");
		sb.append(s1.substring(0,s1.length()-1));
		System.out.println(sb);
	*/

		StringBuilder sb=new StringBuilder("India");
		char ch=sb.charAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		sb.insert(0,ch);
		System.out.println(sb);
	
		
	}
}
				