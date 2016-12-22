package ICCharger;

import java.util.ArrayList;

public class StudentCard {
	/* インスタンス化された学生証のリスト */
	private static ArrayList<StudentCard> studentCardList_ = new ArrayList<StudentCard>();
	
	private int ID;			/* 学籍番号 */
	private String name;	/* 氏名 */
	private int balance;	/* 残高 */

	public StudentCard(int ID, String name, int balance) {
		this.ID = ID;
		this.name = name;
		this.balance = balance;
		/* 生成した学生証をデータベースに登録 */
		studentCardList_.add(this);
	}
	
	/* 以下，セッタとゲッタ */

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
