package ICCharger;

public class MainShopCharger {
	public static void main(String[] args) {
		/* 学生証を2つインスタンス化する */
		StudentCard[] studentCards = new StudentCard[2];
		studentCards[0] = new StudentCard(12345, "hello", 54321);
		studentCards[1] = new StudentCard(67890, "world", 9876);
		
		/* チャージ機を2つインスタンス化する */
		ShopCharger[] shopChargers = new ShopCharger[2];
		for (int i = 0; i < shopChargers.length; i++)
			shopChargers[i] = new ShopCharger();
		
		/* 学生証を挿入していない状態でチャージを試みる */
		shopChargers[0].chargeMoney(1000);
		
		for (int i = 0; i < shopChargers.length; i++) {
			ShopCharger shopCharger = shopChargers[i];
			/* 1枚目の学生証を挿入 */
			shopCharger.insertStudentCard(studentCards[i]);	
			/* 10回チャージを行う */
			for (int j = 0; j < 10; j++)
				shopCharger.chargeMoney(j * 100);
			/* 最新チャージ履歴を表示 */
			shopCharger.printChargeHistory();
		}
	}
}
