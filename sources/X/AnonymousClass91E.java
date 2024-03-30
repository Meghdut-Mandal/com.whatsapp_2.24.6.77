package X;

/* renamed from: X.91E  reason: invalid class name */
public enum AnonymousClass91E implements C22899AyB {
    SANS_SERIF(0),
    SERIF(1),
    FACEBOOKSCRIPT_WA_REGULAR(2),
    BEBASNEUE_REGULAR(3),
    SYSTEM_BOLD(4),
    MORNINGBREEZE_REGULAR(5),
    CALISTOGA_REGULAR(6),
    EXO2_EXTRABOLD(7),
    COURIERPRIME_BOLD(8);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass91E(int i) {
        this.value = i;
    }

    public static AnonymousClass91E A00(int i) {
        switch (i) {
            case 0:
                return SANS_SERIF;
            case 1:
                return SERIF;
            case 2:
                return FACEBOOKSCRIPT_WA_REGULAR;
            case 3:
                return BEBASNEUE_REGULAR;
            case 4:
                return SYSTEM_BOLD;
            case 5:
                return MORNINGBREEZE_REGULAR;
            case 6:
                return CALISTOGA_REGULAR;
            case 7:
                return EXO2_EXTRABOLD;
            case 8:
                return COURIERPRIME_BOLD;
            default:
                return null;
        }
    }

    public final int BEY() {
        return this.value;
    }
}
