package com.example.demo4;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {
    //Разные картинки, если верить image

    public ImageView view;
    public Collection coll=new Collection("bmp");
    public Iterator iter= coll.getIterator();
    public Timeline timeline=new Timeline();
   // timeline.setCycleCount(Timeline.INDEFINITE);
   // timeline.getKeyFrames().add(new KeyFrame (new Duration(1000), new EvHandler()))
    @FXML
    protected void onLeft()
    {
      //  FileChooser fileChooser = new FileChooser();

      //  fileChooser.setTitle("Сохранение файла....");

       // fileChooser.ExtensionFilter("Изображение", "*.bmp"));

     //   File file = fileChooser.showOpenDialog(view.getScene().getWindow());
        Image name=(Image)iter.preview();
        view.setImage(name); //внутри name
        System.out.println(name.toString());


    }

    @FXML
    protected void onRight()
    {
        Image name=(Image)iter.next();
        view.setImage(name); //внутри name
        System.out.println(name.toString());
    }
}