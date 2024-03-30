package X;

import java.util.Collection;

/* renamed from: X.3fZ  reason: invalid class name and case insensitive filesystem */
public abstract class C70693fZ implements C88784Ua {
    public final boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (collection.size() != 1) {
            return false;
        }
        return A01(C36421kH.A0S(collection));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b8, code lost:
        if (r10.A0E(5174) != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0369, code lost:
        if (X.C63903Lw.A00(r13) != false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04d8, code lost:
        if (r1.A00.A03() == false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x04fd, code lost:
        if (r0 == false) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0522, code lost:
        if (r2.A01.A01.A0E(7080) == false) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0128, code lost:
        r14 = (com.whatsapp.jid.GroupJid) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a8, code lost:
        if ((r13 instanceof X.C46972by) != false) goto L_0x01aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030 A[PHI: r4 
      PHI: (r4v16 boolean) = (r4v5 boolean), (r4v5 boolean), (r4v5 boolean), (r4v5 boolean), (r4v5 boolean), (r4v5 boolean), (r4v12 boolean), (r4v12 boolean), (r4v17 boolean), (r4v17 boolean) binds: [B:240:0x03f1, B:334:0x056d, B:336:0x0573, B:338:0x0579, B:340:0x0583, B:342:0x058b, B:344:0x0594, B:346:0x059c, B:9:0x0026, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[EDGE_INSN: B:347:0x0071->B:26:0x0071 ?: BREAK  , ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.AnonymousClass3T1 r24) {
        /*
            r23 = this;
            r13 = r24
            r2 = r23
            boolean r0 = r2 instanceof X.C43792Jv
            if (r0 == 0) goto L_0x0031
            X.2Jv r2 = (X.C43792Jv) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.0yC r2 = r2.A00
            r0 = 2890(0xb4a, float:4.05E-42)
            boolean r0 = r2.A0E(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0052
            int r1 = r13.A1I
            r0 = 2
            if (r1 != r0) goto L_0x0052
            int r0 = r13.A09
            if (r0 != r4) goto L_0x0052
            boolean r0 = X.C64933Qa.A04(r13)
            if (r0 == 0) goto L_0x0030
            r0 = 5884(0x16fc, float:8.245E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 != 0) goto L_0x0052
        L_0x0030:
            return r4
        L_0x0031:
            boolean r0 = r2 instanceof X.AnonymousClass2K4
            if (r0 == 0) goto L_0x0054
            X.2K4 r2 = (X.AnonymousClass2K4) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.3Qa r0 = r13.A1J
            X.11F r1 = r0.A00
            r4 = 0
            if (r1 == 0) goto L_0x0052
            X.16D r0 = r2.A00
            X.141 r1 = r0.A07(r1)
            if (r1 != 0) goto L_0x058e
            X.1Jb r2 = r2.A01
            X.8zz r1 = X.C188648zz.A0Q
            r0 = 0
            r2.A00(r1, r0)
        L_0x0052:
            r4 = 0
            return r4
        L_0x0054:
            boolean r0 = r2 instanceof X.C43812Jx
            if (r0 == 0) goto L_0x0073
            X.2Jx r2 = (X.C43812Jx) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.0yC r1 = r2.A02
            r0 = 535(0x217, float:7.5E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0071
            X.1Fz r0 = r2.A03
            boolean r0 = r0.A02(r13)
            r2 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            return r2
        L_0x0073:
            boolean r0 = r2 instanceof X.C43732Jp
            if (r0 == 0) goto L_0x0084
            X.2Jp r2 = (X.C43732Jp) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.9g8 r0 = r2.A01
            boolean r2 = r0.A02(r13)
            return r2
        L_0x0084:
            boolean r0 = r2 instanceof X.C43742Jq
            if (r0 == 0) goto L_0x00ce
            X.2Jq r2 = (X.C43742Jq) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.9g8 r2 = r2.A01
            X.005 r0 = r2.A01
            java.lang.Object r1 = X.C36411kG.A0v(r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00b7
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b7
        L_0x00a5:
            boolean r0 = X.C199859g8.A00(r13, r2)
            if (r0 == 0) goto L_0x0071
            com.whatsapp.jid.UserJid r0 = r13.A0L()
            boolean r0 = X.AnonymousClass143.A0I(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0072
            goto L_0x0071
        L_0x00b7:
            java.util.Iterator r1 = r1.iterator()
        L_0x00bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r0 = r1.next()
            X.4Tc r0 = (X.C88544Tc) r0
            boolean r0 = r0.BMn(r13)
            if (r0 != 0) goto L_0x00bb
            goto L_0x0071
        L_0x00ce:
            boolean r0 = r2 instanceof X.AnonymousClass2K5
            if (r0 == 0) goto L_0x0279
            X.2K5 r2 = (X.AnonymousClass2K5) r2
            r12 = 0
            X.AnonymousClass00C.A0D(r13, r12)
            X.0wo r11 = r2.A05
            X.0yC r10 = r2.A08
            X.0wQ r9 = r2.A01
            X.12q r15 = r2.A06
            X.0xf r14 = r2.A09
            X.16D r8 = r2.A02
            X.1EM r7 = r2.A0C
            X.1GQ r1 = r2.A0A
            X.18y r6 = r2.A04
            X.0v5 r0 = r2.A00
            r22 = r0
            X.1E9 r0 = r2.A0B
            r17 = r0
            X.185 r5 = r2.A03
            X.17X r0 = r2.A07
            X.3Qa r4 = r13.A1J
            X.11F r3 = r4.A00
            boolean r2 = X.AnonymousClass3M3.A01(r14, r3)
            if (r2 != 0) goto L_0x013d
            boolean r2 = X.AnonymousClass3RR.A00(r10, r3)
            if (r2 != 0) goto L_0x013d
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r3)
            boolean r16 = X.C63823Lo.A01(r5, r10, r14, r2)
            if (r16 != 0) goto L_0x013d
            r20 = r2
            r21 = r17
            r17 = r6
            r18 = r10
            r19 = r14
            r16 = r5
            boolean r14 = X.AnonymousClass3RK.A00(r16, r17, r18, r19, r20, r21)
            if (r14 != 0) goto L_0x013d
            boolean r14 = X.AnonymousClass143.A0G(r3)
            if (r14 == 0) goto L_0x013e
            r14 = r3
            com.whatsapp.jid.GroupJid r14 = (com.whatsapp.jid.GroupJid) r14
            X.141 r8 = r8.A08(r14)
            if (r8 == 0) goto L_0x013d
            boolean r7 = r7.A04(r8, r14)
            if (r7 != 0) goto L_0x013d
            boolean r0 = r0.A0C(r14)
            if (r0 != 0) goto L_0x013e
        L_0x013d:
            return r12
        L_0x013e:
            java.lang.Object r7 = r22.A03()
            X.1HX r7 = (X.AnonymousClass1HX) r7
            if (r7 == 0) goto L_0x0155
            java.util.List r0 = r13.A0w
            com.whatsapp.jid.UserJid r0 = r7.A01(r0)
            if (r0 != 0) goto L_0x013d
            boolean r0 = X.C197029b1.A00(r3)
            if (r0 == 0) goto L_0x0155
            return r12
        L_0x0155:
            boolean r7 = r3 instanceof X.C28981Uw
            if (r7 == 0) goto L_0x01d4
            X.1Uw r3 = (X.C28981Uw) r3
            if (r3 == 0) goto L_0x013d
            X.3Qp r6 = r15.A09(r3, r12)
            X.2La r6 = (X.C44072La) r6
            if (r6 == 0) goto L_0x013d
            long r8 = X.AnonymousClass3T1.A05(r11, r13)
            r4 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            boolean r2 = X.C36431kI.A1P(r0)
            boolean r0 = X.C65903Tx.A06(r15, r3, r1)
            if (r0 == 0) goto L_0x013d
            boolean r0 = r6.A0L()
            if (r0 == 0) goto L_0x013d
            int r1 = r13.A0D
            r0 = 4
            if (r1 != r0) goto L_0x013d
            X.3Jw r0 = r13.A0W()
            if (r0 != 0) goto L_0x013d
            r1 = 1
            int r0 = r13.A0A
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 != 0) goto L_0x013d
            boolean r0 = r13 instanceof X.AnonymousClass2bV
            if (r0 != 0) goto L_0x01aa
            boolean r0 = r13 instanceof X.C46882bp
            if (r0 != 0) goto L_0x01aa
            boolean r0 = r13 instanceof X.C181798o3
            if (r0 != 0) goto L_0x01aa
            boolean r0 = r13 instanceof X.C181788o2
            if (r0 != 0) goto L_0x01aa
            boolean r0 = r13 instanceof X.C46972by
            if (r0 == 0) goto L_0x013d
        L_0x01aa:
            boolean r0 = X.C66013Ui.A0b(r13)
            if (r0 != 0) goto L_0x013d
            if (r2 == 0) goto L_0x013d
            r0 = 5174(0x1436, float:7.25E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x013d
        L_0x01ba:
            long r3 = X.AnonymousClass3T1.A05(r11, r13)
            r0 = 3272(0xcc8, float:4.585E-42)
            int r0 = r10.A07(r0)
            long r1 = X.C36371kC.A07(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d2
            if (r7 != 0) goto L_0x01d2
            boolean r0 = r13 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x013d
        L_0x01d2:
            r12 = 1
            return r12
        L_0x01d4:
            boolean r0 = r15.A0O(r3)
            if (r0 == 0) goto L_0x01e2
            r0 = 4090(0xffa, float:5.731E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x013d
        L_0x01e2:
            long r0 = r13.A0H
            r14 = -1
            int r8 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x01f0
            boolean r0 = r9.A0M(r3)
            if (r0 == 0) goto L_0x013d
        L_0x01f0:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x013d
            r0 = 2190(0x88e, float:3.069E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x024b
            boolean r0 = r13 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x024b
        L_0x0200:
            r1 = 1
            int r0 = r13.A0A
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 != 0) goto L_0x013d
            long r14 = X.AnonymousClass3T1.A05(r11, r13)
            r0 = 2983(0xba7, float:4.18E-42)
            int r0 = r10.A07(r0)
            long r8 = X.C36371kC.A07(r0)
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0227
            boolean r0 = X.C64933Qa.A04(r13)
            if (r0 != 0) goto L_0x0227
            boolean r0 = r13 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x013d
        L_0x0227:
            boolean r0 = r3 instanceof X.C177538dx
            if (r0 != 0) goto L_0x013d
            boolean r0 = r5.A04(r2)
            if (r0 != 0) goto L_0x013d
            X.3U1 r1 = new X.3U1
            r1.<init>((X.AnonymousClass185) r5, (X.C235618y) r6, (com.whatsapp.jid.UserJid) r2)
            r0 = 5968(0x1750, float:8.363E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r1.A05()
            if (r0 != 0) goto L_0x013d
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x01ba
            return r12
        L_0x024b:
            r0 = 3687(0xe67, float:5.167E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x013d
            boolean r0 = r13 instanceof X.C46882bp
            if (r0 != 0) goto L_0x025f
            boolean r0 = r13 instanceof X.C181798o3
            if (r0 != 0) goto L_0x025f
            boolean r0 = r13 instanceof X.C181788o2
            if (r0 == 0) goto L_0x0269
        L_0x025f:
            r0 = r13
            X.2bU r0 = (X.AnonymousClass2bU) r0
            boolean r0 = X.AnonymousClass2bU.A02(r0)
            if (r0 != 0) goto L_0x0269
            goto L_0x0200
        L_0x0269:
            boolean r0 = r13 instanceof X.C46972by
            if (r0 == 0) goto L_0x013d
            r0 = r13
            X.2by r0 = (X.C46972by) r0
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x013d
            goto L_0x0200
        L_0x0279:
            boolean r0 = r2 instanceof X.AnonymousClass2K2
            if (r0 == 0) goto L_0x02a7
            X.2K2 r2 = (X.AnonymousClass2K2) r2
            X.11F r4 = X.C64933Qa.A00(r13)
            X.0yC r3 = r2.A08
            X.0yV r1 = X.C21000yV.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = X.C20800yB.A01(r1, r3, r0)
            if (r0 == 0) goto L_0x0071
            boolean r0 = r13 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x0071
            boolean r0 = X.AnonymousClass143.A0G(r4)
            if (r0 == 0) goto L_0x0071
            X.12q r0 = r2.A05
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            int r1 = r0.A05(r4)
            r0 = 3
            r2 = 1
            if (r1 == r0) goto L_0x0072
            goto L_0x0071
        L_0x02a7:
            boolean r0 = r2 instanceof X.C43762Js
            if (r0 == 0) goto L_0x02b6
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            com.whatsapp.jid.UserJid r0 = r13.A0L()
            boolean r2 = r0 instanceof X.C223313w
            return r2
        L_0x02b6:
            boolean r0 = r2 instanceof X.AnonymousClass2K3
            if (r0 == 0) goto L_0x02d6
            X.2K3 r2 = (X.AnonymousClass2K3) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.1Js r1 = r2.A02
            X.2nd r0 = X.C51322nd.UNPIN
            r2 = 1
            boolean r0 = X.C26321Js.A00(r0, r1, r13)
            r1 = 0
            if (r0 == 0) goto L_0x02d5
            X.5J2 r0 = r13.A1V
            if (r0 == 0) goto L_0x02d5
            int r0 = r0.A00
            if (r0 != r2) goto L_0x02d5
        L_0x02d4:
            r1 = 1
        L_0x02d5:
            return r1
        L_0x02d6:
            boolean r0 = r2 instanceof X.C43802Jw
            if (r0 == 0) goto L_0x02f4
            X.2Jw r2 = (X.C43802Jw) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.3Qa r0 = r13.A1J
            X.11F r1 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x052d
            X.1EL r0 = r2.A03
            boolean r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x052d
            goto L_0x0071
        L_0x02f4:
            boolean r0 = r2 instanceof X.C43832Jz
            if (r0 == 0) goto L_0x0337
            X.2Jz r2 = (X.C43832Jz) r2
            r1 = 0
            X.AnonymousClass00C.A0D(r13, r1)
            X.3Qa r0 = r13.A1J
            X.11F r3 = r0.A00
            X.12q r0 = r2.A03
            X.3Qp r1 = r0.A09(r3, r1)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x0071
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0071
            boolean r0 = r3 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r1.A0J
            if (r0 == 0) goto L_0x0071
            X.0wo r0 = r2.A02
            boolean r0 = X.C65903Tx.A05(r0, r13)
            if (r0 == 0) goto L_0x0071
            long r5 = r13.A1O
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            boolean r0 = X.C66013Ui.A0n(r13)
            if (r0 != 0) goto L_0x0071
            X.0yC r1 = r2.A04
            r0 = 5188(0x1444, float:7.27E-42)
            boolean r2 = r1.A0E(r0)
            return r2
        L_0x0337:
            boolean r0 = r2 instanceof X.AnonymousClass2K0
            if (r0 == 0) goto L_0x03c2
            X.2K0 r2 = (X.AnonymousClass2K0) r2
            r3 = 0
            X.AnonymousClass00C.A0D(r13, r3)
            X.16D r1 = r2.A02
            X.3Qa r4 = r13.A1J
            X.11F r0 = r4.A00
            X.C18740tg.A06(r0)
            X.141 r0 = r1.A07(r0)
            r5 = 0
            if (r0 == 0) goto L_0x036b
            X.3L0 r0 = r0.A0E
            int r1 = X.AnonymousClass3U1.A00(r0)
            r0 = 1
            if (r1 == r0) goto L_0x036b
            X.0v5 r1 = r2.A00
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x036c
            r1.A02()
            boolean r0 = X.C63903Lw.A00(r13)
            if (r0 == 0) goto L_0x036c
        L_0x036b:
            return r5
        L_0x036c:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            int r0 = r13.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 != 0) goto L_0x036b
            X.0yC r1 = r2.A03
            r0 = 690(0x2b2, float:9.67E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x036b
            X.1Fz r2 = r2.A04
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x036b
            X.005 r0 = r2.A00
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0393:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03aa
            java.lang.Object r0 = r1.next()
            X.4Ui r0 = (X.C88864Ui) r0
            java.lang.Boolean r0 = r0.BMp(r13)
            boolean r0 = X.C36371kC.A1X(r0, r3)
            if (r0 == 0) goto L_0x0393
            return r5
        L_0x03aa:
            X.00T r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            X.9XG r1 = (X.AnonymousClass9XG) r1
            int r0 = r13.A1I
            X.0ow r0 = r1.A00(r0)
            X.4VB r0 = (X.AnonymousClass4VB) r0
            boolean r0 = r0.BMq(r13)
            if (r0 == 0) goto L_0x036b
            r5 = 1
            return r5
        L_0x03c2:
            boolean r0 = r2 instanceof X.AnonymousClass2K6
            if (r0 == 0) goto L_0x03e0
            X.2K6 r2 = (X.AnonymousClass2K6) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.1Js r1 = r2.A04
            X.2nd r0 = X.C51322nd.PIN
            boolean r0 = X.C26321Js.A00(r0, r1, r13)
            r1 = 0
            if (r0 == 0) goto L_0x02d5
            X.5J2 r0 = r13.A1V
            if (r0 == 0) goto L_0x02d4
            int r0 = r0.A00
            if (r0 == 0) goto L_0x02d4
            return r1
        L_0x03e0:
            boolean r0 = r2 instanceof X.C43822Jy
            if (r0 == 0) goto L_0x03fd
            X.2Jy r2 = (X.C43822Jy) r2
            X.3Qa r1 = X.AnonymousClass3T1.A06(r13)
            X.11F r3 = r1.A00
            boolean r0 = X.AnonymousClass143.A0G(r3)
            r4 = 0
            if (r0 == 0) goto L_0x0030
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0567
            int r1 = r13.A0D
            r0 = 6
            if (r1 == r0) goto L_0x0567
            return r4
        L_0x03fd:
            boolean r0 = r2 instanceof X.AnonymousClass2JO
            if (r0 == 0) goto L_0x040e
            X.2JO r2 = (X.AnonymousClass2JO) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.3QW r0 = r2.A00
            boolean r2 = r0.A03(r13)
            return r2
        L_0x040e:
            boolean r0 = r2 instanceof X.AnonymousClass2JN
            if (r0 == 0) goto L_0x041f
            X.2JN r2 = (X.AnonymousClass2JN) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.3QW r0 = r2.A00
            boolean r2 = r0.A02(r13)
            return r2
        L_0x041f:
            boolean r0 = r2 instanceof X.C43782Ju
            if (r0 == 0) goto L_0x0438
            X.2Ju r2 = (X.C43782Ju) r2
            r4 = 0
            X.AnonymousClass00C.A0D(r13, r4)
            X.3Qa r3 = r13.A1J
            X.11F r1 = r3.A00
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0538
            X.12q r0 = r2.A01
            r0.A09(r1, r4)
            goto L_0x0071
        L_0x0438:
            boolean r0 = r2 instanceof X.C43772Jt
            if (r0 == 0) goto L_0x0461
            r1 = 0
            X.AnonymousClass00C.A0D(r13, r1)
            boolean r0 = r13 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0071
            X.2bU r13 = (X.AnonymousClass2bU) r13
            int r3 = X.C66013Ui.A00(r13)
            r0 = 2
            java.lang.Integer[] r2 = new java.lang.Integer[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r1] = r0
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.util.Set r0 = X.C36421kH.A0i(r0, r2, r1)
            boolean r2 = X.AnonymousClass000.A1Z(r0, r3)
            return r2
        L_0x0461:
            boolean r0 = r2 instanceof X.AnonymousClass2K1
            if (r0 == 0) goto L_0x04ba
            X.2K1 r2 = (X.AnonymousClass2K1) r2
            X.3Qa r1 = X.AnonymousClass3T1.A06(r13)
            X.11F r4 = r1.A00
            boolean r0 = X.AnonymousClass143.A0G(r4)
            r3 = 0
            if (r0 == 0) goto L_0x047d
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x047e
            int r1 = r13.A0D
            r0 = 6
            if (r1 == r0) goto L_0x047e
        L_0x047d:
            return r3
        L_0x047e:
            X.1EL r0 = r2.A05
            boolean r0 = r0.A02(r4)
            if (r0 != 0) goto L_0x047d
            com.whatsapp.jid.UserJid r1 = X.C20350xQ.A03(r13)
            if (r1 == 0) goto L_0x047d
            X.0xf r0 = r2.A04
            boolean r0 = X.AnonymousClass3M3.A01(r0, r1)
            if (r0 != 0) goto L_0x047d
            boolean r0 = X.C63903Lw.A00(r13)
            if (r0 != 0) goto L_0x047d
            com.whatsapp.jid.UserJid r0 = r13.A0L()
            boolean r0 = X.AnonymousClass143.A0I(r0)
            if (r0 != 0) goto L_0x047d
            X.16D r0 = r2.A02
            X.141 r0 = r0.A0D(r1)
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x047d
            X.0wQ r0 = r2.A01
            boolean r0 = X.C36441kJ.A1J(r0)
            if (r0 == 0) goto L_0x047d
            r3 = 1
            return r3
        L_0x04ba:
            X.2Jo r2 = (X.C43722Jo) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.1HX r1 = r2.A00
            boolean r0 = X.C63903Lw.A00(r13)
            r5 = 1
            if (r0 == 0) goto L_0x04da
            X.1Hg r1 = r1.A00
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x04da
            X.1Ha r0 = r1.A00
            boolean r0 = r0.A03()
            r4 = 1
            if (r0 != 0) goto L_0x04db
        L_0x04da:
            r4 = 0
        L_0x04db:
            X.1El r3 = r2.A03
            r1 = 8388608(0x800000, float:1.17549435E-38)
            int r0 = r13.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x04ff
            X.1CF r1 = r2.A02
            X.3Qa r0 = r13.A1J
            X.11F r0 = r0.A00
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x04ff
            X.0yC r1 = r3.A01
            r0 = 5215(0x145f, float:7.308E-42)
            boolean r0 = r1.A0E(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0500
        L_0x04ff:
            r3 = 0
        L_0x0500:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            int r0 = r13.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x0524
            X.1CF r1 = r2.A02
            X.3Qa r0 = r13.A1J
            X.11F r0 = r0.A00
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0524
            X.3Rj r0 = r2.A01
            X.0yC r1 = r0.A01
            r0 = 7080(0x1ba8, float:9.921E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0525
        L_0x0524:
            r0 = 0
        L_0x0525:
            if (r4 != 0) goto L_0x036b
            if (r3 != 0) goto L_0x036b
            if (r0 != 0) goto L_0x036b
            r5 = 0
            return r5
        L_0x052d:
            boolean r0 = r1 instanceof X.C177638e7
            if (r0 != 0) goto L_0x0071
            X.1Fz r0 = r2.A02
            boolean r2 = r0.A03(r13)
            return r2
        L_0x0538:
            boolean r2 = r3.A02
            if (r2 == 0) goto L_0x055f
            boolean r0 = r13.A1J()
            if (r0 != 0) goto L_0x055f
            int r1 = r13.A1I
            r0 = 10
            if (r1 == r0) goto L_0x055f
            r0 = 90
            if (r1 == r0) goto L_0x055f
            boolean r0 = X.C66013Ui.A0n(r13)
            if (r0 != 0) goto L_0x055f
            int r1 = r13.A0D
            r0 = 4
            int r0 = X.AnonymousClass3TJ.A00(r1, r0)
            boolean r0 = X.C36401kF.A1U(r0)
            if (r0 != 0) goto L_0x0565
        L_0x055f:
            boolean r0 = r13 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x0071
            if (r2 == 0) goto L_0x0071
        L_0x0565:
            r2 = 1
            return r2
        L_0x0567:
            X.1EL r0 = r2.A04
            boolean r0 = r0.A02(r3)
            if (r0 != 0) goto L_0x0030
            boolean r0 = X.C63903Lw.A00(r13)
            if (r0 != 0) goto L_0x0030
            com.whatsapp.jid.UserJid r1 = X.C20350xQ.A03(r13)
            if (r1 == 0) goto L_0x0030
            com.whatsapp.jid.UserJid r0 = r13.A0L()
            boolean r0 = X.AnonymousClass143.A0I(r0)
            if (r0 != 0) goto L_0x0030
            X.0xf r0 = r2.A03
            boolean r0 = X.AnonymousClass3M3.A01(r0, r1)
            if (r0 != 0) goto L_0x0030
            goto L_0x059e
        L_0x058e:
            X.1Or r0 = r2.A05
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0030
            X.1Fz r0 = r2.A02
            boolean r0 = r0.A02(r13)
            if (r0 == 0) goto L_0x0030
        L_0x059e:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70693fZ.A01(X.3T1):boolean");
    }
}
