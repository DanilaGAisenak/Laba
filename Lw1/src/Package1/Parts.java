package Package1;

public class Parts extends Jobject {

	protected String manufacturer;
	protected boolean nds = false;//Цена с ндс?
	protected int amount = 0;
	public Parts(){
		super();
		manufacturer = new String();
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setNds() {
		this.nds = true;
	}

	protected void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public int Amount(int a){
		setAmount(a);
		super.setAm(a);
		return 0;
	}

	@Override
	public int CountSum() {
		return this.amount*pPrice;
	}

	@Override
	public String toString(){
		String str;
		str = super.toString()+"_производитель_"+manufacturer;
		str+= nds? "_Цена с НДС" : "_Цена без НДС";
		return str;
	}
}