package X;

/* renamed from: X.919  reason: invalid class name */
public enum AnonymousClass919 implements C22899AyB {
    UNKNOWN(0),
    CHAT_SETTING(1),
    ACCOUNT_SETTING(2),
    BULK_CHANGE(3),
    BIZ_SUPPORTS_FB_HOSTING(4);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass919(int i) {
        this.value = i;
    }

    public static AnonymousClass919 A00(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CHAT_SETTING;
        }
        if (i == 2) {
            return ACCOUNT_SETTING;
        }
        if (i == 3) {
            return BULK_CHANGE;
        }
        if (i != 4) {
            return null;
        }
        return BIZ_SUPPORTS_FB_HOSTING;
    }

    public final int BEY() {
        return this.value;
    }
}
