package X;

import java.util.concurrent.Callable;

/* renamed from: X.7qd  reason: invalid class name and case insensitive filesystem */
public class C163707qd implements Callable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059 A[SYNTHETIC, Splitter:B:25:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011f A[Catch:{ all -> 0x01e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C140456lc A00(X.C140456lc r15, X.C140456lc r16, X.C123115vx r17) {
        /*
            r9 = r15
            int r0 = r15.A00
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01ee
            r5 = r16
            r3 = r17
            if (r16 == 0) goto L_0x0051
            X.6lc r0 = r5.A06
            if (r0 != r15) goto L_0x0051
            java.util.List r1 = r3.A02
            boolean r0 = r1.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x0035
            java.util.Set r2 = r15.A02
            if (r2 != 0) goto L_0x0022
            java.util.Set r2 = java.util.Collections.emptySet()
        L_0x0022:
            X.AnonymousClass00C.A0B(r2)
            boolean r0 = X.C90514aH.A1a(r2)
            if (r0 == 0) goto L_0x0035
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0036
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            return r16
        L_0x0036:
            java.util.Iterator r1 = r1.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r1.next()
            X.5ol r0 = (X.C118805ol) r0
            X.AnonymousClass00C.A0D(r0, r4)
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1Z(r2, r0)
            if (r0 == 0) goto L_0x003a
        L_0x0051:
            X.68E r0 = X.AnonymousClass6RN.A00
            boolean r17 = r0.A03()
            if (r17 == 0) goto L_0x006d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "BloksResolveSubTree: "
            r1.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = X.AnonymousClass6Qm.A02(r15)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x01e1 }
            X.AnonymousClass6RN.A00(r0)     // Catch:{ all -> 0x01e1 }
        L_0x006d:
            int r2 = r15.A04     // Catch:{ all -> 0x01e1 }
            r0 = 13317(0x3405, float:1.8661E-41)
            if (r2 != r0) goto L_0x0084
            X.5oT r0 = r3.A00     // Catch:{ all -> 0x01e1 }
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x01e1 }
            X.67i r1 = (X.C1271967i) r1     // Catch:{ all -> 0x01e1 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x01e1 }
            X.65A r0 = r1.A02     // Catch:{ all -> 0x01e1 }
            X.7it r0 = r0.A01     // Catch:{ all -> 0x01e1 }
            r0.B8r()     // Catch:{ all -> 0x01e1 }
        L_0x0084:
            boolean r16 = X.AnonymousClass6Qn.A02(r15)     // Catch:{ all -> 0x01e1 }
            X.6T8 r0 = X.AnonymousClass6NR.A01()     // Catch:{ all -> 0x01e1 }
            int[] r7 = r0.A01(r2)     // Catch:{ all -> 0x01e1 }
            X.AnonymousClass00C.A0B(r7)     // Catch:{ all -> 0x01e1 }
            int r6 = r7.length     // Catch:{ all -> 0x01e1 }
            r8 = r15
            r4 = 0
        L_0x0096:
            if (r4 >= r6) goto L_0x00ba
            r2 = r7[r4]     // Catch:{ all -> 0x01e1 }
            X.6lc r1 = r8.A0W(r2)     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x00b7
            if (r5 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r0 = 0
            goto L_0x00a9
        L_0x00a5:
            X.6lc r0 = r5.A0W(r2)     // Catch:{ all -> 0x01e1 }
        L_0x00a9:
            X.6lc r1 = A00(r1, r0, r3)     // Catch:{ all -> 0x01e1 }
            boolean r0 = X.C36371kC.A1W(r1, r0)
            r16 = r16 | r0
            X.6lc r8 = X.AnonymousClass6Qm.A00(r8, r15, r1, r2)     // Catch:{ all -> 0x01e1 }
        L_0x00b7:
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00ba:
            X.6T8 r1 = X.AnonymousClass6NR.A01()     // Catch:{ all -> 0x01e1 }
            int r0 = r8.A04     // Catch:{ all -> 0x01e1 }
            int[] r15 = r1.A00(r0)     // Catch:{ all -> 0x01e1 }
            X.AnonymousClass00C.A0B(r15)     // Catch:{ all -> 0x01e1 }
            int r14 = r15.length     // Catch:{ all -> 0x01e1 }
            r13 = 0
        L_0x00c9:
            if (r13 >= r14) goto L_0x0110
            r12 = r15[r13]     // Catch:{ all -> 0x01e1 }
            java.util.List r11 = r8.A0c(r12)     // Catch:{ all -> 0x01e1 }
            X.AnonymousClass00C.A08(r11)     // Catch:{ all -> 0x01e1 }
            if (r5 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r10 = 0
            goto L_0x00dd
        L_0x00d9:
            java.util.List r10 = r5.A0c(r12)     // Catch:{ all -> 0x01e1 }
        L_0x00dd:
            int r7 = r11.size()     // Catch:{ all -> 0x01e1 }
            r6 = r11
            r4 = 0
        L_0x00e3:
            if (r4 >= r7) goto L_0x0107
            X.6lc r2 = X.C90504aG.A0K(r11, r4)     // Catch:{ all -> 0x01e1 }
            if (r2 == 0) goto L_0x0104
            X.6lc r0 = X.AnonymousClass6Qm.A01(r2, r10, r4)     // Catch:{ all -> 0x01e1 }
            X.6lc r1 = A00(r2, r0, r3)     // Catch:{ all -> 0x01e1 }
            boolean r0 = X.C36371kC.A1W(r1, r0)
            r16 = r16 | r0
            if (r1 == r2) goto L_0x0104
            if (r6 != r11) goto L_0x0101
            java.util.ArrayList r6 = X.C36441kJ.A15(r11)     // Catch:{ all -> 0x01e1 }
        L_0x0101:
            r6.set(r4, r1)     // Catch:{ all -> 0x01e1 }
        L_0x0104:
            int r4 = r4 + 1
            goto L_0x00e3
        L_0x0107:
            if (r6 == r11) goto L_0x010d
            X.6lc r8 = X.AnonymousClass6Qm.A00(r8, r9, r6, r12)     // Catch:{ all -> 0x01e1 }
        L_0x010d:
            int r13 = r13 + 1
            goto L_0x00c9
        L_0x0110:
            if (r16 != 0) goto L_0x0119
            if (r5 == 0) goto L_0x0119
            X.6lc r0 = r5.A06     // Catch:{ all -> 0x01e1 }
            if (r0 != r9) goto L_0x0119
            r8 = r5
        L_0x0119:
            boolean r0 = X.AnonymousClass6Qn.A02(r8)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x01e8
            java.util.List r0 = r3.A02     // Catch:{ all -> 0x01e1 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x01e1 }
        L_0x0125:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0155
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x01e1 }
            X.5ol r6 = (X.C118805ol) r6     // Catch:{ all -> 0x01e1 }
            int r1 = r6.A00     // Catch:{ all -> 0x01e1 }
            int r0 = r8.A03     // Catch:{ all -> 0x01e1 }
            if (r1 != r0) goto L_0x0125
            java.util.Map r4 = r3.A03     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r1 = r4.get(r2)     // Catch:{ all -> 0x01e1 }
            X.08V r0 = r6.A01     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r0.apply(r1)     // Catch:{ all -> 0x01e1 }
            if (r1 == r0) goto L_0x0151
            r4.put(r2, r0)     // Catch:{ all -> 0x01e1 }
            java.util.Set r0 = r3.A04     // Catch:{ all -> 0x01e1 }
            r0.add(r2)     // Catch:{ all -> 0x01e1 }
        L_0x0151:
            r7.remove()     // Catch:{ all -> 0x01e1 }
            goto L_0x0125
        L_0x0155:
            if (r5 == 0) goto L_0x016a
            X.6lc r0 = r5.A06     // Catch:{ all -> 0x01e1 }
            if (r0 != r9) goto L_0x016a
            if (r8 != r9) goto L_0x016a
            int r1 = r9.A03     // Catch:{ all -> 0x01e1 }
            java.util.Set r0 = r3.A04     // Catch:{ all -> 0x01e1 }
            boolean r0 = X.AnonymousClass000.A1Z(r0, r1)     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x016a
            r9 = r5
            goto L_0x01e9
        L_0x016a:
            java.util.Map r7 = r3.A03     // Catch:{ all -> 0x01e1 }
            int r0 = r9.A03     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r10 = r7.get(r6)     // Catch:{ all -> 0x01e1 }
            X.AnonymousClass6NR.A00()     // Catch:{ all -> 0x01e1 }
            X.5oT r12 = r3.A00     // Catch:{ all -> 0x01e1 }
            int r1 = r8.A04     // Catch:{ all -> 0x01e1 }
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r1 == r0) goto L_0x01b1
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r1 != r0) goto L_0x01e8
            java.lang.Object r11 = r12.A01     // Catch:{ all -> 0x01e1 }
            X.67i r11 = (X.C1271967i) r11     // Catch:{ all -> 0x01e1 }
            X.65A r0 = r11.A02     // Catch:{ all -> 0x01e1 }
            X.7it r0 = r0.A01     // Catch:{ all -> 0x01e1 }
            r0.B8r()     // Catch:{ all -> 0x01e1 }
            int r0 = r8.A03     // Catch:{ all -> 0x01e1 }
            long r0 = (long) r0     // Catch:{ all -> 0x01e1 }
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01e1 }
            X.6mD r5 = new X.6mD     // Catch:{ all -> 0x01e1 }
            r5.<init>(r8, r2)     // Catch:{ all -> 0x01e1 }
            X.6lR r4 = X.C112645eE.A00     // Catch:{ all -> 0x01e1 }
            X.7Uf r3 = new X.7Uf     // Catch:{ all -> 0x01e1 }
            r3.<init>(r12, r11, r8)     // Catch:{ all -> 0x01e1 }
            X.5uI r2 = new X.5uI     // Catch:{ all -> 0x01e1 }
            r2.<init>(r4, r3, r0)     // Catch:{ all -> 0x01e1 }
            X.6lb r0 = new X.6lb     // Catch:{ all -> 0x01e1 }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x01e1 }
            android.util.Pair r2 = X.C36441kJ.A0Q(r0, r10)     // Catch:{ all -> 0x01e1 }
            goto L_0x01c9
        L_0x01b1:
            int r0 = r8.A03     // Catch:{ all -> 0x01e1 }
            long r4 = (long) r0     // Catch:{ all -> 0x01e1 }
            X.6mE r3 = X.C140826mE.A00     // Catch:{ all -> 0x01e1 }
            X.6lR r2 = X.C112635eD.A00     // Catch:{ all -> 0x01e1 }
            X.7XN r1 = X.AnonymousClass7XN.A00     // Catch:{ all -> 0x01e1 }
            X.5uI r0 = new X.5uI     // Catch:{ all -> 0x01e1 }
            r0.<init>(r2, r1, r4)     // Catch:{ all -> 0x01e1 }
            X.6lb r1 = new X.6lb     // Catch:{ all -> 0x01e1 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x01e1 }
            r0 = 0
            android.util.Pair r2 = X.C36441kJ.A0Q(r1, r0)     // Catch:{ all -> 0x01e1 }
        L_0x01c9:
            java.lang.Object r1 = r2.first     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x01d3
            r0 = 156(0x9c, float:2.19E-43)
            X.6lc r8 = X.AnonymousClass6Qm.A00(r8, r9, r1, r0)     // Catch:{ all -> 0x01e1 }
        L_0x01d3:
            java.lang.Object r1 = r2.second     // Catch:{ all -> 0x01e1 }
            if (r1 != 0) goto L_0x01dd
            boolean r0 = r7.containsKey(r6)     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x01e8
        L_0x01dd:
            r7.put(r6, r1)     // Catch:{ all -> 0x01e1 }
            goto L_0x01e8
        L_0x01e1:
            r0 = move-exception
            if (r17 == 0) goto L_0x01e7
            X.AnonymousClass68E.A00()
        L_0x01e7:
            throw r0
        L_0x01e8:
            r9 = r8
        L_0x01e9:
            if (r17 == 0) goto L_0x01ee
            X.AnonymousClass68E.A00()
        L_0x01ee:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163707qd.A00(X.6lc, X.6lc, X.5vx):X.6lc");
    }

    public C163707qd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
        this.A00 = obj4;
        this.A04 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r3 == null) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r9 = this;
            int r0 = r9.A05
            if (r0 == 0) goto L_0x001d
            java.lang.Object r4 = r9.A00
            X.6WM r4 = (X.AnonymousClass6WM) r4
            java.lang.Object r3 = r9.A01
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            java.lang.Object r2 = r9.A02
            X.630 r2 = (X.AnonymousClass630) r2
            java.lang.Object r1 = r9.A03
            byte[] r1 = (byte[]) r1
            java.lang.Object r0 = r9.A04
            X.6EZ r0 = (X.AnonymousClass6EZ) r0
            X.6Nt r3 = X.AnonymousClass6WM.A00(r4, r0, r3, r2, r1)
            return r3
        L_0x001d:
            java.lang.Object r0 = r9.A03
            X.5iM r0 = (X.C115115iM) r0
            java.lang.Object r7 = r9.A02
            X.5oT r7 = (X.C118625oT) r7
            java.lang.Object r6 = r9.A00
            java.lang.Object r5 = r9.A04
            java.util.List r5 = (java.util.List) r5
            X.5ok r6 = (X.C118795ok) r6
            X.5sY r4 = r0.A00
            monitor-enter(r4)
            java.util.concurrent.RunnableFuture r3 = r4.A01     // Catch:{ all -> 0x00ac }
            X.5xb r1 = r4.A00     // Catch:{ all -> 0x00ac }
            monitor-exit(r4)     // Catch:{ all -> 0x00ac }
            if (r1 != 0) goto L_0x0065
            if (r3 == 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A02
            r1 = -1
            int r0 = android.os.Process.myTid()
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0049
            r3.run()
        L_0x0049:
            int r0 = r2.get()
            java.lang.Object r1 = X.C132926Vv.A00(r3, r0)
            X.5xb r1 = (X.C124105xb) r1
            monitor-enter(r4)
            r4.A00 = r1     // Catch:{ all -> 0x005b }
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x005b }
            monitor-exit(r4)     // Catch:{ all -> 0x005b }
            goto L_0x0065
        L_0x005b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005b }
            throw r0
        L_0x005e:
            java.lang.String r0 = "The future task is null but there is no computed result"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0065:
            r2 = 0
            if (r6 == 0) goto L_0x006a
            X.6Aw r2 = r6.A00
        L_0x006a:
            X.6Oc r8 = X.C131196Oc.A00
            X.C36321k7.A0w(r7, r1)
            r0 = 4
            X.AnonymousClass00C.A0D(r8, r0)
            X.6lc r6 = r1.A02
            if (r2 == 0) goto L_0x00aa
            X.7ek r4 = r2.A00
            X.6lc r4 = (X.C140456lc) r4
            java.lang.Object r3 = r2.A01
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x0085
        L_0x0081:
            X.00f r3 = X.C000400e.A0D()
        L_0x0085:
            java.util.ArrayList r2 = X.C36361kB.A0q(r5)
            X.5vx r0 = new X.5vx
            r0.<init>(r7, r8, r2, r3)
            X.6lc r2 = A00(r6, r4, r0)
            java.util.Map r0 = r0.A03
            X.6Aw r3 = new X.6Aw
            r3.<init>(r2, r0, r5)
            X.5ok r2 = new X.5ok
            r2.<init>(r3, r1)
            X.6Aw r0 = r2.A00
            X.7ek r1 = r0.A00
            java.util.List r0 = r3.A02
            X.6Aw r3 = new X.6Aw
            r3.<init>(r1, r2, r0)
            return r3
        L_0x00aa:
            r4 = 0
            goto L_0x0081
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ac }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163707qd.call():java.lang.Object");
    }
}
