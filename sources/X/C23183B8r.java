package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.B8r  reason: case insensitive filesystem */
public class C23183B8r implements C22990Azg {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23183B8r(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity, int i) {
        this.A02 = i;
        this.A00 = brazilPayBloksActivity;
        this.A01 = r1;
    }

    public final void BmO(C203399nx r7) {
        C203399nx A0c;
        C203399nx A0c2;
        if (this.A02 != 0) {
            BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
            Object obj = this.A01;
            C203399nx A0c3 = r7.A0c("pay");
            if (A0c3 != null && (A0c2 = A0c3.A0c("card")) != null) {
                brazilPayBloksActivity.A0F.A01().A04(new AnonymousClass96A(obj, 4), C175898bF.A02(brazilPayBloksActivity.A03, new AnonymousClass8b7(), A0c2));
                return;
            }
            return;
        }
        BrazilPayBloksActivity brazilPayBloksActivity2 = (BrazilPayBloksActivity) this.A00;
        Object obj2 = this.A01;
        C203399nx A0c4 = r7.A0c("pay");
        if (A0c4 != null && (A0c = A0c4.A0c("card")) != null) {
            C207249un A022 = C175898bF.A02(brazilPayBloksActivity2.A03, new AnonymousClass8b7(), A0c);
            brazilPayBloksActivity2.A0F.A01().A05(new AnonymousClass96A(obj2, 3), A022, "p2m_context");
            brazilPayBloksActivity2.A0C.A0J(C90484aE.A0r(A022));
            brazilPayBloksActivity2.A0A.A0C();
        }
    }
}
