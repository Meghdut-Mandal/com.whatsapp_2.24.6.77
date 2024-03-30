package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.4hu  reason: invalid class name and case insensitive filesystem */
public final class C94254hu extends C137856gq implements C161817nW, C161777nS {
    public float A00;
    public Alignment A01;
    public C114365h6 A02;
    public C128906Eb A03;
    public C161187mL A04;
    public boolean A05 = true;

    public C94254hu(Alignment alignment, C114365h6 r3, C128906Eb r4, C161187mL r5, float f) {
        this.A03 = r4;
        this.A01 = alignment;
        this.A04 = r5;
        this.A00 = f;
        this.A02 = r3;
    }

    public /* synthetic */ void BaV() {
    }

    public static final boolean A01(long j) {
        if (j == AnonymousClass6X0.A01) {
            return false;
        }
        float A002 = AnonymousClass6X0.A00(j);
        if (Float.isInfinite(A002) || Float.isNaN(A002)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(long j) {
        if (j == AnonymousClass6X0.A01) {
            return false;
        }
        float A012 = AnonymousClass6X0.A01(j);
        if (Float.isInfinite(A012) || Float.isNaN(A012)) {
            return false;
        }
        return true;
    }

    public void B5y(C161667nH r15) {
        float A012;
        long j;
        long A002 = this.A03.A00();
        if (A02(A002)) {
            A012 = AnonymousClass6X0.A01(A002);
        } else {
            A012 = AnonymousClass6X0.A01(r15.BHc());
        }
        if (!A01(A002)) {
            A002 = r15.BHc();
        }
        long A0B = C90464aC.A0B(A012, AnonymousClass6X0.A00(A002));
        long BHc = r15.BHc();
        if (AnonymousClass6X0.A01(BHc) == 0.0f || AnonymousClass6X0.A00(BHc) == 0.0f) {
            j = AnonymousClass6X0.A02;
        } else {
            j = A00(A0B, this.A04.B3J(A0B, BHc));
        }
        long B0u = this.A01.B0u(r15.getLayoutDirection(), AnonymousClass6GI.A01(j), AnonymousClass6GI.A01(BHc));
        float A08 = (float) C90494aF.A08(B0u);
        float A032 = (float) C90474aD.A03(B0u);
        C158837iJ r4 = ((C137486gD) r15.BBD()).A00;
        C128306Bs r3 = ((C137486gD) ((C137516gG) r4).A00).A01.A02;
        r3.A01.Bw6(A08, A032);
        C128906Eb r1 = this.A03;
        float f = this.A00;
        C114365h6 r2 = this.A02;
        if (r1.A00 != f) {
            if (r1 instanceof C94624iW) {
                ((C94624iW) r1).A00 = f;
            } else {
                ((C94614iV) r1).A00 = f;
            }
            r1.A00 = f;
        }
        if (!AnonymousClass00C.A0J(r1.A01, r2)) {
            if (r1 instanceof C94624iW) {
                ((C94624iW) r1).A02 = r2;
            } else {
                ((C94614iV) r1).A02 = r2;
            }
            r1.A01 = r2;
        }
        AnonymousClass5RW layoutDirection = r15.getLayoutDirection();
        if (r1.A02 != layoutDirection) {
            r1.A02 = layoutDirection;
        }
        long BHc2 = r15.BHc();
        float A013 = AnonymousClass6X0.A01(BHc2) - AnonymousClass6X0.A01(j);
        float A003 = AnonymousClass6X0.A00(BHc2) - AnonymousClass6X0.A00(j);
        r4.BKm(0.0f, 0.0f, A013, A003);
        if (f > 0.0f && AnonymousClass6X0.A01(j) > 0.0f && AnonymousClass6X0.A00(j) > 0.0f) {
            r1.A01(r15);
        }
        r4.BKm(-0.0f, -0.0f, -A013, -A003);
        r3.A01.Bw6(-A08, -A032);
        r15.B63();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (androidx.compose.ui.unit.Constraints.A04(r10, r4) == 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C160287kl BPi(X.C161687nJ r8, X.C161717nM r9, long r10) {
        /*
            r7 = this;
            int[] r5 = androidx.compose.ui.unit.Constraints.A04
            r2 = 3
            long r0 = r10 & r2
            int r4 = (int) r0
            r3 = r5[r4]
            r0 = 33
            long r1 = r10 >> r0
            int r0 = (int) r1
            r0 = r0 & r3
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r6 = 1
            if (r0 == 0) goto L_0x001d
            int r0 = androidx.compose.ui.unit.Constraints.A04(r10, r4)
            r5 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r5 = 0
        L_0x001e:
            int r1 = androidx.compose.ui.unit.Constraints.A01(r10)
            int r0 = androidx.compose.ui.unit.Constraints.A03(r10)
            if (r1 != r0) goto L_0x012d
            int r1 = androidx.compose.ui.unit.Constraints.A00(r10)
            int r0 = androidx.compose.ui.unit.Constraints.A02(r10)
            if (r1 != r0) goto L_0x012d
        L_0x0032:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0120
            X.6Eb r0 = r7.A03
            long r3 = r0.A00()
            long r1 = X.AnonymousClass6X0.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0120
        L_0x0042:
            if (r6 != 0) goto L_0x0124
            X.6Eb r0 = r7.A03
            long r2 = r0.A00()
            boolean r0 = A02(r2)
            if (r0 == 0) goto L_0x011a
            float r0 = X.AnonymousClass6X0.A01(r2)
            int r1 = X.C14960mT.A01(r0)
        L_0x0058:
            boolean r0 = A01(r2)
            if (r0 == 0) goto L_0x0114
            float r0 = X.AnonymousClass6X0.A00(r2)
            int r0 = X.C14960mT.A01(r0)
        L_0x0066:
            int r1 = androidx.compose.ui.unit.Constraints.A06(r10, r1)
            int r0 = androidx.compose.ui.unit.Constraints.A05(r10, r0)
            float r1 = (float) r1
            float r0 = (float) r0
            long r0 = X.C90464aC.A0B(r1, r0)
            long r2 = X.AnonymousClass6X0.A02
            boolean r2 = r7.A05
            if (r2 == 0) goto L_0x00c5
            X.6Eb r2 = r7.A03
            long r5 = r2.A00()
            long r3 = X.AnonymousClass6X0.A01
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00c5
            X.6Eb r2 = r7.A03
            long r2 = r2.A00()
            boolean r2 = A02(r2)
            if (r2 != 0) goto L_0x0109
            float r4 = X.AnonymousClass6X0.A01(r0)
        L_0x0096:
            X.6Eb r2 = r7.A03
            long r2 = r2.A00()
            boolean r2 = A01(r2)
            if (r2 != 0) goto L_0x00fe
            float r2 = X.AnonymousClass6X0.A00(r0)
        L_0x00a6:
            long r2 = X.C90464aC.A0B(r4, r2)
            float r4 = X.AnonymousClass6X0.A01(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00fb
            float r4 = X.AnonymousClass6X0.A00(r0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00fb
            X.7mL r4 = r7.A04
            long r0 = r4.B3J(r2, r0)
            long r0 = A00(r2, r0)
        L_0x00c5:
            float r2 = X.AnonymousClass6X0.A01(r0)
            int r2 = X.C14960mT.A01(r2)
            int r3 = androidx.compose.ui.unit.Constraints.A06(r10, r2)
            float r0 = X.AnonymousClass6X0.A00(r0)
            int r0 = X.C14960mT.A01(r0)
            int r2 = androidx.compose.ui.unit.Constraints.A05(r10, r0)
        L_0x00dd:
            int r1 = androidx.compose.ui.unit.Constraints.A01(r10)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r10)
            long r0 = androidx.compose.ui.unit.Constraints.A07(r3, r1, r2, r0)
            X.6Q4 r3 = r8.BPj(r0)
            int r2 = r3.A01
            int r1 = r3.A00
            X.7RH r0 = new X.7RH
            r0.<init>(r3)
            X.7kl r0 = X.C90474aD.A0M(r9, r0, r2, r1)
            return r0
        L_0x00fb:
            long r0 = X.AnonymousClass6X0.A02
            goto L_0x00c5
        L_0x00fe:
            X.6Eb r2 = r7.A03
            long r2 = r2.A00()
            float r2 = X.AnonymousClass6X0.A00(r2)
            goto L_0x00a6
        L_0x0109:
            X.6Eb r2 = r7.A03
            long r2 = r2.A00()
            float r4 = X.AnonymousClass6X0.A01(r2)
            goto L_0x0096
        L_0x0114:
            int r0 = androidx.compose.ui.unit.Constraints.A02(r10)
            goto L_0x0066
        L_0x011a:
            int r1 = androidx.compose.ui.unit.Constraints.A03(r10)
            goto L_0x0058
        L_0x0120:
            if (r5 != 0) goto L_0x0124
            goto L_0x0042
        L_0x0124:
            int r3 = androidx.compose.ui.unit.Constraints.A01(r10)
            int r2 = androidx.compose.ui.unit.Constraints.A00(r10)
            goto L_0x00dd
        L_0x012d:
            r6 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94254hu.BPi(X.7nJ, X.7nM, long):X.7kl");
    }

    public static final long A00(long j, long j2) {
        float A012 = AnonymousClass6X0.A01(j);
        long j3 = C112435dt.A00;
        if (j2 != j3) {
            float A013 = A012 * C90464aC.A01(j2);
            float A002 = AnonymousClass6X0.A00(j);
            if (j2 != j3) {
                return C90464aC.A0B(A013, A002 * C90464aC.A00(j2));
            }
            throw AnonymousClass001.A09("ScaleFactor is unspecified");
        }
        throw AnonymousClass001.A09("ScaleFactor is unspecified");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PainterModifier(painter=");
        A0u.append(this.A03);
        A0u.append(", sizeToIntrinsics=");
        A0u.append(this.A05);
        A0u.append(", alignment=");
        A0u.append(this.A01);
        A0u.append(", alpha=");
        A0u.append(this.A00);
        A0u.append(", colorFilter=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
