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
			for (TranslateItem it : presentElts) {			
				res.add(translateItem);
				res.addAll(Temps.buildCO().variante(it));
			}
			for (TranslateItem it : Temps.buildNegation().variante(translateItem)) {			
				res.add(translateItem);
				res.addAll(Temps.buildCO().variante(it));
			}
		}
		return res;
	}

}
