import java.util.List;


public class AndCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria){
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Character> newCriteria(List<Character> characters) {

		List<Character> firstCriteria = criteria.newCriteria(characters);
		return otherCriteria.newCriteria(firstCriteria);
	}
}
