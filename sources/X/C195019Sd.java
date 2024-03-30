package X;

import android.content.Context;

/* renamed from: X.9Sd  reason: invalid class name and case insensitive filesystem */
public class C195019Sd {
    public final C29231Vv A00;
    public final AnonymousClass1EU A01;
    public final C19770wU A02;
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final C19970wo A05;
    public final C19630wG A06;
    public final AnonymousClass19A A07;
    public final C29221Vu A08;

    public void A00(AnonymousClass1XD r14) {
        String A002 = C237919w.A00(this.A04, this.A05);
        AnonymousClass19A r5 = this.A07;
        String A09 = r5.A09();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        C203539oF.A0E(A0T, A09);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "br-remove-merchant-account");
        C203539oF.A0F(A0a, A002);
        C203399nx A0I = C165567td.A0I(A0a, A0T);
        Context context = this.A06.A00;
        AnonymousClass17Y r9 = this.A03;
        C165577te.A1A(r5, new B7J(context, this.A08, r9, this, r14, 6), A0I, A09);
    }

    public C195019Sd(AnonymousClass17Y r1, C19730wQ r2, C19970wo r3, C19630wG r4, AnonymousClass19A r5, C29221Vu r6, C29231Vv r7, AnonymousClass1EU r8, C19770wU r9) {
        this.A05 = r3;
        this.A03 = r1;
        this.A04 = r2;
        this.A07 = r5;
        this.A06 = r4;
        this.A02 = r9;
        this.A01 = r8;
        this.A08 = r6;
        this.A00 = r7;
    }
}
