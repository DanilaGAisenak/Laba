package Package1;

public class Tires extends Jobject {
	protected String manufacturer;
	protected String speedIndex;
	protected int amount = 0;
	public Tires(){
		this.manufacturer = new String();
		this.speedIndex = new String();
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setSpeedIndex(String speedIndex) {
		this.speedIndex = speedIndex;
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
		str = super.toString()+"_Производитель_"+manufacturer+"_Индекс скорости_"+speedIndex;
		return str;
	}
	@Override
	public int hashCode(){
		return amount;
	}
}