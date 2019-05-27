package a63;

public class Klammersetzung {
	public static boolean klammersetzung(String s) {
		char[] cha = s.toCharArray();
		boolean b = false;

		for (int x = 0; x < cha.length; x++) {

			if (cha[x] == '(') {
				for (int y = x; y < cha.length; y++) {
					if (cha[y] == ')') {
						b = true;
						cha[y] = 000;
						break;
					} else if (y == cha.length) {
						b = false;
						x = cha.length;
						break;
					}
				}
			}

			if (cha[x] == '[') {
				for (int y = x; y < cha.length; y++) {
					if (cha[y] == ']') {
						b = true;
						cha[y] = 000;
						break;
					} else if (y == cha.length) {
						b = false;
						x = cha.length;
						break;
					}
				}
			}

			if (cha[x] == '{') {
				for (int y = x; y < cha.length; y++) {
					if (cha[y] == '}') {
						b = true;
						cha[y] = 000;
						break;
					} else if (y == cha.length) {
						b = false;
						x = cha.length;
						break;
					}

				}
			}

			if((cha[x]==')')||(cha[x]==']')||(cha[x]=='}')){
			b=false;
			break;
			}
				
		}

		return b;
	}

	public static void main(String[] args) {
		String s = "([)]";
		boolean b;
		b = klammersetzung(s);
		System.out.println(b);
	}

}
