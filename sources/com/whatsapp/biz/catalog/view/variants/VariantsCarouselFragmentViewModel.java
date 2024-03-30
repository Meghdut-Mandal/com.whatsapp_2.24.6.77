package com.whatsapp.biz.catalog.view.variants;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass0VV;
import X.AnonymousClass6JL;
import X.C001600r;
import X.C001700s;
import X.C006302t;
import X.C207269up;
import X.C20810yC;
import X.C28201Rs;
import X.C36431kI;
import X.C36441kJ;

public final class VariantsCarouselFragmentViewModel extends AnonymousClass04R {
    public C207269up A00;
    public C006302t A01;
    public boolean A02;
    public boolean A03;
    public final C001600r A04;
    public final C001700s A05;
    public final AnonymousClass6JL A06;
    public final C20810yC A07;
    public final C28201Rs A08 = C36441kJ.A0t();

    public VariantsCarouselFragmentViewModel(AnonymousClass6JL r2, C20810yC r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A06 = r2;
        this.A07 = r3;
        C001700s A0S = C36431kI.A0S();
        this.A05 = A0S;
        this.A04 = AnonymousClass0VV.A01(A0S);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r0 > r5) goto L_0x0021;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d A[LOOP:0: B:20:0x0040->B:36:0x007d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x008a A[EDGE_INSN: B:57:0x008a->B:42:0x008a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C128526Cp A01(X.C134736bW r14, com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r15, java.util.List r16, int r17) {
        /*
            r4 = 0
            if (r14 == 0) goto L_0x0086
            java.util.List r0 = r14.A03
        L_0x0005:
            r13 = 0
            r9 = 1
            r5 = r17
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0030
        L_0x0011:
            boolean r0 = r15.A02
            if (r0 != 0) goto L_0x0030
            if (r14 == 0) goto L_0x002e
            java.util.List r0 = r14.A02
            if (r0 == 0) goto L_0x002e
            int r0 = r0.size()
        L_0x001f:
            if (r0 <= r5) goto L_0x0030
        L_0x0021:
            r8 = -1
            r5 = 0
            X.6bX r6 = X.C109895Zn.A00()
            X.6Cp r4 = new X.6Cp
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x002e:
            r0 = 2
            goto L_0x001f
        L_0x0030:
            r0 = r16
            java.lang.Object r11 = X.C007103b.A0P(r0, r5)
            X.6bX r11 = (X.C134746bX) r11
            if (r11 == 0) goto L_0x0084
            java.util.List r3 = r11.A01
            java.util.Iterator r8 = r3.iterator()
        L_0x0040:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r8.next()
            X.6b4 r0 = (X.C134456b4) r0
            java.lang.String r7 = r0.A00()
            if (r14 == 0) goto L_0x0082
            java.util.List r0 = r14.A02
            if (r0 == 0) goto L_0x0082
            java.util.Iterator r6 = r0.iterator()
        L_0x005a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r2 = r6.next()
            r0 = r2
            X.6bJ r0 = (X.C134606bJ) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r11.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x005a
        L_0x0071:
            X.6bJ r2 = (X.C134606bJ) r2
            if (r2 == 0) goto L_0x0082
            java.lang.String r0 = r2.A01
        L_0x0077:
            boolean r0 = X.AnonymousClass00C.A0J(r7, r0)
            if (r0 != 0) goto L_0x008a
            int r13 = r13 + 1
            goto L_0x0040
        L_0x0080:
            r2 = r4
            goto L_0x0071
        L_0x0082:
            r0 = r4
            goto L_0x0077
        L_0x0084:
            r9 = 0
            goto L_0x0021
        L_0x0086:
            r0 = r4
            goto L_0x0005
        L_0x0089:
            r13 = -1
        L_0x008a:
            if (r14 == 0) goto L_0x0094
            java.util.List r0 = r14.A03
            if (r0 == 0) goto L_0x0094
            java.lang.Object r4 = X.C007103b.A0P(r0, r5)
        L_0x0094:
            boolean r0 = r4 instanceof X.C102224zW
            if (r0 != 0) goto L_0x0099
            r9 = 2
        L_0x0099:
            int r0 = r3.size()
            if (r13 >= r0) goto L_0x00be
            if (r13 < 0) goto L_0x00be
            java.lang.String r1 = r11.A00
            java.lang.Object r0 = r3.get(r13)
            X.6b4 r0 = (X.C134456b4) r0
            java.lang.String r0 = r0.A00()
            X.6bJ r10 = new X.6bJ
            r10.<init>(r1, r0)
        L_0x00b2:
            r14 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            X.6Cp r4 = new X.6Cp
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            return r4
        L_0x00be:
            r10 = 0
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel.A01(X.6bW, com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel, java.util.List, int):X.6Cp");
    }
}
