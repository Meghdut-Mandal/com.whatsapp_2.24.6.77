package X;

/* renamed from: X.9al  reason: invalid class name and case insensitive filesystem */
public abstract class C196929al {
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    public static int A00(C201339jM r2) {
        int A012 = r2.A01(4);
        if (A012 == 15) {
            return r2.A01(24);
        }
        if (A012 < 13) {
            return A01[A012];
        }
        throw new C187398xn((String) null, (Throwable) null, true);
    }
}
