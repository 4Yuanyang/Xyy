public class BinarySearch {
	public static void main(String[] args) {
		var list = Arrays.asList(1,2,3,4,5,9,19);
		int l = 0, r = list.size() - 1, mid;
		while(l < r) {
			mid = l + r >> 1;
			if(list.get(mid) >= 4) r = mid;
			else l = mid + 1;
		}	
		System.out.println(r);
		System.out.println(list.get(r));
	}
}
