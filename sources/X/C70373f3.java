package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.3f3  reason: invalid class name and case insensitive filesystem */
public final class C70373f3 implements C87664Pr, C87674Ps {
    public final AnonymousClass17Y A00;
    public final C19630wG A01;
    public final AnonymousClass171 A02;
    public final /* synthetic */ ReportSpamDialogFragment A03;

    public void BkA(AnonymousClass141 r6) {
        if (ReportSpamDialogFragment.A09(this.A03)) {
            this.A00.A07(R.string.f12nameremoved, 0);
            return;
        }
        Resources A0B = C36421kH.A0B(this.A01);
        Object[] A0L = AnonymousClass001.A0L();
        C36361kB.A1F(this.A02, r6, A0L, 0);
        String string = A0B.getString(R.string.f12nameremoved, A0L);
        AnonymousClass00C.A08(string);
        A00(this, string);
    }

    public C70373f3(AnonymousClass17Y r1, AnonymousClass171 r2, C19630wG r3, ReportSpamDialogFragment reportSpamDialogFragment) {
        this.A03 = reportSpamDialogFragment;
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }

    public static final void A00(C70373f3 r3, String str) {
        if (!r3.A03.A0O) {
            r3.A00.A0H(new C1503274v(24, str, r3));
        }
    }

    public void BYk(AnonymousClass141 r3, boolean z) {
        A00(this, C36371kC.A0v(this.A01, R.string.f12nameremoved));
    }
}
