
public class TotalElements {
	int n=0;
	int []arr= {1,2,3,4,5,6,7,3};
	void getData()
	{
		while(n!=arr.length)
		{
			n++;
		}
		System.out.println("Total number:"+n);
		
	}
public static void main(String[] args) {

	TotalElements obj=new TotalElements();
	obj.getData();
}
}
