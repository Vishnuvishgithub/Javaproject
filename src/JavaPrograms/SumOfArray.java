package JavaPrograms;

public class SumOfArray {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,40,50};
		
		int sum = 0;
		
		int length=a.length;
		
		for (int i = 0; i < length; i++)       // i =0 ,     1,     2 ,     3    , 4 
		
		{
			sum=sum+a[i];     // 0+10=10,    10+20=30,  30+30=60,  60+40=100     100+50=150
		}
		
		System.out.println("sum of arrays :" + sum);
		
		// using for each 
		
		for (int i : a) 
		
		{
			sum=sum+i;
		}
		
		
		
	}

}
