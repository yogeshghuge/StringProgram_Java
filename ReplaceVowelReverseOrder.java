//WAP to replace at vowel at reverse order.
//input= International
//output=6nt5rn4t32n1l

class ReplaceVowelReverseOrder
{
	public static void main(String args[])
	{
	
		String s1="International";
		int count=0;
		String vowels="AEIOUaeiou";
		StringBuilder sb=new StringBuilder(s1);
		for(int i=sb.length()-1; i>=0;i--)
			if(vowels.contains(String.valueOf(sb.charAt(i))))
			{
				sb.deleteCharAt(i);
				sb.insert(i,++count);
			}		
		System.out.println(sb);


	}
}
