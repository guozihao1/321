public class PyramidTest {
	public static void main(String[] args) {
		int k,i = 5;
		k = i;
		for (int j = 1;j <= i;j++) {
			if(k > 0) {
				for(int a =k-1;a > 0;a--) {
					System.out.print(" ");
				}
			}
			int times = 2*j - 1;
			while(times != 0) {
				System.out.print("*");
				times--;
			}
			System.out.print("\n");	
			k--;
		}   
	}
}
