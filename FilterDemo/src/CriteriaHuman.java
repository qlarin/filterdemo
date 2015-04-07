import java.util.ArrayList;
import java.util.List;


public class CriteriaHuman implements Criteria {

	@Override
	public List<Character> newCriteria(List<Character> characters) {
		List<Character> humanCharacters = new ArrayList<Character>();
		
		for(Character c : characters){
			if(c.getRace().equalsIgnoreCase("HUMAN")){
				humanCharacters.add(c);
			}
		}
		return humanCharacters;
	}	
}
