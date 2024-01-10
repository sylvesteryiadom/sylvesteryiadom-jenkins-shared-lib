module com.example.jenkinssharedlib {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.groovy;


    opens com.example.jenkinssharedlib to javafx.fxml;
    exports com.example.jenkinssharedlib;
}