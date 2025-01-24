//WAP to swap first to last character from string 
//input=India
//Output=andiI

class SwapFirstToLastCh
{
	public static void main(String args[])
	{
		String s1="India";
	/*
		StringBuilder sb=new StringBuilder();
		sb.append(s1.charAt(s1.length()-1));
		for(int i=1; i<s1.length()-1;i++)
			sb.append(s1.charAt(i));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	*/
		StringBuilder sb=new StringBuilder();
		sb.append(s1.charAt(s1.length()-1));
		sb.append(s1.substring(1,s1.length()-1));
		sb.append(s1.charAt(0));
		System.out.println(sb);

		
	}
}
