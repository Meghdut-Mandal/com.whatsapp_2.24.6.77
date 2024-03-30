package X;

import java.util.Map;

/* renamed from: X.5Xd  reason: invalid class name and case insensitive filesystem */
public abstract class C109325Xd {
    public static final AnonymousClass040 A00(AnonymousClass04R r3) {
        Object obj;
        AnonymousClass00C.A0D(r3, 0);
        Map map = r3.A00;
        synchronized (map) {
            obj = map.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        }
        AnonymousClass040 r0 = (AnonymousClass040) obj;
        if (r0 == null) {
            return (AnonymousClass040) r3.A0Q(new C1510177r(new C007703h((C007403e) null).plus(C36401kF.A0y())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        }
        return r0;
    }

    public static void A01(AnonymousClass04R r2, C009003v r3, AnonymousClass05H r4) {
        C06820Vf.A01(A00(r2), new C18510tH(r3, r4, 5));
    }
}
