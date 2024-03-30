package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.8fw  reason: invalid class name and case insensitive filesystem */
public class C178438fw extends AIB {
    public final /* synthetic */ AnonymousClass1XD A00;
    public final /* synthetic */ C29121Vk A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178438fw(Context context, AnonymousClass1XD r2, C29221Vu r3, C29121Vk r4, C19640wH r5, boolean z, boolean z2) {
        super(context, r3, r5);
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = z;
        this.A03 = z2;
    }

    public void A05(C202059ky r4) {
        C165567td.A15(this.A01.A0F, r4, "TosV2 onRequestError: ", AnonymousClass000.A0u());
        this.A00.Bes(r4);
    }

    public void A06(C202059ky r4) {
        C165567td.A15(this.A01.A0F, r4, "TosV2 onResponseError: ", AnonymousClass000.A0u());
        this.A00.Bf0(r4);
    }

    public void A07(C203399nx r9) {
        C203399nx A0c = r9.A0c("accept_pay");
        C178528gg r3 = new C178528gg();
        boolean z = false;
        if (A0c != null) {
            String A0i = A0c.A0i("consumer", (String) null);
            String A0i2 = A0c.A0i("merchant", (String) null);
            if ((!this.A02 || "1".equals(A0i)) && (!this.A03 || "1".equals(A0i2))) {
                z = true;
            }
            r3.A02 = z;
            r3.A00 = C203399nx.A0J(A0c, "outage", "1");
            r3.A01 = C203399nx.A0J(A0c, "sandbox", "1");
            if (!TextUtils.isEmpty(A0i) && !TextUtils.isEmpty("tos_no_wallet")) {
                AnonymousClass1EZ r2 = this.A01.A07;
                C24851Ea A04 = r2.A04("tos_no_wallet");
                if ("1".equals(A0i)) {
                    r2.A0A(A04);
                } else {
                    r2.A09(A04);
                }
            }
            if (!TextUtils.isEmpty(A0i2) && !TextUtils.isEmpty("tos_merchant")) {
                C29231Vv r22 = this.A01.A09;
                C24851Ea A042 = r22.A04("tos_merchant");
                if ("1".equals(A0i2)) {
                    r22.A0A(A042);
                } else {
                    r22.A09(A042);
                }
            }
            this.A01.A0A.A0P(r3.A01);
        } else {
            r3.A02 = false;
        }
        this.A00.Bf1(r3);
    }
}
