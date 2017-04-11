
public class EnumTest {
	public static void main(String args[]){
	 int[] a= new int[5];
	 for(int i=0;i<5;i++){
		 a[i]=i;
	 }
	 int[] b=a.clone();
	 
	 b[0]=3;
	 System.out.println(a);
	 System.out.println(a[0]);
		
	}
	
}
