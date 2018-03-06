package fr.frg.conj;

public class ConjItem {

	private String prefix;
	private String suffix;
	private String translationPrefix;
	private String translationSufix;

	public String getPrefix() {
		return prefix;
	}

	public ConjItem(String prefix, String suffix, String translationPrefix, String translationSufix) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.translationPrefix = translationPrefix;
		this.translationSufix = translationSufix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getTranslationPrefix() {
		return translationPrefix;
	}

	public void setTranslationPrefix(String translationPrefix) {
		this.translationPrefix = translationPrefix;
	}

	public String getTranslationSufix() {
		return translationSufix;
	}

	public void setTranslationSufix(String translationSufix) {
		this.translationSufix = translationSufix;
	}
}
