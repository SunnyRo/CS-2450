package javafxapplication2.model;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class CarMake implements Comparable<CarMake> {
    private static final String SEE_ALL_BUTTON_TEXT_FORMAT = "See All %s Models";

    private final String name;
    private final ImageView image;
    private final ImageView logo;
    private final String description;
    private final Button button;


    public CarMake(String name, ImageView image, ImageView logo, String description) {
        this.name = name;
        this.image = image;
        this.logo = logo;
        this.description = description;


        this.image.setFitHeight(120);
        this.image.setFitWidth(170);
        this.image.setPickOnBounds(true);
        this.image.setPreserveRatio(true);

        this.logo.setFitHeight(120);
        this.logo.setFitWidth(170);
        this.logo.setPickOnBounds(true);
        this.logo.setPreserveRatio(true);

        this.button = new Button(String.format(SEE_ALL_BUTTON_TEXT_FORMAT, this.name));
        this.button.setTextFill(Paint.valueOf("#4667e1"));
        this.button.setStyle(
                "-fx-background-color: transparent;"
        );
    }

    public CarMake(String name, Image image, Image logo, String description) {
        this(name, new ImageView(image), new ImageView(logo), description);
    }

    public CarMake(String name, InputStream image, InputStream logo, String description) {
        this(
                name,
                new Image(image),
                new Image(logo),
                description
        );
    }

    public static CarMake of(String name, String image, String logo, String description){
        try {
            return new CarMake(name, new FileInputStream(image), new FileInputStream(logo), description);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public String getName(){ return name; }

    public Pane getContainer(){
        Label descriptionLabel = new Label(description);
        descriptionLabel.setWrapText(true);


        VBox container = new VBox(
                5,
                image,
                new Separator(),
                logo,
                new Separator(),
                descriptionLabel,
                button
        );

        container.setStyle(
                "-fx-padding: 5;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: black;" +
                "-fx-background-color: white;"
        );


        container.setAlignment(Pos.CENTER);
        container.setMaxHeight(450);
        container.setMaxWidth(215);


        return container;
    }


    @Override
    public int compareTo(CarMake carMake) {
        return name.compareToIgnoreCase(carMake.getName());
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj.getClass()  != getClass()){
            return false;
        }

        CarMake other = (CarMake) obj;

        return Objects.equals(this.name, other.name)
                && Objects.equals(this.image, other.image)
                && Objects.equals(this.logo, other.logo)
                && Objects.equals(this.description, other.description)
                && Objects.equals(this.button, other.button);
    }


    @Override
    public int hashCode(){
        return Objects.hash(name, image, logo, description, button);
    }

}
