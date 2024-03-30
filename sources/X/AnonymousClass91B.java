package X;

/* renamed from: X.91B  reason: invalid class name */
public enum AnonymousClass91B implements C22899AyB {
    ERROR(0),
    PENDING(1),
    SERVER_ACK(2),
    DELIVERY_ACK(3),
    READ(4),
    PLAYED(5);
    
    public final int value;

    public static AnonymousClass91B A00(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return PENDING;
        }
        if (i == 2) {
            return SERVER_ACK;
        }
        if (i == 3) {
            return DELIVERY_ACK;
        }
        if (i == 4) {
            return READ;
        }
        if (i != 5) {
            return null;
        }
        return PLAYED;
    }

    /* access modifiers changed from: public */
    AnonymousClass91B(int i) {
        this.value = i;
    }

    public final int BEY() {
        return this.value;
    }
}
