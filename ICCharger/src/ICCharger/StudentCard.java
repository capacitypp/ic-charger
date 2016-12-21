package ICCharger;

import java.util.ArrayList;

public class StudentCard {
	private static ArrayList<StudentCard> studentCardList_ = new ArrayList<StudentCard>();
	
	private int ID;
	private String name;
	private int balance;

	public StudentCard(int ID, String name, int balance) {
		this.ID = ID;
		this.name = name;
		this.balance = balance;
		studentCardList_.add(this);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
