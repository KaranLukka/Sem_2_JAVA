public class A3{
	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		int sum=0,avg=0,i=0;
		for(i=0;i<arr[3];i++){
			sum+=arr[i];
			avg=sum/4;
		}
		System.out.print("Average:");
		System.out.print(avg);
	}
}