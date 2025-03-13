//WAJP to identify missing element in an array.

public class MissingEle {

	public static void main(String[] args) {
		int a[] = {1,2,4,5,6,7,8,9,10};
		int ele = a[0];
		for(int i=0; i<a.length; i++) {
				
			if(ele == a[i]) {
				ele++;
			}
		}
		System.out.println(ele+" is not present in an Array.");
	}
}