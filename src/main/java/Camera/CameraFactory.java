package Camera;

import Camera.Canon.CanonCamera;
import Camera.Canon.CanonFilm;
import Camera.Canon.CanonMirror;
import Camera.Canon.CanonShutter;
import Camera.Nikon.NikonCamera;
import Camera.Nikon.NikonFilm;
import Camera.Nikon.NikonMirror;
import Camera.Nikon.NikonShutter;

public class CameraFactory {
    public enum CameraManufacturer{
        NIKON_FILM("Nikon Film"),
        CANON_FILM("Canon Film");

        String name;

        private CameraManufacturer(String name) {
            this.name = name;
        }
    }

    public static Camera makeCamera(CameraManufacturer manufacturer) {
        if (manufacturer == CameraManufacturer.NIKON_FILM) {
            return new NikonCamera(new NikonFilm(), new NikonShutter(), new NikonMirror());
        } else if (manufacturer == CameraManufacturer.CANON_FILM) {
            return new CanonCamera(new CanonFilm(), new CanonShutter(), new CanonMirror());
        }

        return null;
    }
}
