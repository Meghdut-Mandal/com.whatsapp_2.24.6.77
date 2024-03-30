package X;

import android.os.Handler;
import java.util.Map;

/* renamed from: X.6SN  reason: invalid class name */
public final class AnonymousClass6SN {
    public static final Handler A07 = C36341k9.A0H();
    public final AnonymousClass67F A00;
    public final AnonymousClass6WZ A01;
    public final C130466Le A02;
    public final Object A03 = C36441kJ.A11();
    public final Map A04 = C36431kI.A1G();
    public final Map A05 = C36431kI.A1G();
    public final Map A06 = C36431kI.A1G();

    public AnonymousClass6SN(AnonymousClass67F r2, AnonymousClass6WZ r3, C130466Le r4) {
        AnonymousClass00C.A0D(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02fe, code lost:
        if (r1 == null) goto L_0x0300;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.AnonymousClass6SN r35, X.C100674vP r36, X.AnonymousClass66B r37, X.C128756Dm r38, java.lang.String r39) {
        /*
            r24 = r39
            r6 = r37
            boolean r8 = r6 instanceof X.C100534vB
            java.lang.String r3 = "BloksComponentQueryManager"
            r4 = r36
            r7 = r38
            if (r8 != 0) goto L_0x003e
            boolean r0 = r6 instanceof X.C100544vC
            if (r0 == 0) goto L_0x03a8
            X.7ku r1 = r7.A00
            java.lang.String r0 = "appId"
            java.lang.Object r2 = X.AnonymousClass5Z1.A00(r4, r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0020
            java.lang.String r2 = "unknown"
        L_0x0020:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Attempting to process a failed network response for "
            r1.append(r0)
            r1.append(r2)
            r0 = 46
            java.lang.String r2 = X.AnonymousClass000.A0t(r1, r0)
            r0 = r6
            X.4vC r0 = (X.C100544vC) r0
            java.lang.Throwable r1 = r0.A00
            X.67i r0 = r4.A00
            X.AnonymousClass6RS.A00(r0, r3, r2, r1)
            java.lang.String r24 = "failed"
        L_0x003e:
            java.util.Set r0 = r7.A06
            if (r0 != 0) goto L_0x0044
            X.02c r0 = X.C004702c.A00
        L_0x0044:
            java.util.Iterator r1 = r0.iterator()
        L_0x0048:
            boolean r0 = r1.hasNext()
            r5 = r35
            if (r0 == 0) goto L_0x007f
            java.lang.Object r2 = r1.next()
            java.util.Map r0 = r5.A04
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L_0x0048
            java.util.Map r1 = r5.A06
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x006b
            java.util.LinkedHashSet r0 = X.C36441kJ.A17()
            r1.put(r2, r0)
        L_0x006b:
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r2 = r7.A04
            r0.add(r2)
            java.util.Map r1 = r5.A05
            X.69Q r0 = new X.69Q
            r0.<init>(r6, r7)
            r1.put(r2, r0)
            X.09w r0 = X.C023409w.A00
            return r0
        L_0x007f:
            java.util.Map r0 = r5.A04
            java.lang.String r2 = r7.A04
            r0.put(r2, r6)
            java.util.Map r0 = r5.A05
            r39 = r0
            r0.remove(r2)
            r10 = 2
            X.011[] r9 = new X.AnonymousClass011[r10]
            java.lang.String r1 = "resolution_type"
            r0 = r24
            X.C90464aC.A1E(r1, r0, r9)
            if (r8 == 0) goto L_0x038a
            r0 = r6
            X.4vB r0 = (X.C100534vB) r0
            X.5on r8 = r0.A00
        L_0x009e:
            X.011[] r10 = new X.AnonymousClass011[r10]
            java.util.Map r1 = r8.A01
            java.lang.String r0 = "points"
            X.C90464aC.A1E(r0, r1, r10)
            java.util.Map r1 = r8.A00
            java.lang.String r0 = "annotations"
            X.011 r0 = X.C36441kJ.A19(r0, r1)
            r8 = 1
            r10[r8] = r0
            java.util.LinkedHashMap r1 = X.C000400e.A07(r10)
            java.lang.String r0 = "response_summary"
            X.C36341k9.A1J(r0, r1, r9, r8)
            java.util.LinkedHashMap r23 = X.C000400e.A07(r9)
            boolean r0 = r6 instanceof X.C100514v9
            r8 = 0
            if (r0 != 0) goto L_0x0132
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "query_info_"
            java.lang.String r6 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.69S r1 = new X.69S
            r0 = r23
            r1.<init>(r6, r0)
            X.69T r0 = new X.69T
            r0.<init>(r8, r1)
            java.util.List r0 = X.C36371kC.A11(r0)
        L_0x00de:
            java.util.ArrayList r8 = X.C36361kB.A0q(r0)
            java.util.Map r7 = r5.A06
            java.lang.Object r0 = r7.get(r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x012f
            java.util.Set r0 = X.C007103b.A0f(r0)
        L_0x00f0:
            java.util.Iterator r9 = r0.iterator()
        L_0x00f4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x038e
            java.lang.String r6 = X.AnonymousClass001.A0C(r9)
            r0 = r39
            java.lang.Object r0 = r0.get(r6)
            X.69Q r0 = (X.AnonymousClass69Q) r0
            if (r0 != 0) goto L_0x011e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Expected to find pending response for "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " but found none."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.AnonymousClass6RS.A01(r3, r0)
            goto L_0x00f4
        L_0x011e:
            X.6Dm r6 = r0.A01
            X.66B r1 = r0.A00
            r0 = r24
            java.util.List r0 = A00(r5, r4, r1, r6, r0)
            r8.addAll(r0)
            r7.remove(r2)
            goto L_0x00f4
        L_0x012f:
            X.02c r0 = X.C004702c.A00
            goto L_0x00f0
        L_0x0132:
            java.util.Map r0 = r7.A05
            if (r0 == 0) goto L_0x018b
            java.util.Map r10 = X.C000400e.A0B(r0)
        L_0x013a:
            X.4v9 r6 = (X.C100514v9) r6
            X.69R r0 = r6.A00
            java.util.Map r9 = r0.A00
            java.util.HashMap r1 = X.AnonymousClass001.A0J()
            java.util.Iterator r12 = X.AnonymousClass000.A0y(r10)
        L_0x0148:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0190
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r12)
            java.lang.String r11 = X.C90494aF.A0f(r0)
            java.lang.Object r10 = r0.getValue()
            X.6B0 r10 = (X.AnonymousClass6B0) r10
            java.lang.Object r0 = r9.get(r11)
            if (r0 != 0) goto L_0x0187
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Missing "
            r6.append(r0)
            r6.append(r11)
            java.lang.String r0 = " parseResult for target "
            r6.append(r0)
            int r0 = r10.A00
            r6.append(r0)
            r0 = 58
            r6.append(r0)
            java.util.List r0 = r10.A02
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r6)
            X.AnonymousClass6RS.A01(r3, r0)
            goto L_0x0148
        L_0x0187:
            r1.put(r10, r0)
            goto L_0x0148
        L_0x018b:
            X.00f r10 = X.C000400e.A0D()
            goto L_0x013a
        L_0x0190:
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0381
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.concurrent.atomic.AtomicInteger r0 = X.C113005eq.A00
            int r0 = r0.incrementAndGet()
            X.AnonymousClass000.A1F(r9, r0)
        L_0x01a1:
            int r0 = r1.size()
            java.util.ArrayList r22 = X.C36441kJ.A14(r0)
            java.util.Iterator r21 = X.C36371kC.A10(r1)
        L_0x01ad:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x0384
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r21)
            java.lang.Object r11 = r0.getValue()
            X.6XK r11 = (X.AnonymousClass6XK) r11
            java.lang.Object r10 = r0.getKey()
            X.6B0 r10 = (X.AnonymousClass6B0) r10
            int r0 = r10.A00
            r38 = r0
            X.6lc r1 = r11.A01
            X.AnonymousClass00C.A0B(r1)
            X.4uy r0 = new X.4uy
            r0.<init>(r1, r9)
            X.6lc r6 = X.AnonymousClass5Z9.A00(r8, r0, r1)
            X.6Lg r11 = r11.A00
            java.util.List r0 = r11.A05
            r37 = r0
            java.util.Map r0 = r11.A06
            r36 = r0
            java.util.List r0 = r11.A02
            r35 = r0
            java.util.List r0 = r11.A01
            X.AnonymousClass00C.A07(r0)
            java.util.ArrayList r20 = X.C36321k7.A0J(r0)
            java.util.Iterator r19 = r0.iterator()
        L_0x01f0:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0296
            java.lang.Object r12 = r19.next()
            X.6Dm r12 = (X.C128756Dm) r12
            X.AnonymousClass00C.A0B(r6)
            X.AnonymousClass00C.A0B(r12)
            r0 = 1
            X.AnonymousClass00C.A0D(r12, r0)
            java.util.Map r13 = r12.A05
            if (r13 == 0) goto L_0x025c
            int r0 = r13.size()
            int r0 = X.C000300d.A02(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r18 = X.AnonymousClass000.A0y(r13)
        L_0x021b:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x025d
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r18)
            java.lang.Object r17 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.6B0 r0 = (X.AnonymousClass6B0) r0
            java.lang.String r0 = r0.A01
            X.6lc r13 = X.C140456lc.A0C(r6, r0)
            if (r13 == 0) goto L_0x0393
            java.lang.String r16 = r13.A0Y()
            X.AnonymousClass00C.A0B(r16)
            int r0 = r13.A03
            r25 = r0
            java.util.List r0 = r13.A08
            if (r0 == 0) goto L_0x0259
            java.util.List r15 = X.C007103b.A0Y(r0)
        L_0x024a:
            X.6B0 r14 = new X.6B0
            r13 = r25
            r0 = r16
            r14.<init>(r15, r13, r0)
            r0 = r17
            r1.put(r0, r14)
            goto L_0x021b
        L_0x0259:
            X.09w r15 = X.C023409w.A00
            goto L_0x024a
        L_0x025c:
            r1 = 0
        L_0x025d:
            java.lang.String r0 = r12.A04
            r30 = r0
            X.7ku r0 = r12.A00
            r18 = r0
            X.7ku r0 = r12.A03
            r17 = r0
            X.7ku r0 = r12.A02
            r16 = r0
            java.util.Set r0 = r12.A06
            r15 = r0
            X.7ku r0 = r12.A01
            r14 = r0
            boolean r0 = r12.A07
            r13 = r0
            boolean r0 = r12.A08
            X.6Dm r12 = new X.6Dm
            r25 = r12
            r26 = r18
            r27 = r17
            r28 = r16
            r29 = r14
            r31 = r1
            r32 = r15
            r33 = r13
            r34 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r20
            r0.add(r12)
            goto L_0x01f0
        L_0x0296:
            java.util.List r13 = r11.A03
            X.68a r12 = r11.A00
            java.util.Map r1 = r11.A07
            java.util.List r0 = r11.A04
            X.6Lg r11 = new X.6Lg
            r25 = r11
            r26 = r12
            r27 = r37
            r28 = r35
            r29 = r20
            r30 = r13
            r31 = r0
            r32 = r36
            r33 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = r38
            long r0 = (long) r0
            X.6oU r13 = new X.6oU
            r13.<init>(r0)
            java.util.List r12 = X.C36371kC.A11(r6)
            X.6oT r1 = new X.6oT
            r1.<init>(r13)
            X.4vK r0 = new X.4vK
            r0.<init>(r13, r12)
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            java.lang.Object r12 = r0.first
            X.AnonymousClass00C.A07(r12)
            X.7fI r12 = (X.AnonymousClass7fI) r12
            java.lang.Object r1 = r0.second
            X.AnonymousClass00C.A07(r1)
            X.65X r1 = (X.AnonymousClass65X) r1
            X.6XK r0 = new X.6XK
            r0.<init>(r11, r6, r8)
            X.6Az r11 = new X.6Az
            r11.<init>(r0, r12, r1)
            X.7ku r6 = r7.A02
            if (r6 == 0) goto L_0x0300
            X.6MO r1 = X.AnonymousClass6MO.A01
            java.util.List r0 = r10.A02
            X.4vP r0 = X.C100674vP.A01(r4, r0)
            java.lang.Object r1 = X.AnonymousClass5ZN.A00(r1, r6, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
            X.AnonymousClass00C.A0E(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0304
        L_0x0300:
            X.00f r1 = X.C000400e.A0D()
        L_0x0304:
            int r0 = r1.size()
            java.util.ArrayList r6 = X.C36441kJ.A14(r0)
            java.util.Iterator r13 = X.AnonymousClass000.A0y(r1)
        L_0x0310:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0348
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r13)
            java.lang.String r12 = X.C90494aF.A0f(r1)
            if (r9 == 0) goto L_0x0336
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0336
            java.lang.Integer r0 = X.C023109s.A00
            java.lang.String r0 = X.C129286Gh.A00(r0, r9)
            X.AnonymousClass00C.A08(r0)
            java.lang.String r12 = X.C129286Gh.A01(r12, r0)
            X.AnonymousClass00C.A08(r12)
        L_0x0336:
            java.lang.Object r0 = r1.getValue()
            X.69S r1 = new X.69S
            r1.<init>(r12, r0)
            X.69T r0 = new X.69T
            r0.<init>(r8, r1)
            r6.add(r0)
            goto L_0x0310
        L_0x0348:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "query_info_"
            java.lang.String r12 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.util.List r1 = r10.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x036a
            java.lang.Integer r0 = X.C023109s.A00
            java.lang.String r0 = X.C129286Gh.A00(r0, r1)
            X.AnonymousClass00C.A08(r0)
            java.lang.String r12 = X.C129286Gh.A01(r12, r0)
            X.AnonymousClass00C.A08(r12)
        L_0x036a:
            X.69S r1 = new X.69S
            r0 = r23
            r1.<init>(r12, r0)
            X.69T r0 = new X.69T
            r0.<init>(r11, r1)
            java.util.ArrayList r1 = X.C007103b.A0T(r0, r6)
            r0 = r22
            r0.add(r1)
            goto L_0x01ad
        L_0x0381:
            r9 = r8
            goto L_0x01a1
        L_0x0384:
            java.util.ArrayList r0 = X.AnonymousClass03U.A07(r22)
            goto L_0x00de
        L_0x038a:
            X.5on r8 = r6.A00
            goto L_0x009e
        L_0x038e:
            java.util.List r0 = X.C007103b.A0Y(r8)
            return r0
        L_0x0393:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to find async component container for "
            r1.append(r0)
            java.lang.String r0 = r12.A04
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            throw r1
        L_0x03a8:
            X.0jS r1 = X.C36441kJ.A18()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6SN.A00(X.6SN, X.4vP, X.66B, X.6Dm, java.lang.String):java.util.List");
    }
}
