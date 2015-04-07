import java.util.ArrayList;
import java.util.List;


public class CriteriaWarrior  implements Criteria{

	@Override
	public List<Character> newCriteria(List<Character> characters) {
		List<Character> warriorCharacters = new ArrayList<Character>();
		
		for(Character c : characters){
			if(c.getProfession().equalsIgnoreCase("WARRIOR")){
				warriorCharacters.add(c);
			}
		}
		return warriorCharacters;
	}
}
