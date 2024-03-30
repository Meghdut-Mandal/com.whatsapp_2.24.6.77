package X;

/* renamed from: X.9hh  reason: invalid class name and case insensitive filesystem */
public abstract class C200599hh {
    public static boolean A00 = true;

    public static void A00(C204369pt r3, String str, String str2, Object... objArr) {
        if (A00) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("playerId[");
            A0u.append(r3.A0k);
            C131916Rh.A01(str, AnonymousClass000.A0p("]: ", str2, A0u), objArr);
        }
    }

    public static void A02(String str, Object... objArr) {
        if (A00) {
            C131916Rh.A01("HeroService", str, objArr);
        }
    }

    public static void A01(C204369pt r3, String str, Throwable th, Object... objArr) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("playerId[");
        A0u.append(r3.A0k);
        C165607th.A1L(AnonymousClass000.A0p("]: ", str, A0u), "HeroService", th, objArr);
    }
}
