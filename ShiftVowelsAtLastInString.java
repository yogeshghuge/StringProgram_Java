//WAP to shift vowels at last in string with same space in word
//Input= hello i am java developer
//output=hllmj v dv lpre oiaaaeeoe

class ShiftVowelsAtLastInString
{
	public static void main(String args[])
	{
		String s1="hello i am java developer";
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		String vowels="AEIOUaeiou";
		for(int i=0; i<s1.length();i++)
			if(vowels.contains(String.valueOf(s1.charAt(i))))
				sb2.append(s1.charAt(i));
			else
				if(s1.charAt(i)!=' ')
					sb1.append(s1.charAt(i));
		sb1.append(sb2);
		for(int i=0; i<s1.length();i++)
			if(s1.charAt(i)==' ')
				sb1.insert(i,' ');
		System.out.println(sb1);
	}
}
			
		
		
