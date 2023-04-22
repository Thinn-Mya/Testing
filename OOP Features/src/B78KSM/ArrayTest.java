package B78KSM;

public class ArrayTest {

	public static void main(String[] args) {
		
		// array sum and average
		int sum=0;
		int [] array = {10,20,30,40,50 };
		int max=array[0];
		int min=array[0];
		int findvalue=35;
		boolean found=false;
		int index=100;
		for (int i=0; i<array.length; i++)
		{
			sum+=array[i];
		}
		System.out.println("Sum=" + sum);
		System.out.println("Average=" + sum/array.length);
		
		// to find maximum
		for (int i=1; i<array.length; i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("Maximum=" + max);
		// to find minimum
				for (int i=1; i<array.length; i++)
				{
					if(array[i]<min)
					{
						min=array[i];
					}
				}
				System.out.println("Minimum=" + min);
		// to find the number
		for (int i=0; i<array.length; i++)
		{
			if(findvalue==array[i])
			{
				found=true;
				index=i;
			}
				
		}
		if (found==true) System.out.println("Found at index : " + index);
		}

}
