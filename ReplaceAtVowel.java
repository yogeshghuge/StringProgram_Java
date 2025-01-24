//WAP to replace at vowel
//input= International
//output=1nt2rn3t45n6l

class ReplaceAtVowel
{
	public static void main(String args[])
	{
	
		String s1="International";
		int count=0;
		String vowels="AEIOUaeiou";
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s1.length();i++)
			if(vowels.contains(String.valueOf(s1.charAt(i))))
				sb.append(++count);
			else

				sb.append(s1.charAt(i));		
		System.out.println(sb);

	}
}