package X;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.9pK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204019pK implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ C202199lE A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C204019pK(AnonymousClass155 r1, C202199lE r2, String str, String str2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C202199lE r1 = this.A01;
        AnonymousClass155 r6 = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        boolean z = this.A04;
        C202199lE.A00(r6, r1);
        C165577te.A1C(r1.A0I, 160, "prompt_warn_setup_without_recover", str);
        Intent A0F = C165597tg.A0F(r6);
        A0F.putExtra("screen_name", "brpay_p_tos");
        C1025050g.A01(A0F, "referral_screen", str);
        C1025050g.A01(A0F, "onboarding_context", str2);
        r6.A33(A0F, z);
    }
}
