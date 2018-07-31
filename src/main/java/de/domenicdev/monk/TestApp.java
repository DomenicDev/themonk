package de.domenicdev.monk;

import com.jme3.app.SimpleApplication;
import com.jme3.scene.Spatial;

public class TestApp extends SimpleApplication {

    public static void main(String[] args) {
        new TestApp().start();
    }

    @Override
    public void simpleInitApp() {
        Spatial scene = assetManager.loadModel("Models/Model1.j3o");
        rootNode.attachChild(scene);
    }
}
