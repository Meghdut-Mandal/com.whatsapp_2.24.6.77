package X;

import android.content.Context;
import android.text.Spannable;

/* renamed from: X.9Rq  reason: invalid class name and case insensitive filesystem */
public final class C194889Rq {
    public final AnonymousClass17Y A00;
    public final C32691e2 A01;
    public final C21060yb A02;
    public final C32731e6 A03;

    public final int A00(Context context, Spannable spannable, AnonymousClass3T1 r15) {
        AnonymousClass3T1 r9 = r15;
        C36321k7.A0x(spannable, r15);
        Object[] spans = spannable.getSpans(0, spannable.length(), C166197vK.class);
        AnonymousClass00C.A08(spans);
        for (C166197vK r0 : (C166197vK[]) spans) {
            C1901997g.A00(spannable, spannable, r0, new AnonymousClass22u(context, this.A01, this.A00, this.A02, r9, r0.A00, r0.A01));
        }
        return r2;
    }

    public C194889Rq(AnonymousClass17Y r1, C32691e2 r2, C21060yb r3, C32731e6 r4) {
        C36321k7.A18(r4, r1, r3, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
