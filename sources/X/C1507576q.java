package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.CallOfferInfo;
import java.util.concurrent.Callable;

/* renamed from: X.76q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1507576q implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6ES A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ CallOfferInfo A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C1507576q(AnonymousClass6ES r1, DeviceJid deviceJid, CallOfferInfo callOfferInfo, String str, int i) {
        this.A01 = r1;
        this.A04 = str;
        this.A03 = callOfferInfo;
        this.A02 = deviceJid;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        X.C05600Qi.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fb, code lost:
        if ("connected".equals(r1.state) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005d, code lost:
        if (r0 != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r21 = this;
            r1 = r21
            X.6ES r0 = r1.A01
            java.lang.String r4 = r1.A04
            com.whatsapp.voipcalling.CallOfferInfo r5 = r1.A03
            com.whatsapp.jid.DeviceJid r14 = r1.A02
            int r10 = r1.A00
            X.6YM r6 = r0.A00
            X.1HO r1 = r6.A2p
            java.lang.String r0 = X.C34681hT.A09(r4)
            X.5Ng r0 = r1.A04(r0)
            r9 = 1
            r7 = 0
            boolean r3 = X.AnonymousClass000.A1V(r0)
            X.5yC r0 = r6.A0G(r4)
            r0.A06 = r3
            boolean r0 = r5.isAudioChat
            if (r0 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x0033
            X.1Fq r2 = r6.A2i
            r1 = 27
            java.lang.String r0 = "joinable call"
            r2.A04(r1, r4, r0)
        L_0x0033:
            X.6Ts r13 = r6.A2L
            com.whatsapp.jid.UserJid r15 = r5.fromJid
            java.lang.String r8 = r5.callId
            long r0 = r5.epochTimeMillis
            boolean r2 = r5.isVideoCall
            r16 = r8
            r17 = r10
            r18 = r0
            r20 = r2
            X.5Nh r2 = r13.A02(r14, r15, r16, r17, r18, r20)
            com.whatsapp.jid.GroupJid r8 = r5.groupJid
            java.lang.String r10 = r5.scheduledId
            boolean r0 = r5.isAudioChat
            if (r0 == 0) goto L_0x00ac
            X.0yC r1 = r6.A2t
            r0 = 3362(0xd22, float:4.711E-42)
            int r1 = r1.A07(r0)
            r0 = 1
            if (r1 >= r9) goto L_0x005d
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x00ac
        L_0x005f:
            r13.A06(r8, r2, r10, r9)
            java.lang.String r11 = r5.callLinkToken
            X.3Ir r0 = r2.A0C
            if (r0 != 0) goto L_0x0081
            if (r11 == 0) goto L_0x0081
            X.6YM r0 = r13.A03
            r10 = 0
            X.1HM r0 = r0.A2F
            X.3Ir r9 = r0.A02(r11)
            if (r9 != 0) goto L_0x007e
            long r0 = r0.A00(r10, r11)
            X.3Ir r9 = new X.3Ir
            r9.<init>(r10, r11, r0)
        L_0x007e:
            r2.A0I(r9)
        L_0x0081:
            int r0 = r5.silenceReason
            r2.A0H(r0)
            X.1DM r1 = r6.A2c
            X.6by r0 = r2.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r1.A0C(r0)
            if (r0 != 0) goto L_0x00c3
            X.5lm r9 = r6.A2n
            android.content.ContentValues r12 = X.C36441kJ.A0E()
            long r0 = r2.A02()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "call_log_row_id"
            r12.put(r0, r1)
            X.12P r0 = r9.A00
            X.1M0 r11 = r0.A05()
            goto L_0x00ae
        L_0x00ac:
            r9 = 0
            goto L_0x005f
        L_0x00ae:
            X.14e r10 = r11.A02     // Catch:{ all -> 0x00b9 }
            java.lang.String r9 = "call_unknown_caller"
            r1 = 5
            java.lang.String r0 = "CallUnknownCallerStore.markUnknown"
            r10.A08(r9, r0, r12, r1)     // Catch:{ all -> 0x00b9 }
            goto L_0x00c0
        L_0x00b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)
            throw r0
        L_0x00c0:
            r11.close()
        L_0x00c3:
            java.lang.String r0 = r5.scheduledId
            r13.A05(r8, r2, r0)
            boolean r0 = r5.isJoinableGroupCall()
            if (r0 == 0) goto L_0x0104
            com.whatsapp.voipcalling.CallGroupInfo r0 = r5.callGroupInfo
            X.C18740tg.A06(r0)
            com.whatsapp.voipcalling.CallParticipant[] r11 = r0.participants
            int r10 = r11.length
        L_0x00d6:
            if (r7 >= r10) goto L_0x0104
            r1 = r11[r7]
            X.0wQ r9 = r6.A29
            com.whatsapp.jid.UserJid r0 = r1.jid
            boolean r0 = r9.A0M(r0)
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r6.A0q(r2)
            if (r0 == 0) goto L_0x0101
        L_0x00ea:
            com.whatsapp.jid.UserJid r9 = r1.jid
            boolean r0 = r6.A0q(r2)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r1 = r1.state
            java.lang.String r0 = "connected"
            boolean r1 = r0.equals(r1)
            r0 = 5
            if (r1 != 0) goto L_0x00fe
        L_0x00fd:
            r0 = 2
        L_0x00fe:
            r2.A0K(r9, r0)
        L_0x0101:
            int r7 = r7 + 1
            goto L_0x00d6
        L_0x0104:
            if (r8 != 0) goto L_0x0121
            if (r3 != 0) goto L_0x0121
            com.whatsapp.jid.UserJid r1 = r14.userJid
            com.whatsapp.jid.UserJid r0 = r5.fromJid
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0121
            X.0yC r0 = r6.A2t
            boolean r0 = X.C34681hT.A0K(r0)
            if (r0 == 0) goto L_0x0121
            X.1Pa r1 = r6.A2D
            com.whatsapp.jid.UserJid r0 = r5.fromJid
            r1.A04(r0, r4)
        L_0x0121:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1507576q.call():java.lang.Object");
    }
}
