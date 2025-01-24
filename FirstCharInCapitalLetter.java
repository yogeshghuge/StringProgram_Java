//WAP to convert first character in capital letter
//Input= listen nayan eye for an eye makes whole world blind
//output=Listen Nayan Eye For An Eye Makes Whole WOrld Blind

class FirstCharInCapitalLetter
{
	public static void main(String args[])
	{
		String s1="listen nayan eye for an eye makes whole blind";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s2.length;i++)
		{	
			String temp=s2[i];
			sb.append(Character.toUpperCase(temp.charAt(0)));
			sb.append(temp.substring(1));
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
		