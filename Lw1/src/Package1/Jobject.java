package Package1;

public abstract class Jobject implements Amount{
    protected String pName; //Название продукта
    protected String pType; //Тип продукта
    protected int pPrice;
    private int amount = 0;

    public Jobject() {
        pName = new String();
        pType = new String();
        pPrice = 0;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public void setAm(int amount) {
        this.amount = amount;
    }

    public int getpPrice() {
        return pPrice;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        String str = new String();
        str = pName+"_"+pType+"_цена"+pPrice+" byn";
        return str;
    }

    @Override
    public int Amount(int a) {
        return 0;
    }
}
