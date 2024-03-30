package X;

/* renamed from: X.916  reason: invalid class name */
public enum AnonymousClass916 implements C22899AyB {
    UNKNOWN(0),
    KEEP_FOR_ALL(1),
    UNDO_KEEP_FOR_ALL(2);
    
    public final int value;

    public static AnonymousClass916 A00(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return KEEP_FOR_ALL;
        }
        if (i != 2) {
            return null;
        }
        return UNDO_KEEP_FOR_ALL;
    }

    /* access modifiers changed from: public */
    AnonymousClass916(int i) {
        this.value = i;
    }

    public final int BEY() {
        return this.value;
    }
}
