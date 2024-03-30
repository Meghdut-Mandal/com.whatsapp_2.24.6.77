package X;

import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;

/* renamed from: X.2iH  reason: invalid class name and case insensitive filesystem */
public class C48922iH extends C33541fX {
    public Object A00;
    public String A01;
    public final int A02;

    public C48922iH(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        this.A02 = 0;
        this.A00 = acceptInviteLinkActivity;
        this.A01 = "invite-via-link-unavailable";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0111, code lost:
        X.C64953Qc.A00(r3);
        r1.A01 = X.C36361kB.A0i();
        r1.A02 = r5;
        r3.A01();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A02
            switch(r0) {
                case 0: goto L_0x01b3;
                case 1: goto L_0x0138;
                case 2: goto L_0x0121;
                case 3: goto L_0x006c;
                case 4: goto L_0x0038;
                case 5: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            X.2dT r0 = (X.AnonymousClass2dT) r0
            X.1e2 r2 = r0.A01
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = r11.A01
            X.C36331k8.A0t(r1, r2, r0)
            return
        L_0x0015:
            java.lang.String r2 = r11.A01
            if (r2 == 0) goto L_0x0026
            java.lang.Object r0 = r11.A00
            com.whatsapp.permissions.RequestPermissionsBottomSheet r0 = (com.whatsapp.permissions.RequestPermissionsBottomSheet) r0
            X.3TX r1 = r0.A06
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "not_now"
            r1.A08(r2, r0)
        L_0x0026:
            java.lang.Object r0 = r11.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            X.C36341k9.A15(r0)
            return
        L_0x0031:
            java.lang.String r0 = "funnelLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0038:
            java.lang.String r2 = r11.A01
            android.net.Uri r1 = android.net.Uri.parse(r2)
            java.lang.String r0 = r1.getScheme()
            if (r0 != 0) goto L_0x0052
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "http://"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            android.net.Uri r1 = android.net.Uri.parse(r0)
        L_0x0052:
            android.content.Intent r1 = X.C36391kE.A0G(r1)
            java.lang.Object r0 = r11.A00     // Catch:{ ActivityNotFoundException -> 0x005e }
            android.view.View r0 = (android.view.View) r0     // Catch:{ ActivityNotFoundException -> 0x005e }
            X.C36371kC.A16(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x005e }
            return
        L_0x005e:
            java.lang.Object r0 = r11.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            X.17Y r2 = r0.A0R
            r1 = 2131886365(0x7f12011d, float:1.9407307E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x006c:
            java.lang.Object r4 = r11.A00
            com.whatsapp.conversation.ConversationAttachmentContentView r4 = (com.whatsapp.conversation.ConversationAttachmentContentView) r4
            X.3Qc r3 = r4.A0E
            java.lang.String r2 = r11.A01
            X.2RC r1 = r3.A01
            if (r1 == 0) goto L_0x0089
            if (r2 == 0) goto L_0x0089
            int r0 = r2.hashCode()
            r10 = 9
            r9 = 8
            r8 = 7
            r7 = 5
            r6 = 3
            r5 = 2
            switch(r0) {
                case -1367751899: goto L_0x0090;
                case -1275762953: goto L_0x009d;
                case -786681338: goto L_0x00aa;
                case -309474065: goto L_0x00b7;
                case -196315310: goto L_0x00c4;
                case 3446719: goto L_0x00d1;
                case 93166550: goto L_0x00de;
                case 861720859: goto L_0x00eb;
                case 951526432: goto L_0x00f8;
                case 1901043637: goto L_0x0105;
                default: goto L_0x0089;
            }
        L_0x0089:
            X.28e r1 = r4.A0D
            r0 = 0
            r1.A0G(r2, r0)
            return
        L_0x0090:
            java.lang.String r0 = "camera"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            goto L_0x0111
        L_0x009d:
            java.lang.String r0 = "quick reply"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = X.C36421kH.A0W()
            goto L_0x0111
        L_0x00aa:
            java.lang.String r0 = "payment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = X.C36421kH.A0U()
            goto L_0x0111
        L_0x00b7:
            java.lang.String r0 = "product"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = X.C36401kF.A0k()
            goto L_0x0111
        L_0x00c4:
            java.lang.String r0 = "gallery"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            goto L_0x0111
        L_0x00d1:
            java.lang.String r0 = "poll"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = X.C36401kF.A0j()
            goto L_0x0111
        L_0x00de:
            java.lang.String r0 = "audio"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            goto L_0x0111
        L_0x00eb:
            java.lang.String r0 = "document"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0111
        L_0x00f8:
            java.lang.String r0 = "contact"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            goto L_0x0111
        L_0x0105:
            java.lang.String r0 = "location"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
        L_0x0111:
            X.C64953Qc.A00(r3)
            java.lang.Integer r0 = X.C36361kB.A0i()
            r1.A01 = r0
            r1.A02 = r5
            r3.A01()
            goto L_0x0089
        L_0x0121:
            java.lang.Object r3 = r11.A00
            com.whatsapp.calling.callhistory.CallLogActivity r3 = (com.whatsapp.calling.callhistory.CallLogActivity) r3
            X.11F r2 = r3.A0T
            java.lang.Integer r0 = X.C36381kD.A0n()
            X.3Pd r1 = new X.3Pd
            r1.<init>((android.view.View) r12, (X.AnonymousClass11F) r2, (java.lang.Integer) r0)
            java.lang.String r0 = r11.A01
            r1.A04 = r0
            r1.A02(r3)
            return
        L_0x0138:
            java.lang.Object r3 = r11.A00
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r3 = (com.whatsapp.biz.order.view.fragment.OrderDetailFragment) r3
            X.1FR r1 = r3.A0M
            com.whatsapp.jid.UserJid r0 = r3.A0J
            int r1 = r1.A0D(r0)
            X.1De r0 = r3.A0L
            X.9l8 r2 = r0.A02()
            r0 = 1
            if (r1 != r0) goto L_0x0198
            if (r2 == 0) goto L_0x0198
            X.9l8 r0 = X.C202159l8.A0E
            java.lang.String r1 = "BR"
            java.lang.String r0 = r2.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0198
            X.1qm r2 = X.AnonymousClass3LW.A05(r3)
            r0 = 2131891976(0x7f121708, float:1.9418687E38)
            r2.A0d(r0)
            r0 = 2131891975(0x7f121707, float:1.9418685E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            X.3VX r0 = X.AnonymousClass3VX.A00
            r2.A0h(r0, r1)
            X.C36341k9.A11(r2)
            X.9gL r4 = r3.A0Q
            java.lang.String r3 = "received_cart"
            java.lang.String r2 = "from_cart"
            r0 = 4
            X.2Pf r1 = new X.2Pf
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r1.A01 = r3
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x0192
            r1.A02 = r2
        L_0x0192:
            X.0yW r0 = r4.A01
            r0.Bly(r1)
            return
        L_0x0198:
            r3.A0a()
            X.0v5 r0 = r3.A01
            r0.A02()
            r3.A0a()
            android.os.Bundle r1 = r3.A0b()
            java.lang.String r0 = ""
            X.AnonymousClass3UJ.A03(r1, r0)
            java.lang.String r0 = "getCreateOrderActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01b3:
            java.lang.Object r2 = r11.A00
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r2 = (com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity) r2
            X.1fs r1 = r2.A04
            java.lang.String r0 = "invite-via-link-unavailable"
            r1.A01(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48922iH.A02(android.view.View):void");
    }

    public C48922iH(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }
}
