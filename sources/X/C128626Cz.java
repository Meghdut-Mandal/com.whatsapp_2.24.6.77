package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6Cz  reason: invalid class name and case insensitive filesystem */
public final class C128626Cz {
    public final AnonymousClass173 A00;
    public final C24631De A01;
    public final Map A02 = C36431kI.A1G();
    public final Map A03 = C36431kI.A1G();
    public final AtomicInteger A04 = new AtomicInteger();

    public final void A01(Integer num, String str, String str2, long j) {
        AnonymousClass00C.A0D(str, 0);
        C155057Up r1 = new C155057Up(num, str2, j);
        Object obj = this.A03.get(str);
        if (obj != null) {
            r1.invoke(obj);
        }
    }

    public final void A02(Integer num, String str, String str2, String str3) {
        AnonymousClass00C.A0D(str, 0);
        C155047Uo r1 = new C155047Uo(num, str2, str3);
        Object obj = this.A03.get(str);
        if (obj != null) {
            r1.invoke(obj);
        }
    }

    public final int A00(int i, String str, String str2) {
        int andIncrement = this.A04.getAndIncrement();
        Integer valueOf = Integer.valueOf(andIncrement);
        String str3 = str;
        if (valueOf != null) {
            str3 = AnonymousClass000.A0l(valueOf, str, AnonymousClass000.A0u());
        }
        Map map = this.A03;
        C21700zf r4 = (C21700zf) map.get(str3);
        if (r4 == null) {
            C21710zg r1 = new C21710zg(i);
            r4 = this.A00.A01(r1, str3);
            r1.A04 = true;
            AnonymousClass00C.A0B(r4);
            map.put(str3, r4);
        }
        r4.A09(str2, andIncrement, false);
        C202159l8 A022 = this.A01.A02();
        if (A022 != null) {
            if (valueOf != null) {
                str = AnonymousClass000.A0l(valueOf, str, AnonymousClass000.A0u());
            }
            A02(valueOf, str, "country", A022.A03);
        }
        return andIncrement;
    }

    public C128626Cz(AnonymousClass173 r2, C24631De r3) {
        C36321k7.A0x(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
