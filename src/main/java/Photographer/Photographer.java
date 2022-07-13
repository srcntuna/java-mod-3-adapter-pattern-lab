package Photographer;

import Camera.Camera;
import Camera.CameraFactory;

public class Photographer implements  PhotoOperation{
    private Camera camera;

    public Photographer(CameraFactory.CameraManufacturer cameraManufacturer) {
     this.camera = CameraFactory.makeCamera(cameraManufacturer);
    }

    @Override
    public void takePhotograph(double shutterSpeed) {
        camera.takePhotograph(shutterSpeed);
    }
}
