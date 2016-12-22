package ICCharger;

public class MainShopCharger {
	public static void main(String[] args) {
		/* 学生証を2つインスタンス化する */
		StudentCard[] studentCards = new StudentCard[2];
		studentCards[0] = new StudentCard(12345, "hello", 54321);
		studentCards[1] = new StudentCard(67890, "world", 9876);
		
		/* チャージ機のインスタンス化 */
		ShopCharger shopCharger = new ShopCharger();
		
		/* 学生証を挿入していない状態でチャージを試みる */
		shopCharger.chargeMoney(1000);
		
		/* 1枚目の学生証を挿入してチャージ */
		shopCharger.insertStudentCard(studentCards[0]);
		shopCharger.chargeMoney(1000);
		
		/* 2枚目の学生証を挿入してチャージ */
		shopCharger.insertStudentCard(studentCards[1]);
		shopCharger.chargeMoney(2000);
		
		/* 最新チャージ年月日を表示 */
		shopCharger.printLastChargeDate();
	}
}
