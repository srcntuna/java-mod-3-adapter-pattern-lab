import Camera.Camera;
import Photographer.Photographer;
import Camera.CameraFactory;
public class PhotoStudio {
    public static void main(String[] args) {
        // your code here
        Photographer sercan = new Photographer(CameraFactory.CameraManufacturer.CANON_FILM);
        sercan.takePhotograph(100.0);

    }
}
