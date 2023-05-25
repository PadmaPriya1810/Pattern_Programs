package PatternPrograms;
/*
			1 2 3 
			4 5 6 
			7 8 9 
 */
public class _123456789 {
	public static void main(String[] args) {
		for(int num=1;num<=9;num++)
		{
			System.out.print(num+" ");
			if(num%3==0)
			{
				System.out.println();
			}
		}
		
	}

}
