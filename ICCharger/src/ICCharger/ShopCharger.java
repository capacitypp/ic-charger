package ICCharger;

import java.util.Calendar;

public class ShopCharger {
	private StudentCard insertedStudentCard; /* 挿入されている学生証 */
	private String lastChargeDate;	/* 最新チャージ年月日 */
	
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
		lastChargeDate = "";
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
		/* 最新チャージ日時の保存 */
		lastChargeDate = getDate();
	}

	/* 最新チャージ日時を表示する */
	public void printLastChargeDate() {
		System.out.println("最新チャージ日時 : " + lastChargeDate);
	}
}
