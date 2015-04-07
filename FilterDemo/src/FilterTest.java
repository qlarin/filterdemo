import java.util.ArrayList;
import java.util.List;


public class FilterTest {

	public static void main(String[] args) {
		List<Character> characters = new ArrayList<Character>();
		
		characters.add(new Character("Pinguu", "Male", "Human", "Mage"));
		characters.add(new Character("Quiv", "Male", "Elf", "Mage"));
		characters.add(new Character("Lys", "Female", "Elf", "Warrior"));
		characters.add(new Character("Elizabeth", "Female", "Human", "Mage"));
		
		
		Criteria humans = new CriteriaHuman();
		Criteria mages = new CriteriaMage();

		Criteria humanMage = new AndCriteria(humans, mages);
		
		System.out.println("Human mages: ");
		show(humanMage.newCriteria(characters));
		
		System.out.println("Mages: ");
		show(mages.newCriteria(characters));
	}

	public static void show(List<Character> characters){
		for(Character c : characters){
			System.out.println("[ " + c.getNickname() + ", " + c.getGender() + ", " + c.getRace() + ", " + c.getProfession() + " ]");
		}
	}
}