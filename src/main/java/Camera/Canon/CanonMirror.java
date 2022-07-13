package Camera.Canon;

import Camera.MirrorOperations;
import Logger.Logger;
public class CanonMirror implements MirrorOperations {
    @Override
    public void openMirror() {
        Logger.getInstance().log((getName() + " is open"));

    }

    @Override
    public void closeMirror() {
        Logger.getInstance().log((getName() + " is closed"));

    }

    @Override
    public String getName() {
        return "Canon Mirror";
    }
}
