package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.3qW  reason: invalid class name and case insensitive filesystem */
public final class C77453qW implements C88544Tc {
    public final AnonymousClass16D A00;
    public final AnonymousClass17X A01;
    public final C20350xQ A02;
    public final AnonymousClass1EL A03;
    public final C220412q A04;
    public final C20810yC A05;
    public final AnonymousClass1EM A06;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r1.A0M(r2) != 1) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r6.A1R(16) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.AnonymousClass3T1 r6) {
        /*
            r5 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r6, r4)
            com.whatsapp.jid.GroupJid r2 = X.C64933Qa.A03(r6)
            X.12q r0 = r5.A04
            int r1 = r0.A05(r2)
            r3 = 1
            r0 = 3
            if (r1 != r0) goto L_0x003a
            boolean r0 = r6.A1I()
            if (r0 == 0) goto L_0x003a
            if (r2 == 0) goto L_0x003b
            X.16D r0 = r5.A00
            X.141 r2 = r0.A08(r2)
            if (r2 == 0) goto L_0x003b
            X.0xQ r1 = r5.A02
            X.1EL r0 = r1.A0n
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0032
            int r0 = r1.A0M(r2)
            if (r0 != r3) goto L_0x003b
        L_0x0032:
            r0 = 16
            boolean r0 = r6.A1R(r0)
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            return r4
        L_0x003b:
            r0 = 16
            boolean r0 = r6.A1R(r0)
            if (r0 == 0) goto L_0x004c
            X.0yC r0 = r5.A05
            boolean r0 = X.C36401kF.A1Z(r0)
            if (r0 == 0) goto L_0x004c
            r4 = 1
        L_0x004c:
            X.0yC r2 = r5.A05
            X.0yV r1 = X.C21000yV.A01
            r0 = 4727(0x1277, float:6.624E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r4 != 0) goto L_0x005b
            if (r0 != 0) goto L_0x005b
            r3 = 0
        L_0x005b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77453qW.A00(X.3T1):boolean");
    }

    public boolean BMn(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (AnonymousClass143.A0G(r4.A1J.A00)) {
            GroupJid A032 = C64933Qa.A03(r4);
            if (A032 != null) {
                return (this.A00.A08(A032) == null || !this.A03.A02(A032)) && this.A01.A0C(A032);
            }
            return true;
        }
        return false;
    }

    public boolean BN1(AnonymousClass3T1 r6) {
        AnonymousClass00C.A0D(r6, 0);
        GroupJid A032 = C64933Qa.A03(r6);
        if (A032 != null) {
            if (!A00(r6)) {
                AnonymousClass141 A08 = this.A00.A08(A032);
                if (A08 != null && this.A06.A04(A08, A032)) {
                    return false;
                }
            }
        }
        GroupJid A033 = C64933Qa.A03(r6);
        return A033 == null || ((this.A00.A08(A033) == null || !this.A03.A02(A033)) && this.A01.A0C(A033));
    }

    public C77453qW(AnonymousClass16D r1, C220412q r2, AnonymousClass17X r3, C20810yC r4, C20350xQ r5, AnonymousClass1EL r6, AnonymousClass1EM r7) {
        C36321k7.A1B(r4, r2, r1, r7, r6);
        C36321k7.A10(r5, r3);
        this.A05 = r4;
        this.A04 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = r6;
        this.A02 = r5;
        this.A01 = r3;
    }
}
