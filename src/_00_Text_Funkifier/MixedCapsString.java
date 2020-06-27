package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String newS = "";
		newS += Character.toLowerCase(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (i % 2 != 0) {
				newS += Character.toUpperCase(s.charAt(i));
			} else {
				newS += s.charAt(i);	
			}
		}
		s = newS;
		return s;
	}

}
