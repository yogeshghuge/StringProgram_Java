//WAP to shift vowels at last in word in string
//Input= hello i am java developer
//output=hlleo i ma jvaa dvlpreeoe

class ShiftVowelsAtLastInWord
{
	public static void main(String args[])
	{
		/*String s1="hello i am java developer";
		String vowels="AEIOUaeiou";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s2.length;i++)
		{
			String temp=s2[i];
			for(int j=0; j<temp.length();j++)
				if(!vowels.contains(String.valueOf(temp.charAt(j))))
					sb.append(temp.charAt(j));
			for(int j=0; j<temp.length();j++)
				if(vowels.contains(String.valueOf(temp.charAt(j))))
					sb.append(temp.charAt(j));

			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
		*/

		String s1="hello i am java developer";
		String vowels="AEIOUaeiou";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s2.length;i++)
		{
			String temp=s2[i];
			StringBuilder vow=new StringBuilder();
			for(int j=0; j<temp.length();j++)
				if(!vowels.contains(String.valueOf(temp.charAt(j))))
					sb.append(temp.charAt(j));
				else
					vow.append(temp.charAt(j));
			sb.append(vow);
				
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);				


		
	}
}
		