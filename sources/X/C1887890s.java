package X;

/* renamed from: X.90s  reason: invalid class name and case insensitive filesystem */
public enum C1887890s implements C22899AyB {
    APPLICATION_TYPE_UNKNOWN(0),
    APPLICATION_TYPE_FACEBOOK(1),
    APPLICATION_TYPE_INSTAGRAM(2),
    APPLICATION_TYPE_FAIR_DEMO(3),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1887890s(int i) {
        this.value = i;
    }
}
