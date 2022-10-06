package Package1;

import java.util.ArrayList;
import java.util.Iterator;

public class Order implements AddToBill, Amount {
	private ArrayList<Jobject> list;
	private int price;
	private int amount;
	private static int number = 0;

	public Order(){
		list = new ArrayList<Jobject>();
		number+=1;
	}

	public void add(Jobject obj){ list.add(obj); }
	@Override
	public String Add(String a){
		Iterator it = list.iterator();
		Jobject obj;
		while(it.hasNext()){
			obj = (Jobject)it.next();
			a+=obj.toString();
		}
		return a;
	}

	@Override
	public int Amount(int a){
		int tempAmount = 0;
		Iterator it = list.iterator();
		Jobject obj;
		while(it.hasNext()){
			obj = (Jobject)it.next();
			tempAmount+=obj.getAmount();
		}
		amount = tempAmount*a;
		return tempAmount*a;
	}

	@Override
	public int CountSum() {
		int tempPrice = 0;
		Iterator it = list.iterator();
		Jobject obj;
		while(it.hasNext()){
			obj = (Jobject)it.next();
			tempPrice+=obj.getpPrice();
		}
		price = tempPrice;
		return tempPrice;
	}

	@Override
	public String toString() {
		String str = new String();
		Iterator it = list.iterator();
		while (it.hasNext()){
			str+=it.next().toString();
			str+="\n";
		}
		return str;
	}
}