module es.aketzagonzalez {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens es.aketzagonzalez.aeropuertosN to javafx.fxml;
    exports es.aketzagonzalez.aeropuertosN;
}