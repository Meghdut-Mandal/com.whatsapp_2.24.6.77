package X;

import java.util.List;

/* renamed from: X.9vY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207649vY implements AnonymousClass08V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1O1 A01;
    public final /* synthetic */ C108515Tu A02;
    public final /* synthetic */ C1041758o A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    public /* synthetic */ C207649vY(AnonymousClass1O1 r2, C108515Tu r3, C1041758o r4, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A01 = r2;
        this.A02 = r3;
        this.A08 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0B = z4;
        this.A0C = z5;
        this.A0D = z6;
        this.A0E = z7;
        this.A0F = z8;
        this.A06 = z9;
        this.A07 = z10;
        this.A00 = i;
        this.A04 = list;
        this.A05 = list2;
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014e, code lost:
        if (r15 == false) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r33) {
        /*
            r32 = this;
            r23 = r33
            r1 = r32
            X.1O1 r10 = r1.A01
            X.5Tu r13 = r1.A02
            boolean r0 = r1.A08
            r22 = r0
            boolean r12 = r1.A09
            boolean r0 = r1.A0A
            r31 = r0
            boolean r11 = r1.A0B
            boolean r9 = r1.A0C
            boolean r8 = r1.A0D
            boolean r0 = r1.A0E
            r30 = r0
            boolean r0 = r1.A0F
            r29 = r0
            boolean r0 = r1.A06
            r28 = r0
            boolean r7 = r1.A07
            int r0 = r1.A00
            r27 = r0
            java.util.List r3 = r1.A04
            java.util.List r0 = r1.A05
            r26 = r0
            X.58o r6 = r1.A03
            r0 = r23
            java.lang.String r0 = (java.lang.String) r0
            r23 = r0
            long r18 = android.os.SystemClock.elapsedRealtime()
            X.1O3 r2 = r10.A0B
            java.lang.String r1 = "sync/sync_all/"
            java.util.List r0 = java.util.Collections.emptyList()
            X.9NY r5 = r2.A02(r1, r3, r0)
            if (r5 != 0) goto L_0x0055
            r0 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A09 = r0
            X.6Pu r0 = X.C131626Pu.A03
            return r0
        L_0x0055:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.1A6 r0 = r10.A0C
            r25 = r0
            java.util.HashSet r17 = r25.A0C()
            java.util.HashSet r21 = X.C36441kJ.A16()
            java.util.HashSet r20 = X.C36441kJ.A16()
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            java.util.List r3 = r5.A00
            r1.addAll(r3)
            java.util.List r2 = r5.A06
            r1.addAll(r2)
            java.util.List r0 = r5.A05
            r24 = r0
            r1.addAll(r0)
            java.util.Iterator r16 = r1.iterator()
        L_0x0082:
            boolean r0 = r16.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x00f6
            X.141 r14 = X.C36391kE.A0f(r16)
            r0 = r17
            boolean r0 = X.C202329lb.A03(r14, r0, r1)
            if (r0 != 0) goto L_0x0082
            X.9jB r15 = new X.9jB
            r15.<init>((X.AnonymousClass141) r14)
            r15.A0C = r1
            r15.A0L = r12
            r0 = r31
            r15.A0J = r0
            r15.A0B = r11
            r15.A0E = r9
            r15.A0I = r8
            r0 = r30
            r15.A0F = r0
            int r0 = X.C165607th.A06(r14, r13)
            r15.A01 = r0
            r0 = r29
            r15.A0H = r0
            r0 = r28
            r15.A0N = r0
            r15.A0M = r7
            if (r11 == 0) goto L_0x00c5
            java.util.Map r1 = r10.A0K
            com.whatsapp.jid.UserJid r0 = r15.A0P
            X.AnonymousClass9jB.A02(r10, r15, r0, r1)
        L_0x00c5:
            if (r9 == 0) goto L_0x00d1
            X.17i r1 = r10.A0E
            com.whatsapp.jid.UserJid r0 = r15.A0P
            long r0 = X.AnonymousClass9jB.A00(r15, r1, r0)
            r15.A02 = r0
        L_0x00d1:
            X.C165577te.A14(r10, r15, r8)
            X.AnonymousClass9jB.A04(r15, r4)
            X.3IL r0 = r14.A0F
            if (r0 == 0) goto L_0x00e4
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x00e4
            r0 = r20
            r0.add(r1)
        L_0x00e4:
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r14.A06(r0)
            if (r1 == 0) goto L_0x0082
            com.whatsapp.jid.Jid r1 = r14.A06(r0)
            r0 = r21
            r0.add(r1)
            goto L_0x0082
        L_0x00f6:
            if (r12 != 0) goto L_0x00fe
            if (r11 != 0) goto L_0x00fe
            if (r22 != 0) goto L_0x00fe
            if (r7 == 0) goto L_0x0183
        L_0x00fe:
            java.util.HashSet r17 = r25.A0C()
            java.util.Iterator r16 = r26.iterator()
        L_0x0106:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0183
            X.141 r1 = X.C36391kE.A0f(r16)
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r14 = r1.A06(r0)
            X.3IL r0 = r1.A0F
            if (r0 == 0) goto L_0x0124
            java.lang.String r15 = r0.A01
            r0 = r20
            boolean r0 = r0.contains(r15)
            if (r0 != 0) goto L_0x0106
        L_0x0124:
            if (r14 != 0) goto L_0x0106
            r0 = r21
            boolean r0 = r0.contains(r14)
            if (r0 != 0) goto L_0x0106
            X.11F r0 = r1.A0H
            boolean r0 = X.C202329lb.A04(r0)
            if (r0 != 0) goto L_0x0106
            r0 = r17
            boolean r15 = X.AnonymousClass1O1.A06(r1, r0)
            X.9jB r14 = new X.9jB
            r14.<init>((X.AnonymousClass141) r1)
            r14.A0L = r12
            r14.A0B = r11
            r0 = r31
            r14.A0J = r0
            r14.A0G = r15
            if (r22 == 0) goto L_0x0150
            r0 = 1
            if (r15 != 0) goto L_0x0151
        L_0x0150:
            r0 = 0
        L_0x0151:
            r14.A0K = r0
            r14.A0E = r9
            int r0 = X.C165607th.A06(r1, r13)
            r14.A01 = r0
            r14.A0I = r8
            r0 = r30
            r14.A0F = r0
            r0 = r29
            r14.A0H = r0
            r14.A0M = r7
            if (r11 == 0) goto L_0x0170
            java.util.Map r1 = r10.A0K
            com.whatsapp.jid.UserJid r0 = r14.A0P
            X.AnonymousClass9jB.A02(r10, r14, r0, r1)
        L_0x0170:
            if (r9 == 0) goto L_0x017c
            X.17i r1 = r10.A0E
            com.whatsapp.jid.UserJid r0 = r14.A0P
            long r0 = X.AnonymousClass9jB.A00(r14, r1, r0)
            r14.A02 = r0
        L_0x017c:
            X.C165577te.A14(r10, r14, r8)
            X.AnonymousClass9jB.A04(r14, r4)
            goto L_0x0106
        L_0x0183:
            boolean r0 = X.C165577te.A1Y(r6, r4)
            if (r0 == 0) goto L_0x018c
            X.6Pu r0 = X.C131626Pu.A08
            return r0
        L_0x018c:
            X.AIC r11 = X.AnonymousClass1O1.A01(r10)
            java.lang.String r0 = "sync_sid_full"
            java.lang.String r9 = X.C202329lb.A00(r0)
            r7 = 0
            X.9eK r8 = new X.9eK
            r0 = r27
            r8.<init>(r13, r4, r0, r7)
            r0 = 64000(0xfa00, double:3.162E-319)
            X.777 r1 = r11.A05(r8, r9, r0)
            r0 = r23
            boolean r0 = X.AnonymousClass1O1.A04(r10, r6, r0, r1)
            if (r0 != 0) goto L_0x01b0
            X.6Pu r0 = X.C131626Pu.A03
            return r0
        L_0x01b0:
            java.util.Map r1 = r10.A0N
            r0 = 0
            X.AnonymousClass1O1.A03(r10, r0, r3, r1)
            X.AnonymousClass1O1.A03(r10, r0, r2, r1)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            r0 = r24
            X.AnonymousClass1O1.A03(r10, r8, r0, r1)
            java.util.List r0 = r5.A03
            boolean r2 = X.AnonymousClass1O1.A05(r10, r3, r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sync/sync_all/contacts update="
            X.C36321k7.A1X(r0, r1, r2)
            java.lang.String r0 = "sync/sync_all/contacts_changed_by_server"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x01e2
            X.196 r0 = r10.A05
            r0.A0O(r8, r7)
            r2 = 1
        L_0x01e2:
            r0 = r18
            X.C192519Hh.A00(r10, r6, r4, r0)
            if (r2 == 0) goto L_0x01ec
            X.6Pu r0 = X.C131626Pu.A07
            return r0
        L_0x01ec:
            X.6Pu r0 = X.C131626Pu.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207649vY.apply(java.lang.Object):java.lang.Object");
    }
}
