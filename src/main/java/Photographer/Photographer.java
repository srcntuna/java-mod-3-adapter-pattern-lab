package Photographer;

import Camera.Camera;
import Camera.CameraFactory;
import Camera.DigitalCamera;

public class Photographer implements  PhotoOperation{
    private Camera traditionalCamera;

    private DigitalCamera digitalCamera;

    public Photographer(CameraFactory.CameraManufacturer cameraManufacturer) {
     this.traditionalCamera = CameraFactory.makeCamera(cameraManufacturer);
     this.digitalCamera = new DigitalCamera(this.traditionalCamera);
    }

    @Override
    public void takePhotograph(double shutterSpeed) {

        traditionalCamera.takePhotograph(shutterSpeed);
        digitalCamera.takePhotograph(shutterSpeed);

    }
}
