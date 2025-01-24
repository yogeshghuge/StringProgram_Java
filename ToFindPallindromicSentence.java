//WAP to display pallindromic Sentence
//input= never odd or even 
//output=true


class ToFindPallindromicSentence
{
	public static void main(String args[])
	{
		String s1="Gate-man sees name, garage-man sees name-tag.";
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s1.length();i++)
			if(Character.isLetterOrDigit(s1.charAt(i)))
				sb.append(s1.charAt(i));
			
		if(sb.toString().equalsIgnoreCase(sb.reverse().toString()))
			System.out.println(true);
		else

			System.out.println(false);
	}
}
		
		
