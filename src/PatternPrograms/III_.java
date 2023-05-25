package PatternPrograms;
/*
		1 1 1 s s    
		2 2 2 p p    
		3 3 3 a a    
		4 4 4 c c  
		5 5 5 e e  

 */
public class III_ {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<=n/2)
				System.out.print(i+1+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
