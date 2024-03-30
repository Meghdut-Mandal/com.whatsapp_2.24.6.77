package X;

/* renamed from: X.2vH  reason: invalid class name and case insensitive filesystem */
public class C55842vH implements C88234Rx {
    public Object A00;
    public final int A01;

    public C55842vH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        if (r10.equals(r2.A45) == false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass11F r10, X.C135066c4 r11, java.lang.Integer r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.A01
            r6 = r11
            r7 = r12
            switch(r0) {
                case 0: goto L_0x0099;
                case 1: goto L_0x004c;
                case 2: goto L_0x001d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r9.A00
            com.whatsapp.status.playback.MessageReplyActivity r2 = (com.whatsapp.status.playback.MessageReplyActivity) r2
            java.util.HashMap r0 = com.whatsapp.status.playback.MessageReplyActivity.A1g
            X.1NG r1 = r2.A0J
            X.11F r0 = r2.A0k
            boolean r0 = X.C36351kA.A1X(r1, r0)
            if (r0 == 0) goto L_0x0185
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A01(r2, r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r1 = r9.A00
            X.3HE r1 = (X.AnonymousClass3HE) r1
            X.4Rx r0 = r1.A04
            if (r0 == 0) goto L_0x001c
            r0.Bhl(r10, r11, r12, r13)
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x001c
            X.3Ki r2 = r1.A0G
            X.C18740tg.A06(r2)
            r2.A01()
            X.4lK r0 = r1.A0F
            X.C18740tg.A06(r0)
            X.00s r1 = r0.A02
            java.lang.Object r0 = r1.A04()
            X.C18740tg.A06(r0)
            int r0 = X.C36401kF.A00(r1)
            r2.A03(r12, r13, r0)
            return
        L_0x004c:
            java.lang.Object r3 = r9.A00
            X.3H8 r3 = (X.AnonymousClass3H8) r3
            X.4Rx r0 = r3.A03
            if (r0 == 0) goto L_0x001c
            r0.Bhl(r10, r11, r12, r13)
            X.4lK r2 = r3.A0A
            if (r2 == 0) goto L_0x0097
            X.00s r0 = r2.A02
            java.util.List r1 = X.C36401kF.A0w(r0)
        L_0x0061:
            X.3GT r0 = r3.A09
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x001c
            if (r1 == 0) goto L_0x001c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x001c
            X.3Ki r1 = r3.A0B
            r1.A01()
            if (r2 == 0) goto L_0x0095
            X.00s r0 = r2.A02
            java.lang.Object r0 = r0.A04()
        L_0x007e:
            X.C18740tg.A06(r0)
            if (r2 == 0) goto L_0x0093
            X.00s r0 = r2.A02
            java.util.List r0 = X.C36401kF.A0w(r0)
            if (r0 == 0) goto L_0x0093
            int r0 = r0.size()
        L_0x008f:
            r1.A03(r12, r13, r0)
            return
        L_0x0093:
            r0 = 0
            goto L_0x008f
        L_0x0095:
            r0 = 0
            goto L_0x007e
        L_0x0097:
            r1 = 0
            goto L_0x0061
        L_0x0099:
            java.lang.Object r2 = r9.A00
            X.3fk r2 = (X.C70803fk) r2
            if (r10 == 0) goto L_0x00a8
            X.11F r0 = r2.A45
            boolean r1 = r10.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            r3 = 0
            if (r0 != 0) goto L_0x00e2
            X.0yC r1 = r2.A3n
            r0 = 7174(0x1c06, float:1.0053E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "ConversationDelegate/stickerOnClickListener/onStickerSelected/sticker was tried to be sent into an incorrect chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wN r4 = r2.A0z
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sticker was tried to be sent into an incorrect chat. Current chat is null? = "
            r1.append(r0)
            X.11F r0 = r2.A45
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1.append(r0)
            java.lang.String r0 = " Destination chat is null? = "
            r1.append(r0)
            if (r10 != 0) goto L_0x00d8
            r3 = 1
        L_0x00d8:
            java.lang.String r1 = X.C36421kH.A0d(r1, r3)
            java.lang.String r0 = "conversation/stickerSelected"
            r4.A0E(r0, r1, r2)
            return
        L_0x00e2:
            X.4V6 r0 = r2.A2l
            X.0yE r0 = r0.getWaPermissionsHelper()
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x00fa
            X.155 r2 = X.C70803fk.A0C(r2)
            r1 = 812(0x32c, float:1.138E-42)
            X.3US r0 = com.whatsapp.RequestPermissionActivity.A0B
            r0.A0D(r2, r1)
            return
        L_0x00fa:
            X.1NG r1 = r2.A1z
            X.141 r0 = r2.A3Y
            boolean r0 = X.C36331k8.A1Y(r1, r0)
            if (r0 == 0) goto L_0x0108
            X.AnonymousClass3SJ.A03(r2)
            return
        L_0x0108:
            X.3rU r0 = r2.A4c
            r0.A04(r3)
            X.2M8 r0 = r2.A3r
            if (r0 == 0) goto L_0x011c
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x011c
            com.whatsapp.mentions.MentionableEntry r0 = r2.A4B
            X.C36421kH.A1D(r0)
        L_0x011c:
            X.1X4 r3 = X.C70803fk.A0A(r2)
            X.11F r4 = r2.A45
            X.C18740tg.A06(r4)
            X.1uh r0 = r2.A2x
            X.3T1 r5 = r0.A0F
            boolean r8 = r2.A6F
            r3.A0L(r4, r5, r6, r7, r8)
            X.3GT r0 = r2.A4v
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0156
            if (r12 == 0) goto L_0x0156
            r1 = 7
            int r0 = r12.intValue()
            if (r1 != r0) goto L_0x0156
            r1 = 1
            int r0 = X.C70803fk.A01(r2)
            if (r1 != r0) goto L_0x0156
            com.whatsapp.mentions.MentionableEntry r0 = r2.A4B
            if (r0 == 0) goto L_0x014d
            r0.selectAll()
        L_0x014d:
            X.2M8 r1 = r2.A3r
            if (r1 == 0) goto L_0x0156
            com.whatsapp.WaEditText r0 = r1.A0L
            r1.A0B(r0)
        L_0x0156:
            X.C70803fk.A0g(r2)
            com.whatsapp.expressions.BaseExpressionsBottomSheet r3 = r2.A3j
            if (r3 == 0) goto L_0x0168
            int r1 = r3.A08
            r0 = 7
            if (r1 < r0) goto L_0x0168
            r3.A1b()
            X.C70803fk.A0e(r2)
        L_0x0168:
            X.0yC r1 = r2.A3n
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x001c
            boolean r0 = r2.A6I
            if (r0 == 0) goto L_0x001c
            X.3Ki r0 = r2.A4x
            r0.A01()
            X.3Ki r1 = r2.A4x
            r0 = -1
            r1.A03(r12, r13, r0)
            X.C70803fk.A0f(r2)
            return
        L_0x0185:
            X.1X4 r3 = r2.A0D
            X.11F r4 = r2.A0k
            X.C18740tg.A06(r4)
            X.3T1 r5 = r2.A0v
            r8 = 0
            r3.A0L(r4, r5, r6, r7, r8)
            com.whatsapp.status.playback.MessageReplyActivity.A0Q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55842vH.Bhl(X.11F, X.6c4, java.lang.Integer, int):void");
    }
}
