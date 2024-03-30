package X;

/* renamed from: X.905  reason: invalid class name */
public enum AnonymousClass905 {
    INPUT_PREVIEW(true, false, true),
    INPUT_PREVIEW_SIZE(true, true, false),
    INPUT_FACING(true, true, false),
    INPUT_ROTATION(true, true, false),
    INPUT_CAPTURE_CONTEXT(true, true, false),
    PREVIEW_VIEW_SIZE(true, true, false),
    TOUCH_INPUT_CONFIG(false, true, false),
    EXTERNAL_WORLD_TRACKING_EVENT(true, false, true),
    PLATFORM_ALGORITHM_DATA_EVENT(true, false, true);
    
    public static final AnonymousClass905[] A00 = null;
    public final boolean isCacheableEvent;
    public final boolean isSystemEvent;
    public final boolean shouldNotifyEventListenerRegistration;

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    public static AnonymousClass905 A00(String str, int i, boolean z) {
        return new AnonymousClass905(str, i, z, false, false);
    }

    /* access modifiers changed from: public */
    AnonymousClass905(boolean z, boolean z2, boolean z3) {
        this.isSystemEvent = z;
        this.isCacheableEvent = z2;
        this.shouldNotifyEventListenerRegistration = z3;
    }
}
