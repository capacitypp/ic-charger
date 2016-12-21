package ICCharger;

public class ShopCharger {
	private StudentCard insertedStudentCard;
	
	private void printAccountBalance() {
		System.out.println("Student Name : " + insertedStudentCard.getName());
		System.out.println("Balance      : " + insertedStudentCard.getBalance());
		System.out.println();
	}
	
	public ShopCharger() {
		insertedStudentCard = null;
	}
	
	public void insertStudentCard(StudentCard studentCard) {
		insertedStudentCard = studentCard;
	}
	
	public void chargeMoney(int money) {
		if (insertedStudentCard == null) {
			System.out.println("学生証が挿入されていません");
			return;
		}
		insertedStudentCard.setBalance(insertedStudentCard.getBalance() + money);
		printAccountBalance();
	}
}
