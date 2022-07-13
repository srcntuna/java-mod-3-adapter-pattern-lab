package Camera.Nikon;

import Camera.Camera;
import Camera.FilmOperations;
import Camera.ShutterOperations;
import Camera.MirrorOperations;

public class NikonCamera extends Camera {

    public NikonCamera(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        super(filmOps, shutterOps, mirrorOps);
    }

    @Override
    public String getName() {
        return "Nikon";
    }
}
