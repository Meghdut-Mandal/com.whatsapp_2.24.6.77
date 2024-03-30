package X;

/* renamed from: X.90v  reason: invalid class name and case insensitive filesystem */
public enum C1888190v implements C22899AyB {
    ERROR_CODE_SUCCESS(0),
    ERROR_CODE_INTERNAL(1),
    ERROR_CODE_INVALID_PARAMETER(2),
    ERROR_CODE_UNSUPPORTED_PARAMETER(3),
    ERROR_CODE_DOFF(4),
    ERROR_CODE_BUSY(5),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    C1888190v(int i) {
        this.value = i;
    }
}
