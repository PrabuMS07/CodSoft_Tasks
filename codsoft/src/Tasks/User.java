package Tasks;


public class User {
	
	String Name;
	int No_of_Attempt = 0;
	int No_of_Game_Won = 0;
	
	public User(String name) {
		this.Name = name;
	}
	public void Update (boolean Is_win) {
		No_of_Attempt++;
		if (Is_win) {
			No_of_Game_Won++;
		}
	}
	
}
