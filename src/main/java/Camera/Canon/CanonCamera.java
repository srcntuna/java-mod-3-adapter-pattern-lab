package Camera.Canon;

import Camera.Camera;
import Camera.FilmOperations;
import Camera.ShutterOperations;
import Camera.MirrorOperations;
public class CanonCamera extends Camera {

    public CanonCamera(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        super(filmOps, shutterOps, mirrorOps);
    }

    @Override
    public String getName() {
        return "Canon";
    }
}
