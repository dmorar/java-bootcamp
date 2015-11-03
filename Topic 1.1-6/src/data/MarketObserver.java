package data;

public class MarketObserver {

	static int observerID = 0;
	int ID;

	public MarketObserver() {
		ID = observerID;
		observerID++;
	}

	public void doNotify(Transaction trans) {
		System.out.println("mail sent to Market Manager N�" + ID + "\n" + trans);

	}

	public void doNotify(Item item) {
		System.out.println("mail sent to Market Manager N�" + ID + "\n" + "modified item: \n" + item);

	}
}
