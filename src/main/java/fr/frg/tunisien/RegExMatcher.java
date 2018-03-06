package fr.frg.tunisien;

import java.util.regex.Pattern;

public class RegExMatcher {

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
		pat = pat.replace("a", "REGLEAZZ");
		
		pat = pat.replace("e", "REGLEEIA");
		
		pat = pat.replace("i", "REGLEEI");


		pat = pat.replace("rr", "REGLER");
		pat = pat.replace("5", "REGLER");
		pat = pat.replace("gh", "REGLER");
		pat = pat.replace("kh", "REGLER");
		pat = pat.replace("r", "REGLER");

		pat = pat.replace("kk", "REGLEK");
		pat = pat.replace("k", "REGLEK");
		pat = pat.replace("9", "REGLEK");

		pat = pat.replace("ss", "REGLES");
		pat = pat.replace("s", "REGLES");

		pat = pat.replace("7", "REGLEH");
		pat = pat.replace("hh", "REGLEH");
		pat = pat.replace("h", "REGLEH");

		pat = pat.replace("ou", "REGLEW");
		pat = pat.replace("o", "REGLEW");
		pat = pat.replace("w", "REGLEW");

		pat = pat.replace("t", "REGLET");
		pat = pat.replace("tt", "REGLET");

		// -------------------------regex

		pat = pat.replace("REGLEEIA", buildRegex("e", "a", "i"));
		pat = pat.replace("REGLEEI", buildRegex("e", "i"));
		pat = pat.replace("REGLEAZZ", buildRegex("e", "a", "3", "3a"));

		pat = pat.replace("REGLEK", buildRegex("9", "k", "kk"));

		pat = pat.replace("REGLER", buildRegex("5", "r", "rr", "gh", "kh"));

		pat = pat.replace("REGLES", buildRegex("s", "ss"));

		pat = pat.replace("REGLEH", buildRegex("7", "h", "hh"));

		pat = pat.replace("REGLEW", buildRegex("w", "ou", "o"));
		
		pat = pat.replace("REGLET", buildRegex("t", "tt"));

		return Pattern.matches(pat, b);
	}

	private static String clean(String input) {
		input = input.toLowerCase();
		input = input.replace("2", "");
		input = input.replace("é", "e");
		input = input.replace("è", "e");
		input = input.replace("-", "");
		return input;
	}

	public static String buildRegex(String... params) {
		String res = "";
		for (String string : params) {
			if ("".equals(res)) {
				res = "(" + string + ")";
			} else {
				res = "(" + res + "|(" + string + "))";
			}
		}
		return res;
	}

}
