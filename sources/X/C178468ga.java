package X;

import android.content.Context;

/* renamed from: X.8ga  reason: invalid class name and case insensitive filesystem */
public class C178468ga extends C178498gd {
    public final /* synthetic */ C199129ek A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178468ga(Context context, AnonymousClass17Y r13, C29221Vu r14, AnonymousClass9YX r15, C199129ek r16, AF7 af7, AnonymousClass5GM r18, String str, String str2, String str3) {
        super(context, r13, r14, r15, af7, r18, "upi-bind-device", str, 20);
        this.A00 = r16;
        this.A01 = str2;
        this.A02 = str3;
    }

    private void A00(C202059ky r7) {
        C199129ek r5 = this.A00;
        if (r5.A01 != null) {
            if (r7.A00 == 11453) {
                String A04 = r5.A0G.A04();
                AE0 ae0 = r5.A0A;
                String str = this.A01;
                String str2 = this.A02;
                ae0.A0K(str, str2, A04);
                StringBuilder A0u = AnonymousClass000.A0u();
                C36321k7.A1a(A0u, C178498gd.A01("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ", str, str2, A04, A0u));
            }
            r5.A01.BVU(r7);
        }
    }

    public void A05(C202059ky r3) {
        super.A05(r3);
        C36321k7.A1K(r3, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", AnonymousClass000.A0u());
        A00(r3);
    }

    public void A06(C202059ky r3) {
        super.A06(r3);
        C36321k7.A1K(r3, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", AnonymousClass000.A0u());
        A00(r3);
    }

    public void A07(C203399nx r7) {
        super.A07(r7);
        C199129ek r5 = this.A00;
        String A04 = r5.A0G.A04();
        AE0 ae0 = r5.A0A;
        String str = this.A01;
        String str2 = this.A02;
        ae0.A0K(str, str2, A04);
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1a(A0u, C178498gd.A01("PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: ", str, str2, A04, A0u));
        B1L b1l = r5.A01;
        if (b1l != null) {
            b1l.BVU((C202059ky) null);
        }
    }
}
