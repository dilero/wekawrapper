package classification;

import java.util.Random;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instances;

public abstract class BaseClassifierWrapper implements IClassifierWrapper {
	protected final Instances instances;
	protected Evaluation evaluation;
	protected Classifier classifier;

	public BaseClassifierWrapper(Instances instances, int classIndex) {
		instances.setClassIndex(classIndex);
		this.instances = instances;
	}

	@Override
	public boolean run() {
		boolean success = false;
		try {
			evaluation = new Evaluation(instances);
			evaluation.crossValidateModel(classifier, instances, 10, new Random());
			success = true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			success = false;
		}

		return success;
	}

	@Override
	public Evaluation getEvaluation() {
		return evaluation;
	}

}
