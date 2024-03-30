package X;

/* renamed from: X.2pe  reason: invalid class name and case insensitive filesystem */
public enum C52572pe {
    LEFT_CROP_TO_LEFT(0, r8, r8),
    LEFT_CROP_TO_RIGHT(1, r8, r14),
    TOP_CROP_TO_TOP(2, r2, r20),
    TOP_CROP_TO_BOTTOM(3, r20, r3),
    RIGHT_CROP_TO_RIGHT(4, r21, r14),
    RIGHT_CROP_TO_LEFT(5, r21, r8),
    BOTTOM_CROP_TO_TOP(6, r3, r2),
    BOTTOM_CROP_TO_BOTTOM(7, r3, r3);
    
    public final int direction;
    public final int origin;
    public final int value;

    /* access modifiers changed from: public */
    static {
        C52572pe[] r3;
        A00 = C000900k.A00(r3);
    }

    /* access modifiers changed from: public */
    C52572pe(int i, int i2, int i3) {
        this.value = i;
        this.origin = i2;
        this.direction = i3;
    }
}
