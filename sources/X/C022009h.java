package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;

/* renamed from: X.09h  reason: invalid class name and case insensitive filesystem */
public final class C022009h {
    public static C022109i A00 = C022109i.A02;
    public static final C022009h A01 = new C022009h();

    public static final void A03(C022209j r2) {
        if (AnonymousClass01z.A0E(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("StrictMode violation in ");
            sb.append(r2.fragment.getClass().getName());
            Log.d("FragmentManager", sb.toString(), r2);
        }
    }

    public static final C022109i A00(AnonymousClass02E r1) {
        while (r1 != null) {
            if (r1.A12()) {
                r1.A0l();
            }
            r1 = r1.A0I;
        }
        return A00;
    }

    public static final void A01(AnonymousClass02E r4, String str) {
        C03700Hj r3 = new C03700Hj(r4, str);
        A03(r3);
        C022109i A002 = A00(r4);
        if (A002.A01.contains(C022409l.DETECT_FRAGMENT_REUSE) && A04(A002, r4.getClass(), r3.getClass())) {
            A02(A002, r3);
        }
    }

    public static final void A02(C022109i r6, C022209j r7) {
        AnonymousClass02E r5 = r7.fragment;
        String name = r5.getClass().getName();
        Set set = r6.A01;
        if (set.contains(C022409l.PENALTY_LOG)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
            Log.d("FragmentStrictMode", sb.toString(), r7);
        }
        if (set.contains(C022409l.PENALTY_DEATH)) {
            C11480gN r3 = new C11480gN(r7, name);
            if (r5.A12()) {
                Handler handler = r5.A0l().A07.A02;
                AnonymousClass00C.A08(handler);
                if (!AnonymousClass00C.A0J(handler.getLooper(), Looper.myLooper())) {
                    handler.post(r3);
                    return;
                }
            }
            r3.run();
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static final boolean A04(C022109i r2, Class cls, Class cls2) {
        Set set = (Set) r2.A00.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AnonymousClass00C.A0J(cls2.getSuperclass(), C022209j.class) || !C007103b.A0j(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
