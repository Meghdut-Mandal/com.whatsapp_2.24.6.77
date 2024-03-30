package X;

import com.whatsapp.R;

/* renamed from: X.6wn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C147176wn implements C22953Az5 {
    public final /* synthetic */ C202319lY A00;
    public final /* synthetic */ C202629mK A01;
    public final /* synthetic */ Runnable A02;

    public /* synthetic */ C147176wn(C202319lY r1, C202629mK r2, Runnable runnable) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = runnable;
    }

    public final void BeS(C202059ky r13) {
        C202629mK r4 = this.A01;
        C202319lY r0 = this.A00;
        Runnable runnable = this.A02;
        if (r13 == null) {
            C19770wU r1 = r4.A08;
            String str = r0.A0K;
            int i = r0.A03;
            C19970wo r02 = r4.A01;
            C36391kE.A1Q(new AnonymousClass5MT(r4.A06, runnable, str, i, C19970wo.A00(r02), C19970wo.A00(r02)), r1);
            return;
        }
        int i2 = 0;
        if (r13.A00 == 443) {
            i2 = R.string.f12nameremoved;
        }
        AnonymousClass17Y r03 = r4.A00;
        if (i2 == 0) {
            i2 = R.string.f12nameremoved;
        }
        r03.A06(i2, 0);
        r03.A02();
    }
}
