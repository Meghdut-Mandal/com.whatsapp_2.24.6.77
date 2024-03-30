package X;

/* renamed from: X.91H  reason: invalid class name */
public enum AnonymousClass91H implements C22899AyB {
    UNKNOWN_APP(0),
    OTA(1),
    BUG_REPORTER(2),
    LIVE_STREAMING(3),
    VIDEO_CALLING(4),
    MEDIA_IMPORT(5),
    CLOUD_CONFIGURATION(6),
    CAPTURE(7),
    ASSISTANT(8),
    PHONE_CALL(9),
    AUDIO_PLAYBACK(10),
    SHARING(11),
    CONVERSATION_FOCUS(12),
    PAIRING(13),
    APP_MANAGER(14),
    BT_MESSAGING(15),
    AUDIO_DATA_COLLECTION(16),
    VERIFIED_SESSIONS(17),
    AUTOCAPTURE(18),
    WIFI(19),
    CLOUD_OTA(20),
    CAPTURE_VIDEO(21),
    HEARING(22),
    MEDIA_PROCESSING(23),
    LOCATION_SERVICE(24),
    SG_ML_RUNTIME(25),
    WIRELESS_INSIGHT_NON_APP(101),
    RETAIL_DEMO_PLAYBACK(501),
    EXAMPLE(1001),
    TEST1(1002),
    CONSTELLATION_MEDIA_CAPTURE(2001),
    EXTERNAL_DEVICE_INTERFACE(2002),
    AI_MEMORY_ASSISTANT(2003),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    AnonymousClass91H(int i) {
        this.value = i;
    }

    public static AnonymousClass91H A00(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_APP;
            case 1:
                return OTA;
            case 2:
                return BUG_REPORTER;
            case 3:
                return LIVE_STREAMING;
            default:
                return VIDEO_CALLING;
        }
    }
}
