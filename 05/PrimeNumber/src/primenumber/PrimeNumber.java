package primenumber;

public class PrimeNumber {
	public static void main(String args[]) {
		int k;
		int s=0;
		int d, c=0;
		for(k=2; k<=100; k++)
		{
			c=0;
			for(d=2; d<=k-1; d++)
			{
				if(k%d == 0) {
					c++;
					break;
				}
			}
			if(c==0) {
				System.out.printf("%d ", k);
			}
			
		}
	}

}
