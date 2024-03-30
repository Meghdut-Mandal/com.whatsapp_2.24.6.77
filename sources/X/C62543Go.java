package X;

import android.app.ProgressDialog;
import android.content.Context;

/* renamed from: X.3Go  reason: invalid class name and case insensitive filesystem */
public final class C62543Go {
    public final /* synthetic */ ProgressDialog A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C65383Rv A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C62543Go(ProgressDialog progressDialog, Context context, C65383Rv r3, Integer num, String str, String str2) {
        this.A02 = r3;
        this.A01 = context;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = num;
        this.A00 = progressDialog;
    }

    public void A00() {
        C65383Rv r3 = this.A02;
        r3.A01.A0H(C80223v3.A00(this.A00, 5));
        C65383Rv.A01(this.A01, r3, this.A03, this.A04, "https://whatsapp.com/dl/", this.A05);
    }

    public void A01(String str) {
        C65383Rv r3 = this.A02;
        r3.A01.A0H(C80223v3.A00(this.A00, 6));
        C65383Rv.A01(this.A01, r3, this.A03, this.A04, AnonymousClass000.A0p("https://whatsapp.com/dl/code=", str, AnonymousClass000.A0u()), this.A05);
    }
}
