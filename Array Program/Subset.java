//WAJP to check one array is subset of another array / check one array is present inside another array.

//a[] = {20,13,5,2,30,28,8,1,19};
//b[] = {13,5,1,30}; Array b[] is subset of array a[].Because it has all the elements which are present in array a[].

public class Subset{

	public static void main(String[] args) {
		int a[] = {10,20,30,40,40,50,60,70,80};
		int b[] = {10,20,30,40,40};
		int count = 0;

		for(int i=0; i<b.length; i++) {
			for(int j=0; j<a.length ; j++) {
				if(b[i] == a[j] ) {
					count ++;
					a[j] = -1;
					break;
				}
			}
		}
		if(count==b.length) {
			System.out.println("Array b is Subset of Array a.");
		}
		else {
			System.out.println("Array b is not s Subset of Array a.");
		}

	}

}