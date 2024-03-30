package X;

/* renamed from: X.1SZ  reason: invalid class name */
public final class AnonymousClass1SZ extends AnonymousClass1PM {
    public final C19770wU A00;
    public final Runnable A01 = new C35671j4(this, 16);
    public volatile Runnable A02;

    public static void A00(AnonymousClass1SZ r5) {
        if (r5.A02.A02() > 0 && r5.A02 == null) {
            r5.A02 = r5.A00.BpM(r5.A01, "TrackedBitmapCache/clean", 60000);
        }
    }

    public AnonymousClass1SZ(C19760wT r3, C220112n r4, C19770wU r5, String str, int i) {
        super(r3, r4, str, i);
        this.A00 = r5;
        A08();
    }
}
