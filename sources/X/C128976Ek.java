package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Arrays;

/* renamed from: X.6Ek  reason: invalid class name and case insensitive filesystem */
public final class C128976Ek {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int[] A05 = new int[16];
    public AnonymousClass6EM[] A06 = new AnonymousClass6EM[16];
    public Object[] A07 = new Object[16];

    public static int A00(C128976Ek r2, int i) {
        return (1 << i) & r2.A03;
    }

    public static int A01(C128976Ek r2, int i) {
        return (1 << i) & r2.A04;
    }

    public final void A02() {
        this.A02 = 0;
        this.A00 = 0;
        AnonymousClass02Q.A04(this.A07, 0, this.A01);
        this.A01 = 0;
    }

    public final void A05(AnonymousClass6EM r8) {
        this.A03 = 0;
        this.A04 = 0;
        int i = this.A02;
        AnonymousClass6EM[] r2 = this.A06;
        if (i == r2.length) {
            int i2 = i;
            if (i > 1024) {
                i2 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            }
            this.A06 = (AnonymousClass6EM[]) AnonymousClass00C.A0K(r2, i + i2);
        }
        int i3 = this.A00;
        int i4 = r8.A00;
        int i5 = i3 + i4;
        int[] iArr = this.A05;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = length;
            if (length > 1024) {
                i6 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            }
            int i7 = length + i6;
            if (i7 < i5) {
                i7 = i5;
            }
            int[] copyOf = Arrays.copyOf(iArr, i7);
            AnonymousClass00C.A08(copyOf);
            this.A05 = copyOf;
        }
        int i8 = this.A01;
        int i9 = r8.A01;
        int i10 = i8 + i9;
        Object[] objArr = this.A07;
        int length2 = objArr.length;
        if (i10 > length2) {
            int i11 = length2;
            if (length2 > 1024) {
                i11 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            }
            int i12 = length2 + i11;
            if (i12 < i10) {
                i12 = i10;
            }
            this.A07 = AnonymousClass00C.A0K(objArr, i12);
        }
        AnonymousClass6EM[] r22 = this.A06;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        r22[i13] = r8;
        this.A00 += i4;
        this.A01 += i9;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: X.6gp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C157567dk r23, X.AnonymousClass7bJ r24, X.AnonymousClass6YK r25) {
        /*
            r22 = this;
            r21 = r22
            r0 = r21
            int r0 = r0.A02
            if (r0 == 0) goto L_0x04dc
            X.6ff r4 = new X.6ff
            r0 = r21
            r4.<init>(r0)
        L_0x000f:
            X.6Ek r5 = r4.A03
            X.6EM[] r1 = r5.A06
            int r0 = r4.A02
            r3 = r1[r0]
            X.AnonymousClass00C.A0B(r3)
            boolean r0 = r3 instanceof X.C93644gu
            r9 = r23
            if (r0 == 0) goto L_0x0055
            r0 = r9
            X.6fD r0 = (X.C136896fD) r0
            java.lang.Object r1 = r0.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback"
            X.AnonymousClass00C.A0E(r1, r0)
            X.7k0 r1 = (X.C159837k0) r1
            r1.BfY()
        L_0x002f:
            int r1 = r4.A02
            int r0 = r5.A02
            if (r1 >= r0) goto L_0x04dc
            X.6EM[] r0 = r5.A06
            r2 = r0[r1]
            X.AnonymousClass00C.A0B(r2)
            int r1 = r4.A00
            int r0 = r2.A00
            int r1 = r1 + r0
            r4.A00 = r1
            int r1 = r4.A01
            int r0 = r2.A01
            int r1 = r1 + r0
            r4.A01 = r1
            int r0 = r4.A02
            int r1 = r0 + 1
            r4.A02 = r1
            int r0 = r5.A02
            if (r1 >= r0) goto L_0x04dc
            goto L_0x000f
        L_0x0055:
            boolean r0 = r3 instanceof X.C93784h8
            if (r0 == 0) goto L_0x006a
            r2 = 0
            X.6Ek r0 = r4.A03
            int[] r1 = r0.A05
            int r0 = r4.A00
            r0 = r1[r0]
        L_0x0062:
            if (r2 >= r0) goto L_0x002f
            r9.BwR()
            int r2 = r2 + 1
            goto L_0x0062
        L_0x006a:
            boolean r0 = r3 instanceof X.C93814hB
            r1 = r24
            r2 = r25
            if (r0 == 0) goto L_0x00a8
            X.6Ek r6 = r4.A03
            java.lang.Object[] r3 = r6.A07
            int r0 = r4.A01
            r7 = r3[r0]
            int[] r3 = r6.A05
            int r0 = r4.A00
            r6 = r3[r0]
            boolean r0 = r7 instanceof X.C114295gz
            if (r0 == 0) goto L_0x0091
            r0 = r7
            X.5gz r0 = (X.C114295gz) r0
            X.7k1 r3 = r0.A00
            r0 = r1
            X.6fQ r0 = (X.C136996fQ) r0
            java.util.List r0 = r0.A02
            r0.add(r3)
        L_0x0091:
            int r0 = r2.A00
            java.lang.Object r2 = r2.A0J(r7, r0, r6)
            boolean r0 = r2 instanceof X.C114295gz
            if (r0 == 0) goto L_0x014d
            X.5gz r2 = (X.C114295gz) r2
            X.7k1 r2 = r2.A00
            r0 = r1
            X.6fQ r0 = (X.C136996fQ) r0
            java.util.List r0 = r0.A01
        L_0x00a4:
            r0.add(r2)
            goto L_0x002f
        L_0x00a8:
            boolean r0 = r3 instanceof X.C93774h7
            if (r0 == 0) goto L_0x00c4
            X.6Ek r0 = r4.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r4.A01
            r2 = r1[r0]
            int r0 = r0 + 1
            r1 = r1[r0]
            X.03v r1 = (X.C009003v) r1
            r0 = r9
            X.6fD r0 = (X.C136896fD) r0
            java.lang.Object r0 = r0.A00
            r1.invoke(r0, r2)
            goto L_0x002f
        L_0x00c4:
            boolean r0 = r3 instanceof X.C93764h6
            if (r0 == 0) goto L_0x00d5
            X.6Ek r0 = r4.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r4.A01
            r0 = r1[r0]
            r2.A0Q(r0)
            goto L_0x002f
        L_0x00d5:
            boolean r0 = r3 instanceof X.C93634gt
            if (r0 == 0) goto L_0x00e7
            int r1 = r2.A01
            r2.A00 = r1
            int[] r0 = r2.A0G
            int r0 = X.AnonymousClass6YK.A02(r2, r0, r1)
            r2.A02 = r0
            goto L_0x002f
        L_0x00e7:
            boolean r0 = r3 instanceof X.C93754h5
            if (r0 == 0) goto L_0x00f9
            X.6Ek r0 = r4.A03
            java.lang.Object[] r2 = r0.A07
            int r0 = r4.A01
            r2 = r2[r0]
            r0 = r1
            X.6fQ r0 = (X.C136996fQ) r0
            java.util.List r0 = r0.A03
            goto L_0x00a4
        L_0x00f9:
            boolean r0 = r3 instanceof X.C93624gs
            if (r0 == 0) goto L_0x0115
            int r0 = r2.A06
            r1 = 0
            if (r0 != 0) goto L_0x0487
            X.AnonymousClass6YK.A06(r2)
            r2.A00 = r1
            int r0 = X.AnonymousClass6YK.A00(r2)
            r2.A01 = r0
            r2.A02 = r1
            r2.A03 = r1
            r2.A07 = r1
            goto L_0x002f
        L_0x0115:
            boolean r0 = r3 instanceof X.C93744h4
            if (r0 == 0) goto L_0x0131
            X.6Ek r0 = r4.A03
            int[] r1 = r0.A05
            int r0 = r4.A00
            r2 = r1[r0]
            int r0 = r0 + 1
            r1 = r1[r0]
            r0 = r9
            X.6fD r0 = (X.C136896fD) r0
            java.lang.Object r0 = r0.A00
            X.6gp r0 = (X.C137846gp) r0
            r0.A0Q(r2, r1)
            goto L_0x002f
        L_0x0131:
            boolean r0 = r3 instanceof X.C93614gr
            if (r0 == 0) goto L_0x013a
            X.AnonymousClass6XJ.A03(r1, r2)
            goto L_0x002f
        L_0x013a:
            boolean r0 = r3 instanceof X.C93734h3
            if (r0 == 0) goto L_0x0158
            X.6Ek r0 = r4.A03
            java.lang.Object[] r2 = r0.A07
            int r0 = r4.A01
            r2 = r2[r0]
            r0 = r1
            X.6fQ r0 = (X.C136996fQ) r0
            java.util.List r0 = r0.A02
            goto L_0x00a4
        L_0x014d:
            boolean r0 = r2 instanceof X.C136976fO
            if (r0 == 0) goto L_0x002f
            X.6fO r2 = (X.C136976fO) r2
            r2.A00()
            goto L_0x002f
        L_0x0158:
            boolean r0 = r3 instanceof X.C93804hA
            if (r0 == 0) goto L_0x01a3
            X.6Ek r6 = r4.A03
            java.lang.Object[] r1 = r6.A07
            int r0 = r4.A01
            r3 = r1[r0]
            X.606 r3 = (X.AnonymousClass606) r3
            int[] r1 = r6.A05
            int r0 = r4.A00
            r7 = r1[r0]
            r9.BwR()
            int r1 = r3.A00
            if (r1 >= 0) goto L_0x0178
            int r0 = X.AnonymousClass6YK.A00(r2)
            int r1 = r1 + r0
        L_0x0178:
            int r6 = X.AnonymousClass6YK.A01(r2, r1)
            int[] r1 = r2.A0G
            boolean r0 = X.AnonymousClass6QR.A03(r1, r6)
            if (r0 == 0) goto L_0x01a1
            java.lang.Object[] r3 = r2.A0H
            int r1 = X.AnonymousClass6YK.A03(r2, r1, r6)
            int r0 = r2.A0B
            if (r1 < r0) goto L_0x0191
            int r0 = r2.A09
            int r1 = r1 + r0
        L_0x0191:
            r1 = r3[r1]
        L_0x0193:
            r0 = r9
            X.6fD r0 = (X.C136896fD) r0
            X.6gp r1 = (X.C137846gp) r1
            java.lang.Object r0 = r0.A00
            X.6gp r0 = (X.C137846gp) r0
            r0.A0S(r1, r7)
            goto L_0x002f
        L_0x01a1:
            r1 = 0
            goto L_0x0193
        L_0x01a3:
            boolean r0 = r3 instanceof X.C93724h2
            if (r0 == 0) goto L_0x01c3
            X.6Ek r0 = r4.A03
            int[] r6 = r0.A05
            int r1 = r4.A00
            r3 = r6[r1]
            int r0 = r1 + 1
            r2 = r6[r0]
            int r0 = r1 + 2
            r1 = r6[r0]
            r0 = r9
            X.6fD r0 = (X.C136896fD) r0
            java.lang.Object r0 = r0.A00
            X.6gp r0 = (X.C137846gp) r0
            r0.A0R(r3, r2, r1)
            goto L_0x002f
        L_0x01c3:
            boolean r0 = r3 instanceof X.C93714h1
            if (r0 == 0) goto L_0x02f4
            X.6Ek r0 = r4.A03
            int[] r1 = r0.A05
            int r0 = r4.A00
            r9 = r1[r0]
            int r0 = r2.A06
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L_0x0498
            boolean r0 = X.C36401kF.A1U(r9)
            java.lang.String r6 = "Parameter offset is out of bounds"
            if (r0 == 0) goto L_0x0493
            if (r9 == 0) goto L_0x002f
            int r8 = r2.A00
            int r0 = r2.A08
            r20 = r0
            int r3 = r2.A01
            r7 = r8
        L_0x01e8:
            int[] r1 = r2.A0G
            int r0 = X.AnonymousClass6YK.A01(r2, r7)
            if (r9 <= 0) goto L_0x01fa
            int r0 = X.C90524aI.A05(r1, r0)
            int r7 = r7 + r0
            if (r7 > r3) goto L_0x048e
            int r9 = r9 + -1
            goto L_0x01e8
        L_0x01fa:
            int r9 = X.C90524aI.A05(r1, r0)
            int r14 = r2.A02
            int r6 = X.AnonymousClass6YK.A03(r2, r1, r0)
            int r7 = r7 + r9
            int r13 = X.AnonymousClass6YK.A02(r2, r1, r7)
            int r3 = r13 - r6
            int r0 = r8 - r11
            int r0 = java.lang.Math.max(r0, r10)
            X.AnonymousClass6YK.A0B(r2, r3, r0)
            X.AnonymousClass6YK.A07(r2, r9)
            int[] r1 = r2.A0G
            int r0 = X.AnonymousClass6YK.A01(r2, r7)
            int r11 = r0 * 5
            int r0 = X.AnonymousClass6YK.A01(r2, r8)
            int r10 = r0 * 5
            int r0 = r9 * 5
            int r0 = r0 + r11
            X.AnonymousClass02Q.A03(r10, r11, r0, r1, r1)
            if (r3 <= 0) goto L_0x0241
            java.lang.Object[] r12 = r2.A0H
            int r11 = r6 + r3
            int r10 = r2.A0B
            if (r11 < r10) goto L_0x0238
            int r0 = r2.A09
            int r11 = r11 + r0
        L_0x0238:
            int r13 = r13 + r3
            if (r13 < r10) goto L_0x023e
            int r0 = r2.A09
            int r13 = r13 + r0
        L_0x023e:
            X.AnonymousClass02Q.A05(r12, r14, r12, r11, r13)
        L_0x0241:
            int r6 = r6 + r3
            int r17 = r6 - r14
            int r0 = r2.A0B
            r19 = r0
            int r11 = r2.A09
            java.lang.Object[] r0 = r2.A0H
            int r10 = r0.length
            int r0 = r2.A0A
            r18 = r0
            int r16 = r8 + r9
            r12 = r8
        L_0x0254:
            r0 = r16
            if (r12 >= r0) goto L_0x0284
            int r14 = X.AnonymousClass6YK.A01(r2, r12)
            int r13 = X.AnonymousClass6YK.A03(r2, r1, r14)
            int r13 = r13 - r17
            r15 = r19
            r0 = r18
            if (r0 >= r14) goto L_0x0269
            r15 = 0
        L_0x0269:
            if (r13 <= r15) goto L_0x0271
            int r0 = r10 - r11
            int r0 = r0 - r13
            int r0 = r0 + 1
            int r13 = -r0
        L_0x0271:
            r0 = r19
            if (r13 <= r0) goto L_0x027b
            int r0 = r10 - r11
            int r0 = r0 - r13
            int r0 = r0 + 1
            int r13 = -r0
        L_0x027b:
            int r0 = r14 * 5
            int r0 = r0 + 4
            r1[r0] = r13
            int r12 = r12 + 1
            goto L_0x0254
        L_0x0284:
            int r11 = r9 + r7
            int r14 = X.AnonymousClass6YK.A00(r2)
            java.util.ArrayList r1 = r2.A0D
            int r12 = X.AnonymousClass6QR.A01(r1, r7, r14)
            if (r12 >= 0) goto L_0x0295
            int r0 = r12 + 1
            int r12 = -r0
        L_0x0295:
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            if (r12 < 0) goto L_0x02bd
        L_0x029b:
            int r0 = r1.size()
            if (r12 >= r0) goto L_0x02bd
            java.lang.Object r10 = r1.get(r12)
            X.606 r10 = (X.AnonymousClass606) r10
            int r1 = r10.A00
            if (r1 >= 0) goto L_0x02b0
            int r0 = X.AnonymousClass6YK.A00(r2)
            int r1 = r1 + r0
        L_0x02b0:
            if (r1 < r7) goto L_0x02bd
            if (r1 >= r11) goto L_0x02bd
            r13.add(r10)
            java.util.ArrayList r1 = r2.A0D
            r1.remove(r12)
            goto L_0x029b
        L_0x02bd:
            int r16 = r8 - r7
            r12 = 0
            int r11 = r13.size()
        L_0x02c4:
            if (r12 >= r11) goto L_0x045a
            java.lang.Object r10 = r13.get(r12)
            X.606 r10 = (X.AnonymousClass606) r10
            int r15 = r10.A00
            if (r15 >= 0) goto L_0x02d5
            int r0 = X.AnonymousClass6YK.A00(r2)
            int r15 = r15 + r0
        L_0x02d5:
            int r15 = r15 + r16
            int r0 = r2.A05
            if (r15 < r0) goto L_0x02f1
            int r0 = r14 - r15
            int r0 = -r0
            r10.A00 = r0
        L_0x02e0:
            java.util.ArrayList r1 = r2.A0D
            int r0 = X.AnonymousClass6QR.A01(r1, r15, r14)
            if (r0 >= 0) goto L_0x02eb
            int r0 = r0 + 1
            int r0 = -r0
        L_0x02eb:
            r1.add(r0, r10)
            int r12 = r12 + 1
            goto L_0x02c4
        L_0x02f1:
            r10.A00 = r15
            goto L_0x02e0
        L_0x02f4:
            boolean r0 = r3 instanceof X.C93704h0
            if (r0 == 0) goto L_0x031e
            X.6Ek r0 = r4.A03
            java.lang.Object[] r6 = r0.A07
            int r3 = r4.A01
            int r0 = r3 + 1
            r8 = r6[r0]
            X.72c r8 = (X.C1496372c) r8
            r7 = r6[r3]
            X.606 r7 = (X.AnonymousClass606) r7
            int r0 = r3 + 2
            r6 = r6[r0]
            X.5nd r6 = (X.C118285nd) r6
            X.6YK r3 = r8.A02()
            X.6Ek r0 = r6.A01     // Catch:{ all -> 0x04a6 }
            int r0 = r0.A02     // Catch:{ all -> 0x04a6 }
            if (r0 != 0) goto L_0x049f
            X.6Ek r0 = r6.A00     // Catch:{ all -> 0x04a6 }
            r0.A03(r9, r1, r3)     // Catch:{ all -> 0x04a6 }
            goto L_0x033d
        L_0x031e:
            boolean r0 = r3 instanceof X.C93694gz
            if (r0 == 0) goto L_0x034f
            X.6Ek r0 = r4.A03
            java.lang.Object[] r6 = r0.A07
            int r3 = r4.A01
            int r0 = r3 + 1
            r1 = r6[r0]
            X.72c r1 = (X.C1496372c) r1
            r0 = r6[r3]
            X.606 r0 = (X.AnonymousClass606) r0
            r2.A0K()
            int r0 = r1.A00(r0)
            r2.A0P(r1, r0)
            goto L_0x034a
        L_0x033d:
            r3.A0L()
            r2.A0K()
            int r0 = r8.A00(r7)
            r2.A0P(r8, r0)
        L_0x034a:
            r2.A0N()
            goto L_0x002f
        L_0x034f:
            boolean r0 = r3 instanceof X.C93794h9
            if (r0 == 0) goto L_0x038a
            X.6Ek r6 = r4.A03
            java.lang.Object[] r1 = r6.A07
            int r0 = r4.A01
            r0 = r1[r0]
            X.00S r0 = (X.AnonymousClass00S) r0
            java.lang.Object r3 = r0.invoke()
            java.lang.Object[] r1 = r6.A07
            int r0 = r4.A01
            int r0 = r0 + 1
            r1 = r1[r0]
            X.606 r1 = (X.AnonymousClass606) r1
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"
            X.AnonymousClass00C.A0E(r9, r0)
            int r1 = r1.A00
            if (r1 >= 0) goto L_0x0379
            int r0 = X.AnonymousClass6YK.A00(r2)
            int r1 = r1 + r0
        L_0x0379:
            X.AnonymousClass6YK.A0E(r2, r3, r1)
            r2 = r9
            X.6fD r2 = (X.C136896fD) r2
            java.util.List r1 = r2.A02
            java.lang.Object r0 = r2.A00
            r1.add(r0)
            r2.A00 = r3
            goto L_0x002f
        L_0x038a:
            boolean r0 = r3 instanceof X.C93604gq
            if (r0 == 0) goto L_0x0394
            r0 = 0
            r2.A0O(r0)
            goto L_0x002f
        L_0x0394:
            boolean r0 = r3 instanceof X.C93684gy
            if (r0 == 0) goto L_0x03b0
            X.6Ek r0 = r4.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r4.A01
            r0 = r1[r0]
            X.606 r0 = (X.AnonymousClass606) r0
            int r1 = r0.A00
            if (r1 >= 0) goto L_0x03ab
            int r0 = X.AnonymousClass6YK.A00(r2)
            int r1 = r1 + r0
        L_0x03ab:
            r2.A0O(r1)
            goto L_0x002f
        L_0x03b0:
            boolean r0 = r3 instanceof X.C93594gp
            if (r0 == 0) goto L_0x03e1
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"
            X.AnonymousClass00C.A0E(r9, r0)
        L_0x03b9:
            r1 = 0
            int r3 = r2.A08
            if (r1 <= r3) goto L_0x03fc
            int r0 = r2.A01
            if (r1 < r0) goto L_0x03fe
        L_0x03c2:
            int r1 = r2.A01
            r2.A00 = r1
            int[] r0 = r2.A0G
            int r0 = X.AnonymousClass6YK.A02(r2, r0, r1)
            r2.A02 = r0
            int[] r1 = r2.A0G
            int r0 = X.AnonymousClass6YK.A01(r2, r3)
            boolean r0 = X.AnonymousClass6QR.A03(r1, r0)
            if (r0 == 0) goto L_0x03dd
            r9.BwR()
        L_0x03dd:
            r2.A0M()
            goto L_0x03b9
        L_0x03e1:
            boolean r0 = r3 instanceof X.C93584go
            if (r0 != 0) goto L_0x03fe
            boolean r0 = r3 instanceof X.C93674gx
            if (r0 == 0) goto L_0x0403
            X.6Ek r0 = r4.A03
            java.lang.Object[] r2 = r0.A07
            int r0 = r4.A01
            r1 = r2[r0]
            X.02t r1 = (X.C006302t) r1
            int r0 = r0 + 1
            r0 = r2[r0]
            r1.invoke(r0)
            goto L_0x002f
        L_0x03fc:
            if (r3 != 0) goto L_0x03c2
        L_0x03fe:
            r2.A0M()
            goto L_0x002f
        L_0x0403:
            boolean r0 = r3 instanceof X.C93664gw
            if (r0 == 0) goto L_0x042b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"
            X.AnonymousClass00C.A0E(r9, r0)
            r8 = 0
            X.6Ek r0 = r4.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r4.A01
            r7 = r1[r0]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r6 = r7.length
        L_0x0418:
            if (r8 >= r6) goto L_0x002f
            r3 = r7[r8]
            r2 = r9
            X.6fD r2 = (X.C136896fD) r2
            java.util.List r1 = r2.A02
            java.lang.Object r0 = r2.A00
            r1.add(r0)
            r2.A00 = r3
            int r8 = r8 + 1
            goto L_0x0418
        L_0x042b:
            boolean r0 = r3 instanceof X.C93574gn
            if (r0 == 0) goto L_0x0434
            X.AnonymousClass6XJ.A02(r1, r2)
            goto L_0x002f
        L_0x0434:
            X.6Ek r0 = r4.A03
            int[] r1 = r0.A05
            int r0 = r4.A00
            r3 = r1[r0]
            if (r3 < 0) goto L_0x04d5
            int r0 = r2.A06
            if (r0 > 0) goto L_0x04ce
            if (r3 == 0) goto L_0x002f
            int r1 = r2.A00
            int r1 = r1 + r3
            int r3 = r2.A08
            if (r1 < r3) goto L_0x04b2
            int r0 = r2.A01
            if (r1 > r0) goto L_0x04b2
            r2.A00 = r1
            int[] r0 = r2.A0G
            int r0 = X.AnonymousClass6YK.A02(r2, r0, r1)
            r2.A02 = r0
            goto L_0x0483
        L_0x045a:
            boolean r0 = X.AnonymousClass6YK.A0H(r2, r7, r9)
            r9 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x04ab
            int r1 = r2.A01
            r0 = r20
            X.AnonymousClass6YK.A0D(r2, r0, r1, r8)
            if (r3 <= 0) goto L_0x002f
            int r7 = r7 - r9
            int r0 = r2.A09
            int r1 = r6 + r3
            X.AnonymousClass6YK.A0C(r2, r1, r7)
            r2.A0B = r6
            int r0 = r0 + r3
            r2.A09 = r0
            java.lang.Object[] r0 = r2.A0H
            X.AnonymousClass02Q.A04(r0, r6, r1)
            int r0 = r2.A03
            if (r0 < r6) goto L_0x002f
            int r0 = r0 - r3
        L_0x0483:
            r2.A03 = r0
            goto L_0x002f
        L_0x0487:
            java.lang.String r0 = "Cannot reset when inserting"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x048e:
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r6)
            throw r0
        L_0x0493:
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r6)
            throw r0
        L_0x0498:
            java.lang.String r0 = "Cannot move a group while inserting"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x049f:
            java.lang.String r0 = "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)     // Catch:{ all -> 0x04a6 }
            throw r0     // Catch:{ all -> 0x04a6 }
        L_0x04a6:
            r0 = move-exception
            r3.A0L()
            throw r0
        L_0x04ab:
            java.lang.String r0 = "Unexpectedly removed anchors"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x04b2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot seek outside the current group ("
            r1.append(r0)
            r1.append(r3)
            r0 = 45
            r1.append(r0)
            int r0 = r2.A01
            java.lang.String r0 = X.C36321k7.A0G(r1, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x04ce:
            java.lang.String r0 = "Cannot call seek() while inserting"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x04d5:
            java.lang.String r0 = "Cannot seek backwards"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x04dc:
            r21.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128976Ek.A03(X.7dk, X.7bJ, X.6YK):void");
    }

    public final void A04(AnonymousClass6EM r4) {
        int i = r4.A00;
        if (i == 0 && r4.A01 == 0) {
            A05(r4);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Cannot push ");
        A0u.append(r4);
        A0u.append(" without arguments because it expects ");
        A0u.append(i);
        A0u.append(" ints and ");
        A0u.append(r4.A01);
        throw AnonymousClass000.A0c(" objects.", A0u);
    }
}
