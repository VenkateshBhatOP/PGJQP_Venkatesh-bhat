
public class NonPositive {
	int n;
	int []arr= {1,-7,-5,9,0};
	int []empty=new int[100];
	void accept()
	{
		for(n=0;n<arr.length;n++)
		{
			if(arr[n]<0)
			{
				arr[n]=0;
			}
		
		System.out.println(arr[n]);
	}
	}

	public static void main(String[] args) {
		NonPositive obj=new NonPositive();
		obj.accept();
		

	}

}
