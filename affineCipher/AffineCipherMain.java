package affineCipher;

public class AffineCipherMain {

	public static void main(String[] args) {
		
		/* 1. ������ ��ȣ(Affine Cipher)
		 * 	- shift ��ȣ�� ��ȭ��
		 * 	- �� ���� Ű�� ����ϴ� ��ĪŰ ġȯ ��ȣ
		 * 	- ���ĺ� ���� ��ȣȭ
		 * 	- ��ȣȭ : key1*plain+key2 modulo 52
		 * 	- ��ȣȭ : key1^(-1)*(cipher-key2) modulo 52
		 * 	- key1 �� modulo ������ ������ �� 52 �� ���μ� �̾�� �Ѵ�.
		 * 	- key2 �� ������ ������ ������ x = x + 52 = x + 2*52 ... = x +n*52 modulo 52 �̹Ƿ� ��� �� 52���� ���� 
		 * 	- key in (1,3,5,7,9,11,15,17,19,21,23,25,27,29,31,33,35,37,41,43,45,47,49,51)
		 *  - Ư���� key ���� �ſ� ���� ������ �Ҹ��� Ű Ž�� ���ݿ� ���� �ſ� ����ϴ�.(�� ���� ��� 52*24���� key �� �����Ѵ�.)
		 *  - 1:1 ġȯ �� �����ϹǷ� ���� �󵵸� ������� �� ���ݿ� �ſ� ����ϴ�.
		 *  - ���ȼ��� �ſ� ���ϴ�.
		 * */
		
		AffineCipher ac = new AffineCipher(37, 48);
		String plain = "My Heart Will Go On\r\n"
				+ "Every night in my dreams\r\n"
				+ "I see you, I feel you\r\n"
				+ "That is how I know you go on\r\n"
				+ "Far across the distance\r\n"
				+ "And spaces between us\r\n"
				+ "You have come to show you go on\r\n"
				+ "Near, far, wherever you are\r\n"
				+ "I believe that the heart does go on\r\n"
				+ "Once more, you open the door\r\n"
				+ "And you're here in my heart\r\n"
				+ "And my heart will go on and on\r\n"
				+ "Love can touch us one time\r\n"
				+ "And last for a lifetime\r\n"
				+ "And never let go 'til we're gone\r\n"
				+ "Love was when I loved you\r\n"
				+ "One true time I'd hold to\r\n"
				+ "In my life, we'll always go on\r\n"
				+ "Near, far, wherever you are\r\n"
				+ "I believe that the heart does go on (why does the heart go on?)\r\n"
				+ "Once more, you open the door\r\n"
				+ "And you're here in my heart\r\n"
				+ "And my heart will go on and on\r\n"
				+ "You're here, there's nothing I fear\r\n"
				+ "And I know that my heart will go on\r\n"
				+ "We'll stay forever this way\r\n"
				+ "You are safe in my heart and\r\n"
				+ "My heart will go on and on";
		String cipher = ac.Encode(plain);
		System.out.println(cipher);
		System.out.println();
		String plain2 = ac.Decode(cipher);
		System.out.println(plain2);
		System.out.println(plain.equals(plain2));
	}

}
