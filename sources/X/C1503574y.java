package X;

/* renamed from: X.74y  reason: invalid class name and case insensitive filesystem */
public class C1503574y implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C1503574y(C195979Xa r2, C204369pt r3, Integer num) {
        this.A04 = 2;
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = num;
        this.A03 = "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ea, code lost:
        if (r10 == null) goto L_0x01ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x041b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r1 = r26
            int r0 = r1.A04
            switch(r0) {
                case 0: goto L_0x02e6;
                case 1: goto L_0x0314;
                case 2: goto L_0x0029;
                case 3: goto L_0x0088;
                case 4: goto L_0x032f;
                case 5: goto L_0x0361;
                case 6: goto L_0x0383;
                case 7: goto L_0x03a1;
                case 8: goto L_0x00a0;
                case 9: goto L_0x00ca;
                case 10: goto L_0x0116;
                case 11: goto L_0x03b4;
                case 12: goto L_0x017d;
                case 13: goto L_0x0438;
                case 14: goto L_0x01b6;
                case 15: goto L_0x044a;
                case 16: goto L_0x0484;
                case 17: goto L_0x0258;
                case 18: goto L_0x0496;
                case 19: goto L_0x04fd;
                case 20: goto L_0x0515;
                case 21: goto L_0x0562;
                case 22: goto L_0x0580;
                case 23: goto L_0x05b6;
                case 24: goto L_0x05ed;
                case 25: goto L_0x02ac;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.6VK r0 = (X.AnonymousClass6VK) r0
            java.lang.String r4 = r1.A03
            java.lang.Object r3 = r1.A01
            java.lang.Object r2 = r1.A02
            X.005 r0 = r0.A0L
            java.lang.Object r1 = r0.get()
            X.AAt r1 = (X.C21159AAt) r1
            X.5Tu r0 = X.C108515Tu.A0C
            r1.A02(r0, r4)
            r1 = 30
            X.72w r0 = new X.72w
            r0.<init>(r3, r2, r1)
            X.C202399lk.A00(r0)
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r2 = r1.A00
            X.9pt r2 = (X.C204369pt) r2
            r5 = 0
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r0 = "buildRenderersCompleted starts"
            X.C204369pt.A0F(r2, r0, r3)
            java.lang.Object r3 = r1.A02
            X.9Xa r3 = (X.C195979Xa) r3
            java.util.Objects.requireNonNull(r3)
            X.9um r4 = r3.A0F
            java.util.Objects.requireNonNull(r4)
            X.9Xa r0 = r2.A10
            if (r0 == 0) goto L_0x0607
            X.9Xa r0 = r2.A10
            X.9um r0 = r0.A0F
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0607
            r0 = 1
            r2.A0Z = r0
            java.lang.Object r0 = r1.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.A0S = r0
            android.view.Surface r1 = r2.A0H
            if (r1 == 0) goto L_0x0063
            X.AUR r0 = r2.A0p
            boolean r0 = r0.useBlockingSetSurfaceExo2
            X.C204369pt.A0A(r1, r2, r0)
        L_0x0063:
            float r0 = r2.A01
            X.C204369pt.A0D(r2, r0)
            float r0 = r2.A00
            X.C204369pt.A0C(r2, r0)
            int r0 = r2.A02
            X.C204369pt.A0E(r2, r0)
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0084
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x0028
            X.9n2 r0 = r2.A12
            X.9mU r0 = r0.A01
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0028
        L_0x0084:
            X.C204369pt.A0B(r2)
            return
        L_0x0088:
            java.lang.Object r5 = r1.A00
            X.21s r5 = (X.C429721s) r5
            java.lang.Object r6 = r1.A01
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.String r3 = r1.A03
            java.lang.Object r4 = r1.A02
            android.view.View r4 = (android.view.View) r4
            X.0yb r0 = r5.A08
            android.content.ClipboardManager r2 = r0.A09()
            if (r2 == 0) goto L_0x0028
            goto L_0x060f
        L_0x00a0:
            java.lang.Object r5 = r1.A00
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r0 = r1.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            java.lang.String r4 = r1.A03
            java.lang.Object r3 = r1.A02
            X.4Pw r3 = (X.C87714Pw) r3
            X.3Qa r2 = r0.A1J
            r1 = 2131434560(0x7f0b1c40, float:1.8490937E38)
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Object r0 = r5.getTag(r1)
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0028
            r5.setText(r4)
            r3.BR1(r4)
            return
        L_0x00ca:
            java.lang.Object r4 = r1.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r4 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r4
            java.lang.Object r2 = r1.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.String r0 = r1.A03
            java.lang.Object r3 = r1.A02
            X.1A1 r1 = r4.A05
            X.3Qa r0 = X.C90504aG.A0T(r2, r0)
            X.3T1 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x0028
            com.whatsapp.jid.UserJid r0 = r1.A0L()
            java.lang.String r6 = X.AnonymousClass143.A03(r0)
            X.5lh r5 = r4.A02
            boolean r0 = r1 instanceof X.C88854Uh
            if (r0 == 0) goto L_0x0114
            r0 = r1
            X.4Uh r0 = (X.C88854Uh) r0
            X.3F4 r0 = r0.BIE()
            java.lang.String r7 = r0.A05
        L_0x00f9:
            X.60t r2 = r4.A04
            long r0 = r1.A1N
            java.lang.Integer r0 = r2.A00(r0)
            boolean r8 = X.AnonymousClass000.A1V(r0)
            java.lang.Integer r4 = X.C36371kC.A0n()
            X.8Zx r1 = X.C175168Zx.A00
            r0 = 2
            if (r3 != r1) goto L_0x010f
            r0 = 1
        L_0x010f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x015f
        L_0x0114:
            r7 = 0
            goto L_0x00f9
        L_0x0116:
            java.lang.Object r4 = r1.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r4 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r4
            java.lang.Object r2 = r1.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.String r0 = r1.A03
            java.lang.Object r3 = r1.A02
            X.1A1 r1 = r4.A05
            X.3Qa r0 = X.C90504aG.A0T(r2, r0)
            X.3T1 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x0028
            com.whatsapp.jid.UserJid r0 = r1.A0L()
            java.lang.String r6 = X.AnonymousClass143.A03(r0)
            X.5lh r5 = r4.A02
            boolean r0 = r1 instanceof X.C88854Uh
            if (r0 == 0) goto L_0x017b
            r0 = r1
            X.4Uh r0 = (X.C88854Uh) r0
            X.3F4 r0 = r0.BIE()
            java.lang.String r7 = r0.A05
        L_0x0145:
            X.60t r2 = r4.A04
            long r0 = r1.A1N
            java.lang.Integer r0 = r2.A00(r0)
            boolean r8 = X.AnonymousClass000.A1V(r0)
            r1 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            X.8Zx r0 = X.C175168Zx.A00
            if (r3 == r0) goto L_0x015b
            r1 = 2
        L_0x015b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x015f:
            r0 = 0
            X.58F r1 = new X.58F
            r1.<init>()
            r1.A05 = r6
            r1.A02 = r4
            r1.A03 = r2
            r1.A01 = r0
            r1.A06 = r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.A00 = r0
            X.0yW r0 = r5.A00
            r0.Blv(r1)
            return
        L_0x017b:
            r7 = 0
            goto L_0x0145
        L_0x017d:
            java.lang.Object r8 = r1.A00
            X.11F r8 = (X.AnonymousClass11F) r8
            java.lang.Object r7 = r1.A01
            com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver r7 = (com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver) r7
            java.lang.Object r2 = r1.A02
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            java.lang.String r6 = r1.A03
            if (r8 == 0) goto L_0x0028
            X.19x r1 = r7.A0A
            if (r1 == 0) goto L_0x066c
            X.0wo r0 = r7.A03
            if (r0 == 0) goto L_0x0665
            long r4 = X.C19970wo.A00(r0)
            long r2 = r2.A1N
            if (r6 != 0) goto L_0x019f
            java.lang.String r6 = ""
        L_0x019f:
            X.19w r0 = r1.A01
            X.3Qa r0 = X.C36411kG.A0o(r8, r0)
            X.2cK r1 = new X.2cK
            r1.<init>(r0, r4)
            r1.A00 = r2
            r1.A01 = r6
            X.0xM r0 = r7.A07
            if (r0 == 0) goto L_0x065e
            r0.A0P(r1)
            return
        L_0x01b6:
            java.lang.Object r9 = r1.A00
            android.net.Uri[] r9 = (android.net.Uri[]) r9
            java.lang.Object r8 = r1.A01
            X.6LV r8 = (X.AnonymousClass6LV) r8
            java.lang.Object r7 = r1.A02
            X.02t r7 = (X.C006302t) r7
            java.lang.String r6 = r1.A03
            r5 = 0
            r4 = 1
            r12 = 2
            X.AnonymousClass00C.A0D(r7, r12)
            int r0 = r9.length
            r25 = r0
            r3 = 0
        L_0x01ce:
            r0 = r25
            if (r3 >= r0) goto L_0x0028
            r11 = r9[r3]
            if (r11 == 0) goto L_0x0254
            java.lang.String r2 = X.C90464aC.A0V()
            X.1Gs r1 = r8.A04
            r0 = 100
            byte[] r0 = r1.A05(r11, r0, r0, r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x01ec
            java.lang.String r10 = android.util.Base64.encodeToString(r0, r12)     // Catch:{ Exception -> 0x01ee }
            if (r10 != 0) goto L_0x01f3
        L_0x01ec:
            r10 = r1
            goto L_0x01f3
        L_0x01ee:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r10 = r1
        L_0x01f3:
            r0 = 32
            byte[] r14 = new byte[r0]
            X.3Ot r15 = new X.3Ot
            r15.<init>(r5, r5, r4)
            X.1Gl r18 = X.C25471Gl.A07
            X.0wo r0 = r8.A01
            long r0 = X.C19970wo.A00(r0)
            X.6Rx r13 = new X.6Rx
            r13.<init>(r14, r0)
            r16 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r17 = r15
            r19 = r16
            r20 = r2
            r15 = r13
            r14 = r11
            X.3Rg r0 = X.C65233Rg.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.1D0 r13 = r8.A03
            X.6vi r11 = r13.A07(r0, r4)
            java.lang.String r0 = "mms"
            r11.A0X = r0
            X.17Y r0 = r8.A00
            java.util.Objects.requireNonNull(r0)
            X.1jo r14 = new X.1jo
            r14.<init>(r0, r4)
            X.70M r1 = new X.70M
            r1.<init>(r10, r6, r2, r7)
            X.1Hk r0 = r11.A0G
            r0.A03(r1, r14)
            X.70J r1 = new X.70J
            r1.<init>(r6, r2, r7)
            X.1Hk r0 = r11.A0J
            r0.A03(r1, r14)
            X.70L r0 = new X.70L
            r0.<init>(r11, r6, r2, r7)
            r11.A06(r0, r14)
            java.lang.String r0 = "flow media upload"
            r13.A0E(r11, r0)
        L_0x0254:
            int r3 = r3 + 1
            goto L_0x01ce
        L_0x0258:
            java.lang.Object r2 = r1.A00
            X.0fG r2 = (X.C10810fG) r2
            java.lang.Object r4 = r1.A01
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            java.lang.Object r3 = r1.A02
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r3 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r3
            java.lang.String r9 = r1.A03
            X.C36321k7.A0w(r2, r4)
            r0 = 3
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.Object r0 = r2.element
            if (r0 == 0) goto L_0x02a8
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x02a8
            X.01I r5 = r3.A0h()
            if (r5 == 0) goto L_0x0028
            X.3Rv r7 = r3.A05
            if (r7 == 0) goto L_0x0673
            java.lang.Object r8 = r2.element
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r2 = ";"
            X.4N6 r1 = X.AnonymousClass4N6.A00
            java.lang.String r0 = ""
            java.lang.String r2 = X.C007103b.A0Q(r2, r0, r0, r4, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sms:"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            android.net.Uri r6 = android.net.Uri.parse(r0)
            X.AnonymousClass00C.A08(r6)
            int r0 = r4.size()
            long r10 = (long) r0
            X.C65383Rv.A00(r5, r6, r7, r8, r9, r10)
        L_0x02a8:
            r3.A1c()
            return
        L_0x02ac:
            java.lang.Object r4 = r1.A00
            X.6qP r4 = (X.C143356qP) r4
            java.lang.Object r2 = r1.A01
            X.67W r2 = (X.AnonymousClass67W) r2
            java.lang.Object r8 = r1.A02
            X.6bn r8 = (X.C134906bn) r8
            java.lang.String r3 = r1.A03
            X.54t r1 = r4.A04
            java.lang.String r0 = r1.A00
            java.lang.String r7 = r1.A0F(r0)
            if (r7 == 0) goto L_0x067a
            r2.A01(r7)
            if (r8 == 0) goto L_0x0028
            X.6Pt r6 = r4.A06
            java.lang.String r5 = r8.A01
            X.6MZ r2 = r4.A03
            r1 = 0
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.5OH r4 = new X.5OH
            r4.<init>(r2, r3, r1)
            long r2 = r8.A00
            boolean r1 = r8.A02
            X.6S9 r0 = new X.6S9
            r0.<init>((java.lang.Object) r7, (long) r2, (boolean) r1)
            r6.A02(r4, r0, r5)
            return
        L_0x02e6:
            java.lang.Object r0 = r1.A00
            X.01M r0 = (X.AnonymousClass01M) r0
            java.lang.Object r4 = r1.A01
            androidx.car.app.IOnDoneCallback r4 = (androidx.car.app.IOnDoneCallback) r4
            java.lang.String r3 = r1.A03
            java.lang.Object r2 = r1.A02
            X.7dU r2 = (X.AnonymousClass7dU) r2
            if (r0 == 0) goto L_0x0306
            X.01N r0 = (X.AnonymousClass01N) r0
            X.01P r1 = r0.A02
            X.01P r0 = X.AnonymousClass01P.CREATED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x0306
            X.C132496Ty.A01(r4, r2, r3)
            return
        L_0x0306:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Lifecycle is not at least created when dispatching "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r2, r0, r1)
            X.C132496Ty.A02(r4, r3, r0)
            return
        L_0x0314:
            java.lang.Object r5 = r1.A00
            X.6lc r5 = (X.C140456lc) r5
            java.lang.Object r4 = r1.A01
            X.7ku r4 = (X.C160377ku) r4
            X.68b r3 = X.C1273868b.A00()
            java.lang.String r2 = r1.A03
            r0 = 0
            X.6MO r2 = X.C1273868b.A05(r3, r2, r0)
            java.lang.Object r0 = r1.A02
            X.67i r0 = (X.C1271967i) r0
            X.C131756Qk.A02(r0, r5, r2, r4)
            return
        L_0x032f:
            java.lang.Object r6 = r1.A00
            X.6Mt r6 = (X.C130876Mt) r6
            java.lang.Object r5 = r1.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r4 = r1.A02
            X.7iv r4 = (X.C159167iv) r4
            java.lang.String r3 = r1.A03
            X.1KK r2 = r6.A01
            X.9uZ r0 = r2.A07(r5)
            if (r0 == 0) goto L_0x035d
            boolean r0 = r0.A0X
            if (r0 == 0) goto L_0x035d
            X.9Pa r1 = r6.A00
            X.6px r0 = new X.6px
            r0.<init>(r4, r6, r5, r3)
            X.8VE r1 = r1.A00(r0, r5, r3)
            X.6pf r0 = new X.6pf
            r0.<init>(r1)
            r2.A0C(r0, r5)
            return
        L_0x035d:
            r4.onSuccess()
            return
        L_0x0361:
            java.lang.Object r6 = r1.A00
            com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel r6 = (com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel) r6
            java.lang.String r5 = r1.A03
            java.lang.Object r4 = r1.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r0 = r1.A02
            X.8yZ r0 = (X.C187808yZ) r0
            X.67M r3 = r6.A04
            X.7Um r2 = new X.7Um
            r2.<init>(r0, r6, r4)
            java.util.Set r1 = X.C36411kG.A15(r5)
            X.7UG r0 = new X.7UG
            r0.<init>(r5, r2)
            r3.A00(r4, r1, r0)
            return
        L_0x0383:
            java.lang.Object r5 = r1.A00
            X.14u r5 = (X.C225314u) r5
            java.lang.Object r0 = r1.A01
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r4 = r1.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.String r3 = r1.A03
            r0.setText(r3)
            X.17Y r2 = r5.A05
            X.0yb r1 = r5.A08
            X.3Z5 r0 = new X.3Z5
            r0.<init>(r2, r1, r3)
            r4.setOnLongClickListener(r0)
            return
        L_0x03a1:
            java.lang.Object r4 = r1.A00
            X.9Sb r4 = (X.C194999Sb) r4
            java.lang.String r3 = r1.A03
            java.lang.Object r2 = r1.A01
            X.918 r2 = (X.AnonymousClass918) r2
            java.lang.Object r1 = r1.A02
            X.6c4 r1 = (X.C135066c4) r1
            r0 = 0
            r4.A00(r2, r1, r3, r0)
            return
        L_0x03b4:
            java.lang.Object r0 = r1.A00
            X.AHp r0 = (X.C21337AHp) r0
            java.lang.Object r7 = r1.A01
            X.5ur r7 = (X.C122445ur) r7
            java.lang.Object r6 = r1.A02
            X.8SX r6 = (X.AnonymousClass8SX) r6
            java.lang.String r2 = r1.A03
            X.3Qa r5 = r0.A0Q
            X.67N r4 = r7.A00
            boolean r0 = r6.A0w()
            r3 = 0
            if (r0 == 0) goto L_0x042b
            X.8SV r0 = r6.interactiveMessage_
            r1 = r0
            if (r0 != 0) goto L_0x03d4
            X.8SV r0 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x03d4:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x042b
            if (r1 != 0) goto L_0x03de
            X.8SV r1 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x03de:
            X.8SG r1 = r1.contextInfo_
            if (r1 != 0) goto L_0x03e4
            X.8SG r1 = X.AnonymousClass8SG.DEFAULT_INSTANCE
        L_0x03e4:
            int r0 = r1.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x03ef
            boolean r0 = r1.isForwarded_
            if (r0 == 0) goto L_0x03ef
            r3 = 1
        L_0x03ef:
            X.5uz r7 = r7.A02
            r1 = 0
            if (r3 == 0) goto L_0x041b
            r0 = 0
        L_0x03f5:
            java.lang.String r11 = r4.A01(r5, r0)
            X.11F r8 = r5.A00
            int r0 = r4.A00(r8, r2, r3)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            if (r3 == 0) goto L_0x040b
            X.13s r0 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r8 = X.C222913s.A00(r2)
        L_0x040b:
            r10 = 0
            r14 = 22
            X.0wU r0 = r7.A03
            X.74s r6 = new X.74s
            r13 = r10
            r12 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Boy(r6)
            return
        L_0x041b:
            boolean r0 = r6.A10()
            if (r0 == 0) goto L_0x0426
            java.lang.Integer r0 = X.C36361kB.A0i()
            goto L_0x03f5
        L_0x0426:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x03f5
        L_0x042b:
            java.lang.String r0 = r5.A01
            X.AnonymousClass00C.A07(r0)
            java.lang.String r0 = X.C90464aC.A0b(r0)
            X.AnonymousClass00C.A08(r0)
            goto L_0x03ef
        L_0x0438:
            java.lang.Object r4 = r1.A00
            X.1sS r4 = (X.C39471sS) r4
            java.lang.String r3 = r1.A03
            java.lang.Object r2 = r1.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r0 = r1.A02
            X.005 r0 = (X.AnonymousClass005) r0
            r4.A0U(r2, r0, r3)
            return
        L_0x044a:
            java.lang.Object r4 = r1.A00
            X.3B1 r4 = (X.AnonymousClass3B1) r4
            java.lang.String r10 = r1.A03
            java.lang.Object r3 = r1.A01
            java.lang.Object r5 = r1.A02
            r12 = 0
            r0 = 3
            X.AnonymousClass00C.A0D(r5, r0)
            android.app.Activity r8 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r8, r0)
            r0 = r8
            X.14u r0 = (X.C225314u) r0
            android.view.View r7 = r0.A00
            java.util.ArrayList r11 = X.C36411kG.A13(r7)
            X.0yb r9 = r4.A06
            X.012 r8 = (X.AnonymousClass012) r8
            X.3ZU r6 = new X.3ZU
            r13 = 0
            r6.<init>((android.view.View) r7, (X.AnonymousClass012) r8, (X.C21060yb) r9, (java.lang.String) r10, (java.util.List) r11, (int) r12, (boolean) r13)
            r2 = 2131895193(0x7f122399, float:1.9425212E38)
            r1 = 46
            X.3Yo r0 = new X.3Yo
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r3, (int) r1)
            r6.A04(r0, r2)
            r6.A02()
            return
        L_0x0484:
            java.lang.Object r4 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r4 = (com.whatsapp.group.newgroup.NewGroup) r4
            java.lang.Object r3 = r1.A01
            X.146 r3 = (X.AnonymousClass146) r3
            java.lang.String r2 = r1.A03
            java.lang.Object r0 = r1.A02
            java.util.List r0 = (java.util.List) r0
            r4.A3i(r3, r2, r0)
            return
        L_0x0496:
            java.lang.Object r7 = r1.A00
            X.5Fi r7 = (X.C105605Fi) r7
            java.lang.String r5 = r1.A03
            java.lang.Object r2 = r1.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.Object r6 = r1.A02
            X.7hF r6 = (X.AnonymousClass7hF) r6
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "action"
            java.lang.String r3 = "upi-get-p2m-config"
            X.C36381kD.A1M(r0, r3, r4)
            java.lang.String r0 = "payment-config-id"
            X.C36381kD.A1M(r0, r5, r4)
            X.0yC r1 = r7.A03
            X.12O r0 = r7.A02
            com.whatsapp.jid.UserJid r2 = X.C111255bz.A00(r0, r1, r2)
            if (r2 == 0) goto L_0x04c8
            java.lang.String r1 = "receiver"
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r4.add(r0)
        L_0x04c8:
            X.9YX r5 = r7.A00
            if (r5 == 0) goto L_0x04cf
            r5.A02(r3)
        L_0x04cf:
            X.6AT r0 = r7.A06
            java.lang.Integer r8 = r0.A00(r3)
            X.1Vk r9 = r7.A05
            r0 = 0
            X.1AL[] r0 = new X.AnonymousClass1AL[r0]
            java.lang.Object[] r1 = r4.toArray(r0)
            X.1AL[] r1 = (X.AnonymousClass1AL[]) r1
            java.lang.String r0 = "account"
            X.9nx r11 = new X.9nx
            r11.<init>(r0, r1)
            X.0wG r0 = r7.A01
            android.content.Context r2 = r0.A00
            X.17Y r3 = r7.A00
            X.1Vu r4 = r7.A04
            X.5Fj r1 = new X.5Fj
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r12 = "get"
            r10 = r1
            r9.A0H(r10, r11, r12, r13)
            return
        L_0x04fd:
            java.lang.Object r2 = r1.A00
            X.AAr r2 = (X.C21157AAr) r2
            java.lang.Object r0 = r1.A01
            X.9ua r0 = (X.C207119ua) r0
            java.lang.Object r4 = r1.A02
            X.9tD r4 = (X.C206349tD) r4
            java.lang.String r3 = r1.A03
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r2 = r2.A04
            X.16X r1 = r0.A02
            java.lang.String r0 = "p2m_context"
            com.whatsapp.payments.ui.BrazilPaymentActivity.A17(r1, r2, r4, r0, r3)
            return
        L_0x0515:
            java.lang.Object r0 = r1.A00
            X.9KX r0 = (X.AnonymousClass9KX) r0
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r5 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r5
            java.lang.String r2 = r1.A03
            java.lang.Object r4 = r1.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            X.8gi r0 = (X.C178548gi) r0
            java.util.List r1 = r0.A01
            if (r1 == 0) goto L_0x0536
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0536
            X.1Ed r0 = r5.A08
            if (r0 == 0) goto L_0x055b
            r0.A0e(r1)
        L_0x0536:
            X.9UZ r0 = r5.A3k()
            X.1Ed r0 = r0.A01
            X.9lY r3 = r0.A0K(r2)
            X.0xM r0 = r5.A05
            if (r0 == 0) goto L_0x0554
            r0.A0k(r4)
            X.17Y r2 = r5.A05
            r1 = 29
            X.736 r0 = new X.736
            r0.<init>(r5, r4, r3, r1)
            r2.A0H(r0)
            return
        L_0x0554:
            java.lang.String r0 = "coreMessageStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x055b:
            java.lang.String r0 = "paymentTransactionStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0562:
            java.lang.Object r0 = r1.A00
            X.5wT r0 = (X.C123425wT) r0
            java.lang.String r5 = r1.A03
            java.lang.Object r3 = r1.A01
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r1 = r1.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            X.5wU r0 = r0.A02
            X.00T r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.6CW r0 = (X.AnonymousClass6CW) r0
            r4 = 0
            r2 = r1
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x0580:
            java.lang.Object r7 = r1.A00
            X.5x8 r7 = (X.C123815x8) r7
            java.lang.Object r6 = r1.A01
            X.3dK r6 = (X.C69313dK) r6
            java.lang.String r5 = r1.A03
            java.lang.Object r4 = r1.A02
            X.4Te r4 = (X.C88564Te) r4
            r3 = 0
            X.66O r2 = r7.A04
            X.AnonymousClass00C.A08(r2)
            X.60z r1 = r7.A03
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.shops.graphql.ShopMetaDataProcessor"
            X.AnonymousClass00C.A0E(r1, r0)
            int r0 = r7.A00
            if (r0 != 0) goto L_0x05b0
            java.lang.Object r1 = r1.A00
            X.3XW r1 = (X.AnonymousClass3XW) r1
            if (r1 == 0) goto L_0x05b0
            r1.A00 = r5
            r4.BXk(r1)
            X.00v r0 = r6.A01
            r0.A08(r5, r1)
            return
        L_0x05b0:
            java.util.Map r0 = r2.A00
            r6.A00(r4, r5, r0, r3)
            return
        L_0x05b6:
            java.lang.Object r2 = r1.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r7 = r1.A01
            X.3dK r7 = (X.C69313dK) r7
            java.lang.String r6 = r1.A03
            java.lang.Object r5 = r1.A02
            X.4Te r5 = (X.C88564Te) r5
            r4 = 1
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to fetch metadata: "
            r1.append(r0)
            java.lang.String r0 = r2.getLocalizedMessage()
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.Integer r1 = X.C90494aF.A0U()
            X.6Sy r0 = new X.6Sy
            r0.<init>((java.lang.String) r2)
            r3.put(r1, r0)
            r7.A00(r5, r6, r3, r4)
            return
        L_0x05ed:
            java.lang.Object r0 = r1.A00
            X.71C r0 = (X.AnonymousClass71C) r0
            java.lang.Object r4 = r1.A01
            X.33w r4 = (X.C594233w) r4
            java.lang.String r3 = r1.A03
            java.lang.Object r2 = r1.A02
            java.util.Map r2 = (java.util.Map) r2
            X.61i r1 = r0.A01
            java.lang.String r0 = "address_message_validate"
            X.6C8 r0 = r1.A00(r4, r0)
            r0.A02(r3, r2)
            return
        L_0x0607:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "skipped buildRenderersCompleted because of non-matching request"
            X.C204369pt.A0F(r2, r0, r1)
            return
        L_0x060f:
            java.lang.String r0 = "wapay"
            boolean r0 = r0.equals(r3)     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            if (r0 == 0) goto L_0x063d
            java.lang.String r1 = r6.getLastPathSegment()     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            r0 = 2131892186(0x7f1217da, float:1.9419113E38)
        L_0x061e:
            android.util.Pair r3 = X.C36341k9.A0I(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            java.lang.Object r0 = r3.first     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            r2.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            r2 = 0
            r5.A00 = r2     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            r4.invalidate()     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            X.17Y r1 = r5.A07     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            int r0 = X.C36381kD.A03(r3)     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            r1.A06(r0, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            goto L_0x0656
        L_0x063d:
            java.lang.String r0 = "tel"
            boolean r0 = r0.equals(r3)     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            if (r0 == 0) goto L_0x0650
            java.lang.String r1 = r6.getSchemeSpecificPart()     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            r0 = 2131892999(0x7f121b07, float:1.9420762E38)
            r5.A01()     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            goto L_0x061e
        L_0x0650:
            java.lang.String r1 = r5.A0A     // Catch:{ NullPointerException | SecurityException -> 0x0657 }
            r0 = 2131890701(0x7f12120d, float:1.9416101E38)
            goto L_0x061e
        L_0x0656:
            return
        L_0x0657:
            r1 = move-exception
            java.lang.String r0 = "linktouchablespan/copy/"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x065e:
            java.lang.String r0 = "coreMessageStoreWrapper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0665:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x066c:
            java.lang.String r0 = "systemMessageFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0673:
            java.lang.String r0 = "inviteContactUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x067a:
            boolean r0 = r4 instanceof X.AnonymousClass5OM
            if (r0 == 0) goto L_0x068c
            java.lang.String r0 = "Extensions bloks layout was not loaded"
        L_0x0680:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            r2.A00(r0)
            r0 = 4
            r4.A01(r0)
            return
        L_0x068c:
            java.lang.String r0 = "Commerce bloks layout was not loaded"
            goto L_0x0680
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503574y.run():void");
    }

    public C1503574y(C194999Sb r2, AnonymousClass918 r3, C135066c4 r4, String str) {
        this.A04 = 7;
        this.A00 = r2;
        this.A03 = str;
        this.A01 = r3;
        this.A02 = r4;
    }

    public C1503574y(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj3;
    }
}
