package PatternPrograms;

/*
		s p a c e		          
		s p a c e         
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 

 */
public class IV_ {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=n/2)
				System.out.print(j+1+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
