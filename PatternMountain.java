import java.util.Scanner;
public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int space=((2*n)-3);
		int star=1;
		int row=1;
	while(row<=n)
		{
			int p=1;
			if(row<n)
			{
				p=row+1;
			}
			else{
				p=row;
			}
			int i=1;
			int val=1;
	while( i<=star)
	{
		System.out.print(val+"\t");
		i++;
		val++;
	}
	int j=1;
	while(j<=space)
	{
		System.out.print("\t");
		j++;
	}	
		int k=1;
		if(row==n)
		{
			k++;
		}
		while(k<=star)
		{
			p--;		
			System.out.print(p+"\t");
		k++;
		}
		star++;
		space-=2;
		row++;
		System.out.println();
		}
    }
}
