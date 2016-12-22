package ICCharger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class ShopCharger {
	private static final int PRINT_NUMBER = 5;
	
	private StudentCard insertedStudentCard; /* 挿入されている学生証 */
	private int ID;	/* 次に発行する履歴ID */
	private ArrayList<HashMap<String, String>> history; /* チャージ履歴 */
	
	/* 挿入されている学生証の情報を表示する */
	private void printAccountBalance() {
		System.out.println("Student Name : " + insertedStudentCard.getName());
		System.out.println("Balance      : " + insertedStudentCard.getBalance());
		System.out.println();
	}
	
	/* 現在の日付を取得して，文字列として返す */
	private String getDate() {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.getMaximum(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
		
		return "" + year + "年" + month + "月" + day + "日";
	}
	
	public ShopCharger() {
		insertedStudentCard = null;
		ID = 0;
		history = new ArrayList<HashMap<String, String>>();
	}
	
	/* 学生証の挿入 */
	public void insertStudentCard(StudentCard studentCard) {
		insertedStudentCard = studentCard;
	}
	
	/* チャージ */
	public void chargeMoney(int money) {
		/* 学生証が挿入されていないときは何もしない */
		if (insertedStudentCard == null) {
			System.out.println("学生証が挿入されていません");
			return;
		}
		insertedStudentCard.setBalance(insertedStudentCard.getBalance() + money);
		printAccountBalance();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("history_id", "" + ID++);
		map.put("student_id", "" + insertedStudentCard.getID());
		map.put("time", getDate());
		map.put("balance", "" + insertedStudentCard.getBalance());
		history.add(map);
	}

	/* 最新チャージ日時を表示する */
	public void printChargeHistory() {
		int idx = history.size() - PRINT_NUMBER;
		if (idx < 0)
			idx = 0;
		for (; idx < history.size(); idx++) {
			HashMap<String, String> map = history.get(idx);
			System.out.println("[履歴ID : " + map.get("history_id") + "]");
			System.out.println("ユーザID : " + map.get("student_id"));
			System.out.println("日時 : " + map.get("time"));
			System.out.println("残高 : " + map.get("balance"));
			System.out.println();
		}
	}
}
