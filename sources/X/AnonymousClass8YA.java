package X;

import java.util.List;

/* renamed from: X.8YA  reason: invalid class name */
public final class AnonymousClass8YA extends AnonymousClass1LZ {
    public final AnonymousClass16E A00;
    public final C19970wo A01;
    public final C20810yC A02;

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        if (r0 == null) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C201669k5 A0A(X.C202599mH r17, java.lang.String r18, boolean r19) {
        /*
            r16 = this;
            r1 = 2
            r2 = r17
            X.AnonymousClass00C.A0D(r2, r1)
            r7 = 1
            java.lang.String[] r3 = r2.A06
            X.AnonymousClass00C.A07(r3)
            int r0 = r3.length
            r8 = 0
            if (r0 != r7) goto L_0x00bf
            java.lang.String r3 = X.C165617ti.A0a(r3)
            java.lang.String r0 = "status_privacy"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00bf
            X.9fw r4 = r2.A01
            X.AnonymousClass00C.A07(r4)
            X.8SS r3 = r2.A03
            if (r3 == 0) goto L_0x00bf
            int r0 = r3.bitField0_
            boolean r0 = X.C165577te.A1W(r0)
            if (r0 == 0) goto L_0x00bf
            int r0 = r3.bitField1_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00bf
            X.8PR r0 = r3.statusPrivacy_
            r6 = r0
            if (r0 != 0) goto L_0x003a
            X.8PR r0 = X.AnonymousClass8PR.DEFAULT_INSTANCE
        L_0x003a:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00bf
            r0 = r6
            if (r6 != 0) goto L_0x0045
            X.8PR r0 = X.AnonymousClass8PR.DEFAULT_INSTANCE
        L_0x0045:
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.mode_
            if (r0 == 0) goto L_0x009e
            if (r0 == r7) goto L_0x009b
            if (r0 != r1) goto L_0x009e
            X.90h r0 = X.AnonymousClass90h.CONTACTS
        L_0x0051:
            int r5 = r0.ordinal()
            r1 = 0
            if (r5 == r1) goto L_0x0094
            r7 = 2
            r0 = 1
            if (r5 == r0) goto L_0x0094
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0060:
            int r13 = r0.intValue()
            java.util.HashSet r12 = X.C36441kJ.A16()
            if (r6 != 0) goto L_0x006c
            X.8PR r6 = X.AnonymousClass8PR.DEFAULT_INSTANCE
        L_0x006c:
            X.B6c r0 = r6.userJid_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00a1
            X.8PR r0 = r3.statusPrivacy_
            if (r0 != 0) goto L_0x007a
            X.8PR r0 = X.AnonymousClass8PR.DEFAULT_INSTANCE
        L_0x007a:
            X.B6c r0 = r0.userJid_
            java.util.Iterator r1 = r0.iterator()
        L_0x0080:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            if (r0 == 0) goto L_0x0080
            r12.add(r0)
            goto L_0x0080
        L_0x0094:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            if (r0 == 0) goto L_0x00bf
            goto L_0x0060
        L_0x009b:
            X.90h r0 = X.AnonymousClass90h.DENY_LIST
            goto L_0x0051
        L_0x009e:
            X.90h r0 = X.AnonymousClass90h.ALLOW_LIST
            goto L_0x0051
        L_0x00a1:
            X.9fw r9 = X.C199769fw.A02
            boolean r0 = r9.equals(r4)
            if (r0 == 0) goto L_0x00b5
            r14 = 0
            X.9jo r10 = r2.A02
        L_0x00ad:
            X.8bK r8 = new X.8bK
            r11 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x00b5:
            long r14 = r3.timestamp_
            X.9jo r10 = r2.A02
            X.9fw r9 = X.C199769fw.A03
            X.AnonymousClass00C.A09(r9)
            goto L_0x00ad
        L_0x00bf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YA.A0A(X.9mH, java.lang.String, boolean):X.9k5");
    }

    public String A0B() {
        return "regular_high";
    }

    public String A0C() {
        return "status_privacy";
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A06(r2);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r6, C201669k5 r7) {
        C175948bK r62 = (C175948bK) r6;
        AnonymousClass00C.A0D(r62, 0);
        if (r7 == null || r7.A04 < r62.A04) {
            int i = r62.A00;
            this.A00.A0F(r62.A01, i);
            A09(r62, r7);
            return;
        }
        A07(r62);
    }

    public boolean A0H() {
        return this.A02.A0E(4905);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C175948bK A0I() {
        /*
            r10 = this;
            X.16E r2 = r10.A00
            int r3 = r2.A05()
            java.util.HashSet r1 = X.C36441kJ.A16()
            r0 = 1
            if (r3 == r0) goto L_0x0035
            r0 = 2
            if (r3 != r0) goto L_0x0017
            java.util.ArrayList r0 = r2.A0B()
        L_0x0014:
            r1.addAll(r0)
        L_0x0017:
            java.util.HashSet r6 = X.C36441kJ.A16()
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)
            if (r0 == 0) goto L_0x001f
            r6.add(r0)
            goto L_0x001f
        L_0x0035:
            java.util.ArrayList r0 = r2.A0A()
            goto L_0x0014
        L_0x003a:
            X.0wo r0 = r10.A01
            long r8 = X.C19970wo.A00(r0)
            r4 = 0
            X.9fw r3 = X.C199769fw.A03
            X.AnonymousClass00C.A09(r3)
            int r7 = r2.A05()
            X.8bK r2 = new X.8bK
            r5 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YA.A0I():X.8bK");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YA(C19970wo r1, AnonymousClass16E r2, AnonymousClass1AC r3, C20810yC r4) {
        super(r3);
        C36321k7.A18(r1, r4, r2, r3);
        this.A01 = r1;
        this.A02 = r4;
        this.A00 = r2;
    }

    public List A0D(boolean z) {
        return C36371kC.A11(A0I());
    }
}
