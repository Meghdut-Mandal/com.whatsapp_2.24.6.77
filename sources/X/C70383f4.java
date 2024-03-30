package X;

import com.whatsapp.R;

/* renamed from: X.3f4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70383f4 implements C87674Ps {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C225314u A01;
    public final /* synthetic */ AnonymousClass3O6 A02;

    public /* synthetic */ C70383f4(C225314u r1, AnonymousClass3O6 r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void BkA(AnonymousClass141 r8) {
        String string;
        AnonymousClass3O6 r6 = this.A02;
        C225314u r4 = this.A01;
        int i = this.A00;
        if (r6.A06.A0E(6186)) {
            string = r4.getString(R.string.f12nameremoved);
        } else {
            Object[] A0L = AnonymousClass001.A0L();
            C36361kB.A1F(r6.A03, r8, A0L, 0);
            string = r4.getString(R.string.f12nameremoved, A0L);
        }
        AnonymousClass17Y r2 = r6.A00;
        r2.A09((C225014r) null);
        r2.A0H(new AnonymousClass751(24, string, r6));
        if (i == 2) {
            C36381kD.A15(r4, AnonymousClass190.A03(r4));
        } else if (i != 1) {
            return;
        }
        r4.finish();
    }
}
