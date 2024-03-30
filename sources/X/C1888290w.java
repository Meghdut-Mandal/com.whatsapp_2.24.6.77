package X;

/* renamed from: X.90w  reason: invalid class name and case insensitive filesystem */
public enum C1888290w implements C22899AyB {
    Unknown(0),
    Critical(1),
    PreCritical(2),
    Warning(3),
    Normal(4),
    Ideal(5),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1888290w(int i) {
        this.value = i;
    }
}
