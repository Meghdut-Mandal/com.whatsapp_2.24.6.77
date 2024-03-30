package X;

/* renamed from: X.913  reason: invalid class name */
public enum AnonymousClass913 implements C22899AyB {
    NONE(0),
    PHONE_SCREEN_OFF(1),
    STREAM_STARTING(2),
    STREAM_STARTED(3),
    STREAM_PAUSE(4),
    STREAM_RESUME(5),
    STREAM_ENDS(6),
    STREAM_ERROR(7),
    TOGGLE_TO_PHONE(8),
    TOGGLE_TO_SG(9),
    PHONE_SCREEN_ON(10),
    PROMPT_DOUBLE_CAPTURE_PRESS(11),
    STREAM_ENDING(12),
    TOGGLE_TO_SG_PRE_LIVE(13),
    TOGGLE_TO_SG_WHILE_LIVE(14),
    STREAM_BROADCASTING(15),
    PHONE_VIDEO_OFF(16),
    PHONE_SCREEN_OFF_PRE_LIVE(17),
    PROMPT_PHONE_VIDEO_OFF_ERROR(18),
    PROMPT_GENERIC_ERROR(19),
    PROMPT_VIDEO_CAPTURE_USER_ED(20),
    PROMPT_PHOTO_CAPTURE_USER_ED(21),
    PHOTO_CAPTURED(22),
    PROMPT_PREVIEWING_FROM_GLASSES(23),
    PROMPT_SWITCH_TO_GLASSES_CAPTURE_USER_ED(24),
    PROMPT_ENABLE_PERMISSIONS_ERROR(25),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    AnonymousClass913(int i) {
        this.value = i;
    }
}
