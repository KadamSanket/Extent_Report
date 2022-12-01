 package java_Prg;

public class MaxNo_Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,9,8,5};
		
		int i=1;
		System.out.println("Length of an array: "+a.length);
		
		
//		for(int n=0; n<a[i]; n++){
//			
//			System.out.println(a[i]);
//			i++;
//			
//			}
		int max = a[0];
//		
		for(int n=0; n<=a[i]; n++){
			
			
			if(a[n]>a[i]){
				
				max = a[i];
				
				
				i++;	
				
			}
			
			System.out.println(" max no is "+max);
			
		}
		
				
		
		
		

	}

}
