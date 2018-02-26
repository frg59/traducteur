package fr.frg.tunisien;

import java.util.regex.Pattern;

public class TunisienMatcher {

	private String a;
	private String b;

	public boolean match() {
		return checkMatch(this.getA(), this.getB());
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public static boolean checkMatch(String a, String b) {
		a = clean(a);
		b = clean(b);

		String pat = "^" + a + "$";
		pat = pat.toLowerCase();

		// ----- scan sound to replace
		pat = pat.replace("3a", "REGLEAZZ");
		pat = pat.replace("3", "REGLEAZZ");
		pat = pat.replace("e", "REGLEEIA");
		pat = pat.replace("i", "REGLEEI");
		pat = pat.replace("a", "REGLEAZZ");

		pat = pat.replace("5", "REGLER");
		pat = pat.replace("gh", "REGLER");
		pat = pat.replace("kh", "REGLER");
		pat = pat.replace("r", "REGLER");

		pat = pat.replace("k", "REGLEK");
		pat = pat.replace("9", "REGLEK");

		pat = pat.replace("ss", "REGLES");
		pat = pat.replace("s", "REGLES");

		pat = pat.replace("7", "REGLEH");
		pat = pat.replace("hh", "REGLEH");
		pat = pat.replace("h", "REGLEH");

		pat = pat.replace("ou", "REGLEW");
		pat = pat.replace("w", "REGLEW");

		// -------------------------regex

		pat = pat.replace("REGLEEIA", "[eia]");
		pat = pat.replace("REGLEEI", "[ei]");
		// pat = pat.replace("REGLEAZZ", "[a3]");
		pat = pat.replace("REGLEAZZ", "([a|e|3]|(3a))");

		pat = pat.replace("REGLEK", "[9k]");

		pat = pat.replace("REGLER", "(([5|r]|(gh))|(kh))");

		pat = pat.replace("REGLES", "(s|(ss))");

		pat = pat.replace("REGLEH", "(7|h|(hh))");

		pat = pat.replace("REGLEW", "(w|(ou))");

		return Pattern.matches(pat, b);
	}

	private static String clean(String input) {
		input = input.toLowerCase();
		input = input.replace("2", "");
		input = input.replace("é", "e");
		input = input.replace("è", "e");
		return input;
	}

}
