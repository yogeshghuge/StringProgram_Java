//WAP to shift all vowels at first 
// Input=International
//output=Ieaioantrntnl

class ShiftVowelsAtFirst
{
	public static void main(String args[])
	{
		String s1="International";
		int count=0;
		String vowels="AEIOUaeiou";
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		for(int i=0; i<s1.length();i++)
			if(vowels.contains(String.valueOf(s1.charAt(i))))
				sb1.append(s1.charAt(i));
			else
				sb2.append(s1.charAt(i));
		sb1.append(sb2);
		System.out.println(sb1);
	}
}		