package X;

/* renamed from: X.90t  reason: invalid class name and case insensitive filesystem */
public enum C1887990t implements C22899AyB {
    SystemHealthEventTypeUnknown(0),
    Connectivity(1),
    Battery(2),
    Thermal(3),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1887990t(int i) {
        this.value = i;
    }
}
