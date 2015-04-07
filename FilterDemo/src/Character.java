
public class Character {

	private String nickname;
	private String gender;
	private String race;
	private String profession;
	
	public Character(String nickname, String gender, String race, String profession){
		this.nickname = nickname;
		this.gender = gender;
		this.race = race;
		this.profession = profession;
	}

	public String getNickname() {
		return nickname;
	}

	public String getGender() {
		return gender;
	}

	public String getRace() {
		return race;
	}

	public String getProfession() {
		return profession;
	}
	
 
}
