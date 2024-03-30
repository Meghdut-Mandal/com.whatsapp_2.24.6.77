package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces;

public class FaceTrackerDataProviderConfig {
    public final int executionMode = 0;
    public final int frameProcessorDelayTolerance = 30000;
    public final int frameProcessorTimeToLive = 15000;
    public final int frameProcessorWaitTimeout = 70000;
    public final boolean useLazyFaceTracker = false;
    public final boolean useSynchronousFaceTracker = false;

    public int getExecutionMode() {
        return this.executionMode;
    }

    public boolean getUseLazyFaceTracker() {
        return this.useLazyFaceTracker;
    }

    public boolean getUseSynchronousFaceTracker() {
        return this.useSynchronousFaceTracker;
    }
}
