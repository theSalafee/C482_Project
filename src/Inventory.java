import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {

    // Private Members
    // ObservableList<> =  A list that allows "listeners" to track changes when they occur
    // FXCollections = A utility class that consists of static methods that are one-to-one copies of java.util.Collections methods
    // Listeners =  do some work when an event occurs. They are called as "Event Listeners". Events like click, hover
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();

    // Inventory Class Methods

    ///////////////////
    // Parts methods //
    ///////////////////

    public static void addPart(Part part) {

        // Access ObservableList allparts declared above and add a part
        allParts.add(part);
    }

    public static void deletePart(Part part) {

        // Access ObservableList allParts declared above and delete a part
        allParts.remove(part);
    }

//    public lookupPart(int partID) {
//
//        // Access ObservableList allParts declared above and get part by partID
//        allParts.get(partID);
//    }

//    public lookupPart(String partName) {
//
//        return ObservableList<Part>;
//    }

//    public void updatePart(int index, Part part) {
//
//        return;
//    }


//    public getAllParts() {
//
//
//    }

    //////////////////////
    // Products Methods //
    /////////////////////

//    public void addProduct(Product product) {
//
//        return;
//    }

//    public lookupProduct(int productID) {
//
//        return Product;
//    }

//    public lookupProduct(String productName) {
//
//        return ObservableList<Product>;
//    }




}
