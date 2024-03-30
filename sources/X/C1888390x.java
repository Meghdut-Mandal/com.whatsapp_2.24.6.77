package X;

/* renamed from: X.90x  reason: invalid class name and case insensitive filesystem */
public enum C1888390x implements C22899AyB {
    USER_EVENT_ACTION_NONE(0),
    USER_EVENT_ACTION_REQUEST_SG_CAMERA_ON(1),
    USER_EVENT_ACTION_SG_MEDIA_STREAM_PAUSED(2),
    USER_EVENT_ACTION_TOGGLE_CAMERA_BACKGROUND(3),
    USER_EVENT_ACTION_REQUEST_PHOTO_CAPTURE(4),
    USER_EVENT_ACTION_REQUEST_TOGGLE_VIDEO_CAPTURE(5),
    USER_EVENT_ACTION_REQUEST_MODEL_RESPONSE(6),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1888390x(int i) {
        this.value = i;
    }
}
