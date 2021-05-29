import java.util.*;
public class Beautifularray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");//Enter the test cases
		int t=sc.nextInt();
		for(int a=0;a<t;a++)
		{
			System.out.println("enter the number of elements");//enter the no of elements.
			int n=sc.nextInt();
			int ab[]=new int[n];
			int b=0,c=0,d=0,e=0;
			for(int i=0;i<n;i++)
			{
				ab[i]=sc.nextInt();// Enter the elements values.
				if(ab[i]==0) b++;//b increments if value of any element is 0
				else if(ab[i]==1)c++;//c increments if value of any element is 1
				else if(ab[i]==-1)d++;
				else e++;						// e increments if value is other than 0,1,-1.
				
					
			}
			if(e>1)									// if more than once e increments then condition doesnt satisfies
				System.out.println("no");
			else
			{
				if(e>0 && d>0)
					System.out.println("no");
				else if(d>1 && b==0)
					System.out.println("no");
				else
					System.out.println("yes");
					
			}
		}

	}

}
