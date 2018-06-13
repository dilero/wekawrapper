package classification;

import weka.classifiers.trees.RandomForest;
import weka.core.Instances;

public class RandomForestWrapper extends BaseClassifierWrapper {

	public RandomForestWrapper(Instances instances, int classIndex) {
		super(instances, classIndex);
		this.classifier = new RandomForest();

	}


}
