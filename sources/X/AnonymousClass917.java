package X;

/* renamed from: X.917  reason: invalid class name */
public enum AnonymousClass917 implements C22899AyB {
    UNKNOWN(0),
    FBPAY(1),
    NOVI(2),
    UPI(3);
    
    public final int value;

    public static AnonymousClass917 A00(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FBPAY;
        }
        if (i == 2) {
            return NOVI;
        }
        if (i != 3) {
            return null;
        }
        return UPI;
    }

    /* access modifiers changed from: public */
    AnonymousClass917(int i) {
        this.value = i;
    }

    public final int BEY() {
        return this.value;
    }
}
