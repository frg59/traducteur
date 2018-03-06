package fr.frg.conj;

import java.util.ArrayList;
import java.util.List;

import fr.frg.tunisien.TranslateItem;

public class Temps {

	List<ConjItem> conjItems = new ArrayList<ConjItem>();

	public List<ConjItem> getConjItems() {
		return conjItems;
	}

	public void setConjItems(List<ConjItem> conjItems) {
		this.conjItems = conjItems;
	}
	
	public static Temps buildNegation() {
		Temps tps = new Temps();
		tps.getConjItems().add(new ConjItem("ma", "ech", "ne pas ", ""));
		return tps;
	}

	public static Temps buildPresent() {
		Temps present = new Temps();
		present.getConjItems().add(new ConjItem("n", "", "je ", ""));
		present.getConjItems().add(new ConjItem("t", "", "tu ", ""));
		present.getConjItems().add(new ConjItem("y", "", "il ", ""));
		present.getConjItems().add(new ConjItem("n", "w", "nous ", ""));
		present.getConjItems().add(new ConjItem("t", "w", "vous ", ""));
		present.getConjItems().add(new ConjItem("y", "w", "ils ", ""));
		return present;
	}

	public static Temps buildPosessif() {
		Temps present = new Temps();
		present.getConjItems().add(new ConjItem("", "i", "mon/ma ", ""));
		present.getConjItems().add(new ConjItem("", "ek", "ton/ta ", ""));
		present.getConjItems().add(new ConjItem("", "a", "son/sa ", ""));
		present.getConjItems().add(new ConjItem("", "na", "son ", ""));
		present.getConjItems().add(new ConjItem("", "kom", "votre ", ""));
		present.getConjItems().add(new ConjItem("", "hom", "leur ", ""));
		return present;
	}

	public List<TranslateItem> variante(TranslateItem base) {
		List<TranslateItem> res = new ArrayList<TranslateItem>();
		for (ConjItem conjitem : this.conjItems) {
			res.add(new TranslateItem(conjitem.getPrefix() + base.getToTranslate() + conjitem.getSuffix(),
					conjitem.getTranslationPrefix() + base.getTranslation() + conjitem.getTranslationSufix()));
		}
		return res;
	}

}
