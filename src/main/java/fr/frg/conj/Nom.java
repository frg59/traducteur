package fr.frg.conj;

import java.util.ArrayList;
import java.util.List;

import fr.frg.tunisien.TranslateItem;

public class Nom {

	public static List<TranslateItem> variante(TranslateItem base) {
		List<TranslateItem> res = new ArrayList<TranslateItem>();
		Temps present = Temps.buildPosessif();
		return present.variante(base);
	}
}
