package sample;

import javafx.scene.layout.Pane;

public class PeaShooter extends Shooter{
//    String path="./assets/peashooter.png";
    public PeaShooter(int x, int y, Pane pane) {
        super(x, y, "file:src/sample/assets/peashooter.gif", pane, 7,60,62);
    }

}