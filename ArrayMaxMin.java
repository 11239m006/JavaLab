import java.util.Scanner;
class ArrayMaxMin{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
    
	

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
	int max=arr[0];
	for (int j=0;j<n;j++)
	{
	    if(min>arr[j])
	    {
	   	min=arr[j];
	    }
	    if(max<arr[j])
	    {
		max=arr[j];
	    }
	}
	System.out.println("Min element :" + min);
	System.out.println("Max element :" + max);
	
        sc.close();
    }
}
