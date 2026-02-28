import java.util.Arrays;

public class Array {
	

	public static void main(String[] arg){
		int total =0;
		int arr[]= {1,5,7,9,16};
		System.out.println(Arrays.toString(arr) );
		for (int i=0;i<arr.length;i++) {
			total=total+arr[i];
			
			
			
		System.out.println(arr[i]*2);
		if(arr[i]==7) {
			arr[i]=30;
			//System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		}
		System.out.println(total);
		System.out.println(arr[0]);
		System.out.println("    ");;
		
	int[] akshat=new int[5];
	akshat[3]=7;
	akshat[2]=11;
	akshat[1]=18;
	akshat[0]=9;
	akshat[4]=90;
	
//	for(int i=akshat.length-1;i>=0;i--) {
//		System.out.print(akshat[i]+" ");
//		
//	}
	
	
	
	for(int x : akshat) {
		
		
		System.out.println(x);}
	
	System.out.println(Arrays.toString(akshat) );
	
	System.out.println(akshat.length);
	
	}
	
	}

