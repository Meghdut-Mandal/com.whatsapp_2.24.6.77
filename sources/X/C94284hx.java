package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.4hx  reason: invalid class name and case insensitive filesystem */
public final class C94284hx extends C137856gq implements C161777nS {
    public float A00 = 1.0f;
    public Integer A01;

    public C94284hx(Integer num) {
        this.A01 = num;
    }

    public C160287kl BPi(C161687nJ r7, C161717nM r8, long j) {
        int A03;
        int A012;
        int A02;
        int A002;
        int i = (int) (j & 3);
        if ((((int) (j >> 33)) & Constraints.A04[i]) == 0 || this.A01 == C023109s.A00) {
            A03 = Constraints.A03(j);
            A012 = Constraints.A01(j);
        } else {
            int A013 = Constraints.A01(j);
            A03 = C15040mb.A02(C14960mT.A01(((float) A013) * this.A00), Constraints.A03(j), A013);
            A012 = A03;
        }
        if (Constraints.A04(j, i) == 0 || this.A01 == C023109s.A01) {
            A02 = Constraints.A02(j);
            A002 = Constraints.A00(j);
        } else {
            int A003 = Constraints.A00(j);
            A02 = C15040mb.A02(C14960mT.A01(((float) A003) * this.A00), Constraints.A02(j), A003);
            A002 = A02;
        }
        AnonymousClass6Q4 BPj = r7.BPj(C132746Vb.A00(A03, A012, A02, A002));
        return C90474aD.A0M(r8, new C153977Qk(BPj), BPj.A01, BPj.A00);
    }
}
