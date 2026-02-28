package seleniumPractice;

import org.apache.commons.lang3.RandomStringUtils;

public class TestingclassCommanMethods {

	public static void main(String[] args) {
		
		TestingclassCommanMethods abc=new TestingclassCommanMethods();
		System.out.println(abc.randomString());	
		
		System.out.println(abc.randomNumeric());
		System.out.println(abc.randomEMAIL());
}
	public String randomString() {
		String random=RandomStringUtils.randomAlphabetic(5);
		return random;

		}
	
	public String randomNumeric() {
		String random=RandomStringUtils.randomNumeric(5);
		String k=random;
		return random+k;

		}
	public String randomEMAIL() {
		String random=RandomStringUtils.randomNumeric(5);
		String random1=RandomStringUtils.randomAlphabetic(5);
		return random+"@" +random1+".com";

		}






}
