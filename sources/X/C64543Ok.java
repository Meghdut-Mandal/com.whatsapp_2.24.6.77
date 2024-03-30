package X;

import java.util.Map;

/* renamed from: X.3Ok  reason: invalid class name and case insensitive filesystem */
public class C64543Ok {
    public final Map A00;
    public final /* synthetic */ AnonymousClass3BR A01;
    public final /* synthetic */ C70803fk A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C64543Ok(AnonymousClass3BR r1, C70803fk r2) {
        this();
        this.A02 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0147, code lost:
        if (X.C34681hT.A0B(r0.A1W, r0.A3n) != false) goto L_0x0149;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C80183uz A00(java.lang.Class r24) {
        /*
            r23 = this;
            r7 = r23
            java.util.Map r2 = r7.A00
            r1 = r24
            java.lang.Object r10 = r2.get(r1)
            X.3uz r10 = (X.C80183uz) r10
            if (r10 != 0) goto L_0x0042
            X.3fk r0 = r7.A02
            X.11F r3 = r0.A45
            com.whatsapp.jid.UserJid r18 = X.C36401kF.A0b(r3)
            java.lang.Class<X.2HJ> r3 = X.AnonymousClass2HJ.class
            if (r1 != r3) goto L_0x0043
            X.3BF r3 = X.C70803fk.A0G(r0)
            X.2yW r3 = r3.A04
            X.4V6 r12 = r0.A2l
            X.141 r14 = r0.A3Y
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1V
            X.1Mz r0 = r3.A00
            X.0tq r0 = r0.A01
            X.190 r15 = X.C36351kA.A0h(r0)
            X.1Mz r0 = r3.A00
            X.0tq r0 = r0.A01
            X.12q r13 = X.C36351kA.A0a(r0)
            X.1ZM r16 = r0.Aze()
            X.2HJ r10 = new X.2HJ
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x003f:
            r2.put(r1, r10)
        L_0x0042:
            return r10
        L_0x0043:
            java.lang.Class<X.2HN> r3 = X.AnonymousClass2HN.class
            if (r1 != r3) goto L_0x0069
            X.4V6 r14 = r0.A2l
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1V
            X.141 r15 = r0.A3Y
            X.0wU r16 = r14.getWaWorkers()
            X.4V6 r3 = r0.A2l
            X.1Dv r12 = r3.getActivityUtils()
            X.4V6 r3 = r0.A2l
            X.16D r13 = r3.getContactManager()
            X.0yC r0 = r0.A3n
            boolean r17 = X.AnonymousClass1MI.A00(r0)
            X.2HN r10 = new X.2HN
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x003f
        L_0x0069:
            java.lang.Class<X.2HG> r3 = X.AnonymousClass2HG.class
            if (r1 != r3) goto L_0x0087
            X.141 r3 = r0.A3Y
            if (r3 == 0) goto L_0x02c9
            X.12q r4 = r0.A3O
            com.whatsapp.jid.GroupJid r3 = X.C36421kH.A0P(r3)
            int r3 = r4.A05(r3)
            if (r3 != 0) goto L_0x02c9
            X.0yC r4 = r0.A3n
            r3 = 4579(0x11e3, float:6.417E-42)
            boolean r3 = r4.A0E(r3)
            if (r3 == 0) goto L_0x02c9
        L_0x0087:
            java.lang.Class<X.2HF> r3 = X.AnonymousClass2HF.class
            if (r1 != r3) goto L_0x00c6
            X.4V6 r12 = r0.A2l
            X.0yC r14 = r0.A3n
            X.005 r3 = r0.A5t
            java.lang.Object r3 = r3.get()
            X.36U r3 = (X.AnonymousClass36U) r3
            X.1Js r6 = r3.A01
            X.005 r3 = r0.A5t
            java.lang.Object r3 = r3.get()
            X.36U r3 = (X.AnonymousClass36U) r3
            X.1Ju r5 = r3.A02
            X.005 r3 = r0.A5t
            java.lang.Object r3 = r3.get()
            X.36U r3 = (X.AnonymousClass36U) r3
            X.2K3 r13 = r3.A00
            X.04H r4 = X.C70803fk.A08(r0)
            java.lang.Class<com.whatsapp.pininchat.banner.PinInChatBannerViewModel> r3 = com.whatsapp.pininchat.banner.PinInChatBannerViewModel.class
            X.04R r15 = r4.A00(r3)
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r15 = (com.whatsapp.pininchat.banner.PinInChatBannerViewModel) r15
            android.view.ViewGroup r11 = r0.A0Q
            X.2HF r10 = new X.2HF
            r16 = r6
            r17 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x003f
        L_0x00c6:
            java.lang.Class<X.2HO> r3 = X.AnonymousClass2HO.class
            if (r1 != r3) goto L_0x00f9
            if (r18 == 0) goto L_0x00f9
            X.4V6 r15 = r0.A2l
            X.0wQ r12 = r15.getMeManager()
            X.0wU r19 = X.C70803fk.A0K(r0)
            X.4V6 r3 = r0.A2l
            X.16D r13 = r3.getContactManager()
            X.171 r14 = r3.getWAContactNames()
            X.1Cu r5 = r0.A3J
            X.141 r4 = r0.A3Y
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1V
            boolean r3 = r0.A6L
            boolean r0 = r0.A6M
            X.2HO r10 = new X.2HO
            r21 = r0
            r16 = r5
            r17 = r4
            r20 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x003f
        L_0x00f9:
            java.lang.Class<X.2HI> r3 = X.AnonymousClass2HI.class
            if (r1 != r3) goto L_0x012d
            if (r18 == 0) goto L_0x012d
            X.141 r3 = r0.A3Y
            if (r3 == 0) goto L_0x012d
            boolean r3 = r3.A0C()
            if (r3 == 0) goto L_0x012d
            X.4V6 r9 = r0.A2l
            com.whatsapp.KeyboardPopupLayout r8 = r0.A1V
            X.1bg r7 = r0.A5d
            X.3Dn r6 = r0.A41
            X.0wU r5 = r0.A5S
            X.3Sp r4 = r0.A42
            X.0yC r3 = r0.A3n
            X.2aL r0 = r0.A43
            X.2HI r10 = new X.2HI
            r11 = r8
            r12 = r9
            r13 = r3
            r14 = r6
            r15 = r4
            r16 = r0
            r17 = r18
            r18 = r5
            r19 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x003f
        L_0x012d:
            java.lang.Class<X.2HP> r3 = X.AnonymousClass2HP.class
            if (r1 != r3) goto L_0x0196
            boolean r3 = r0.A6L
            if (r3 == 0) goto L_0x0196
            X.0yC r4 = r0.A3n
            X.0wQ r3 = r0.A1W
            boolean r3 = X.C34681hT.A0A(r3, r4)
            if (r3 != 0) goto L_0x0149
            X.0yC r4 = r0.A3n
            X.0wQ r3 = r0.A1W
            boolean r3 = X.C34681hT.A0B(r3, r4)
            if (r3 == 0) goto L_0x0196
        L_0x0149:
            X.2yM r5 = r0.A1M
            X.4V6 r4 = r0.A2l
            X.141 r3 = r0.A3Y
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1V
            X.3BR r0 = r7.A01
            boolean r0 = r0.A0X
            r22 = 9
            if (r0 == 0) goto L_0x015b
            r22 = 1
        L_0x015b:
            X.1Mz r0 = r5.A00
            X.0tq r0 = r0.A01
            X.0yC r19 = X.C36341k9.A0V(r0)
            X.1Mz r0 = r5.A00
            X.0tq r0 = r0.A01
            X.0wQ r12 = X.C36351kA.A0N(r0)
            X.0wU r20 = X.C36341k9.A0Z(r0)
            X.16D r15 = X.C36341k9.A0R(r0)
            X.171 r16 = X.C36341k9.A0S(r0)
            X.1ND r14 = X.C36391kE.A0Y(r0)
            X.1aN r13 = X.C18800tq.A4U(r0)
            X.0tt r0 = r0.A00
            X.004 r0 = r0.A0t
            java.lang.Object r0 = r0.get()
            X.1Pm r0 = (X.C27721Pm) r0
            X.2HP r10 = new X.2HP
            r21 = r0
            r17 = r4
            r18 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x003f
        L_0x0196:
            java.lang.Class<X.2HE> r3 = X.AnonymousClass2HE.class
            if (r1 != r3) goto L_0x01d7
            boolean r3 = X.C70803fk.A1Z(r0)
            if (r3 == 0) goto L_0x01d7
            X.0yC r4 = X.C70803fk.A0H(r0)
            r3 = 5656(0x1618, float:7.926E-42)
            boolean r3 = r4.A0E(r3)
            if (r3 == 0) goto L_0x01d7
            X.0yC r5 = X.C70803fk.A0H(r0)
            X.0yV r4 = X.C21000yV.A01
            r3 = 4727(0x1277, float:6.624E-42)
            boolean r3 = X.C20800yB.A01(r4, r5, r3)
            if (r3 == 0) goto L_0x01d7
            X.2yJ r6 = r0.A1J
            X.4V6 r5 = r0.A2l
            android.view.ViewGroup r4 = r0.A0Q
            X.1Mz r0 = r6.A00
            X.0tq r0 = r0.A01
            X.0yC r3 = X.C36341k9.A0V(r0)
            X.1Mz r0 = r6.A00
            X.0tq r0 = r0.A01
            X.0v0 r0 = X.C36351kA.A0Y(r0)
            X.2HE r10 = new X.2HE
            r10.<init>(r4, r5, r0, r3)
            goto L_0x003f
        L_0x01d7:
            java.lang.Class<X.2HM> r3 = X.AnonymousClass2HM.class
            if (r1 != r3) goto L_0x021c
            X.0yC r4 = X.C70803fk.A0H(r0)
            r3 = 4184(0x1058, float:5.863E-42)
            boolean r3 = r4.A0E(r3)
            if (r3 == 0) goto L_0x021c
            X.11F r4 = r0.A45
            boolean r3 = r4 instanceof X.AnonymousClass147
            if (r3 == 0) goto L_0x021c
            X.4V6 r3 = r0.A2l
            X.1LV r3 = r3.getCommunityChatManager()
            X.147 r4 = (X.AnonymousClass147) r4
            X.147 r15 = r3.A02(r4)
            if (r15 == 0) goto L_0x02fa
            X.2yN r3 = r0.A1N
            X.4V6 r14 = r0.A2l
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1V
            X.1Mz r0 = r3.A00
            X.0tq r0 = r0.A01
            X.16D r13 = X.C36341k9.A0R(r0)
            X.1Mz r0 = r3.A00
            X.0tq r0 = r0.A01
            X.1Sq r12 = X.C36391kE.A0b(r0)
            X.0wU r16 = X.C36341k9.A0Z(r0)
            X.2HM r10 = new X.2HM
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x003f
        L_0x021c:
            java.lang.Class<X.2HK> r3 = X.AnonymousClass2HK.class
            if (r1 != r3) goto L_0x0248
            boolean r3 = r0.A6L
            if (r3 == 0) goto L_0x0248
            X.0yC r4 = r0.A3n
            X.141 r3 = r0.A3Y
            boolean r3 = X.AnonymousClass3M0.A00(r3, r4)
            if (r3 == 0) goto L_0x0248
            X.141 r3 = r0.A3Y
            if (r3 == 0) goto L_0x02a8
            X.12q r4 = r0.A3O
            com.whatsapp.jid.GroupJid r3 = X.C36421kH.A0P(r3)
            int r3 = r4.A05(r3)
            if (r3 != 0) goto L_0x02a8
            X.0yC r4 = r0.A3n
            r3 = 4579(0x11e3, float:6.417E-42)
            boolean r3 = r4.A0E(r3)
            if (r3 == 0) goto L_0x02a8
        L_0x0248:
            java.lang.Class<X.2HH> r3 = X.AnonymousClass2HH.class
            if (r1 != r3) goto L_0x02fa
            X.1uL r3 = r0.A2t
            X.2pL r4 = r3.A0S()
            X.2pL r3 = X.C52382pL.SUBSCRIBED
            if (r4 != r3) goto L_0x02fa
            X.0yC r4 = r0.A3n
            r3 = 7472(0x1d30, float:1.047E-41)
            boolean r3 = r4.A0E(r3)
            if (r3 == 0) goto L_0x02fa
            X.2yL r4 = r0.A1K
            X.4V6 r15 = r0.A2l
            android.view.ViewGroup r11 = r0.A0Q
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r6 = r0.A4H
            X.3QY r3 = r15.getConversationRowInflater()
            X.155 r0 = r15.getActivityNullable()
            X.1RY r14 = r3.A02(r0)
            X.3o9 r5 = new X.3o9
            r5.<init>(r7)
            X.1Mz r0 = r4.A00
            X.0tq r7 = r0.A01
            X.0yC r16 = X.C36341k9.A0V(r7)
            X.16I r13 = X.C36351kA.A0S(r7)
            X.0tt r4 = r7.A00
            X.004 r0 = r4.A2y
            java.lang.Object r3 = r0.get()
            X.3hE r3 = (X.C71723hE) r3
            X.1dD r18 = X.C36431kI.A0n(r7)
            X.004 r0 = r4.A1i
            java.lang.Object r12 = r0.get()
            X.3CE r12 = (X.AnonymousClass3CE) r12
            X.2HH r10 = new X.2HH
            r17 = r3
            r19 = r5
            r20 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x003f
        L_0x02a8:
            X.4V6 r13 = r0.A2l
            X.0wo r14 = r0.A33
            X.0yC r5 = r0.A3n
            X.0wU r4 = r0.A5S
            X.16D r12 = r13.getContactManager()
            X.17X r15 = r13.getGroupParticipantsManager()
            X.11F r3 = r0.A45
            com.whatsapp.KeyboardPopupLayout r11 = r0.A1V
            X.2HK r10 = new X.2HK
            r16 = r5
            r17 = r3
            r18 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x003f
        L_0x02c9:
            X.4V6 r13 = r0.A2l
            X.1e1 r20 = r13.getLinkifier()
            X.12q r5 = r0.A3O
            X.12t r15 = r0.A3K
            X.1H2 r18 = r13.getEmojiLoader()
            X.4V6 r3 = r0.A2l
            X.0yf r12 = r3.getServerProps()
            X.4V6 r3 = r0.A2l
            X.0yb r14 = r3.getSystemServices()
            X.0wg r4 = r0.A4e
            X.141 r3 = r0.A3Y
            android.view.ViewGroup r11 = r0.A0Q
            boolean r0 = r0.A6L
            X.2HG r10 = new X.2HG
            r21 = r0
            r16 = r5
            r17 = r3
            r19 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x003f
        L_0x02fa:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64543Ok.A00(java.lang.Class):X.3uz");
    }

    public C64543Ok() {
        this.A00 = C36431kI.A1G();
    }
}
