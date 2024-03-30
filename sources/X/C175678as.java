package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.8as  reason: invalid class name and case insensitive filesystem */
public final class C175678as extends C129086Ew {
    public final C20310xM A00;
    public final C20520xh A01;
    public final C30571aQ A02;
    public final C30121Zh A03;
    public final AnonymousClass1A1 A04;
    public final C25301Ft A05;
    public final C20810yC A06;

    public String A00() {
        return "MessageOrphanBotResolver";
    }

    public ArrayList A02(C64933Qa r7, int i, long j) {
        AnonymousClass00C.A0D(r7, 0);
        return this.A05.A03(r7, 2, i, j);
    }

    public final boolean A05(AnonymousClass3T1 r6, AnonymousClass3T1 r7) {
        AnonymousClass3T1 A032;
        r6.A0w(r7);
        if (r6.A0S() == null) {
            r6.A0x(r7.A0S());
        }
        AnonymousClass3T1 A0S = r6.A0S();
        if (A0S == null || (A032 = this.A04.A03(A0S.A1J)) == null) {
            return false;
        }
        A0S.A18(A032.A0w);
        A0S.A1A(true);
        return true;
    }

    public ArrayList A01(int i, long j) {
        return this.A05.A02(2, i, j);
    }

    public Set A03() {
        if (this.A06.A0E(4165)) {
            return super.A03();
        }
        Set emptySet = Collections.emptySet();
        AnonymousClass00C.A08(emptySet);
        return emptySet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        r6 = r23;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.util.List r24, java.util.Set r25) {
        /*
            r23 = this;
            r0 = r24
            r5 = r25
            X.C36321k7.A0w(r0, r5)
            java.util.Iterator r10 = r0.iterator()
        L_0x000b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r2 = r10.next()
            X.9XS r2 = (X.AnonymousClass9XS) r2
            java.lang.Long r4 = r2.A07
            X.3Qa r3 = r2.A05
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.Jid r0 = r2.A04
            com.whatsapp.jid.UserJid r14 = X.C222813r.A00(r0)
            X.3Qa r8 = r2.A06
            com.whatsapp.jid.Jid r0 = r2.A03
            com.whatsapp.jid.UserJid r17 = X.C222813r.A00(r0)
            long r0 = r2.A02
            byte[] r7 = r2.A08
            byte[] r6 = r2.A09
            java.lang.String r9 = "MessageOrphanBotResolver/getEditTargetId/unexpected error while processing BotMessageInfo"
            r20 = 0
            if (r6 == 0) goto L_0x0055
            X.8Nx r2 = X.C172458Nx.DEFAULT_INSTANCE     // Catch:{ 0wR | 186 -> 0x0051 }
            X.8Hz r6 = X.C170918Hz.A08(r2, r6)     // Catch:{ 0wR | 186 -> 0x0051 }
            X.8Nx r6 = (X.C172458Nx) r6     // Catch:{ 0wR | 186 -> 0x0051 }
            int r2 = r6.bitField0_     // Catch:{ 0wR | 186 -> 0x0051 }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0055
            java.lang.String r6 = r6.editTargetId_     // Catch:{ 0wR | 186 -> 0x0051 }
            X.AnonymousClass00C.A08(r6)     // Catch:{ 0wR | 186 -> 0x0051 }
            java.lang.String r2 = "[^a-zA-Z0-9]"
            java.lang.String r2 = X.C36411kG.A0y(r6, r2)     // Catch:{ 0wR | 186 -> 0x0051 }
            goto L_0x0057
        L_0x0051:
            r2 = move-exception
            com.whatsapp.util.Log.e(r9, r2)
        L_0x0055:
            r2 = r20
        L_0x0057:
            if (r4 == 0) goto L_0x0114
            if (r8 == 0) goto L_0x0114
            if (r7 == 0) goto L_0x0114
            java.lang.String r6 = r8.A01
            X.AnonymousClass00C.A07(r6)
            X.11F r13 = r8.A00
            X.9X8 r12 = new X.9X8
            r15 = r12
            r16 = r13
            r18 = r6
            r19 = r2
            r21 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r8 = 5
            if (r13 == 0) goto L_0x0104
            r6 = r23
            X.1Zh r11 = r6.A03
            X.3T1 r15 = r11.A00(r12, r13)
            java.lang.String r9 = r3.A01
            r17 = r2
            r18 = r7
            r16 = r9
            byte[] r7 = r11.A03(r12, r13, r14, r15, r16, r17, r18)
            if (r7 == 0) goto L_0x0104
            X.8SX r7 = X.AnonymousClass8SX.A0i(r7)     // Catch:{ 186 -> 0x00f7 }
            X.8SX r12 = X.C200429hO.A00(r7)     // Catch:{ 186 -> 0x00f7 }
            X.AnonymousClass00C.A0B(r12)     // Catch:{ 186 -> 0x00f7 }
            if (r12 == 0) goto L_0x0104
            X.3Qa r7 = new X.3Qa     // Catch:{ 1Tb -> 0x00fe }
            r7.<init>(r3)     // Catch:{ 1Tb -> 0x00fe }
            X.9T0 r11 = new X.9T0     // Catch:{ 1Tb -> 0x00fe }
            r13 = r12
            r14 = r7
            r15 = r0
            r11.<init>(r12, r13, r14, r15)     // Catch:{ 1Tb -> 0x00fe }
            r0 = 1
            r11.A0F = r0     // Catch:{ 1Tb -> 0x00fe }
            X.9YL r1 = r11.A00()     // Catch:{ 1Tb -> 0x00fe }
            X.0xh r0 = r6.A01     // Catch:{ 1Tb -> 0x00fe }
            X.3T1 r7 = r0.A00(r1)     // Catch:{ 1Tb -> 0x00fe }
            java.lang.String r0 = "MessageOrphanBotResolver/resolveOrphanedMessageSecretMessage/storing decrypted orphan"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x00c1
            X.11F r1 = r3.A00
            boolean r0 = r3.A02
            X.3Qa r3 = X.C165617ti.A0R(r1, r2, r0)
        L_0x00c1:
            X.1A1 r0 = r6.A04
            X.3T1 r1 = r0.A03(r3)
            if (r1 == 0) goto L_0x000b
            boolean r0 = r1 instanceof X.AnonymousClass2bK
            if (r0 == 0) goto L_0x00df
            if (r2 != 0) goto L_0x000b
            boolean r0 = r6.A05(r7, r1)
            if (r0 == 0) goto L_0x000b
            X.0xM r0 = r6.A00
            r0.A0n(r7, r8)
        L_0x00da:
            r5.add(r4)
            goto L_0x000b
        L_0x00df:
            if (r2 == 0) goto L_0x000b
            boolean r0 = r6.A05(r7, r1)
            if (r0 == 0) goto L_0x000b
            X.1aQ r1 = r6.A02
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r7.A1T(r0)
            if (r0 == 0) goto L_0x00da
            X.1Xd r0 = r1.A04
            r0.A03(r7)
            goto L_0x00da
        L_0x00f7:
            r1 = move-exception
            java.lang.String r0 = "MessageOrphanBotResolver/getE2EMessageData/invalidProto/"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0104
        L_0x00fe:
            r1 = move-exception
            java.lang.String r0 = "MessageOrphanBotResolver/getProcessedMessage/BadMessage:"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0104:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageOrphanBotResolver/resolveOrphanedMessageSecretMessage/processed message is null: "
            r1.append(r0)
            java.lang.String r0 = r3.A01
            X.C36321k7.A1Z(r1, r0)
            goto L_0x000b
        L_0x0114:
            java.lang.String r0 = "MessageOrphanBotResolver/resolveOrphanedMessageSecretMessages/some required data to decrypt the msg is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x000b
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175678as.A04(java.util.List, java.util.Set):void");
    }

    public C175678as(C20310xM r1, C25301Ft r2, C20810yC r3, C20520xh r4, C30571aQ r5, C30121Zh r6, AnonymousClass1A1 r7) {
        C36321k7.A1B(r3, r7, r2, r1, r4);
        C36321k7.A10(r5, r6);
        this.A06 = r3;
        this.A04 = r7;
        this.A05 = r2;
        this.A00 = r1;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }
}
