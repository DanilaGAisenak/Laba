package Package1;

import java.util.ArrayList;
import java.util.Iterator;

public class CashMachine implements Discount, PrintBill, AddToBill {

	ArrayList<Order>list;
	protected int price;
	public CashMachine() {
		list = new ArrayList<Order>();
	}

	public int getPrice() {
		return price;
	}

	public void add(Order obj){
		list.add(obj);
	}

	public String print(){
		Iterator it = list.iterator();
		String str = "В заказе:\n";
		while(it.hasNext()){
			str+=it.next().toString();
		}
		return str;
	}

	@Override
	public String Add(String a) {
		return "";
	}


	@Override
	public int Discount(int a) {
		return price - (price*a%100);
	}

	@Override
	public void Print() {
		Iterator it = list.iterator();
		String str = "В заказе:\n";
		while(it.hasNext()){
			System.out.println(str+=it.next().toString());
		}
	}

	@Override
	public int CountSum() {
		int tempPrice = 0;
		Iterator it = list.iterator();
		Order obj;
		while(it.hasNext()){
			obj = (Order)it.next();
			tempPrice+=obj.CountSum();
		}
		price = tempPrice;
		return tempPrice;
	}
}