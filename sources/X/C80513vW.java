package X;

/* renamed from: X.3vW  reason: invalid class name and case insensitive filesystem */
public class C80513vW implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C80513vW(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A04 = i2;
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023e, code lost:
        if (r2 != 4) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07f4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        X.C05600Qi.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x07f8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010a, code lost:
        if (r1.length() == 0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01dc, code lost:
        if (r0.length() == 0) goto L_0x01de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:383:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r3 = r28
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0891;
                case 1: goto L_0x0862;
                case 2: goto L_0x05d3;
                case 3: goto L_0x057a;
                case 4: goto L_0x0561;
                case 5: goto L_0x0527;
                case 6: goto L_0x0501;
                case 7: goto L_0x0499;
                case 8: goto L_0x0479;
                case 9: goto L_0x03cc;
                case 10: goto L_0x03aa;
                case 11: goto L_0x0396;
                case 12: goto L_0x032c;
                case 13: goto L_0x0272;
                case 14: goto L_0x01b1;
                case 15: goto L_0x0183;
                case 16: goto L_0x015b;
                case 17: goto L_0x0116;
                case 18: goto L_0x00e1;
                case 19: goto L_0x00b6;
                case 20: goto L_0x005d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r4
            java.lang.Object r1 = r3.A02
            java.util.Collection r1 = (java.util.Collection) r1
            int r5 = r3.A00
            java.lang.Object r3 = r3.A03
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r4.A15()
            if (r0 == 0) goto L_0x08d2
            X.01I r0 = r4.A0i()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x08d2
            java.util.Iterator r2 = r1.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003e
            X.3T1 r0 = X.C36391kE.A0l(r2)
            X.00v r1 = r4.A0w
            X.3Qa r0 = r0.A1J
            X.AnonymousClass00C.A07(r0)
            r1.A05(r0)
            goto L_0x0029
        L_0x003e:
            int r0 = r3.size()
            if (r5 < r0) goto L_0x004a
            r1 = 4
            r0 = 6
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0G(r4, r1, r0)
            return
        L_0x004a:
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0D(r4)
            r0 = -1
            r4.A00 = r0
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0E(r4, r5)
            X.3LC r2 = com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A05(r4)
            r1 = 4
            r0 = 6
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0F(r4, r2, r1, r0)
            return
        L_0x005d:
            java.lang.Object r4 = r3.A01
            X.3PQ r4 = (X.AnonymousClass3PQ) r4
            int r6 = r3.A00
            java.lang.Object r5 = r3.A02
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            java.lang.Object r3 = r3.A03
            java.lang.Long r3 = (java.lang.Long) r3
            X.3O7 r1 = r4.A01
            r0 = 81
            X.3Ks r2 = new X.3Ks
            r2.<init>(r1, r0, r6)
            X.3O7 r1 = r2.A08
            monitor-enter(r1)
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = X.AnonymousClass3O7.A00(r1)     // Catch:{ all -> 0x00b3 }
        L_0x007f:
            monitor-exit(r1)
            r2.A02 = r0
            X.3Qa r0 = r5.A1J
            X.11F r0 = r0.A00
            r2.A01(r0)
            r2.A02(r0)
            r2.A03(r5)
            r0 = 40
            if (r6 != r0) goto L_0x00a5
            r2.A01 = r3
            X.5J2 r0 = r5.A1V
            if (r0 == 0) goto L_0x00b1
            X.3Qa r0 = r0.A1J
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00a3:
            r2.A00 = r0
        L_0x00a5:
            X.2S8 r2 = r2.A00()
            X.0yW r1 = r4.A00
            X.0u5 r0 = X.AnonymousClass3PQ.A03
            r1.Blx(r2, r0)
            return
        L_0x00b1:
            r0 = 0
            goto L_0x00a3
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00b6:
            java.lang.Object r4 = r3.A01
            X.1wG r4 = (X.C40881wG) r4
            java.lang.Object r1 = r3.A02
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.Object r2 = r3.A03
            X.3JI r2 = (X.AnonymousClass3JI) r2
            int r3 = r3.A00
            X.16D r0 = r4.A03
            X.141 r0 = r0.A08(r1)
            X.2Lc r1 = new X.2Lc
            r1.<init>(r0)
            X.141 r0 = r2.A00
            r1.A00(r0)
            X.17Y r2 = r4.A02
            r1 = 49
            X.3wl r0 = new X.3wl
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1)
            r2.A0H(r0)
            return
        L_0x00e1:
            java.lang.Object r4 = r3.A01
            X.3UC r4 = (X.AnonymousClass3UC) r4
            int r1 = r3.A00
            java.lang.Object r2 = r3.A02
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r3 = r3.A03
            X.02t r3 = (X.C006302t) r3
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            X.1Dj r0 = r4.A05
            java.lang.String r1 = r0.A01(r1)
            X.14u r0 = X.C36411kG.A0W(r2)
            if (r0 == 0) goto L_0x0102
            r0.Bnv()
        L_0x0102:
            r2 = 1
            if (r1 == 0) goto L_0x010c
            int r1 = r1.length()
            r0 = 0
            if (r1 != 0) goto L_0x010d
        L_0x010c:
            r0 = 1
        L_0x010d:
            r2 = r2 ^ r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.invoke(r0)
            return
        L_0x0116:
            java.lang.Object r4 = r3.A01
            com.whatsapp.mentions.MentionableEntry r4 = (com.whatsapp.mentions.MentionableEntry) r4
            java.lang.Object r1 = r3.A02
            X.141 r1 = (X.AnonymousClass141) r1
            java.lang.Object r0 = r3.A03
            X.34G r0 = (X.AnonymousClass34G) r0
            int r3 = r3.A00
            r4.A0H(r0, r1)
            r0 = 32
            if (r3 != r0) goto L_0x0142
            java.lang.String r2 = "imagine"
            android.text.Editable r1 = r4.getText()
            if (r1 == 0) goto L_0x0142
            java.lang.String r0 = "/"
            android.text.Editable r0 = r1.append(r0)
            android.text.Editable r1 = r0.append(r2)
            java.lang.String r0 = " "
            r1.append(r0)
        L_0x0142:
            X.11F r2 = r4.A09
            if (r2 == 0) goto L_0x08d2
            r0 = 8
            if (r3 != r0) goto L_0x0152
            X.1NM r1 = r4.A06
            X.2oa r0 = X.C51912oa.DEFAULT_BOT_CLICKED
        L_0x014e:
            r1.A08(r0, r2)
            return
        L_0x0152:
            r0 = 32
            if (r3 != r0) goto L_0x08d2
            X.1NM r1 = r4.A06
            X.2oa r0 = X.C51912oa.DEFAULT_BOT_IMAGINE_CMD_CLICKED
            goto L_0x014e
        L_0x015b:
            java.lang.Object r0 = r3.A01
            X.6T5 r0 = (X.AnonymousClass6T5) r0
            int r14 = r3.A00
            java.lang.Object r12 = r3.A02
            java.io.File r12 = (java.io.File) r12
            java.lang.Object r4 = r3.A03
            X.5tK r4 = (X.C121555tK) r4
            X.0wN r1 = r0.A01
            com.whatsapp.stickers.WebpUtils r8 = r0.A0A
            X.0y0 r2 = r0.A02
            X.1Gu r10 = r0.A0C
            X.1B0 r9 = r0.A0B
            X.1DT r3 = r0.A03
            X.1Gs r11 = r0.A0D
            X.68C r7 = r0.A08
            X.6Fp r6 = r0.A07
            X.4xN r5 = r0.A06
            int r13 = r5.A14
            X.AnonymousClass6YC.A09(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0183:
            java.lang.Object r4 = r3.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r4 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r4
            java.lang.Object r1 = r3.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r5 = r3.A03
            int r7 = r3.A00
            boolean r0 = r4.A0i
            if (r0 != 0) goto L_0x08d2
            boolean r0 = r4.A0a
            if (r0 != 0) goto L_0x08d2
            r0 = 1
            r1.setEnabled(r0)
            java.util.ArrayList r6 = r4.A0F
            X.0wU r0 = r4.A0A
            if (r0 == 0) goto L_0x01ac
            r8 = 14
            X.3vW r3 = new X.3vW
            r3.<init>(r4, r5, r6, r7, r8)
            r0.Bp1(r3)
            return
        L_0x01ac:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x01b1:
            java.lang.Object r10 = r3.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r10 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r10
            java.lang.Object r5 = r3.A02
            X.147 r5 = (X.AnonymousClass147) r5
            java.lang.Object r7 = r3.A03
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            int r2 = r3.A00
            r8 = 0
            r4 = 1
            r3 = 2
            X.AnonymousClass00C.A0D(r7, r3)
            X.16D r0 = r10.A02
            if (r0 == 0) goto L_0x026d
            X.141 r9 = r0.A0D(r5)
            X.12q r0 = r10.A07
            if (r0 == 0) goto L_0x0266
            java.lang.String r0 = r0.A0D(r5)
            if (r0 == 0) goto L_0x01de
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x01df
        L_0x01de:
            r1 = 1
        L_0x01df:
            java.lang.String r6 = "https://whatsapp.com/dl/"
            boolean r0 = com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment.A03(r10, r5)
            if (r1 != 0) goto L_0x021e
            r5 = 2131894022(0x7f121f06, float:1.9422837E38)
            if (r0 == 0) goto L_0x01ef
            r5 = 2131894001(0x7f121ef1, float:1.9422794E38)
        L_0x01ef:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.171 r0 = r10.A03
            if (r0 == 0) goto L_0x0261
            java.lang.String r0 = r0.A0R(r9, r4, r8)
            r1[r8] = r0
            java.lang.String r11 = X.C36401kF.A0q(r10, r6, r1, r4, r5)
        L_0x01ff:
            X.AnonymousClass00C.A0B(r11)
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r7.iterator()
        L_0x020a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r0 = r0.getRawString()
            r9.add(r0)
            goto L_0x020a
        L_0x021e:
            r1 = 2131894024(0x7f121f08, float:1.9422841E38)
            if (r0 == 0) goto L_0x0226
            r1 = 2131894023(0x7f121f07, float:1.942284E38)
        L_0x0226:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r11 = X.C36401kF.A0q(r10, r6, r0, r8, r1)
            goto L_0x01ff
        L_0x022d:
            X.0fG r8 = new X.0fG
            r8.<init>()
            if (r2 == 0) goto L_0x0258
            if (r2 == r4) goto L_0x0251
            r1 = 22
            if (r2 == r3) goto L_0x025a
            r0 = 3
            if (r2 == r0) goto L_0x0258
            r0 = 4
            if (r2 == r0) goto L_0x025a
        L_0x0240:
            X.01I r0 = r10.A0h()
            if (r0 == 0) goto L_0x08d2
            r12 = 17
            X.74y r7 = new X.74y
            r7.<init>(r8, r9, r10, r11, r12)
            r0.runOnUiThread(r7)
            return
        L_0x0251:
            r0 = 21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x025e
        L_0x0258:
            r0 = 0
            goto L_0x025e
        L_0x025a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x025e:
            r8.element = r0
            goto L_0x0240
        L_0x0261:
            java.lang.RuntimeException r0 = X.C36331k8.A0c()
            throw r0
        L_0x0266:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x026d:
            java.lang.RuntimeException r0 = X.C36331k8.A0Z()
            throw r0
        L_0x0272:
            java.lang.Object r2 = r3.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r2 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r2
            java.lang.Object r5 = r3.A02
            X.147 r5 = (X.AnonymousClass147) r5
            java.lang.Object r6 = r3.A03
            android.view.View r6 = (android.view.View) r6
            int r9 = r3.A00
            X.01I r3 = r2.A0h()
            if (r3 == 0) goto L_0x0290
            r1 = 38
            X.3v6 r0 = new X.3v6
            r0.<init>(r6, r1)
            r3.runOnUiThread(r0)
        L_0x0290:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.ArrayList r0 = r2.A0F
            java.util.Iterator r3 = r0.iterator()
        L_0x029a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02ad
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r3)
            X.8uZ r0 = new X.8uZ
            r0.<init>((com.whatsapp.jid.UserJid) r1)
            r8.add(r0)
            goto L_0x029a
        L_0x02ad:
            X.19A r0 = r2.A09
            if (r0 == 0) goto L_0x0325
            java.lang.String r13 = r0.A09()
            X.6QB r7 = X.C36421kH.A0T()
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.C36331k8.A1D(r7, r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C36331k8.A1D(r7, r1, r0)
            java.lang.String r1 = "to"
            boolean r0 = X.C203539oF.A0N(r5, r1)
            if (r0 == 0) goto L_0x02d2
            X.C36351kA.A1I(r5, r7, r1)
        L_0x02d2:
            r15 = 0
            r20 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r22 = 0
            r18 = 0
            r17 = r13
            boolean r0 = X.C203539oF.A0P(r17, r18, r20, r22)
            if (r0 == 0) goto L_0x02ea
            java.lang.String r0 = "id"
            X.C36331k8.A1D(r7, r0, r13)
        L_0x02ea:
            java.lang.String r0 = "store_sent_invite_sms"
            X.6QB r10 = X.C36441kJ.A0q(r0)
            r3 = 1
            r0 = 32
            boolean r0 = X.C203539oF.A0Y(r8, r3, r0)
            if (r0 == 0) goto L_0x0308
            java.util.Iterator r1 = r8.iterator()
        L_0x02fe:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0308
            X.C592133b.A01(r10, r1)
            goto L_0x02fe
        L_0x0308:
            X.C36361kB.A1H(r10, r7)
            X.9nx r12 = r7.A03()
            X.19A r10 = r2.A09
            if (r10 == 0) goto L_0x031e
            r14 = 408(0x198, float:5.72E-43)
            X.3pH r11 = new X.3pH
            r11.<init>(r6, r2, r5, r9)
            r10.A0E(r11, r12, r13, r14, r15)
            return
        L_0x031e:
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0325:
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x032c:
            java.lang.Object r5 = r3.A01
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            java.lang.Object r6 = r3.A02
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r2 = r3.A03
            X.141 r2 = (X.AnonymousClass141) r2
            int r4 = r3.A00
            r5.invalidateOptionsMenu()
            r0 = 2131431197(0x7f0b0f1d, float:1.8484116E38)
            android.widget.ImageView r3 = X.C36431kI.A0P(r5, r0)
            X.0ts r1 = r5.A0q
            r0 = 2131231313(0x7f080251, float:1.8078703E38)
            X.C36321k7.A0L(r5, r3, r1, r0)
            r3 = 0
            r6.setVisibility(r3)
            r0 = 6
            X.C48752hz.A00(r6, r5, r0)
            r0 = 2131431199(0x7f0b0f1f, float:1.848412E38)
            android.widget.ImageView r1 = X.C36431kI.A0P(r5, r0)
            X.1RY r0 = r5.A0l
            r0.A08(r1, r2)
            X.1EL r0 = r5.A0N
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x036d
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r0)
        L_0x036d:
            r0 = 2131431201(0x7f0b0f21, float:1.8484125E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36441kJ.A0e(r5, r0)
            X.171 r0 = r5.A0j
            java.lang.String r0 = r0.A0H(r2)
            r1.A0I(r0)
            X.C33511fU.A03(r1)
            r0 = 2131431200(0x7f0b0f20, float:1.8484122E38)
            android.widget.TextView r2 = X.C36401kF.A0H(r5, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131755178(0x7f1000aa, float:1.9141228E38)
            java.lang.String r0 = X.C36321k7.A0B(r1, r4, r3, r0)
            r2.setText(r0)
            return
        L_0x0396:
            java.lang.Object r0 = r3.A01
            X.3cd r0 = (X.C68893cd) r0
            java.lang.Object r4 = r3.A02
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            int r2 = r3.A00
            java.lang.Object r1 = r3.A03
            X.34i r1 = (X.C595434i) r1
            X.1CH r0 = r0.A03
            r0.A02(r1, r4, r2)
            return
        L_0x03aa:
            java.lang.Object r5 = r3.A01
            X.397 r5 = (X.AnonymousClass397) r5
            java.lang.Object r2 = r3.A03
            X.1Ak r2 = (X.C23931Ak) r2
            java.lang.Object r1 = r3.A02
            X.1Ak r1 = (X.C23931Ak) r1
            X.1vG r0 = new X.1vG
            r0.<init>(r2, r1, r5)
            X.0X4 r4 = X.C06880Vl.A00(r0)
            java.util.concurrent.Executor r2 = r5.A04
            r1 = 9
            X.3wc r0 = new X.3wc
            r0.<init>(r3, r4, r1)
            r2.execute(r0)
            return
        L_0x03cc:
            java.lang.Object r4 = r3.A01
            X.3fk r4 = (X.C70803fk) r4
            java.lang.Object r6 = r3.A02
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r2 = r3.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r3.A00
            r5 = 0
            X.005 r0 = r4.A5y     // Catch:{ IOException -> 0x0444 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0444 }
            X.31O r0 = (X.AnonymousClass31O) r0     // Catch:{ IOException -> 0x0444 }
            X.1Ax r1 = r0.A00     // Catch:{ IOException -> 0x0444 }
            r0 = 1
            java.io.InputStream r7 = r1.A07(r6, r0)     // Catch:{ IOException -> 0x0444 }
            r0 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r7, r0, r0)     // Catch:{ all -> 0x043a }
            r10 = 0
            if (r8 == 0) goto L_0x0430
            boolean r0 = r8.hasAlpha()     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x0430
            int r9 = r8.getWidth()     // Catch:{ all -> 0x043a }
            r0 = 1
            int r9 = r9 - r0
            int r1 = r8.getHeight()     // Catch:{ all -> 0x043a }
            int r1 = r1 - r0
            if (r9 < 0) goto L_0x0430
            if (r1 < 0) goto L_0x0430
            int r0 = r8.getPixel(r5, r5)     // Catch:{ all -> 0x043a }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x042f
            int r0 = r8.getPixel(r9, r5)     // Catch:{ all -> 0x043a }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x042f
            int r0 = r8.getPixel(r5, r1)     // Catch:{ all -> 0x043a }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x042f
            int r0 = r8.getPixel(r9, r1)     // Catch:{ all -> 0x043a }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x043a }
            if (r0 != 0) goto L_0x0430
        L_0x042f:
            r10 = 1
        L_0x0430:
            r5 = r10
            if (r8 == 0) goto L_0x0436
            r8.recycle()     // Catch:{ all -> 0x043a }
        L_0x0436:
            r7.close()     // Catch:{ IOException -> 0x0444 }
            goto L_0x044a
        L_0x043a:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x043f }
            goto L_0x0443
        L_0x043f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0444 }
        L_0x0443:
            throw r1     // Catch:{ IOException -> 0x0444 }
        L_0x0444:
            r1 = move-exception
            java.lang.String r0 = "conversation/createMentionableEntry/error while getting bitmap stream"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x044a:
            if (r5 == 0) goto L_0x0473
            X.01z r5 = X.C70803fk.A06(r4)
            X.11F r4 = r4.A45
            X.C36321k7.A0w(r6, r4)
            com.whatsapp.conversation.CustomStickerConfirmationDialog r3 = new com.whatsapp.conversation.CustomStickerConfirmationDialog
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "URI"
            r2.putString(r0, r1)
            X.C36371kC.A1B(r2, r4)
            r3.A17(r2)
            java.lang.String r0 = "STICKER_CONFIRMATION_DIALOG"
            X.C36381kD.A1F(r3, r5, r0)
            return
        L_0x0473:
            X.28e r0 = r4.A2Q
            r0.A0E(r6, r2, r3)
            return
        L_0x0479:
            java.lang.Object r5 = r3.A01
            X.2KN r5 = (X.AnonymousClass2KN) r5
            java.lang.Object r6 = r3.A02
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            int r4 = r3.A00
            java.lang.Object r2 = r3.A03
            X.3P8 r2 = (X.AnonymousClass3P8) r2
            X.1JN r1 = r5.A04
            r0 = 3
            X.AnonymousClass1JN.A00(r1, r6, r0, r4)
            X.3DP r4 = r5.A06
            int r0 = r2.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cta-url"
            goto L_0x0523
        L_0x0499:
            java.lang.Object r6 = r3.A01
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            java.lang.Object r4 = r3.A02
            X.2KB r4 = (X.AnonymousClass2KB) r4
            int r5 = r3.A00
            java.lang.Object r3 = r3.A03
            X.3P8 r3 = (X.AnonymousClass3P8) r3
            r0 = 3
            X.AnonymousClass00C.A0D(r3, r0)
            X.3Qa r0 = r6.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x08d2
            com.whatsapp.jid.UserJid r2 = r6.A0L()
            if (r2 == 0) goto L_0x04bd
            X.1Hr r1 = r4.A00
            r0 = 1
            r1.A01(r2, r6, r0)
        L_0x04bd:
            r1 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r6.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x04ea
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            X.1Fb r3 = r4.A03
            r0 = 2
            X.1Fa[] r2 = new X.C25111Fa[r0]
            X.1Fa r1 = X.C25111Fa.SKIP_ADDONS
            r0 = 0
            r2[r0] = r1
            X.1Fa r1 = X.C25111Fa.SKIP_THUMBNAILS
            r0 = 1
            r2[r0] = r1
            X.3IP r2 = X.AnonymousClass3IP.A00(r2)
            r1 = 17
            X.3vL r0 = new X.3vL
            r0.<init>(r4, r6, r5, r1)
            r3.A01(r2, r6, r0)
            return
        L_0x04ea:
            boolean r0 = X.C203369nr.A07(r6)
            if (r0 == 0) goto L_0x08d2
            X.1JN r1 = r4.A04
            r0 = 4
            X.AnonymousClass1JN.A00(r1, r6, r0, r5)
            X.3DP r4 = r4.A08
            int r0 = r3.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "quick-reply"
            goto L_0x0523
        L_0x0501:
            java.lang.Object r5 = r3.A01
            X.2KL r5 = (X.AnonymousClass2KL) r5
            java.lang.Object r6 = r3.A02
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            int r4 = r3.A00
            java.lang.Object r2 = r3.A03
            X.3P8 r2 = (X.AnonymousClass3P8) r2
            X.1JN r1 = r5.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 5
            X.AnonymousClass1JN.A00(r1, r6, r0, r4)
            X.3DP r4 = r5.A05
            int r0 = r2.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cta-call"
        L_0x0523:
            r4.A00(r6, r0, r1)
            return
        L_0x0527:
            int r2 = r3.A00
            java.lang.Object r5 = r3.A01
            X.02t r5 = (X.C006302t) r5
            java.lang.Object r4 = r3.A02
            X.6LU r4 = (X.AnonymousClass6LU) r4
            java.lang.Object r1 = r3.A03
            X.9iV r1 = (X.C200939iV) r1
            r0 = -1
            if (r2 == r0) goto L_0x055e
            r0 = 406(0x196, float:5.69E-43)
            if (r2 == r0) goto L_0x0546
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto L_0x0546
        L_0x0540:
            X.8XD r0 = X.AnonymousClass8XD.A00
        L_0x0542:
            r5.invoke(r0)
            return
        L_0x0546:
            com.whatsapp.jid.UserJid r3 = r1.A07
            X.AnonymousClass00C.A07(r3)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0540
            r0 = 1
            r4.A00 = r0
            X.1KK r2 = r4.A02
            r1 = 0
            X.3dF r0 = new X.3dF
            r0.<init>(r4)
            r2.A0E(r0, r3, r1)
            goto L_0x0540
        L_0x055e:
            X.8XE r0 = X.AnonymousClass8XE.A00
            goto L_0x0542
        L_0x0561:
            java.lang.Object r1 = r3.A01
            X.6ES r1 = (X.AnonymousClass6ES) r1
            java.lang.Object r5 = r3.A02
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            java.lang.Object r4 = r3.A03
            byte[] r4 = (byte[]) r4
            int r0 = r3.A00
            byte r2 = (byte) r0
            X.6YM r0 = r1.A00
            X.6WM r1 = r0.A2U
            java.lang.String r0 = "call_rekey"
            r1.A04(r5, r0, r4, r2)
            return
        L_0x057a:
            java.lang.Object r5 = r3.A01
            X.33w r5 = (X.C594233w) r5
            java.lang.Object r4 = r3.A02
            java.lang.Object r6 = r3.A03
            X.1KH r6 = (X.AnonymousClass1KH) r6
            int r3 = r3.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.4vP r2 = r5.A00
            X.7ku r1 = r5.A01
            java.util.List r0 = X.C36371kC.A11(r4)
            X.AnonymousClass6JI.A00(X.C142326oh.A03(r2), new X.AnonymousClass6MO(r0), r1)
            r0 = 4
            if (r3 != r0) goto L_0x08d2
            X.4vP r0 = r5.A00
            if (r0 == 0) goto L_0x08d2
            android.app.Activity r5 = X.C142326oh.A01(r0)
            boolean r0 = r5 instanceof com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity
            if (r0 == 0) goto L_0x08d2
            com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity r5 = (com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity) r5
            if (r5 == 0) goto L_0x08d2
            X.01z r1 = r5.getSupportFragmentManager()
            java.lang.String r0 = "bloks_bottomsheet_container"
            X.02E r1 = r1.A0N(r0)
            boolean r0 = r1 instanceof com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment
            if (r0 == 0) goto L_0x05bd
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            if (r1 == 0) goto L_0x05bd
            r1.A1b()
        L_0x05bd:
            X.1K6 r4 = r6.A03
            X.4Lp r3 = new X.4Lp
            r3.<init>(r6, r5)
            java.lang.Integer r2 = X.C36391kE.A0r()
            X.2nm r1 = X.C51412nm.META_AI_SHORTCUT
            X.3de r0 = new X.3de
            r0.<init>(r5, r4, r3)
            X.AnonymousClass1K6.A00(r5, r0, r4, r1, r2)
            return
        L_0x05d3:
            java.lang.Object r12 = r3.A01
            X.65M r12 = (X.AnonymousClass65M) r12
            java.lang.Object r2 = r3.A02
            X.68B r2 = (X.AnonymousClass68B) r2
            int r11 = r3.A00
            java.lang.Object r10 = r3.A03
            X.02t r10 = (X.C006302t) r10
            r9 = 1
            X.0v0 r0 = r12.A04
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "sticker_store_onboarding_badge_shown"
            X.C36331k8.A0w(r1, r0, r9)
            X.38x r8 = r12.A03
            java.util.List r0 = r2.A05
            r0.size()
            X.5Ar r4 = r8.A02
            java.util.List r7 = r2.A05
            X.AnonymousClass00C.A08(r7)
            java.util.LinkedHashMap r5 = X.C36431kI.A1G()
            java.util.HashMap r0 = r4.A06()
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()
            java.util.Iterator r6 = X.C36371kC.A10(r0)
        L_0x060b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x062a
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r6)
            java.lang.Object r0 = r1.getKey()
            X.67c r0 = (X.C1271367c) r0
            java.lang.Object r1 = r1.getValue()
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x060b
            X.AnonymousClass00C.A0B(r1)
            r3.put(r0, r1)
            goto L_0x060b
        L_0x062a:
            java.util.Iterator r6 = r7.iterator()
        L_0x062e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x064c
            java.lang.Object r1 = r6.next()
            X.6c4 r1 = (X.C135066c4) r1
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x0646
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x0646
            r5.put(r0, r1)
            goto L_0x062e
        L_0x0646:
            java.lang.String r0 = "RecentStickers/sticker is not avatar or with null stable id, skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x062e
        L_0x064c:
            java.util.ArrayList r0 = r4.A04()
            java.util.Iterator r16 = r0.iterator()
        L_0x0654:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x06b8
            java.lang.Object r0 = r16.next()
            X.67c r0 = (X.C1271367c) r0
            if (r0 == 0) goto L_0x0654
            java.lang.String r15 = r0.A01
            if (r15 == 0) goto L_0x0654
            r4.A08(r0)
            java.lang.Object r14 = r5.get(r15)
            X.6c4 r14 = (X.C135066c4) r14
            if (r14 == 0) goto L_0x0654
            java.lang.String r13 = r14.A0E
            if (r13 == 0) goto L_0x0654
            java.lang.String r6 = r14.A0B
            long r0 = r0.A00
            X.67c r7 = new X.67c
            r20 = r6
            r21 = r15
            r22 = r0
            r19 = r13
            r18 = r14
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.Number r0 = X.C36441kJ.A10(r15, r3)
            if (r0 == 0) goto L_0x06b2
            float r0 = r0.floatValue()
        L_0x0694:
            X.6vG r6 = new X.6vG
            r6.<init>(r7, r0)
            r4.A07()
            monitor-enter(r4)
            java.util.List r0 = r4.A03     // Catch:{ all -> 0x06b5 }
            r0.add(r6)     // Catch:{ all -> 0x06b5 }
            X.1XK r1 = r4.A00     // Catch:{ all -> 0x06b5 }
            java.util.List r0 = r4.A03     // Catch:{ all -> 0x06b5 }
            r1.Blb(r0)     // Catch:{ all -> 0x06b5 }
            monitor-exit(r4)     // Catch:{ all -> 0x06b5 }
            X.67c r0 = r6.A01
            X.6c4 r0 = r0.A04
            r4.A0E(r0)
            goto L_0x0654
        L_0x06b2:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0694
        L_0x06b5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x06b5 }
            throw r0
        L_0x06b8:
            X.17Y r0 = r8.A00
            r27 = r0
            r0 = 43
            X.72k r1 = new X.72k
            r1.<init>(r8, r0)
            r0 = r27
            r0.A0H(r1)
            X.1HC r7 = r8.A01
            java.lang.String r0 = "migrate_stickers_recents_done"
            r7.A01(r11, r0)
            java.util.List r0 = r2.A05
            r0.size()
            X.1Ar r0 = r8.A04
            r26 = r0
            java.util.List r2 = r2.A05
            java.util.HashMap r6 = X.AnonymousClass001.A0J()
            X.1As r5 = r0.A05
            r1 = 2
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.ArrayList r3 = r5.A01(r0, r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x06ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x070a
            java.lang.Object r1 = r2.next()
            X.6c4 r1 = (X.C135066c4) r1
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x0704
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x0704
            r6.put(r0, r1)
            goto L_0x06ec
        L_0x0704:
            java.lang.String r0 = "StarredStickers/updateStarredStickersByAvatarStableId/is not avatar or with null stable id, skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x06ec
        L_0x070a:
            java.util.Iterator r17 = r3.iterator()
        L_0x070e:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0801
            java.lang.Object r4 = r17.next()
            X.6EB r4 = (X.AnonymousClass6EB) r4
            java.lang.String r0 = r4.A00
            if (r0 != 0) goto L_0x0724
            java.lang.String r0 = "StarredStickers/updateStarredStickersByAvatarStableId/sticker has no avatar stable id, aborting"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x070e
        L_0x0724:
            java.lang.Object r3 = r6.get(r0)
            X.6c4 r3 = (X.C135066c4) r3
            if (r3 != 0) goto L_0x0732
            java.lang.String r0 = r4.A0B
            r5.A03(r0)
            goto L_0x070e
        L_0x0732:
            java.lang.String r13 = r3.A06
            java.lang.String r14 = r3.A0E
            java.lang.String r15 = r3.A0H
            java.lang.String r0 = r3.A07
            r25 = r0
            java.lang.String r0 = r3.A0D
            r24 = r0
            int r0 = r3.A00
            r23 = r0
            int r0 = r3.A03
            r22 = r0
            int r0 = r3.A02
            r20 = r0
            java.lang.String r0 = r3.A08
            r19 = r0
            boolean r0 = r3.A0M
            r18 = r0
            boolean r0 = r3.A0L
            r16 = r0
            r2 = 0
            X.AnonymousClass00C.A0D(r13, r2)
            X.AnonymousClass00C.A0D(r14, r9)
            java.lang.String r21 = "avatar_template_id = ?"
            android.content.ContentValues r1 = X.C36441kJ.A0E()
            java.lang.String r0 = "plaintext_hash"
            r1.put(r0, r14)
            java.lang.String r0 = "url"
            r1.put(r0, r15)
            java.lang.String r14 = "direct_path"
            r0 = r25
            r1.put(r14, r0)
            java.lang.String r14 = "mimetype"
            r0 = r24
            r1.put(r14, r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r23)
            java.lang.String r0 = "file_size"
            r1.put(r0, r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r22)
            java.lang.String r0 = "width"
            r1.put(r0, r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r20)
            java.lang.String r0 = "height"
            r1.put(r0, r14)
            java.lang.String r14 = "emojis"
            r0 = r19
            r1.put(r14, r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r18)
            java.lang.String r0 = "is_first_party"
            r1.put(r0, r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r16)
            java.lang.String r0 = "is_avatar"
            r1.put(r0, r14)
            X.005 r0 = r5.A00     // Catch:{ Exception -> 0x07f9 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07f9 }
            X.54e r0 = (X.C1031554e) r0     // Catch:{ Exception -> 0x07f9 }
            X.1M0 r0 = r0.A04()     // Catch:{ Exception -> 0x07f9 }
            X.14e r15 = r0.A02     // Catch:{ all -> 0x07f2 }
            java.lang.String r20 = "starred_stickers"
            r16 = 1
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ all -> 0x07f2 }
            r14[r2] = r13     // Catch:{ all -> 0x07f2 }
            java.lang.String r22 = "updateStickerAttrsByAvatarTemplateId/UPDATE_STARRED_STICKERS"
            r18 = r15
            r19 = r1
            r23 = r14
            int r1 = r18.A01(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x07f2 }
            if (r1 > 0) goto L_0x07d7
            r16 = 0
        L_0x07d7:
            r0.close()     // Catch:{ Exception -> 0x07f9 }
            if (r16 == 0) goto L_0x070e
            r0 = r26
            X.1B4 r2 = r0.A01
            java.lang.String r1 = r4.A0B
            java.lang.String r0 = r2.A00(r1)
            r2.A02(r1, r0)
            java.lang.String r1 = r3.A0E
            java.lang.String r0 = r3.A0B
            r2.A01(r1, r0)
            goto L_0x070e
        L_0x07f2:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x07f4 }
        L_0x07f4:
            r1 = move-exception
            X.C05600Qi.A00(r0, r2)     // Catch:{ Exception -> 0x07f9 }
            throw r1     // Catch:{ Exception -> 0x07f9 }
        L_0x07f9:
            r1 = move-exception
            java.lang.String r0 = "updateStickerAttrsByAvatarTemplateId/unable to update sticker"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x070e
        L_0x0801:
            X.C24001Ar.A00(r26)
            r0 = 42
            X.72k r1 = new X.72k
            r1.<init>(r8, r0)
            r0 = r27
            r0.A0H(r1)
            java.lang.String r0 = "migrate_stickers_favorites_done"
            r7.A01(r11, r0)
            X.2pF r1 = X.C52322pF.SUCCESS
            r7.A02(r1, r11)
            X.1HC r0 = r12.A07
            r0.A02(r1, r11)
            X.1Bt r0 = r12.A05
            X.00T r4 = r0.A01
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r4)
            java.lang.String r3 = "pref_avatar_art_pending_revision"
            java.lang.String r2 = X.C36371kC.A0t(r0, r3)
            if (r2 == 0) goto L_0x085a
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r4)
            java.lang.String r0 = "pref_avatar_art_revision"
            X.C36341k9.A0x(r1, r0, r2)
            android.content.SharedPreferences$Editor r0 = X.C36351kA.A0A(r4)
            X.C36341k9.A0u(r0, r3)
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r4)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_revision"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_state"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_filters"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_country_code"
            X.C36341k9.A0u(r1, r0)
        L_0x085a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r10.invoke(r0)
            return
        L_0x0862:
            java.lang.Object r6 = r3.A01
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r6 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r6
            java.lang.Object r5 = r3.A02
            X.141 r5 = (X.AnonymousClass141) r5
            java.lang.Object r4 = r3.A03
            byte[] r4 = (byte[]) r4
            int r3 = r3.A00
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)
            X.1P3 r2 = r6.A07
            r1 = 1
            r0 = 0
            boolean r2 = X.AnonymousClass1P3.A00(r5, r2, r0, r4, r1)
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel.A03(r6, r2)
            X.1HC r1 = r6.A06
            java.lang.String r0 = "profile_photo_updated"
            r1.A01(r3, r0)
            if (r2 == 0) goto L_0x088e
            X.2pF r0 = X.C52322pF.SUCCESS
        L_0x088a:
            r1.A02(r0, r3)
            return
        L_0x088e:
            X.2pF r0 = X.C52322pF.FAIL
            goto L_0x088a
        L_0x0891:
            java.lang.Object r2 = r3.A01
            X.1Cv r2 = (X.C24541Cv) r2
            java.lang.Object r1 = r3.A02
            X.11F r1 = (X.AnonymousClass11F) r1
            int r0 = r3.A00
            java.lang.Object r4 = r3.A03
            X.0yW r4 = (X.C21010yW) r4
            java.util.ArrayList r0 = r2.A07(r1, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x08a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x08d2
            X.3T1 r2 = X.C36391kE.A0l(r3)
            if (r2 == 0) goto L_0x08d2
            X.2PO r1 = new X.2PO
            r1.<init>()
            X.3Qa r0 = r2.A1J
            java.lang.String r0 = r0.A01
            r1.A02 = r0
            java.lang.String r0 = X.C65093Qs.A00(r2)
            r1.A01 = r0
            int r0 = X.AnonymousClass3T1.A04(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r4.Bly(r1)
            goto L_0x08a7
        L_0x08d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80513vW.run():void");
    }
}
