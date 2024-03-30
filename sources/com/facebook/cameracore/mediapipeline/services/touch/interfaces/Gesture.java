package com.facebook.cameracore.mediapipeline.services.touch.interfaces;

public abstract class Gesture {
    public final GestureState gestureState;
    public final long id;
    public final float x;
    public final float y;

    public enum GestureState {
        BEGAN,
        CHANGED,
        ENDED,
        CANCELLED,
        FAILED
    }

    public enum GestureType {
        TAP,
        PAN,
        PINCH,
        ROTATE,
        LONG_PRESS,
        RAW_TOUCH
    }

    public abstract String getGestureStateName();

    public abstract String getGestureTypeName();
}
