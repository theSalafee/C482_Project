public class InHouse extends Part {

    // Private class member
    private int machineID;

    // Constructor
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineID ){

        super(id, price, stock, min, max, name);

        this.id = id;
        this.name = name;
        this.price = price;
        this.min = min;
        this.max = max;
        this.machineID = machineID;
    }

    // Getter
    public int getMachineID() {
        return machineID;
    }

    //Setter
    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }



}
