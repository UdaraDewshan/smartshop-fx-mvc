package controller;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;

public class WelcomePageController {

    @FXML
    private Button btnGo;

    @FXML
    public void initialize() {
        addButtonHoverAnimation();
    }

    @FXML
    private void handleGoAction() {

        ScaleTransition st = new ScaleTransition(Duration.millis(150), btnGo);
        st.setFromX(1.0);
        st.setFromY(1.0);
        st.setToX(0.90);
        st.setToY(0.90);
        st.setAutoReverse(true);
        st.setCycleCount(2);
        st.play();

    }

    private void addButtonHoverAnimation() {

        btnGo.setOnMouseEntered(e -> {
            ScaleTransition st = new ScaleTransition(Duration.millis(150), btnGo);
            st.setToX(1.12);
            st.setToY(1.12);
            st.play();
        });

        btnGo.setOnMouseExited(e -> {
            ScaleTransition st = new ScaleTransition(Duration.millis(150), btnGo);
            st.setToX(1.0);
            st.setToY(1.0);
            st.play();
        });
    }
}
