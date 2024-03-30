package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.4hy  reason: invalid class name and case insensitive filesystem */
public final class C94294hy extends C137856gq implements C161777nS {
    public float A00;
    public float A01;

    public C160287kl BPi(C161687nJ r5, C161717nM r6, long j) {
        int A03;
        int A02;
        float f = this.A01;
        if (AnonymousClass72X.A01(f) || Constraints.A03(j) != 0) {
            A03 = Constraints.A03(j);
        } else {
            A03 = r6.Bor(f);
            int A012 = Constraints.A01(j);
            if (A03 > A012) {
                A03 = A012;
            }
            if (A03 < 0) {
                A03 = 0;
            }
        }
        int A013 = Constraints.A01(j);
        float f2 = this.A00;
        if (AnonymousClass72X.A01(f2) || Constraints.A02(j) != 0) {
            A02 = Constraints.A02(j);
        } else {
            A02 = r6.Bor(f2);
            int A002 = Constraints.A00(j);
            if (A02 > A002) {
                A02 = A002;
            }
            if (A02 < 0) {
                A02 = 0;
            }
        }
        AnonymousClass6Q4 BPj = r5.BPj(C132746Vb.A00(A03, A013, A02, Constraints.A00(j)));
        return C90474aD.A0M(r6, new C154017Qo(BPj), BPj.A01, BPj.A00);
    }

    public C94294hy(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
