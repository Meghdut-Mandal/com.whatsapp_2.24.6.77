package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1TZ  reason: invalid class name */
public final class AnonymousClass1TZ {
    public final AnonymousClass164 A00;
    public final C220412q A01;
    public final C20810yC A02;
    public final AnonymousClass1GQ A03;
    public final Set A04 = new LinkedHashSet();
    public final AnonymousClass1SQ A05;
    public final C28621Tj A06;
    public final AnonymousClass1SP A07;

    public AnonymousClass1TZ(AnonymousClass164 r2, C220412q r3, C20810yC r4, AnonymousClass1GQ r5, AnonymousClass1SQ r6, C28621Tj r7, AnonymousClass1SP r8) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r6, 6);
        AnonymousClass00C.A0D(r7, 7);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A07 = r8;
        this.A05 = r6;
        this.A06 = r7;
    }

    public final synchronized void A01(C28981Uw r13, C22949Az1 az1, Long l, Long l2, long j, boolean z) {
        C28981Uw r4 = r13;
        AnonymousClass00C.A0D(r13, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(r13.getRawString());
        long j2 = j;
        sb.append(j2);
        Long l3 = l;
        sb.append(l);
        Long l4 = l2;
        sb.append(l4);
        String obj = sb.toString();
        Set set = this.A04;
        if (!set.contains(obj) && C65903Tx.A06(this.A01, r13, this.A03)) {
            this.A00.A01(new AnonymousClass8fH(r4, new C21227ADj(az1, this), l3, l4, obj, j2, z));
            set.add(obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (r13.isEmpty() != false) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C28981Uw r35, X.C35831jK r36, long r37, boolean r39) {
        /*
            r34 = this;
            r0 = 0
            r1 = r36
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Object r5 = r1.A00
            X.8sC r5 = (X.C184288sC) r5
            java.lang.Object r3 = r5.A00
            X.8sN r3 = (X.C184398sN) r3
            java.lang.String r12 = r3.A05
            if (r12 != 0) goto L_0x0014
            java.lang.String r12 = ""
        L_0x0014:
            java.lang.Long r0 = r3.A03
            X.AnonymousClass00C.A08(r0)
            long r1 = r0.longValue()
            java.lang.Long r0 = r3.A04
            r8 = 0
            if (r0 != 0) goto L_0x0027
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
        L_0x0027:
            long r17 = r0.longValue()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r6
            java.lang.String r4 = r3.A06
            java.lang.String r0 = "true"
            boolean r23 = r0.equals(r4)
            java.lang.Object r0 = r5.A02
            X.8rr r0 = (X.C184078rr) r0
            r11 = 0
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r13 = r0.A00
            java.util.List r13 = (java.util.List) r13
        L_0x0042:
            java.lang.Object r0 = r5.A01
            X.8rr r0 = (X.C184078rr) r0
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r14 = r0.A00
            java.util.List r14 = (java.util.List) r14
        L_0x004c:
            java.lang.Object r0 = r5.A03
            X.8rr r0 = (X.C184078rr) r0
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x005c
        L_0x0058:
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
        L_0x005c:
            long r21 = r0.longValue()
            X.8rr r0 = r3.A01
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00db
            long r4 = r0.longValue()
            long r4 = r4 * r6
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
        L_0x0073:
            X.8rr r0 = r3.A00
            if (r0 == 0) goto L_0x007b
            java.lang.Object r11 = r0.A00
            java.lang.Long r11 = (java.lang.Long) r11
        L_0x007b:
            r30 = r37
            int r0 = (r37 > r8 ? 1 : (r37 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00d8
            r19 = r17
        L_0x0083:
            X.B07 r0 = r3.A02
            r9 = r34
            r8 = r35
            r24 = r39
            if (r0 != 0) goto L_0x00e3
            X.1SQ r5 = r9.A05
            X.1SM r4 = r5.A06
            X.3T1 r3 = r4.A02(r8, r1)
            r2 = 0
            if (r3 == 0) goto L_0x00a4
            X.3A4 r0 = r3.A0Z()
            if (r0 == 0) goto L_0x00ae
            long r0 = r0.A02
            int r6 = (r0 > r37 ? 1 : (r0 == r37 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ae
        L_0x00a4:
            if (r39 == 0) goto L_0x00ad
            if (r2 == 0) goto L_0x00ad
            X.1SP r0 = r9.A07
            r0.A00(r2)
        L_0x00ad:
            return
        L_0x00ae:
            if (r13 == 0) goto L_0x00b7
            boolean r1 = r13.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00b8
        L_0x00b7:
            r0 = 1
        L_0x00b8:
            r32 = r0 ^ 1
            java.lang.Long r27 = java.lang.Long.valueOf(r21)
            r33 = 0
            r29 = r2
            r25 = r5
            r26 = r3
            r28 = r2
            r25.A02(r26, r27, r28, r29, r30, r32, r33)
            r10 = r5
            r11 = r8
            r12 = r3
            r15 = r30
            r10.A00(r11, r12, r13, r14, r15)
            r4.A05(r3)
            r2 = r3
            goto L_0x00a4
        L_0x00d8:
            r19 = r30
            goto L_0x0083
        L_0x00db:
            r10 = r11
            goto L_0x0073
        L_0x00dd:
            r14 = r11
            goto L_0x004c
        L_0x00e0:
            r13 = r11
            goto L_0x0042
        L_0x00e3:
            X.9OW r7 = new X.9OW
            r15 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21, r23, r24)
            r0.B02(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TZ.A02(X.1Uw, X.1jK, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        if (r14.isEmpty() != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C28981Uw r12, X.AnonymousClass1TZ r13, java.lang.Integer r14, java.lang.Long r15, java.lang.Long r16, java.lang.String r17, java.util.List r18, java.util.List r19, byte[] r20, long r21, long r23, long r25, long r27, boolean r29, boolean r30) {
        /*
            X.9Sf r1 = new X.9Sf
            r1.<init>()
            r1.A02 = r12
            r0 = r17
            r1.A07 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            r1.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r29)
            r1.A04 = r0
            X.AHp r5 = r1.A00()
            if (r15 == 0) goto L_0x0036
            if (r16 == 0) goto L_0x0036
            if (r14 == 0) goto L_0x0036
            int r0 = r14.intValue()
            r5.A01 = r0
            long r0 = r15.longValue()
            long r2 = r16.longValue()
            X.9VZ r4 = new X.9VZ
            r4.<init>(r0, r2)
            r5.A0B = r4
        L_0x0036:
            if (r20 == 0) goto L_0x003e
            X.8SX r0 = X.AnonymousClass8SX.A0i(r20)     // Catch:{ 186 -> 0x008f, 1Tb -> 0x008b }
            r5.A0M = r0     // Catch:{ 186 -> 0x008f, 1Tb -> 0x008b }
        L_0x003e:
            r2 = r13
            X.1Tj r0 = r13.A06     // Catch:{ 186 -> 0x008f, 1Tb -> 0x008b }
            r3 = r21
            X.3T1 r4 = r0.A00(r5, r3)     // Catch:{ 186 -> 0x008f, 1Tb -> 0x008b }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r4.A0j(r0)
            X.1SQ r3 = r13.A05
            r14 = r18
            if (r18 == 0) goto L_0x0059
            boolean r1 = r14.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x005a
        L_0x0059:
            r0 = 1
        L_0x005a:
            r10 = r0 ^ 1
            java.lang.Long r5 = java.lang.Long.valueOf(r27)
            r6 = 0
            r11 = 0
            r8 = r25
            r7 = r6
            r3.A02(r4, r5, r6, r7, r8, r10, r11)
            r15 = r19
            r11 = r3
            r13 = r4
            r16 = r8
            r11.A00(r12, r13, r14, r15, r16)
            boolean r0 = r3.A03(r12, r4)
            if (r0 == 0) goto L_0x0095
            X.1SP r3 = r2.A07
            X.0wI r2 = r3.A02
            r1 = 37
            X.1jB r0 = new X.1jB
            r0.<init>(r3, r4, r1)
            r2.A00(r0)
            if (r30 == 0) goto L_0x0095
            r3.A00(r4)
            return
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageManager/BadE2eMessageException historical message "
            goto L_0x0092
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageManager/invalid historical message"
        L_0x0092:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TZ.A00(X.1Uw, X.1TZ, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.util.List, java.util.List, byte[], long, long, long, long, boolean, boolean):void");
    }
}
