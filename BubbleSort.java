import java.io.*;
class BubbleSort
{
	static void bubbleSort(int data[])
	{
		for(int i=1;i<=data.length-1;i++)
		{
			for(int j=1;j<=data.length-i;j++)
			{
				if(data[j-1]>data[j])
				{
					int temp;
					temp=data[j-1];
					data[j-1]=data[j];
					data[j]=temp;
				}
			}
			for(int j=0;j<data.length;j++)
			{
				System.out.print(data[j]+" ");
			}
			System.out.println();
				
		}
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n,i=0;
		int data[]=new int[8];
				
		while(i<8)
		{
			System.out.print("Please input data["+i+"]:");
			s=br.readLine();
			n=Integer.parseInt(s);
			data[i]=n;
			i++;
		}
		
		System.out.println("Befor bubble sort:");
		for(int j=0;j<data.length;j++)
		{
			System.out.print(data[j]+" ");
		}
		System.out.println();
		
		bubbleSort(data);
		
		System.out.println("After bubble sort:");
		for(int j=0;j<data.length;j++)
		{
			System.out.print(data[j]+" ");
		}
		
		System.out.println();
	}
}
