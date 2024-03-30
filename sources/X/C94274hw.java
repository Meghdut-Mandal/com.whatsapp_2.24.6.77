package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.4hw  reason: invalid class name and case insensitive filesystem */
public final class C94274hw extends C137856gq implements C161777nS {
    public C156907b9 A00;

    public C160287kl BPi(C161687nJ r8, C161717nM r9, long j) {
        float f;
        float f2;
        C156907b9 r6 = this.A00;
        AnonymousClass5RW layoutDirection = r9.getLayoutDirection();
        C136756ew r62 = (C136756ew) r6;
        AnonymousClass5RW r1 = AnonymousClass5RW.Ltr;
        if (layoutDirection == r1) {
            f = r62.A02;
        } else {
            f = r62.A01;
        }
        float f3 = (float) 0;
        if (Float.compare(f, f3) >= 0) {
            float f4 = r62.A03;
            if (Float.compare(f4, f3) >= 0) {
                if (layoutDirection == r1) {
                    f2 = r62.A01;
                } else {
                    f2 = r62.A02;
                }
                if (Float.compare(f2, f3) >= 0) {
                    float f5 = r62.A00;
                    if (Float.compare(f5, f3) >= 0) {
                        int Bor = r9.Bor(f) + r9.Bor(f2);
                        int Bor2 = r9.Bor(f4) + r9.Bor(f5);
                        AnonymousClass6Q4 BPj = r8.BPj(C132746Vb.A01(-Bor, -Bor2, j));
                        return C90474aD.A0M(r9, new AnonymousClass7UX(this, r9, BPj), Constraints.A06(j, BPj.A01 + Bor), Constraints.A05(j, BPj.A00 + Bor2));
                    }
                }
            }
        }
        throw AnonymousClass001.A08("Padding must be non-negative");
    }

    public C94274hw(C156907b9 r1) {
        this.A00 = r1;
    }
}
