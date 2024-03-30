package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.4hz  reason: invalid class name and case insensitive filesystem */
public final class C94304hz extends C137856gq implements C161777nS {
    public Integer A00;
    public C009003v A01;

    public C160287kl BPi(C161687nJ r10, C161717nM r11, long j) {
        int A03;
        Integer num = this.A00;
        int i = 0;
        if (num != C023109s.A00) {
            A03 = 0;
        } else {
            A03 = Constraints.A03(j);
        }
        if (num == C023109s.A01) {
            i = Constraints.A02(j);
        }
        AnonymousClass6Q4 BPj = r10.BPj(C132746Vb.A00(A03, Constraints.A01(j), i, Constraints.A00(j)));
        int A06 = Constraints.A06(j, BPj.A01);
        int A05 = Constraints.A05(j, BPj.A00);
        return C90474aD.A0M(r11, new AnonymousClass7VN(this, r11, BPj, A06, A05), A06, A05);
    }

    public C94304hz(Integer num, C009003v r2) {
        this.A00 = num;
        this.A01 = r2;
    }
}
