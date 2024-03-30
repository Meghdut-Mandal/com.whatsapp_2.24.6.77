package X;

/* renamed from: X.915  reason: invalid class name */
public enum AnonymousClass915 implements C22899AyB {
    FULL(1),
    TALL(2),
    COMPACT(3);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass915(int i) {
        this.value = i;
    }

    public static AnonymousClass915 A00(int i) {
        if (i == 1) {
            return FULL;
        }
        if (i == 2) {
            return TALL;
        }
        if (i != 3) {
            return null;
        }
        return COMPACT;
    }

    public final int BEY() {
        return this.value;
    }
}
