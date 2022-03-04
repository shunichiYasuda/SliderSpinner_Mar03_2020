module com.GenSci.tools.sliderspinner {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens com.GenSci.tools.sliderspinner to javafx.fxml;
    exports com.GenSci.tools.sliderspinner;
}
