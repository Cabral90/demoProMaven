module es.demojavafx.demomvnfx {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;
	requires org.kordamp.bootstrapfx.core;
	requires javafx.graphics;

    opens es.demojavafx.demomvnfx to javafx.fxml;
    exports es.demojavafx.demomvnfx;
}