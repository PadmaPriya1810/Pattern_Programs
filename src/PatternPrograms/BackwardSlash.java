package PatternPrograms;

/*
 		5 
      4   
    3     
  2       
1   
      

 */
public class BackwardSlash {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1)
				System.out.print(j+1+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
