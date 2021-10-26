package samplePrograms;

public class ReverseStringWithoutUsingStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Automation";

		StringBuilder strbuild = new StringBuilder();
		strbuild.append(str);

		strbuild = strbuild.reverse();
		System.out.println(strbuild);

	}

}
