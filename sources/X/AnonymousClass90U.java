package X;

/* renamed from: X.90U  reason: invalid class name */
public enum AnonymousClass90U implements C22899AyB {
    ACQUIRE(0),
    RELEASE(1),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    AnonymousClass90U(int i) {
        this.value = i;
    }
}
