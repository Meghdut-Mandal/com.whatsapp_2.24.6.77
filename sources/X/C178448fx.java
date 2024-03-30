package X;

import android.content.Context;

/* renamed from: X.8fx  reason: invalid class name and case insensitive filesystem */
public class C178448fx extends AIB {
    public final /* synthetic */ B1P A00;
    public final /* synthetic */ C193869Nf A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178448fx(Context context, C29221Vu r2, B1P b1p, C193869Nf r4, C19640wH r5, String str, String str2) {
        super(context, r2, r5);
        this.A01 = r4;
        this.A02 = str;
        this.A00 = b1p;
        this.A03 = str2;
    }

    public void A05(C202059ky r4) {
        C24611Dc r2 = this.A01.A05;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentKycAction ");
        A0u.append(this.A02);
        C165567td.A15(r2, r4, ": onRequestError: ", A0u);
        this.A00.BZW(r4);
    }

    public void A06(C202059ky r4) {
        C24611Dc r2 = this.A01.A05;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentKycAction ");
        A0u.append(this.A02);
        C165567td.A15(r2, r4, ": onResponseError: ", A0u);
        this.A00.BZW(r4);
    }

    public void A07(C203399nx r6) {
        C24611Dc r2;
        String str;
        C203399nx A032 = C203399nx.A03(r6);
        if (A032 == null) {
            r2 = this.A01.A05;
            StringBuilder A0v = AnonymousClass000.A0v("PaymentKycAction ");
            A0v.append(this.A02);
            str = AnonymousClass000.A0q(": onResponseSuccess: missing account node", A0v);
        } else {
            C202059ky A012 = C202059ky.A01(A032);
            if (A012 != null) {
                C193869Nf r3 = this.A01;
                C24611Dc r22 = r3.A05;
                StringBuilder A0v2 = AnonymousClass000.A0v("PaymentKycAction ");
                A0v2.append(this.A02);
                C165567td.A15(r22, A012, ": onResponseSuccess: account-node error: ", A0v2);
                if (A012.A00 == 1448) {
                    r3.A04.A02(A012, this.A03, "KYC");
                }
                this.A00.BZW(A012);
                return;
            }
            C207139uc A002 = C207139uc.A00(A032);
            if (A002 != null) {
                this.A00.BZX(A002);
                return;
            } else {
                r2 = this.A01.A05;
                str = "PaymentKycAction/createCallback PaymentKycInfo is null";
            }
        }
        r2.A05(str);
        this.A00.BZW(C202059ky.A00());
    }
}
