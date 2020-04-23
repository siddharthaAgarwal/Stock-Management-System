package stock_management_system;


public class Stock {
	
	Item item;
	int min;
	int qty;
	
	public Stock (Item item,int qty, int min)
	{
		this.item=item;
		this.min=min;
		this.qty=qty;
	}

}
