import Camera.Camera;
import Photographer.Photographer;
import Camera.CameraFactory;
public class PhotoStudio {
    public static void main(String[] args) {
        // your code here

        CameraFactory.CameraManufacturer canon = CameraFactory.CameraManufacturer.CANON_FILM;

        Photographer sercan = new Photographer(canon);
        sercan.takePhotograph(100.0);

    }
}
