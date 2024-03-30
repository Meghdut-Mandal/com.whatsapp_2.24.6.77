package X;

/* renamed from: X.90m  reason: invalid class name and case insensitive filesystem */
public enum C1887290m implements C22899AyB {
    CONTROL_STREAM_ACTION_NONE(0),
    CONTROL_STREAM_ACTION_START(1),
    CONTROL_STREAM_ACTION_STOP(2),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1887290m(int i) {
        this.value = i;
    }
}
