package X;

/* renamed from: X.90n  reason: invalid class name and case insensitive filesystem */
public enum C1887390n implements C22899AyB {
    VIDEO_QUALITY_LOW(0),
    VIDEO_QUALITY_MEDIUM(1),
    VIDEO_QUALITY_HIGH(2),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1887390n(int i) {
        this.value = i;
    }
}
