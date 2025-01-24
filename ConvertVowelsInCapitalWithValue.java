//WAP to convert vowels in capital and write the number for it 
//input= Education
//output=EdUcAtIOn 13578

class ConvertVowelsInCapitalWithValue
{
	public static void main(String args[])
	{
		String s1="Education";
		String s2="AEIOUaeiou";
		StringBuilder sb=new StringBuilder();
		StringBuilder num=new StringBuilder();
		for(int i=0;i<s1.length();i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i))))
			{
				sb.append(Character.toUpperCase(s1.charAt(i)));
				num.append(i+1);
			}
			else
				sb.append(s1.charAt(i));
		}
		sb.append(" ");
		sb.append(num);
		System.out.println(sb);
	}
}
		
			
