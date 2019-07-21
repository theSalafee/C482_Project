import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {

    // Private Members
    // ObservableList<> =  A list that allows "listeners" to track changes when they occur
    // FXCollections = A utility class that consists of static methods that are one-to-one copies of java.util.Collections methods
    // Listeners =  do some work when an event occurs. They are called as "Event Listeners". Events like click, hover
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();


}
