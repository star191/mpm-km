package noppes.mpm.client.MCALibrary.animation;

import noppes.mpm.client.MCALibrary.MCAModelRenderer;

import java.util.HashMap;

public class CustomChannel extends Channel {

    public CustomChannel(String _name) {
        super(_name);
        this.mode = Channel.Mode.CUSTOM;
    }

    @Override
    protected void initializeAllFrames() {
    }

    @Override
    public KeyFrame getPreviousRotationKeyFrameForBox(String boxName, float currentFrame) {
        return null;
    }

    @Override
    public KeyFrame getNextRotationKeyFrameForBox(String boxName, float currentFrame) {
        return null;
    }

    @Override
    public KeyFrame getPreviousTranslationKeyFrameForBox(String boxName, float currentFrame) {
        return null;
    }

    @Override
    public KeyFrame getNextTranslationKeyFrameForBox(String boxName, float currentFrame) {
        return null;
    }

    @Override
    public int getKeyFramePosition(KeyFrame keyFrame) {
        return -1;
    }

    /**
     * Write the actual behaviour of this custom animation here. It will called every tick until the animation is active.
     */
    public void update(HashMap<String, MCAModelRenderer> parts, AnimationHandler animationHandler) {
        //This must be filled in the actual custom channels!
    }
}
