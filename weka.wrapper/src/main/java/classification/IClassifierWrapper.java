package classification;

import weka.classifiers.Evaluation;

public interface IClassifierWrapper {

	public boolean run();

	public Evaluation getEvaluation();

}
