package X;

import android.graphics.Shader;
import java.util.Map;

/* renamed from: X.4iE  reason: invalid class name and case insensitive filesystem */
public final class C94444iE extends C137856gq implements C161837nY, C161817nW, C161777nS {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass6V8 A03;
    public C157027bi A04;
    public String A05;
    public C006302t A06;
    public boolean A07;
    public AnonymousClass6NV A08;
    public Map A09;
    public final C161547n5 A0A = C93994hT.A00(C137076fY.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");

    public /* synthetic */ void BaV() {
    }

    public static final AnonymousClass6NV A00(C94444iE r8) {
        AnonymousClass6NV r0 = r8.A08;
        if (r0 != null) {
            return r0;
        }
        String str = r8.A05;
        AnonymousClass6NV r02 = new AnonymousClass6NV(r8.A03, r8.A04, str, r8.A02, r8.A00, r8.A01, r8.A07);
        r8.A08 = r02;
        return r02;
    }

    public void B1K(AnonymousClass7e3 r7) {
        C006302t r3 = this.A06;
        if (r3 == null) {
            r3 = new AnonymousClass7R3(this);
            this.A06 = r3;
        }
        String str = this.A05;
        C023409w r5 = C023409w.A00;
        r7.Bq1(C114205gq.A0M, C36371kC.A11(new AnonymousClass72L(str, r5, r5)));
        C128286Bq r4 = (C128286Bq) this.A0A.getValue();
        if (r4 != null) {
            r7.Bq1(C114205gq.A0B, Boolean.valueOf(r4.A02));
            r7.Bq1(C114205gq.A0O, new AnonymousClass72L(r4.A01, r5, r5));
        }
        AnonymousClass69I.A01(C114195gp.A0M, r7, (String) null, new AnonymousClass7R4(this));
        AnonymousClass69I.A01(C114195gp.A0N, r7, (String) null, new AnonymousClass7R5(this));
        AnonymousClass69I.A01(C114195gp.A00, r7, (String) null, new C151967Ir(this));
        AnonymousClass69I.A01(C114195gp.A07, r7, (String) null, r3);
    }

    public void B5y(C161667nH r24) {
        IllegalArgumentException th;
        if (this.A08) {
            C160567lD r15 = A00(this).A06;
            if (r15 != null) {
                C161047m3 A002 = C128306Bs.A00(r24.BBD());
                boolean z = A00(this).A0D;
                if (z) {
                    long j = C133206Xf.A03;
                    long A0B = C90464aC.A0B((float) C90494aF.A08(A00(this).A03), (float) C90474aD.A03(A00(this).A03));
                    long j2 = AnonymousClass6X0.A02;
                    AnonymousClass6QC A003 = AnonymousClass5WT.A00(j, A0B);
                    A002.BpF();
                    float f = A003.A01;
                    float f2 = A003.A03;
                    float f3 = f2;
                    float f4 = f;
                    A002.B2x(f4, f3, A003.A02, A003.A00, 1);
                }
                try {
                    AnonymousClass6FJ r0 = this.A03.A02;
                    C131366Ot r7 = r0.A0B;
                    if (r7 == null) {
                        r7 = C131366Ot.A01;
                    }
                    AnonymousClass6PD r4 = r0.A03;
                    if (r4 == null) {
                        r4 = AnonymousClass6PD.A03;
                    }
                    C109085Wf r3 = r0.A04;
                    if (r3 == null) {
                        r3 = C94604iU.A00;
                    }
                    C161277mU r10 = r0.A0C;
                    C125185zS B8w = r10.B8w();
                    if (B8w != null) {
                        C109085Wf r19 = r3;
                        AnonymousClass6PD r18 = r4;
                        C161047m3 r17 = A002;
                        r15.BlB(B8w, r17, r18, r19, r7, r10.B8b(), 3);
                    } else {
                        long j3 = C133336Xx.A05;
                        long j4 = j3;
                        if (j3 == j3) {
                            if (r10.B9t() != j3) {
                                j3 = r10.B9t();
                            } else {
                                j3 = C133336Xx.A01;
                            }
                        }
                        C138016h8 r152 = (C138016h8) r15;
                        C91764ca r11 = r152.A02.A05;
                        C158827iI r102 = r11.A03;
                        C137416g6 r9 = (C137416g6) r102;
                        int i = r9.A00;
                        if (j3 != j4) {
                            r102.BqV(j3);
                            r9.A02 = null;
                            r9.A01.setShader((Shader) null);
                        }
                        r11.A02(r4);
                        r11.A04(r7);
                        r11.A03(r3);
                        r11.A00(3);
                        C138016h8.A01(A002, r152);
                        r11.A00(i);
                    }
                    if (z) {
                        A002.Boi();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                        A002.Boi();
                        throw th;
                    }
                }
            } else {
                th = AnonymousClass001.A08("no paragraph");
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0199, code lost:
        if (r8 == 2) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C160287kl BPi(X.C161687nJ r20, X.C161717nM r21, long r22) {
        /*
            r19 = this;
            r0 = r22
            r4 = r19
            X.7n5 r2 = r4.A0A
            java.lang.Object r3 = r2.getValue()
            X.6Bq r3 = (X.C128286Bq) r3
            if (r3 == 0) goto L_0x020d
            boolean r2 = r3.A02
            if (r2 == 0) goto L_0x020d
            X.6NV r3 = r3.A00
            if (r3 == 0) goto L_0x020d
        L_0x0016:
            r10 = r21
            r3.A01(r10)
            X.5RW r8 = r10.getLayoutDirection()
            int r2 = r3.A01
            r5 = 1
            if (r2 <= r5) goto L_0x003b
            X.64e r9 = r3.A05
            X.6V8 r7 = r3.A08
            X.7ni r6 = r3.A0A
            X.AnonymousClass00C.A0B(r6)
            X.7bi r2 = r3.A09
            X.64e r6 = X.AnonymousClass5W8.A00(r9, r7, r2, r6, r8)
            r3.A05 = r6
            int r2 = r3.A01
            long r0 = r6.A00(r0, r2)
        L_0x003b:
            X.7lD r11 = r3.A06
            if (r11 == 0) goto L_0x0072
            X.7k6 r2 = r3.A07
            if (r2 == 0) goto L_0x0072
            boolean r2 = r2.BCJ()
            if (r2 != 0) goto L_0x0072
            X.5RW r2 = r3.A0B
            if (r8 != r2) goto L_0x0072
            long r6 = r3.A04
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x019d
            int r9 = androidx.compose.ui.unit.Constraints.A01(r0)
            int r2 = androidx.compose.ui.unit.Constraints.A01(r6)
            if (r9 != r2) goto L_0x0072
            int r2 = androidx.compose.ui.unit.Constraints.A00(r0)
            float r6 = (float) r2
            float r2 = r11.BCO()
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0072
            X.6h8 r11 = (X.C138016h8) r11
            X.6WP r2 = r11.A01
            boolean r2 = r2.A0A
            if (r2 == 0) goto L_0x019d
        L_0x0072:
            r2 = 0
            X.7k6 r11 = r3.A07
            if (r11 == 0) goto L_0x0081
            X.5RW r6 = r3.A0B
            if (r8 != r6) goto L_0x0081
            boolean r6 = r11.BCJ()
            if (r6 == 0) goto L_0x009b
        L_0x0081:
            r3.A0B = r8
            java.lang.String r15 = r3.A0C
            X.6V8 r6 = r3.A08
            X.6V8 r12 = X.AnonymousClass5XR.A00(r6, r8)
            X.7ni r14 = r3.A0A
            X.AnonymousClass00C.A0B(r14)
            X.7bi r13 = r3.A09
            X.09w r16 = X.C023409w.A00
            X.6hA r11 = new X.6hA
            r17 = r16
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x009b:
            r3.A07 = r11
            boolean r8 = r3.A0E
            int r7 = r3.A02
            float r6 = r11.BDt()
            long r16 = X.C129236Fy.A00(r6, r7, r0, r8)
            boolean r6 = r3.A0E
            int r8 = r3.A02
            int r7 = r3.A00
            r15 = 1
            if (r6 != 0) goto L_0x0192
            r6 = 2
            if (r8 != r6) goto L_0x0192
        L_0x00b5:
            r18 = 1
        L_0x00b7:
            X.6hA r11 = (X.C138036hA) r11
            X.6h8 r13 = new X.6h8
            r14 = r11
            r13.<init>(r14, r15, r16, r18)
            r3.A04 = r0
            long r5 = r13.A00
            int r7 = androidx.compose.ui.unit.Constraints.A01(r5)
            float r7 = (float) r7
            int r8 = X.C90504aG.A05(r7)
            float r7 = r13.BCO()
            int r7 = X.C90504aG.A05(r7)
            long r11 = X.C90484aE.A0J(r8, r7)
            int r7 = X.C90494aF.A08(r11)
            int r8 = androidx.compose.ui.unit.Constraints.A06(r0, r7)
            int r7 = X.C90474aD.A03(r11)
            int r0 = androidx.compose.ui.unit.Constraints.A05(r0, r7)
            long r0 = X.C90484aE.A0J(r8, r0)
            r3.A03 = r0
            int r8 = r3.A02
            r7 = 3
            if (r8 == r7) goto L_0x010f
            int r7 = X.C90494aF.A08(r0)
            float r7 = (float) r7
            int r5 = androidx.compose.ui.unit.Constraints.A01(r5)
            float r5 = (float) r5
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x010e
            int r0 = X.C90474aD.A03(r0)
            float r1 = (float) r0
            float r0 = r13.BCO()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x010f
        L_0x010e:
            r2 = 1
        L_0x010f:
            r3.A0D = r2
            r3.A06 = r13
            r6 = 1
        L_0x0114:
            X.7k6 r0 = r3.A07
            if (r0 == 0) goto L_0x011b
            r0.BCJ()
        L_0x011b:
            X.7lD r5 = r3.A06
            X.AnonymousClass00C.A0B(r5)
            long r1 = r3.A03
            if (r6 == 0) goto L_0x0167
            r3 = 2
            X.4iy r0 = X.C137856gq.A06(r4)
            r0.A0P()
            java.util.Map r7 = r4.A09
            if (r7 != 0) goto L_0x0135
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r3)
        L_0x0135:
            X.4id r3 = X.C113555fj.A00
            float r0 = r5.BBs()
            int r0 = X.C14960mT.A01(r0)
            X.C36421kH.A1M(r3, r7, r0)
            X.4id r6 = X.C113555fj.A01
            X.6h8 r5 = (X.C138016h8) r5
            X.6WP r8 = r5.A01
            int r0 = r8.A04
            int r3 = r0 + -1
            int r0 = r8.A05
            float r5 = (float) r0
            if (r3 != r3) goto L_0x018a
            android.graphics.Paint$FontMetricsInt r0 = r8.A06
            if (r0 == 0) goto L_0x018a
            float r3 = r8.A03(r3)
            int r0 = r0.ascent
            float r0 = (float) r0
            float r3 = r3 - r0
        L_0x015d:
            float r5 = r5 + r3
            int r0 = X.C14960mT.A01(r5)
            X.C36421kH.A1M(r6, r7, r0)
            r4.A09 = r7
        L_0x0167:
            X.6Lx r0 = androidx.compose.ui.unit.Constraints.A01
            int r5 = X.C90494aF.A08(r1)
            int r3 = X.C90474aD.A03(r1)
            long r0 = X.C129236Fy.A01(r0, r5, r3)
            r2 = r20
            X.6Q4 r2 = r2.BPj(r0)
            java.util.Map r1 = r4.A09
            X.AnonymousClass00C.A0B(r1)
            X.7R6 r0 = new X.7R6
            r0.<init>(r2)
            X.7kl r0 = r10.BO0(r1, r0, r5, r3)
            return r0
        L_0x018a:
            android.text.Layout r0 = r8.A08
            int r0 = r0.getLineBaseline(r3)
            float r3 = (float) r0
            goto L_0x015d
        L_0x0192:
            if (r7 >= r5) goto L_0x0195
            r7 = 1
        L_0x0195:
            r15 = r7
            r5 = 2
            r18 = 0
            if (r8 != r5) goto L_0x00b7
            goto L_0x00b5
        L_0x019d:
            long r6 = r3.A04
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0208
            X.7lD r11 = r3.A06
            X.AnonymousClass00C.A0B(r11)
            r7 = r11
            X.6h8 r7 = (X.C138016h8) r7
            X.6hA r2 = r7.A02
            X.6TJ r2 = r2.A03
            float r6 = r2.A01()
            long r8 = r7.A00
            int r2 = androidx.compose.ui.unit.Constraints.A01(r8)
            float r2 = (float) r2
            float r2 = java.lang.Math.min(r6, r2)
            int r6 = X.C90504aG.A05(r2)
            float r2 = r11.BCO()
            int r2 = X.C90504aG.A05(r2)
            long r12 = X.C90484aE.A0J(r6, r2)
            int r2 = X.C90494aF.A08(r12)
            int r6 = androidx.compose.ui.unit.Constraints.A06(r0, r2)
            int r2 = X.C90474aD.A03(r12)
            int r2 = androidx.compose.ui.unit.Constraints.A05(r0, r2)
            long r6 = X.C90484aE.A0J(r6, r2)
            r3.A03 = r6
            int r12 = r3.A02
            r2 = 3
            if (r12 == r2) goto L_0x020b
            int r2 = X.C90494aF.A08(r6)
            float r12 = (float) r2
            int r2 = androidx.compose.ui.unit.Constraints.A01(r8)
            float r2 = (float) r2
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0204
            int r2 = X.C90474aD.A03(r6)
            float r6 = (float) r2
            float r2 = r11.BCO()
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x020b
        L_0x0204:
            r3.A0D = r5
            r3.A04 = r0
        L_0x0208:
            r6 = 0
            goto L_0x0114
        L_0x020b:
            r5 = 0
            goto L_0x0204
        L_0x020d:
            X.6NV r3 = A00(r4)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94444iE.BPi(X.7nJ, X.7nM, long):X.7kl");
    }

    public C94444iE(AnonymousClass6V8 r4, C157027bi r5, String str, int i, int i2, int i3, boolean z) {
        this.A05 = str;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = i;
        this.A07 = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    public /* synthetic */ boolean BHU() {
        return false;
    }
}
