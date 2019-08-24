public class InHouse extends Part {

    // Private class member
    private int machineID;

    // Constructor
    public InHouse(int id, double price, int stock, int min, int max, String name, int machineID) {
        super(id, price, stock, min, max, name);
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
