package X;

/* renamed from: X.9Zc  reason: invalid class name */
public abstract class AnonymousClass9Zc {
    public static final AnonymousClass919 A01(int i) {
        if (i == 1) {
            return AnonymousClass919.CHAT_SETTING;
        }
        if (i == 2) {
            return AnonymousClass919.ACCOUNT_SETTING;
        }
        if (i == 3) {
            return AnonymousClass919.BULK_CHANGE;
        }
        if (i != 4) {
            return AnonymousClass919.UNKNOWN;
        }
        return AnonymousClass919.BIZ_SUPPORTS_FB_HOSTING;
    }

    public static final int A00(AnonymousClass919 r4) {
        int ordinal = r4.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal != 4) {
            return 0;
        }
        return 4;
    }
}
