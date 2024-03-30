package com.facebook.cameracore.mediapipeline.services.touch.interfaces;

public abstract class TouchEvent {
    public final TouchEventType eventType;
    public final long id;
    public final long time;
    public final float x;
    public final float y;

    public enum TouchEventType {
        DOWN,
        UP,
        MOVE,
        CANCEL
    }

    public abstract String getTouchEventTypeName();
}
