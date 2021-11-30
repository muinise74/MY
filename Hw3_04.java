package javafestival_3weeks;

public class Hw3_04 {

	public static String findKim(String[] a) {
		String result = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("Kim")) {
				result += " " + (i+1);
			}
		}
		result = "김서방은" + result +"에 있다.";
		return result;
	}
	public static void main(String[] args) {
		String[] names1 = {"Queen", "Tod", "Kim"};
		String[] names2 = {"Queen", "Tod", "Kim","Jone","Kim"};
		
		System.out.println(findKim(names1));
		System.out.println(findKim(names2));
	}

}
