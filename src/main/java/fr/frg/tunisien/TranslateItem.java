package fr.frg.tunisien;

public class TranslateItem {

	private String toTranslate;
	private String translation;

	public TranslateItem(String toTranslate, String translation) {
		super();
		this.toTranslate = toTranslate;
		this.translation = translation;
	}

	public String getToTranslate() {
		return toTranslate;
	}

	public String getTranslation() {
		return translation;
	}

	@Override
	public String toString() {
		return "TranslateItem [toTranslate=" + toTranslate + ", translation=" + translation + "]";
	}

}
