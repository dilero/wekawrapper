package preprocess;

import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Before;
import org.junit.Test;

import weka.core.Instances;

public class TestNGramGenerator {

	private Instances instances;
	private NGramGenerator sut;

	@Before
	public void before() {
		try (StringReader reader = new StringReader(TestContants.NGramArffContent)) {
			instances = new Instances(reader);
			sut = new NGramGenerator(instances);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void arffData_applyNGram_numOfAttributeIncreased() throws Exception {
		int originalNofAtt = instances.numAttributes();

		Instances filteredInstances = sut.apply();

		assertFalse(filteredInstances.numAttributes() < originalNofAtt);
	}

}
