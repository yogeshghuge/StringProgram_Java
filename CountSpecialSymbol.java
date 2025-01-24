//WAP to count special Symbol in String 
//Input= hello??? how are you??? i am fine!!!
//output=9

class CountSpecialSymbol
{
	public static void main(String args[])
	{
		/*String s1="hello??? how are you??? i am fine!!!";
		String s2[]=s1.split(" ");
		int count=0;
		for(int i=0; i<s2.length;i++)
		{
			String s = s2[i];

			for(int j=0; j<s.length(); j++){
				if(!(Character.isLetterOrDigit(s.charAt(j))))
					count++;
			}
		}
		System.out.println(count);*/

		String s1="hello??? how are you??? i am fine!!!";
		int count=0;
		for(int i=0; i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(!(Character.isLetterOrDigit(c) || Character.isWhitespace(c)))
				count++;
		}
		System.out.println(count);




		

	}
}