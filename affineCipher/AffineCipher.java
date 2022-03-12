package affineCipher;

import java.util.ArrayList;

public class AffineCipher {
	
	private ArrayList<Character> list = new ArrayList<Character>();
	private int key1 = 0;
	private int key2 = 0;
	
	public AffineCipher(int key1, int key2) {
		super();
		this.key1 = key1;
		this.key2 = key2;
		char A = 'A';
		char a  = 'a';
		for (int i = 0 ; i < 26 ; i ++) {
			list.add(A++);
			list.add(a++);
		}
	}
	
	private int AlphabetToNum(char a) {
		return list.indexOf(a);
	}
	
	private char NumToAlphabet(int a) {
		return list.get(a);
	}
	
	private int getInverse(int a) {
		int inverse = 0;
		for (int i = 1; i <= 51; i++) {
			if (i*a%52 == 1) {
				inverse = i;
				break;
			}
		}
		return inverse;
	}
	public String Encode(String plain) {
		String cipher = null;
		char[] encode = plain.toCharArray();
		for (int i = 0; i < encode.length; i++) {
			if(list.contains(encode[i])) {
				int temp = (AlphabetToNum(encode[i])*key1+key2)%52;
				encode[i] = NumToAlphabet(temp);
			}
		}
		cipher = new String(encode);
		return cipher;
	}
	
	public String Decode(String cipher) {
		String plain = null;
		int inverse = getInverse(key1);
		char[] decode = cipher.toCharArray();
		for (int i = 0; i < decode.length; i++) {
			if(list.contains(decode[i])) {
				int temp = (AlphabetToNum(decode[i])-key2+52)*inverse%52;
				decode[i] = NumToAlphabet(temp);
			}
		}
		plain = new String(decode);
		return plain;
	}
}
