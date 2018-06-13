package preprocess;

import weka.core.Instances;
import weka.core.tokenizers.NGramTokenizer;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.StringToWordVector;

public class NGramGenerator {
	private final Instances instances;

	public NGramGenerator(Instances instances) {
		this.instances = instances;
	}

	public Instances apply() throws Exception {

		NGramTokenizer nGramTokenizer = getTokenizer();

		StringToWordVector stringToWordVector = getFilter(nGramTokenizer);

		return Filter.useFilter(instances, stringToWordVector);
	}

	private StringToWordVector getFilter(NGramTokenizer nGramTokenizer) throws Exception {
		StringToWordVector stringToWordVector = new StringToWordVector();
		stringToWordVector.setInputFormat(instances);
		stringToWordVector.setAttributeNamePrefix("transition-");
		stringToWordVector.setTokenizer(nGramTokenizer);
		return stringToWordVector;
	}

	private NGramTokenizer getTokenizer() {
		NGramTokenizer nGramTokenizer = new NGramTokenizer();
		nGramTokenizer.setDelimiters(";");
		nGramTokenizer.setNGramMaxSize(1);
		nGramTokenizer.setNGramMaxSize(5);
		return nGramTokenizer;
	}

}
