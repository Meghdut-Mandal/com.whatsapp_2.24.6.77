package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.4i0  reason: invalid class name and case insensitive filesystem */
public final class C94314i0 extends C137856gq implements C161777nS {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04 = true;

    public C94314i0(float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
    }

    public C160287kl BPi(C161687nJ r6, C161717nM r7, long j) {
        int Bor = r7.Bor(this.A02) + r7.Bor(this.A01);
        int Bor2 = r7.Bor(this.A03) + r7.Bor(this.A00);
        AnonymousClass6Q4 BPj = r6.BPj(C132746Vb.A01(-Bor, -Bor2, j));
        return C90474aD.A0M(r7, new AnonymousClass7UW(this, r7, BPj), Constraints.A06(j, BPj.A01 + Bor), Constraints.A05(j, BPj.A00 + Bor2));
    }
}
