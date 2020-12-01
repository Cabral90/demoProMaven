package es.demojavafx.demomvnfx;

import java.io.IOException;


import javafx.fxml.FXML;

public class PrimaryController {
	Sampler smp = new Sampler();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    	
    	//smp.start(App.setRoot("secondary"));
    	
    	
    }
}
