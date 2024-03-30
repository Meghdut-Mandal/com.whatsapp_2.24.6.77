package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;
import java.util.Map;

/* renamed from: X.4iF  reason: invalid class name and case insensitive filesystem */
public final class C94454iF extends C137856gq implements C161837nY, C161817nW, C161777nS {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass72L A03;
    public AnonymousClass6V8 A04;
    public C157027bi A05;
    public List A06;
    public C006302t A07;
    public C006302t A08;
    public C006302t A09;
    public boolean A0A;
    public AnonymousClass65H A0B;
    public Map A0C;
    public final C161547n5 A0D = C93994hT.A00(C137076fY.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");

    public /* synthetic */ void BaV() {
    }

    public static final AnonymousClass65H A00(C94454iF r9) {
        AnonymousClass65H r0 = r9.A0B;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass72L r1 = r9.A03;
        AnonymousClass6V8 r2 = r9.A04;
        C157027bi r3 = r9.A05;
        int i = r9.A02;
        boolean z = r9.A0A;
        AnonymousClass65H r02 = new AnonymousClass65H(r1, r2, r3, r9.A06, i, r9.A00, r9.A01, z);
        r9.A0B = r02;
        return r02;
    }

    public static void A01(AnonymousClass65H r7, C94454iF r8, AnonymousClass72L r9) {
        AnonymousClass6V8 r6 = r8.A04;
        C157027bi r5 = r8.A05;
        int i = r8.A02;
        boolean z = r8.A0A;
        int i2 = r8.A00;
        int i3 = r8.A01;
        List list = r8.A06;
        r7.A04 = r9;
        r7.A07 = r6;
        r7.A08 = r5;
        r7.A02 = i;
        r7.A0C = z;
        r7.A00 = i2;
        r7.A01 = i3;
        r7.A0B = list;
        r7.A05 = null;
        r7.A06 = null;
    }

    public void B1K(AnonymousClass7e3 r5) {
        C006302t r3 = this.A09;
        if (r3 == null) {
            r3 = new C154127Qz(this);
            this.A09 = r3;
        }
        r5.Bq1(C114205gq.A0M, C36371kC.A11(this.A03));
        C128276Bp r2 = (C128276Bp) this.A0D.getValue();
        if (r2 != null) {
            r5.Bq1(C114205gq.A0O, r2.A01);
            r5.Bq1(C114205gq.A0B, Boolean.valueOf(r2.A02));
        }
        AnonymousClass69I.A01(C114195gp.A0M, r5, (String) null, new AnonymousClass7R0(this));
        AnonymousClass69I.A01(C114195gp.A0N, r5, (String) null, new AnonymousClass7R1(this));
        AnonymousClass69I.A01(C114195gp.A00, r5, (String) null, new C151957Iq(this));
        AnonymousClass69I.A01(C114195gp.A07, r5, (String) null, r3);
    }

    public void B5y(C161667nH r30) {
        AnonymousClass65H A002;
        int i;
        if (this.A08) {
            C161667nH r28 = r30;
            C161047m3 A003 = C128306Bs.A00(r28.BBD());
            C128276Bp r1 = (C128276Bp) this.A0D.getValue();
            if (r1 == null || !r1.A02 || (A002 = r1.A00) == null) {
                A002 = A00(this);
            }
            A002.A00(r28);
            AnonymousClass6FW r0 = A002.A06;
            if (r0 != null) {
                AnonymousClass6NL r5 = r0.A03;
                long j = r0.A02;
                float A082 = (float) C90494aF.A08(j);
                if ((A082 < r5.A01 || r5.A06 || ((float) C90474aD.A03(j)) < r5.A00) && this.A02 != 3) {
                    i = 1;
                    long j2 = C133206Xf.A03;
                    long A0B2 = C90464aC.A0B(A082, (float) C90474aD.A03(j));
                    long j3 = AnonymousClass6X0.A02;
                    AnonymousClass6QC A004 = AnonymousClass5WT.A00(j2, A0B2);
                    A003.BpF();
                    A003.B2x(A004.A01, A004.A03, A004.A02, A004.A00, i);
                } else {
                    i = 0;
                }
                try {
                    AnonymousClass6FJ r02 = this.A04.A02;
                    C131366Ot r8 = r02.A0B;
                    if (r8 == null) {
                        r8 = C131366Ot.A01;
                    }
                    AnonymousClass6PD r7 = r02.A03;
                    if (r7 == null) {
                        r7 = AnonymousClass6PD.A03;
                    }
                    C109085Wf r6 = r02.A04;
                    if (r6 == null) {
                        r6 = C94604iU.A00;
                    }
                    C161277mU r11 = r02.A0C;
                    C125185zS B8w = r11.B8w();
                    if (B8w != null) {
                        float B8b = r11.B8b();
                        A003.BpF();
                        List list = r5.A04;
                        if (list.size() <= 1 || (B8w instanceof C94484iI)) {
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                C160567lD r112 = ((AnonymousClass6DO) list.get(i2)).A06;
                                r112.BlB(B8w, A003, r7, r6, r8, B8b, 3);
                                A003.Bw6(0.0f, r112.BCO());
                            }
                        } else if (B8w instanceof C94474iH) {
                            int size2 = list.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                ((AnonymousClass6DO) list.get(i3)).A06.BCO();
                            }
                            long j4 = AnonymousClass6X0.A02;
                            Shader shader = ((C94524iM) ((C94474iH) B8w)).A00;
                            Matrix A0B3 = C90524aI.A0B();
                            shader.getLocalMatrix(A0B3);
                            int size3 = list.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                C160567lD r12 = ((AnonymousClass6DO) list.get(i4)).A06;
                                r12.BlB(new C94524iM(shader), A003, r7, r6, r8, B8b, 3);
                                A003.Bw6(0.0f, r12.BCO());
                                A0B3.setTranslate(0.0f, -r12.BCO());
                                shader.setLocalMatrix(A0B3);
                            }
                        }
                    } else {
                        long j5 = C133336Xx.A05;
                        long j6 = j5;
                        if (j5 == j5) {
                            if (r11.B9t() != j5) {
                                j5 = r11.B9t();
                            } else {
                                j5 = C133336Xx.A01;
                            }
                        }
                        A003.BpF();
                        List list2 = r5.A04;
                        int size4 = list2.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            C160567lD r13 = ((AnonymousClass6DO) list2.get(i5)).A06;
                            C138016h8 r122 = (C138016h8) r13;
                            C91764ca r52 = r122.A02.A05;
                            C158827iI r14 = r52.A03;
                            C137416g6 r03 = (C137416g6) r14;
                            int i6 = r03.A00;
                            if (j5 != j6) {
                                r14.BqV(j5);
                                r03.A02 = null;
                                r03.A01.setShader((Shader) null);
                            }
                            r52.A02(r7);
                            r52.A04(r8);
                            r52.A03(r6);
                            r52.A00(3);
                            C138016h8.A01(A003, r122);
                            r52.A00(i6);
                            A003.Bw6(0.0f, r13.BCO());
                        }
                    }
                    A003.Boi();
                    List list3 = this.A06;
                    if (list3 != null && !list3.isEmpty()) {
                        r28.B63();
                    }
                } finally {
                    if (i != 0) {
                        A003.Boi();
                    }
                }
            } else {
                throw AnonymousClass001.A09("You must call layoutWithConstraints first");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019c, code lost:
        if (r9 == 2) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C160287kl BPi(X.C161687nJ r30, X.C161717nM r31, long r32) {
        /*
            r29 = this;
            r0 = r32
            r7 = r29
            X.7n5 r2 = r7.A0D
            java.lang.Object r3 = r2.getValue()
            X.6Bp r3 = (X.C128276Bp) r3
            if (r3 == 0) goto L_0x01b9
            boolean r2 = r3.A02
            if (r2 == 0) goto L_0x01b9
            X.65H r6 = r3.A00
            if (r6 == 0) goto L_0x01b9
        L_0x0016:
            r8 = r31
            r6.A00(r8)
            X.5RW r5 = r8.getLayoutDirection()
            int r2 = r6.A01
            r4 = 1
            if (r2 <= r4) goto L_0x003b
            X.64e r10 = r6.A03
            X.6V8 r9 = r6.A07
            X.7ni r3 = r6.A09
            X.AnonymousClass00C.A0B(r3)
            X.7bi r2 = r6.A08
            X.64e r3 = X.AnonymousClass5W8.A00(r10, r9, r2, r3, r5)
            r6.A03 = r3
            int r2 = r6.A01
            long r0 = r3.A00(r0, r2)
        L_0x003b:
            X.6FW r3 = r6.A06
            if (r3 == 0) goto L_0x006e
            X.6NL r10 = r3.A03
            X.6h9 r2 = r10.A03
            boolean r2 = r2.BCJ()
            if (r2 != 0) goto L_0x006e
            X.6Dq r3 = r3.A04
            X.5RW r2 = r3.A07
            if (r5 != r2) goto L_0x006e
            long r2 = r3.A02
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x01a0
            int r9 = androidx.compose.ui.unit.Constraints.A01(r0)
            int r2 = androidx.compose.ui.unit.Constraints.A01(r2)
            if (r9 != r2) goto L_0x006e
            int r2 = androidx.compose.ui.unit.Constraints.A00(r0)
            float r3 = (float) r2
            float r2 = r10.A00
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x006e
            boolean r2 = r10.A06
            if (r2 == 0) goto L_0x01a0
        L_0x006e:
            X.6h9 r10 = r6.A05
            if (r10 == 0) goto L_0x007c
            X.5RW r2 = r6.A0A
            if (r5 != r2) goto L_0x007c
            boolean r2 = r10.BCJ()
            if (r2 == 0) goto L_0x009a
        L_0x007c:
            r6.A0A = r5
            X.72L r11 = r6.A04
            X.6V8 r2 = r6.A07
            X.6V8 r12 = X.AnonymousClass5XR.A00(r2, r5)
            X.7ni r3 = r6.A09
            X.AnonymousClass00C.A0B(r3)
            X.7bi r13 = r6.A08
            java.util.List r2 = r6.A0B
            if (r2 != 0) goto L_0x0093
            X.09w r2 = X.C023409w.A00
        L_0x0093:
            X.6h9 r10 = new X.6h9
            r14 = r3
            r15 = r2
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x009a:
            r6.A05 = r10
            boolean r9 = r6.A0C
            int r3 = r6.A02
            float r2 = r10.BDt()
            long r12 = X.C129236Fy.A00(r2, r3, r0, r9)
            boolean r2 = r6.A0C
            int r9 = r6.A02
            int r3 = r6.A00
            r11 = 1
            if (r2 != 0) goto L_0x0196
            r2 = 2
            if (r9 != r2) goto L_0x0196
        L_0x00b4:
            r14 = 1
        L_0x00b5:
            X.6NL r3 = new X.6NL
            r9 = r3
            r9.<init>(r10, r11, r12, r14)
        L_0x00bb:
            X.6h9 r2 = r3.A03
            float r9 = r2.BDt()
            float r2 = r3.A01
            float r16 = java.lang.Math.min(r9, r2)
            X.72L r2 = r6.A04
            r17 = r2
            X.6V8 r15 = r6.A07
            java.util.List r14 = r6.A0B
            if (r14 != 0) goto L_0x00d3
            X.09w r14 = X.C023409w.A00
        L_0x00d3:
            int r13 = r6.A00
            boolean r12 = r6.A0C
            int r11 = r6.A02
            X.7ni r10 = r6.A09
            X.AnonymousClass00C.A0B(r10)
            X.7bi r2 = r6.A08
            X.6Dq r9 = new X.6Dq
            r26 = r0
            r28 = r12
            r22 = r5
            r23 = r14
            r24 = r13
            r25 = r11
            r20 = r2
            r21 = r10
            r18 = r17
            r19 = r15
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            int r5 = X.C90504aG.A05(r16)
            float r2 = r3.A00
            int r2 = X.C90504aG.A05(r2)
            long r10 = X.C90484aE.A0J(r5, r2)
            int r2 = X.C90494aF.A08(r10)
            int r5 = androidx.compose.ui.unit.Constraints.A06(r0, r2)
            int r2 = X.C90474aD.A03(r10)
            int r0 = androidx.compose.ui.unit.Constraints.A05(r0, r2)
            long r0 = X.C90484aE.A0J(r5, r0)
            X.6FW r2 = new X.6FW
            r2.<init>(r3, r9, r0)
            r6.A06 = r2
            r1 = 1
        L_0x0125:
            X.6FW r3 = r6.A06
            if (r3 == 0) goto L_0x01bf
            X.6NL r0 = r3.A03
            X.6h9 r0 = r0.A03
            r0.BCJ()
            if (r1 == 0) goto L_0x0168
            r1 = 2
            X.4iy r0 = X.C137856gq.A06(r7)
            r0.A0P()
            X.02t r0 = r7.A08
            if (r0 == 0) goto L_0x0141
            r0.invoke(r3)
        L_0x0141:
            X.011[] r5 = new X.AnonymousClass011[r1]
            r2 = 0
            X.4id r1 = X.C113555fj.A00
            float r0 = r3.A00
            int r0 = X.C14960mT.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C36341k9.A1J(r1, r0, r5, r2)
            X.4id r1 = X.C113555fj.A01
            float r0 = r3.A01
            int r0 = X.C14960mT.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C36341k9.A1J(r1, r0, r5, r4)
            java.util.LinkedHashMap r0 = X.C000400e.A07(r5)
            r7.A0C = r0
        L_0x0168:
            X.02t r1 = r7.A07
            if (r1 == 0) goto L_0x0171
            java.util.List r0 = r3.A05
            r1.invoke(r0)
        L_0x0171:
            X.6Lx r2 = androidx.compose.ui.unit.Constraints.A01
            long r0 = r3.A02
            int r4 = X.C90494aF.A08(r0)
            int r3 = X.C90474aD.A03(r0)
            long r0 = X.C129236Fy.A01(r2, r4, r3)
            r2 = r30
            X.6Q4 r2 = r2.BPj(r0)
            java.util.Map r1 = r7.A0C
            X.AnonymousClass00C.A0B(r1)
            X.7R2 r0 = new X.7R2
            r0.<init>(r2)
            X.7kl r0 = r8.BO0(r1, r0, r4, r3)
            return r0
        L_0x0196:
            if (r3 >= r4) goto L_0x0199
            r3 = 1
        L_0x0199:
            r11 = r3
            r2 = 2
            r14 = 0
            if (r9 != r2) goto L_0x00b5
            goto L_0x00b4
        L_0x01a0:
            X.6FW r2 = r6.A06
            X.AnonymousClass00C.A0B(r2)
            X.6Dq r2 = r2.A04
            long r2 = r2.A02
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x01b0
            r1 = 0
            goto L_0x0125
        L_0x01b0:
            X.6FW r2 = r6.A06
            X.AnonymousClass00C.A0B(r2)
            X.6NL r3 = r2.A03
            goto L_0x00bb
        L_0x01b9:
            X.65H r6 = A00(r7)
            goto L_0x0016
        L_0x01bf:
            java.lang.String r0 = "You must call layoutWithConstraints first"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94454iF.BPi(X.7nJ, X.7nM, long):X.7kl");
    }

    public C94454iF(AnonymousClass72L r4, AnonymousClass6V8 r5, C157027bi r6, List list, C006302t r8, C006302t r9, int i, int i2, int i3, boolean z) {
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A08 = r8;
        this.A02 = i;
        this.A0A = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = list;
        this.A07 = r9;
    }

    public /* synthetic */ boolean BHU() {
        return false;
    }
}
