package fr.frg.tunisien;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TranslateService {

	public static List<TranslateItem> translateItems;

	public static String translate(String word) {
		for (TranslateItem translateItem : translateItems) {
			if (TunisienMatcher.checkMatch(word, translateItem.getToTranslate())) {
				return translateItem.getTranslation();
			}
		}
		return " *"+word+"* ";
	}

	public static void load() {
		translateItems = new ArrayList<TranslateItem>();
		InputStream is = TranslateService.class.getClassLoader().getResourceAsStream("dico");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		try {
			String line = br.readLine();
			while (line != null) {
				String[] item = line.split(",");
				TranslateItem it = new TranslateItem(item[0], item[1]);
				translateItems.add(it);
//				System.out.println(it.toString());
				line = br.readLine();
			}
		} catch (IOException e) {
		}
		System.out.println("dico loaded");
	}

}
