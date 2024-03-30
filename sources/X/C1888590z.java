package X;

/* renamed from: X.90z  reason: invalid class name and case insensitive filesystem */
public enum C1888590z implements C22899AyB {
    UNKNOWN_STATUS(0),
    PROCESSING(1),
    SENT(2),
    NEED_TO_ACCEPT(3),
    COMPLETE(4),
    COULD_NOT_COMPLETE(5),
    REFUNDED(6),
    EXPIRED(7),
    REJECTED(8),
    CANCELLED(9),
    WAITING_FOR_PAYER(10),
    WAITING(11);
    
    public final int value;

    /* access modifiers changed from: public */
    C1888590z(int i) {
        this.value = i;
    }

    public final int BEY() {
        return this.value;
    }
}
