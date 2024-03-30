package X;

import java.util.Map;

/* renamed from: X.66i  reason: invalid class name and case insensitive filesystem */
public abstract class C1269466i {
    public final Map A00 = C36431kI.A1G();
    public final Map A01 = C36431kI.A1G();
    public final String A02;

    public final void A01(String str, String str2) {
        Map map = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A02);
        map.put(C90464aC.A0f(str, A0u, '_'), str2);
    }

    public C1269466i(String str) {
        this.A02 = str;
    }

    public final void A00(String str, long j) {
        Long valueOf = Long.valueOf(j);
        Map map = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A02);
        map.put(C90464aC.A0f(str, A0u, '_'), valueOf);
    }
}
