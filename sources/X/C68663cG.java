package X;

import android.net.Uri;

/* renamed from: X.3cG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68663cG implements C22908AyK {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ AnonymousClass3T1 A01;
    public final /* synthetic */ C48912iG A02;

    public /* synthetic */ C68663cG(C225314u r1, AnonymousClass3T1 r2, C48912iG r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BTc() {
        String str;
        C48912iG r0 = this.A02;
        AnonymousClass3T1 r3 = this.A01;
        C225314u r4 = this.A00;
        AnonymousClass3EA r5 = ((AnonymousClass2IR) r0.A00).A1e;
        AnonymousClass00C.A0D(r3, 0);
        String A19 = C36431kI.A19(r5.A01, 4255);
        AnonymousClass1TF r1 = r5.A02;
        AnonymousClass3P8 A002 = AnonymousClass1TF.A00(r3);
        if (A002 == null || !r1.A09(A002) || A19.length() == 0) {
            A19 = "https://faq.whatsapp.com/general/verification/about-autofilling-security-codes-on-whatsapp";
        }
        Uri.Builder buildUpon = Uri.parse(A19).buildUpon();
        C18820ts r32 = r5.A00;
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("lg", r32.A06()).appendQueryParameter("lc", r32.A05());
        if (r5.A03.A04()) {
            str = "1";
        } else {
            str = "0";
        }
        r4.startActivity(C36391kE.A0G(appendQueryParameter.appendQueryParameter("eea", str).build()));
    }
}
