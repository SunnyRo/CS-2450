/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafxapplication2.config.CarModels;

import static javafxapplication2.config.CarMakes.getCarMakeDisplayRoot;

/**
 *
 * @author plain
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane slider;

    @FXML
    private Label label;

    @FXML
    private ComboBox<String> makeCombo;
    
    @FXML
    private ComboBox<String> modelCombo;

    @FXML
    private VBox cars;

    @FXML
    private ScrollPane scroll;


    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        cars.getChildren().addAll(getCarMakeDisplayRoot().getChildren());
        cars.minWidthProperty().bind(
                Bindings.createDoubleBinding(
                        () -> scroll.getViewportBounds().getDepth(),
                        scroll.viewportBoundsProperty()
                )
        );

        slider.getChildren().addAll(CarSlideShow.get().getChildren());

        makeCombo.setItems(CarModels.getMakes());

        makeCombo.setOnAction(e -> modelCombo.setItems(CarModels.getModels(makeCombo.getSelectionModel().getSelectedItem())));
    }    
    
}
