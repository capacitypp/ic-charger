package ICCharger;

public class MainShopCharger {
	public static void main(String[] args) {
		StudentCard[] studentCards = new StudentCard[2];
		studentCards[0] = new StudentCard(12345, "hello", 54321);
		studentCards[1] = new StudentCard(67890, "world", 9876);
		
		ShopCharger shopCharger = new ShopCharger();
		shopCharger.chargeMoney(1000);
		
		shopCharger.insertStudentCard(studentCards[0]);
		shopCharger.chargeMoney(1000);
		
		shopCharger.insertStudentCard(studentCards[1]);
		shopCharger.chargeMoney(2000);
	}
}
