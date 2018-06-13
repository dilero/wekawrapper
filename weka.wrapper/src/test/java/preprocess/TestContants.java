package preprocess;

public class TestContants {
	public final static String NGramArffContent = "@relation thesis" + System.lineSeparator()
			+ "@attribute 'class' {0,1}" + System.lineSeparator()
			+ "@attribute 'CURRENTTHREADCPURATEAMONGSLIVEHTTPTHREADS' numeric" + System.lineSeparator()
			+ "@attribute 'CURRENTTHREADCPURATESINCE' numeric" + System.lineSeparator()
			+ "@attribute 'operationbasetype' {add, delete, update, read}" + System.lineSeparator()
			+ "@attribute 'operationtime' numeric" + System.lineSeparator() + "@attribute 'reqop' string"
			+ System.lineSeparator() + "@data" + System.lineSeparator()
			+ "0 0.00807799442904148 0.00003791058221364873 add 18 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.003621169916450705 0.00004460716472695663 add 18 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.01086350974940061 0.05928706879750536 add 17 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.00403899721450271 0.03370607212039935 add 10 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.00807799442904148 0.00003791058221364873 add 18 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.003621169916450705 0.00004460716472695663 add 18 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.01086350974940061 0.05928706879750536 add 17 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.00403899721450271 0.03370607212039935 add 10 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.00807799442904148 0.00003791058221364873 add 18 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.003621169916450705 0.00004460716472695663 add 18 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.01086350974940061 0.05928706879750536 add 17 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.00403899721450271 0.03370607212039935 add 10 add;add;add;delete;update " + System.lineSeparator()
			+ "0 0.003621169916450705 0.028543462350457422 add 11 add;add;add;delete;update ";

	public final static String ClassifierArffContent = "@relation thesis" + System.lineSeparator()
			+ "@attribute 'class' {0,1}" + System.lineSeparator()
			+ "@attribute 'CURRENTTHREADCPURATEAMONGSLIVEHTTPTHREADS' numeric" + System.lineSeparator()
			+ "@attribute 'CURRENTTHREADCPURATESINCE' numeric" + System.lineSeparator()
			+ "@attribute 'operationbasetype' {add, delete, update, read}" + System.lineSeparator()
			+ "@attribute 'operationtime' numeric" + System.lineSeparator() + "@data" + System.lineSeparator()
			+ "0 0.00807799442904148 0.00003791058221364873 add 18 " + System.lineSeparator()
			+ "0 0.003621169916450705 0.00004460716472695663 add 18 " + System.lineSeparator()
			+ "0 0.01086350974940061 0.05928706879750536 add 17 " + System.lineSeparator()
			+ "0 0.00403899721450271 0.03370607212039935 add 10 " + System.lineSeparator()
			+ "0 0.00807799442904148 0.00003791058221364873 add 18 " + System.lineSeparator()
			+ "0 0.003621169916450705 0.00004460716472695663 add 18 " + System.lineSeparator()
			+ "0 0.01086350974940061 0.05928706879750536 add 17 " + System.lineSeparator()
			+ "0 0.00403899721450271 0.03370607212039935 add 10 " + System.lineSeparator()
			+ "0 0.00807799442904148 0.00003791058221364873 add 18 " + System.lineSeparator()
			+ "0 0.003621169916450705 0.00004460716472695663 add 18 " + System.lineSeparator()
			+ "0 0.01086350974940061 0.05928706879750536 add 17 " + System.lineSeparator()
			+ "0 0.00403899721450271 0.03370607212039935 add 10 " + System.lineSeparator()
			+ "0 0.003621169916450705 0.028543462350457422 add 11 ";

	public final static int CLASS_INDEX = 0;

}
