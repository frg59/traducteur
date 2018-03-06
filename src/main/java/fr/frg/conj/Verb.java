package fr.frg.conj;

import java.util.ArrayList;
import java.util.List;

import fr.frg.tunisien.TranslateItem;

public class Verb {

	public static List<TranslateItem> variante(TranslateItem base) {
		List<TranslateItem> res = new ArrayList<TranslateItem>();
		Temps present = Temps.buildPresent();
		List<TranslateItem> presentElts = present.variante(base);
		for (TranslateItem translateItem : presentElts) {
			res.add(translateItem);
			res.addAll(Temps.buildNegation().variante(translateItem));
		}
		return res;
	}

}
