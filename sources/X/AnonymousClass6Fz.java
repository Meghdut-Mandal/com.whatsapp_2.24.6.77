package X;

/* renamed from: X.6Fz  reason: invalid class name */
public abstract class AnonymousClass6Fz {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.4hC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.4hC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.4hC} */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.7n6, java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C161337ma r10, X.C120655rr r11, X.C009003v r12, int r13) {
        /*
            r0 = -1350970552(0xffffffffaf79d348, float:-2.272148E-10)
            r10.Bun(r0)
            r3 = r10
            X.6fF r3 = (X.C136916fF) r3
            X.7n6 r4 = X.C136916fF.A04(r3)
            java.lang.Object r5 = X.AnonymousClass6XJ.A02
            r2 = 201(0xc9, float:2.82E-43)
            r1 = 0
            r0 = 0
            X.C136916fF.A0K(r3, r5, r0, r2, r1)
            java.lang.Object r1 = r3.BnZ()
            java.lang.Object r0 = X.C129736Ig.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0101
            r1 = 0
        L_0x0023:
            X.607 r8 = r11.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"
            X.AnonymousClass00C.A0E(r8, r0)
            java.lang.Object r0 = r11.A01
            X.7dn r2 = r8.A01(r1, r0)
            boolean r0 = X.AnonymousClass00C.A0J(r2, r1)
            r7 = 1
            r9 = r0 ^ 1
            if (r9 == 0) goto L_0x003c
            r3.Bwv(r2)
        L_0x003c:
            boolean r0 = r3.A0L
            r6 = 0
            if (r0 == 0) goto L_0x009e
            X.4hC r4 = (X.C93824hC) r4
            X.6YE r1 = r4.A00
            int r0 = r8.hashCode()
            X.5ne r0 = r1.A0F(r8, r2, r0, r6)
            if (r0 == 0) goto L_0x005d
            X.6YE r2 = r0.A00
            int r1 = r4.size()
            int r0 = r0.A01
            int r1 = r1 + r0
            X.4hC r4 = new X.4hC
            r4.<init>(r2, r1)
        L_0x005d:
            r3.A0R = r7
        L_0x005f:
            X.61S r5 = r3.A0X
            boolean r0 = r3.A0O
            r5.A01(r0)
            r3.A0O = r6
            r3.A0B = r4
            r1 = 202(0xca, float:2.83E-43)
            java.lang.Object r0 = X.AnonymousClass6XJ.A00
            r2 = 0
            X.C136916fF.A0K(r3, r0, r4, r1, r2)
            int r0 = r13 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.invoke(r10, r0)
            r1 = 0
            X.C136916fF.A0M(r3, r2)
            X.C136916fF.A0M(r3, r2)
            int r0 = X.AnonymousClass61S.A00(r5)
            if (r0 == 0) goto L_0x008b
            r1 = 1
        L_0x008b:
            r3.A0O = r1
            r0 = 0
            r3.A0B = r0
            X.6fO r1 = r10.B6Z()
            if (r1 == 0) goto L_0x009d
            X.7YW r0 = new X.7YW
            r0.<init>(r11, r12, r13)
            r1.A06 = r0
        L_0x009d:
            return
        L_0x009e:
            X.6QL r1 = r3.A0C
            int r0 = r1.A01
            java.lang.Object r5 = r1.A05(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            X.AnonymousClass00C.A0E(r5, r0)
            X.7n6 r5 = (X.C161557n6) r5
            boolean r0 = r3.BHg()
            if (r0 == 0) goto L_0x00b5
            if (r9 == 0) goto L_0x00ff
        L_0x00b5:
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r4.containsKey(r8)
            if (r0 != 0) goto L_0x00ff
        L_0x00bf:
            X.4hC r4 = (X.C93824hC) r4
            X.6YE r1 = r4.A00
            int r0 = r8.hashCode()
            X.5ne r0 = r1.A0F(r8, r2, r0, r6)
            if (r0 == 0) goto L_0x00db
            X.6YE r2 = r0.A00
            int r1 = r4.size()
            int r0 = r0.A01
            int r1 = r1 + r0
            X.4hC r4 = new X.4hC
            r4.<init>(r2, r1)
        L_0x00db:
            boolean r0 = r3.A0P
            if (r0 != 0) goto L_0x00e2
            if (r5 != r4) goto L_0x00e2
            r7 = 0
        L_0x00e2:
            r6 = r7
            if (r7 == 0) goto L_0x005f
            boolean r0 = r3.A0L
            if (r0 != 0) goto L_0x005f
            X.5h2 r2 = r3.A0J
            if (r2 != 0) goto L_0x00f4
            X.5h2 r2 = new X.5h2
            r2.<init>()
            r3.A0J = r2
        L_0x00f4:
            X.6QL r0 = r3.A0C
            int r1 = r0.A01
            android.util.SparseArray r0 = r2.A00
            r0.put(r1, r4)
            goto L_0x005f
        L_0x00ff:
            r4 = r5
            goto L_0x00db
        L_0x0101:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Any?>"
            X.AnonymousClass00C.A0E(r1, r0)
            X.7dn r1 = (X.C157597dn) r1
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Fz.A00(X.7ma, X.5rr, X.03v, int):void");
    }

    public static final void A01(C161337ma r9, C009003v r10, C120655rr[] r11, int i) {
        C161557n6 A05;
        r9.Bun(-1390796515);
        C136916fF r3 = (C136916fF) r9;
        C161557n6 A04 = C136916fF.A04(r3);
        C136916fF.A0K(r3, AnonymousClass6XJ.A02, (Object) null, 201, 0);
        boolean z = true;
        boolean z2 = false;
        if (r3.A0L) {
            A05 = C136916fF.A05(r3, A04, AnonymousClass6G0.A00(A04, C93824hC.A00, r11));
            r3.A0R = true;
        } else {
            AnonymousClass6QL r1 = r3.A0C;
            Object A06 = r1.A06(r1.A01, 0);
            AnonymousClass00C.A0E(A06, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            C161557n6 r5 = (C161557n6) A06;
            AnonymousClass6QL r12 = r3.A0C;
            Object A062 = r12.A06(r12.A01, 1);
            AnonymousClass00C.A0E(A062, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            C161557n6 r2 = (C161557n6) A062;
            C93824hC A00 = AnonymousClass6G0.A00(A04, r2, r11);
            if (!r3.BHg() || r3.A0P || !AnonymousClass00C.A0J(r2, A00)) {
                A05 = C136916fF.A05(r3, A04, A00);
                if (!r3.A0P && AnonymousClass00C.A0J(A05, r5)) {
                    z = false;
                }
                z2 = z;
                if (z && !r3.A0L) {
                    C114325h2 r22 = r3.A0J;
                    if (r22 == null) {
                        r22 = new C114325h2();
                        r3.A0J = r22;
                    }
                    r22.A00.put(r3.A0C.A01, A05);
                }
            } else {
                r3.A03 += r3.A0C.A01();
                A05 = r5;
            }
        }
        AnonymousClass61S r52 = r3.A0X;
        r52.A01(r3.A0O ? 1 : 0);
        r3.A0O = z2;
        r3.A0B = A05;
        C136916fF.A0K(r3, AnonymousClass6XJ.A00, A05, 202, 0);
        r10.invoke(r9, Integer.valueOf((i >> 3) & 14));
        boolean z3 = false;
        C136916fF.A0M(r3, false);
        C136916fF.A0M(r3, false);
        if (AnonymousClass61S.A00(r52) != 0) {
            z3 = true;
        }
        r3.A0O = z3;
        r3.A0B = null;
        C136976fO B6Z = r9.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new AnonymousClass7YV(r10, r11, i);
        }
    }
}
