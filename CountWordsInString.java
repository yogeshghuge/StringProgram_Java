//WAP to count words in String
//Input= hello i am java developer
//output= 5

import java.util.Arrays;
class CountWordsInString
{
	public static void main(String args[])
	{
		String s1="hello i am       java developer";
		int count=0;
		String s2[]=s1.split(" ");
		for(int i=0; i<s2.length;i++)
			if(s2[i].length()!=0)
				count++;
		System.out.println(count);
		System.out.println(s2.length);// it is use when their is not extra space in the word, their is no need of loop then.

	}
}