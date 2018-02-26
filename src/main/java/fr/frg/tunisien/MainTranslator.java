package fr.frg.tunisien;

import java.util.Scanner;

public class MainTranslator {

	public static void main(String[] args) {
		TranslateService.load();
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("?");
			String s = in.nextLine();
			while (s != null) {	
				String[] words = s.split(" ");
				for (String word : words) {
					System.out.print(TranslateService.translate(word));
				}
				System.out.println("\n?");
				s = in.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
