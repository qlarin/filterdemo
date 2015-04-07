import java.util.ArrayList;
import java.util.List;


public class CriteriaElf implements Criteria{

	@Override
	public List<Character> newCriteria(List<Character> characters) {
		List<Character> elfCharacters = new ArrayList<Character>();
		
		for(Character c : characters){
			if(c.getRace().equalsIgnoreCase("ELF")){
				elfCharacters.add(c);
			}
		}
		return elfCharacters;
	}
}
