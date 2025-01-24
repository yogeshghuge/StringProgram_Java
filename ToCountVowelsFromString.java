//WAP to count vowels from the String
//input= International
//output=6

class ToCountVowelsFromString
{
	public static void main(String args[])
	{
		String s1="International";
		int count=0;
	/*	char ch[] = s1.toCharArray();
		for(char c: ch)
		 	if(c=='A' || c=='E' || c=='I' || c=='O' ||c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count++;							
			System.out.println(count);
	*/
	

	/*
			for(int i=0; i<s1.length();i++)
			if(s1.charAt(i)=='A' || s1.charAt(i)=='a' ||s1.charAt(i)=='E' ||s1.charAt(i)=='e' ||s1.charAt(i)=='I' ||s1.charAt(i)=='i' ||s1.charAt(i)=='O' 						||s1.charAt(i)=='o' ||s1.charAt(i)=='U' ||s1.charAt(i)=='u')
			
						count++;
			System.out.println(count);

	*/

	/*
		
		for(int i=0; i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='A' ||c=='a' ||c=='E' ||c=='e' ||c=='I' ||c=='i' ||c=='O' ||c=='o' ||c=='U' ||c=='u' )
			count++;
		}
		System.out.println(count);
	*/

		String vowels="AEIOUaeiou";
		for(int i=0; i<s1.length();i++)
			if(vowels.contains(String.valueOf(s1.charAt(i))))
				count++;
		System.out.println(count);

			
	}
}
	