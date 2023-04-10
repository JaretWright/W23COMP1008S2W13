module com.example.w23comp1008s2w13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w23comp1008s2w13 to javafx.fxml;
    exports com.example.w23comp1008s2w13;
}