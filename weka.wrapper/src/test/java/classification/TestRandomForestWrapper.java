package classification;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Before;
import org.junit.Test;

import preprocess.TestContants;
import weka.classifiers.Evaluation;
import weka.core.Instances;

public class TestRandomForestWrapper {

	private Instances instances;
	private RandomForestWrapper sut;

	@Before
	public void before() {
		try (StringReader reader = new StringReader(TestContants.ClassifierArffContent)) {
			instances = new Instances(reader);
			sut = new RandomForestWrapper(instances, TestContants.CLASS_INDEX);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void arffData_runClassifier_completedSuccessfully() throws Exception {
		assertTrue(sut.run());
	}
	
	@Test
	public void arffData_runClassifier_evaluationNotNull() throws Exception {
		sut.run();
		
		Evaluation evaluation = sut.getEvaluation();
		assertNotNull(evaluation);
	}

}
