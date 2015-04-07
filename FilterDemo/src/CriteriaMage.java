import java.util.ArrayList;
import java.util.List;


public class CriteriaMage implements Criteria {

	@Override
	public List<Character> newCriteria(List<Character> characters) {
		List<Character> mageCharacters = new ArrayList<Character>();
		
		for(Character c : characters){
			if(c.getProfession().equalsIgnoreCase("MAGE")){
				mageCharacters.add(c);
			}
		}
		return mageCharacters;
	}
}
