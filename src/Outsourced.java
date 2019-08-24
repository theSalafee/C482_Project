public class Outsourced extends Part{

    private String companyName;

    public Outsourced(int id, double price, int stock, int min, int max, String name, String companyName) {
        super(id, price, stock, min, max, name);
        this.companyName = companyName;

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
