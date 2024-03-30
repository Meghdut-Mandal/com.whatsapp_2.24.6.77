package X;

/* renamed from: X.90u  reason: invalid class name and case insensitive filesystem */
public enum C1888090u implements C22899AyB {
    EMPTY(0),
    IPV4(1),
    IPV6(2),
    BTC(3),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1888090u(int i) {
        this.value = i;
    }
}
