package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1En  reason: invalid class name and case insensitive filesystem */
public final class C24981En {
    public final C19970wo A00;
    public final AnonymousClass19A A01;

    public C24981En(C19970wo r2, AnonymousClass19A r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(C88414Sp r18, long... jArr) {
        AnonymousClass19A r10 = this.A01;
        String A09 = r10.A09();
        ArrayList arrayList = new ArrayList(r7);
        for (long valueOf : jArr) {
            arrayList.add(new C35891jQ(Long.valueOf(valueOf), Long.valueOf(C19970wo.A00(this.A00) / 1000)));
        }
        C35911jS r2 = new C35911jS((List) arrayList, 18, A09);
        C203399nx r12 = r2.A00;
        AnonymousClass00C.A08(r12);
        r10.A0E(new C35921jT(r2, new C585530d(r18), 7), r12, A09, 430, 32000);
    }
}
