package PatternPrograms;

public class Assignment 
{
public static void main(String[] args) 
{
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==0||j==0||j==4)
			System.out.print("*"+" ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	int num=1;
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==0||j==0||i==4||j==4)
			System.out.print("*"+" " );
			else
				System.out.print(num++ +" ");
		}
		System.out.println();
	}
}
}

