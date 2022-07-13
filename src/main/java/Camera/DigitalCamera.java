package Camera;

import Logger.Logger;

public class DigitalCamera implements CameraAdapter {

    private Camera traditionalCamera;

    public DigitalCamera(Camera traditionalCamera) {
        this.traditionalCamera = traditionalCamera;
    }


    @Override
    public void takePhotograph(double shutterSpeed) {

        Logger.getInstance().log(traditionalCamera.getName() + "is taking a photograph");

        System.out.println("No FILM since it is a digitalCamera");

        traditionalCamera.getMirrorOps().openMirror();;

        traditionalCamera.getShutterOps().setShutterSpeedSetting(shutterSpeed);
        traditionalCamera.getShutterOps().initializeShutter();
        traditionalCamera.getShutterOps().activateShutter();
        traditionalCamera.getShutterOps().releaseShutter();

        traditionalCamera.getMirrorOps().closeMirror();

        Logger.getInstance().log(traditionalCamera.getName() + " is done taking this photograph");


    }
}
