package javafxapplication2;


import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarSlideShow {
    private static final String PATH_FORMAT = "slides/%s.png";

    private static final List<String> files = List.of(
            "Acura-1",
            "Acura-2",
            "Acura-3",
            "Audi-1",
            "BMW-1",
            "BMW-2",
            "FIAT-1",
            "Lexus-1",
            "Lexus-2",
            "MINI-1",
            "Romeo-1",
            "Volkswagen-1"
    );

    private static final List<String> paths = files.stream().map(f -> String.format(PATH_FORMAT, f)).collect(Collectors.toList());

    private final StackPane root = new StackPane();
    private final List<ImageView> slides = new ArrayList<>();

    public CarSlideShow(){
        init();
        start();
    }

    public Pane getRoot(){ return root; }

    private void init(){
        for(String path : paths){
            try {
                slides.add(new ImageView(new Image(new FileInputStream(path))));
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        for(ImageView slide : slides){
            slide.setFitHeight(100 * 3);
            slide.setFitWidth(170 * 3);
            slide.setPreserveRatio(true);
        }
    }

    public void start(){
        SequentialTransition slideshow = new SequentialTransition();
        slideshow.setCycleCount(Animation.INDEFINITE);

        Collections.shuffle(slides);

        for(ImageView slide : slides){
            SequentialTransition sequentialTransition = new SequentialTransition();

            FadeTransition fadeIn = getFadeTransition(slide, 0.0, 1.0);
            PauseTransition stayOn = new PauseTransition(Duration.millis(2000));
            FadeTransition fadeOut = getFadeTransition(slide, 1.0, 0.0);

            sequentialTransition.getChildren().addAll(fadeIn, stayOn, fadeOut);
            slide.setOpacity(0);
            root.getChildren().add(slide);
            slideshow.getChildren().add(sequentialTransition);
        }

        slideshow.play();
    }

    private FadeTransition getFadeTransition(ImageView imageView, double fromValue, double toValue) {
        FadeTransition ft = new FadeTransition(Duration.millis(2000), imageView);
        ft.setFromValue(fromValue);
        ft.setToValue(toValue);

        return ft;
    }

    public static Pane get(){
        return new CarSlideShow().getRoot();
    }


}
