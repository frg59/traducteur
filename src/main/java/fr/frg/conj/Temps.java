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
		present.getConjItems().add(new ConjItem("", "i", "mon/ma ", "")); //1s
		present.getConjItems().add(new ConjItem("", "ya", "mon/ma ", "")); //1s
		present.getConjItems().add(new ConjItem("", "ek", "ton/ta ", "")); //2s
		present.getConjItems().add(new ConjItem("", "k", "ton/ta ", "")); //2s
		present.getConjItems().add(new ConjItem("", "ou", "son/sa ", "")); //3s m
		present.getConjItems().add(new ConjItem("", "ha", "son/sa ", "")); //3s f
		present.getConjItems().add(new ConjItem("", "na", "son ", "")); //1p
		present.getConjItems().add(new ConjItem("", "kom", "votre ", "")); //2p
		present.getConjItems().add(new ConjItem("", "hom", "leur ", "")); // 3p
		return present;
	}
	
	public static Temps buildCO() {
		Temps present = new Temps();
		present.getConjItems().add(new ConjItem("", "ni", "", " moi ")); //1s
		present.getConjItems().add(new ConjItem("", "ek", "", " toi ")); //2s
		present.getConjItems().add(new ConjItem("", "k", "", " toi ")); //2s
		present.getConjItems().add(new ConjItem("", "ou", "", " lui ")); //3s m
		present.getConjItems().add(new ConjItem("", "ha", "", " elle ")); //3s f
		present.getConjItems().add(new ConjItem("", "na", "", " nous ")); //1p
		present.getConjItems().add(new ConjItem("", "kom", "", " vous ")); //2p
		present.getConjItems().add(new ConjItem("", "hom", " ", " ils")); // 3p
		return present;
	}
	
	public static Temps buidAdv() {
		Temps present = new Temps();
		present.getConjItems().add(new ConjItem("", "i", "mon/ma ", "")); //1s
		present.getConjItems().add(new ConjItem("", "ya", "mon/ma ", "")); //1s
		present.getConjItems().add(new ConjItem("", "ek", "ton/ta ", "")); //2s
		present.getConjItems().add(new ConjItem("", "k", "ton/ta ", "")); //2s
		present.getConjItems().add(new ConjItem("", "h", "son/sa ", "")); //3s m
		present.getConjItems().add(new ConjItem("", "ha", "son/sa ", "")); //3s f
		present.getConjItems().add(new ConjItem("", "na", "son ", "")); //1p
		present.getConjItems().add(new ConjItem("", "kom", "votre ", "")); //2p
		present.getConjItems().add(new ConjItem("", "hom", "leur ", "")); // 3p
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
