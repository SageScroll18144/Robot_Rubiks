package cube.language;

import java.util.ArrayList;

public class Translate {
	
	private ArrayList<String> moveComputer = new ArrayList<>();
	private ArrayList<String> moveCube = new ArrayList<>();
	private String[] languageCube = {"B'", "L", "U'", "R'", "F", "D", "B", "L'", "U", "R", "F'", "D'"};
	
	private String TranslateToComputer(String moving) {
		String now = null;
		for(int i = 0; i < languageCube.length; i++) {
			if(moving == languageCube[i] && i < languageCube.length/2) {
				now = String.valueOf(i).concat("R");
			}else if(moving == languageCube[i] && i >= languageCube.length/2) {
				now = String.valueOf(i-languageCube.length/2).concat("L");
			}
		}	
		putElementInAListToComputer(now);
		return now;
	}
	private String TranslateToCube(String moving) {
		String now = null;
		if(moving.charAt(1) == 'R') {
			now = languageCube[Character.getNumericValue(moving.charAt(0))];
		}else if(moving.charAt(1) == 'L') {
			now = languageCube[Character.getNumericValue(moving.charAt(0)) + languageCube.length/2];
		}
		putElementInAListToCube(now);
		return now;
	}
	private void putElementInAListToComputer(String moving) {
		moveComputer.add(moving);
	}
	private void putElementInAListToCube(String moving) {
		moveCube.add(moving);
	}
	public String getTranslationToComputer(String moving) {
		return TranslateToComputer(moving);
	}
	public String getTranslationToCube(String moving) {
		return TranslateToCube(moving);
	}
	public ArrayList<String> getTranslationToComputer(ArrayList<String> moving) {
		ArrayList<String> movingNow = new ArrayList<String>();
		for (String string : moving) {
			movingNow.add(TranslateToComputer(string));
		}		
		return movingNow;
	}
	public ArrayList<String> getTranslationToCube(ArrayList<String> moving) {
		ArrayList<String> movingNow = new ArrayList<String>();
		for (String string : moving) {
			movingNow.add(TranslateToCube(string));
		}		
		return movingNow;
	}
	public ArrayList<String> getMoveToComputer(){
    	return moveComputer;
    }
	public ArrayList<String> getMoveToCube(){
    	return moveCube;
    }
}
