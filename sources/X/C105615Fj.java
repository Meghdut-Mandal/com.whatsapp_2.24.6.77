package X;

import android.content.Context;

/* renamed from: X.5Fj  reason: invalid class name and case insensitive filesystem */
public class C105615Fj extends C178498gd {
    public final /* synthetic */ AnonymousClass7hF A00;
    public final /* synthetic */ C105605Fi A01;
    public final /* synthetic */ Integer A02;

    public void A05(C202059ky r10) {
        super.A05(r10);
        this.A01.A06.A01(r10, this.A02, "upi-get-p2m-config");
        this.A00.Bf9(r10, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public void A06(C202059ky r10) {
        super.A06(r10);
        this.A01.A06.A01(r10, this.A02, "upi-get-p2m-config");
        this.A00.Bf9(r10, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105615Fj(Context context, AnonymousClass17Y r8, C29221Vu r9, AnonymousClass9YX r10, AnonymousClass7hF r11, C105605Fi r12, Integer num) {
        super(context, r8, r9, r10, "upi-get-p2m-config");
        this.A01 = r12;
        this.A02 = num;
        this.A00 = r11;
    }

    public void A07(C203399nx r11) {
        String str;
        try {
            C203399nx A0d = r11.A0d("account");
            String A0h = A0d.A0h("mcc");
            String A0h2 = A0d.A0h("receiver-vpa");
            String A0i = A0d.A0i("payee-name", (String) null);
            String A0i2 = A0d.A0i("purpose-code", (String) null);
            C105605Fi r3 = this.A01;
            C203399nx A0c = A0d.A0c("l2checkout");
            if (A0c != null) {
                str = A0c.A0i("merchant-public-key", (String) null);
            } else {
                str = null;
            }
            r3.A06.A02(this.A02, "upi-get-p2m-config", 2);
            this.A00.Bf9((C202059ky) null, A0h, A0h2, A0i, A0i2, str);
        } catch (C235919b unused) {
            C202059ky r32 = new C202059ky();
            this.A01.A06.A01(r32, this.A02, "upi-get-p2m-config");
            this.A00.Bf9(r32, (String) null, (String) null, (String) null, (String) null, (String) null);
        }
    }
}
