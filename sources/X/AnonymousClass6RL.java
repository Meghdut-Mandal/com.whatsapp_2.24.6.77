package X;

import java.util.Map;

/* renamed from: X.6RL  reason: invalid class name */
public final class AnonymousClass6RL {
    public static volatile C157817ej A00;

    public static final void A00(AnonymousClass5S6 r1, String str, String str2) {
        AnonymousClass00C.A0D(str2, 2);
        A01(r1, str, str2, (Throwable) null);
    }

    public static final void A01(AnonymousClass5S6 r7, String str, String str2, Throwable th) {
        String str3 = str2;
        AnonymousClass00C.A0D(str2, 2);
        if (A00 == null) {
            synchronized (AnonymousClass6RL.class) {
                if (A00 == null) {
                    A00 = new C140356lS();
                }
            }
        }
        C157817ej r0 = A00;
        if (r0 != null) {
            r0.BoE(r7, str, str3, th, (Map) null, 0);
            return;
        }
        throw C36381kD.A0l();
    }
}
