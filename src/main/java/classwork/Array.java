package classwork;

public class Array {
	public static void main(String[] args) {
		int[] arr = {10,25,20,22,27,38,92,56};
		int n=20;
		int index = checkIf(arr,n);
		if(index!=-1) {
		      System.out.println("Exisit at"+" "+index+" position");
		}
		else {
			System.out.println("No");
		}
	}
	 public static  int checkIf(int[] a,int b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				return i;
			}
		}
			return -1;
	 }
}
