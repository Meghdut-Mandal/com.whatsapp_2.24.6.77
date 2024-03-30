package X;

/* renamed from: X.5UF  reason: invalid class name */
public enum AnonymousClass5UF implements C22899AyB {
    DEFAULT(0),
    OFF(1),
    ON(2);
    
    public final int value;

    public static AnonymousClass5UF A00(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return OFF;
        }
        if (i != 2) {
            return null;
        }
        return ON;
    }

    /* access modifiers changed from: public */
    AnonymousClass5UF(int i) {
        this.value = i;
    }

    public final int BEY() {
        return this.value;
    }
}
