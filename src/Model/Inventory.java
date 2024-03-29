package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {

    // Private Members
    // ObservableList<> =  A list that allows "listeners" to track changes when they occur
    // FXCollections = A utility class that consists of static methods that are one-to-one copies of java.util.Collections methods
    // Listeners =  do some work when an event occurs. They are called as "Event Listeners". Events like click, hover
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();

    // Model.Inventory Class Methods

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

    public static Part lookupPart(int partID) {

        // Access ObservableList allParts declared above and get part by partID
        return allParts.get(partID);
    }

//    public static Model.Part lookupPart(String partName) {
//
//        return allParts.get(partName);
//    }

//    public void updatePart(int index, Model.Part part) {
//
//        return;
//    }

    public static ObservableList<Part> getAllParts() {

        // Return entire ObservableList
        return allParts;
    }

    //////////////////////
    // Products Methods //
    /////////////////////

    //////////////////////
    // Products Methods //
    /////////////////////

    public static void addProduct(Model.Product product) {

        allProducts.add(product);;
    }

//    public static lookupProduct(int productID) {
//
//        return Model.Product;
//    }

//    public static lookupProduct(String productName) {
//
//        return ObservableList<Model.Product>;
//    }

    public static ObservableList<Product> getAllProducts() {

        // Return entire ObservableList
        return allProducts;
    }






}
