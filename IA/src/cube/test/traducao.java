package cube.test;

import cube.language.Translate;

public class traducao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Translate t = new Translate();
		String a = "B";
		System.out.println(t.getTranslationToComputer(a));
		System.out.println(t.getMoveToComputer());
		System.out.println(t.getTranslationToCube("2R"));
		System.out.println(t.getMoveToCube());
	}

}
