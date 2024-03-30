package X;

/* renamed from: X.6oG  reason: invalid class name and case insensitive filesystem */
public abstract class C142056oG implements C159157iu {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026d, code lost:
        if (r13.A0Y().equals(r4) == false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d8, code lost:
        if (r13.A0Y().equals(r5) == false) goto L_0x02da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C140456lc B1D(X.C157187by r18, X.C140456lc r19) {
        /*
            r17 = this;
            r1 = r17
            r13 = r19
            r3 = r1
            boolean r0 = r1 instanceof X.C100404ux
            if (r0 == 0) goto L_0x023f
            X.4ux r3 = (X.C100404ux) r3
            r5 = 0
            r4 = 0
            r11 = r13
        L_0x000e:
            java.util.List r1 = r3.A00
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x0239
            java.lang.Object r8 = r1.get(r4)
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r0 = r8.first
            X.7fI r0 = (X.AnonymousClass7fI) r0
            boolean r0 = r0.BvX(r11)
            if (r0 == 0) goto L_0x0095
            if (r5 != 0) goto L_0x002c
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
        L_0x002c:
            r5.add(r8)
            java.lang.Object r1 = r8.second
            X.65X r1 = (X.AnonymousClass65X) r1
            boolean r0 = r1 instanceof X.C100664vO
            if (r0 == 0) goto L_0x0067
            X.4vO r1 = (X.C100664vO) r1
            int r0 = r1.A00
            java.lang.Object r9 = r1.A01
            java.lang.Object r10 = X.C140456lc.A0I(r11, r0)
            if (r10 == r9) goto L_0x0095
            boolean r0 = r9 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0231
            boolean r0 = r10 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0067
            java.lang.Number r10 = (java.lang.Number) r10
            long r6 = r10.longValue()
            java.lang.Number r9 = (java.lang.Number) r9
            long r1 = r9.longValue()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            double r6 = r10.doubleValue()
            double r1 = r9.doubleValue()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
        L_0x0065:
            if (r0 == 0) goto L_0x0095
        L_0x0067:
            if (r11 != r13) goto L_0x0077
            r14 = 0
            int r0 = r13.A03
            java.util.List r15 = r13.A08
            X.7by r12 = r13.A01
            X.6lc r11 = new X.6lc
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0077:
            java.lang.Object r7 = r8.second
            X.65X r7 = (X.AnonymousClass65X) r7
            boolean r0 = r7 instanceof X.C100654vN
            if (r0 == 0) goto L_0x0099
            X.4vN r7 = (X.C100654vN) r7
            java.lang.String r1 = r7.A02
            r0 = 35
            android.util.SparseArray r2 = r11.A05
            r2.put(r0, r1)
            long r0 = r7.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 48
            r2.put(r0, r1)
        L_0x0095:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0099:
            boolean r0 = r7 instanceof X.C100664vO
            if (r0 == 0) goto L_0x00a9
            X.4vO r7 = (X.C100664vO) r7
            int r2 = r7.A00
            java.lang.Object r1 = r7.A01
        L_0x00a3:
            android.util.SparseArray r0 = r11.A05
            r0.put(r2, r1)
            goto L_0x0095
        L_0x00a9:
            boolean r0 = r7 instanceof X.C162637ou
            if (r0 == 0) goto L_0x00c0
            X.7ou r7 = (X.C162637ou) r7
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0194;
                case 1: goto L_0x01af;
                case 2: goto L_0x0172;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            java.lang.Long r2 = X.C36411kG.A0t()
            r1 = 35
        L_0x00ba:
            android.util.SparseArray r0 = r11.A05
            r0.put(r1, r2)
            goto L_0x0095
        L_0x00c0:
            boolean r0 = r7 instanceof X.C100624vK
            if (r0 == 0) goto L_0x00da
            X.4vK r7 = (X.C100624vK) r7
            X.7fI r0 = r7.A00
            android.util.Pair r0 = X.C131766Ql.A01(r11, r0)
            int r2 = X.C36381kD.A03(r0)
            if (r2 >= 0) goto L_0x01d7
            java.lang.String r1 = "ComponentTree"
            java.lang.String r0 = "replaceChild: No existing child found with specified ID in parent. New children have not been added to parent."
        L_0x00d6:
            android.util.Log.w(r1, r0)
            goto L_0x0095
        L_0x00da:
            boolean r0 = r7 instanceof X.C100614vJ
            if (r0 == 0) goto L_0x00f6
            X.4vJ r7 = (X.C100614vJ) r7
            java.lang.String r1 = r7.A00
            X.6oV r0 = new X.6oV
            r0.<init>(r1)
            android.util.Pair r0 = X.C131766Ql.A01(r11, r0)
            int r1 = X.C36381kD.A03(r0)
            if (r1 >= 0) goto L_0x01e1
            java.lang.String r1 = "ComponentTreeMutator"
            java.lang.String r0 = "replaceChildrenAfter: No existing child found with specified ID in parent. New children have not been added to parent."
            goto L_0x00d6
        L_0x00f6:
            boolean r0 = r7 instanceof X.C100594vH
            if (r0 == 0) goto L_0x0112
            X.4vH r7 = (X.C100594vH) r7
            java.lang.String r1 = r7.A00
            X.6oV r0 = new X.6oV
            r0.<init>(r1)
            android.util.Pair r0 = X.C131766Ql.A01(r11, r0)
            int r1 = X.C36381kD.A03(r0)
            if (r1 >= 0) goto L_0x01fe
            java.lang.String r1 = "ComponentTreeMutator"
            java.lang.String r0 = "removeChildById: No existing child found with specified ID in parent. No child has been removed from the parent."
            goto L_0x00d6
        L_0x0112:
            boolean r0 = r7 instanceof X.C100604vI
            if (r0 == 0) goto L_0x0148
            X.4vI r7 = (X.C100604vI) r7
            java.lang.String r1 = r7.A01
            X.6oV r0 = new X.6oV
            r0.<init>(r1)
            android.util.Pair r0 = X.C131766Ql.A01(r11, r0)
            java.lang.Object r2 = r0.first
            java.util.List r2 = (java.util.List) r2
            int r8 = X.C36381kD.A03(r0)
            java.lang.String r1 = r7.A00
            X.6oV r0 = new X.6oV
            r0.<init>(r1)
            int r6 = X.C131766Ql.A00(r0, r2)
            r0 = -1
            java.lang.String r1 = "ComponentTree"
            if (r8 != r0) goto L_0x013e
            java.lang.String r0 = "removeChildren: The starting id doesn't exist. No children have been removed."
            goto L_0x00d6
        L_0x013e:
            if (r6 != r0) goto L_0x0143
            java.lang.String r0 = "removeChildren: The ending id doesn't exist. No children have been removed."
            goto L_0x00d6
        L_0x0143:
            if (r8 <= r6) goto L_0x0207
            java.lang.String r0 = "removeChildren: The starting index is larger than the ending index. No children have been removed."
            goto L_0x00d6
        L_0x0148:
            boolean r0 = r7 instanceof X.C100644vM
            if (r0 == 0) goto L_0x0165
            X.4vM r7 = (X.C100644vM) r7
            java.lang.String r1 = r7.A01
            X.6oV r0 = new X.6oV
            r0.<init>(r1)
            android.util.Pair r0 = X.C131766Ql.A01(r11, r0)
            int r2 = X.C36381kD.A03(r0)
            if (r2 >= 0) goto L_0x021f
            java.lang.String r1 = "ComponentTree"
            java.lang.String r0 = "insertChildrenRelativeToId: No existing child found with specified ID in parent. New children have not been added to parent."
            goto L_0x00d6
        L_0x0165:
            X.4vL r7 = (X.C100634vL) r7
            X.5zL r1 = r7.A01
            java.lang.String r0 = r7.A02
            r1.A0N = r0
            r2 = 0
            r1 = 31
            goto L_0x00ba
        L_0x0172:
            X.6NR r0 = X.AnonymousClass6NR.A00()
            X.6Sg r0 = r0.A09
            int r2 = r0.A00(r11)
            r0 = -1
            if (r2 == r0) goto L_0x0095
            java.util.List r0 = r11.A0c(r2)
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)
            java.lang.Object r0 = r7.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = X.C131766Ql.A02(r0)
            r1.addAll(r0)
            goto L_0x00a3
        L_0x0194:
            X.6NR r0 = X.AnonymousClass6NR.A00()
            X.6Sg r0 = r0.A09
            int r2 = r0.A00(r11)
            r0 = -1
            if (r2 == r0) goto L_0x0095
            java.lang.Object r0 = r7.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = X.C131766Ql.A02(r0)
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)
            goto L_0x00a3
        L_0x01af:
            X.6NR r0 = X.AnonymousClass6NR.A00()
            X.6Sg r0 = r0.A09
            int r6 = r0.A00(r11)
            r0 = -1
            if (r6 == r0) goto L_0x0095
            java.util.List r0 = r11.A0c(r6)
            java.util.ArrayList r2 = X.C36441kJ.A15(r0)
            r1 = 0
            java.lang.Object r0 = r7.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = X.C131766Ql.A02(r0)
            r2.addAll(r1, r0)
            android.util.SparseArray r0 = r11.A05
            r0.put(r6, r2)
            goto L_0x0095
        L_0x01d7:
            java.lang.Object r1 = r0.first
            java.util.List r1 = (java.util.List) r1
            r1.remove(r2)
            java.util.List r0 = r7.A01
            goto L_0x0228
        L_0x01e1:
            java.lang.Object r2 = r0.first
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
        L_0x01e9:
            int r0 = r0 + -1
            if (r0 <= r1) goto L_0x01f1
            r2.remove(r0)
            goto L_0x01e9
        L_0x01f1:
            int r1 = r1 + 1
            java.util.List r0 = r7.A01
            java.util.ArrayList r0 = X.C131766Ql.A02(r0)
            r2.addAll(r1, r0)
            goto L_0x0095
        L_0x01fe:
            java.lang.Object r0 = r0.first
            java.util.List r0 = (java.util.List) r0
            r0.remove(r1)
            goto L_0x0095
        L_0x0207:
            java.util.Iterator r2 = r2.iterator()
            r1 = 0
        L_0x020c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0095
            r2.next()
            if (r1 <= r8) goto L_0x021c
            if (r1 >= r6) goto L_0x021c
            r2.remove()
        L_0x021c:
            int r1 = r1 + 1
            goto L_0x020c
        L_0x021f:
            java.lang.Object r1 = r0.first
            java.util.List r1 = (java.util.List) r1
            int r0 = r7.A00
            int r2 = r2 + r0
            java.util.List r0 = r7.A02
        L_0x0228:
            java.util.ArrayList r0 = X.C131766Ql.A02(r0)
            r1.addAll(r2, r0)
            goto L_0x0095
        L_0x0231:
            boolean r0 = X.AnonymousClass5Z0.A00(r10, r9)
            r0 = r0 ^ 1
            goto L_0x0065
        L_0x0239:
            if (r5 == 0) goto L_0x0255
            r1.removeAll(r5)
            return r11
        L_0x023f:
            boolean r0 = r1 instanceof X.C100414uy
            if (r0 == 0) goto L_0x0256
            X.4uy r3 = (X.C100414uy) r3
            java.util.List r15 = r3.A01
            java.util.concurrent.atomic.AtomicInteger r0 = X.C113005eq.A00
            int r16 = r0.incrementAndGet()
            r14 = 0
            X.7by r12 = r13.A01
            X.6lc r11 = new X.6lc
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0255:
            return r11
        L_0x0256:
            boolean r0 = r1 instanceof X.C100434v0
            if (r0 == 0) goto L_0x02c5
            X.4v0 r3 = (X.C100434v0) r3
            java.lang.String r4 = r3.A02
            java.lang.String r0 = r13.A0Y()
            if (r0 == 0) goto L_0x026f
            java.lang.String r0 = r13.A0Y()
            boolean r1 = r0.equals(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0270
        L_0x026f:
            r0 = 0
        L_0x0270:
            java.lang.String r2 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x027a
            X.6lc r0 = r3.A00
            if (r0 != 0) goto L_0x02c0
            r3.A00 = r13
        L_0x027a:
            java.util.LinkedList r0 = r13.A07
            if (r0 == 0) goto L_0x029e
            java.util.Iterator r1 = r0.iterator()
        L_0x0282:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x029e
            java.lang.Object r0 = r1.next()
            X.5uV r0 = (X.C122225uV) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0282
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0282
            X.6lc r0 = r3.A00
            if (r0 != 0) goto L_0x02bb
            r3.A00 = r13
        L_0x029e:
            X.6lc r0 = r3.A00
            if (r0 == 0) goto L_0x0320
            r0 = 134(0x86, float:1.88E-43)
            X.7ku r2 = r13.A0X(r0)
            if (r2 == 0) goto L_0x0320
            X.68b r1 = X.C1273868b.A00()
            r0 = 0
            X.6MO r1 = X.C1273868b.A04(r1, r13, r0)
            X.6JI r0 = r3.A01
            X.4vP r0 = r0.A00
            X.AnonymousClass6JI.A00(r0, r1, r2)
            return r13
        L_0x02bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)
            throw r0
        L_0x02c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)
            throw r0
        L_0x02c5:
            X.4uz r3 = (X.C100424uz) r3
            java.lang.String r5 = r3.A02
            java.lang.String r0 = r13.A0Y()
            if (r0 == 0) goto L_0x02da
            java.lang.String r0 = r13.A0Y()
            boolean r1 = r0.equals(r5)
            r0 = 1
            if (r1 != 0) goto L_0x02db
        L_0x02da:
            r0 = 0
        L_0x02db:
            java.lang.String r6 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x02e5
            X.6lc r0 = r3.A00
            if (r0 != 0) goto L_0x0321
            r3.A00 = r13
        L_0x02e5:
            java.util.LinkedList r0 = r13.A07
            if (r0 == 0) goto L_0x0320
            java.util.Iterator r4 = r0.iterator()
        L_0x02ed:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0320
            java.lang.Object r1 = r4.next()
            X.5uV r1 = (X.C122225uV) r1
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0309
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0309
            X.6lc r0 = r3.A00
            if (r0 != 0) goto L_0x031b
            r3.A00 = r13
        L_0x0309:
            X.6lc r0 = r3.A00
            if (r0 == 0) goto L_0x02ed
            X.7ku r2 = r1.A01
            if (r2 == 0) goto L_0x02ed
            X.6JI r0 = r3.A01
            X.6MO r1 = X.AnonymousClass6MO.A01
            X.4vP r0 = r0.A00
            X.AnonymousClass6JI.A00(r0, r1, r2)
            goto L_0x02ed
        L_0x031b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r6)
            throw r0
        L_0x0320:
            return r13
        L_0x0321:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142056oG.B1D(X.7by, X.6lc):X.6lc");
    }
}
