package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1PY  reason: invalid class name */
public final class AnonymousClass1PY {
    public final AnonymousClass1HJ A00;
    public final AnonymousClass1HO A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final C19730wQ A03;
    public final C19970wo A04;

    public AnonymousClass1PY(C19730wQ r2, C19970wo r3, AnonymousClass1HJ r4, AnonymousClass1HO r5) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        this.A04 = r3;
        this.A03 = r2;
        this.A00 = r4;
        this.A01 = r5;
    }

    public final String A00(String str) {
        C107265Nh r3;
        String str2;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass5Ng A042 = this.A01.A04(C34681hT.A09(str));
        if (A042 != null) {
            r3 = this.A00.A06(A042.A02());
        } else {
            r3 = null;
        }
        if ((r3 == null || (str2 = r3.A0H) == null) && (str2 = (String) this.A02.get(str)) == null) {
            str2 = C18750th.A06(C237919w.A01(this.A03, this.A04, true));
        }
        AnonymousClass00C.A0B(str2);
        this.A02.put(str, str2);
        if (r3 != null && !AnonymousClass00C.A0J(r3.A0H, str2)) {
            synchronized (r3) {
                if (r3.A0H != null) {
                    C18740tg.A0D(false, "CallRandomId cannot be set twice!");
                } else {
                    r3.A0H = str2;
                    r3.A03();
                }
            }
            this.A00.A09(r3);
        }
        return str2;
    }
}
