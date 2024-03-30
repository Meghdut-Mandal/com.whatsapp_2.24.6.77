package X;

import android.view.View;

/* renamed from: X.2i6  reason: invalid class name and case insensitive filesystem */
public class C48812i6 extends C33541fX {
    public Object A00;
    public Object A01;
    public final int A02;

    public C48812i6(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C48812i6(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: com.whatsapp.calling.spam.CallSpamActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0312, code lost:
        if (r0 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0314, code lost:
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0317, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0325, code lost:
        X.C36341k9.A17(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0328, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0365, code lost:
        r5.A06(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0368, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x036f, code lost:
        if (r2.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0371, code lost:
        r4.A0h.A02(r4.A0k, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0378, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x066f, code lost:
        r1.A0M = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0671, code lost:
        if (r0 == false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0673, code lost:
        r0 = "call_spam_dialog_report";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0675, code lost:
        r1.A0K = r0;
        r1.A17((android.os.Bundle) r11.A01);
        X.C36331k8.A12(r1, (X.AnonymousClass01I) r11.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0685, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0686, code lost:
        r0 = "call_spam_dialog_block";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x07fb, code lost:
        X.C36341k9.A16(r0.A03, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0800, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02a1, code lost:
        r3.Btl(X.C54242sd.A00(r2, r1, X.C51282nZ.A03), "EVENT_INFO_BOTTOM_SHEET");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02ac, code lost:
        return;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A02
            switch(r0) {
                case 0: goto L_0x0834;
                case 1: goto L_0x081a;
                case 2: goto L_0x0812;
                case 3: goto L_0x0801;
                case 4: goto L_0x07f5;
                case 5: goto L_0x07ee;
                case 6: goto L_0x07b0;
                case 7: goto L_0x0781;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0329;
                case 11: goto L_0x076e;
                case 12: goto L_0x074e;
                case 13: goto L_0x0746;
                case 14: goto L_0x0716;
                case 15: goto L_0x0701;
                case 16: goto L_0x0170;
                case 17: goto L_0x0318;
                case 18: goto L_0x06d8;
                case 19: goto L_0x0133;
                case 20: goto L_0x02fd;
                case 21: goto L_0x02e9;
                case 22: goto L_0x06b7;
                case 23: goto L_0x0689;
                case 24: goto L_0x0669;
                case 25: goto L_0x00d2;
                case 26: goto L_0x0662;
                case 27: goto L_0x02c9;
                case 28: goto L_0x0648;
                case 29: goto L_0x060a;
                case 30: goto L_0x05d7;
                case 31: goto L_0x05bc;
                case 32: goto L_0x05b0;
                case 33: goto L_0x086c;
                case 34: goto L_0x00ad;
                case 35: goto L_0x057e;
                case 36: goto L_0x049f;
                case 37: goto L_0x047b;
                case 38: goto L_0x0475;
                case 39: goto L_0x02ad;
                case 40: goto L_0x0291;
                case 41: goto L_0x0281;
                case 42: goto L_0x043b;
                case 43: goto L_0x0433;
                case 44: goto L_0x03f2;
                case 45: goto L_0x03ce;
                case 46: goto L_0x0203;
                case 47: goto L_0x01b1;
                case 48: goto L_0x0398;
                case 49: goto L_0x0379;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r11.A00
            X.3dG r4 = (X.C69273dG) r4
            java.lang.Object r7 = r11.A01
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            boolean r0 = X.C197029b1.A00(r7)
            if (r0 == 0) goto L_0x0049
            X.0v5 r0 = r4.A0U
            java.lang.Object r1 = r0.A02()
            X.1HX r1 = (X.AnonymousClass1HX) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.005 r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.6BB r0 = (X.AnonymousClass6BB) r0
            X.6E1 r2 = r0.A00(r7)
            if (r2 == 0) goto L_0x0049
            X.2Qh r1 = new X.2Qh
            r1.<init>()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            java.lang.String r0 = r2.A08
            r1.A04 = r0
            java.lang.Integer r0 = X.C36371kC.A0p()
            r1.A02 = r0
            X.0yW r0 = r4.A0x
            r0.Bly(r1)
        L_0x0049:
            r0 = 9
            X.C69273dG.A02(r4, r0)
            r6 = 1
            X.C69273dG.A03(r4, r6)
            X.141 r0 = r4.A0J
            if (r0 == 0) goto L_0x0069
            boolean r0 = X.C69273dG.A09(r4)
            if (r0 == 0) goto L_0x0069
            X.1KI r3 = r4.A1A
            r2 = 8
            X.141 r0 = r4.A0J
            int r1 = r0.A00
            java.lang.Integer r0 = r3.A00
            r3.A00(r0, r2, r1)
        L_0x0069:
            com.whatsapp.chatinfo.ContactInfoActivity r5 = r4.A0k
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass190.A0F(r5, r0)
            java.lang.String r1 = r7.getRawString()
            java.lang.String r0 = "jid"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            android.content.Intent r3 = r1.putExtra(r0, r6)
            java.lang.Integer r0 = r4.A1D
            if (r0 == 0) goto L_0x00aa
            int r1 = r0.intValue()
            r0 = 19
            if (r1 == r0) goto L_0x00a7
            r0 = 20
            if (r1 != r0) goto L_0x00aa
            java.lang.String r1 = "custom_qr_code_link"
        L_0x0092:
            java.lang.String r0 = "entry_point_conversion_source"
            android.content.Intent r2 = r3.putExtra(r0, r1)
            java.lang.String r1 = "entry_point_conversion_app"
            java.lang.String r0 = "whatsapp"
            r2.putExtra(r1, r0)
            X.1Dv r1 = r4.A0V
            java.lang.String r0 = "ContactInfoActivity"
            r1.A08(r5, r3, r0)
        L_0x00a6:
            return
        L_0x00a7:
            java.lang.String r1 = "custom_link"
            goto L_0x0092
        L_0x00aa:
            java.lang.String r1 = "biz_profile"
            goto L_0x0092
        L_0x00ad:
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            java.lang.Object r0 = r11.A01
            X.1pi r0 = (X.C38751pi) r0
            X.1Dv r5 = r0.getActivityUtils$app_product_community_community_non_modified()
            android.content.Context r2 = r12.getContext()
            java.lang.Object r1 = r11.A00
            android.content.Context r1 = (android.content.Context) r1
            X.147 r0 = r0.A02
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "parentJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00cc:
            android.content.Intent r0 = X.AnonymousClass190.A0c(r1, r0)
            goto L_0x0365
        L_0x00d2:
            java.lang.Object r4 = r11.A00
            com.whatsapp.calling.spam.CallSpamActivity r4 = (com.whatsapp.calling.spam.CallSpamActivity) r4
            X.1C6 r1 = r4.A02
            java.lang.Object r6 = r11.A01
            X.11F r6 = (X.AnonymousClass11F) r6
            r0 = 1
            boolean r0 = r1.A08(r6, r0)
            if (r0 != 0) goto L_0x0314
            X.1C6 r5 = r4.A02
            java.util.ArrayList r0 = X.AnonymousClass1C6.A01(r5)
            if (r0 != 0) goto L_0x012e
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
        L_0x00ef:
            boolean r0 = r3.contains(r6)
            r2 = 0
            if (r0 != 0) goto L_0x0124
            int r0 = r3.size()
            int r1 = r0 + 1
            r0 = 50
            if (r1 <= r0) goto L_0x0103
            r3.remove(r2)
        L_0x0103:
            r3.add(r6)
            java.lang.String r0 = ","
            java.lang.String r2 = android.text.TextUtils.join(r0, r3)
            X.12i r1 = r5.A00
            java.lang.String r0 = "call_not_spam_jids"
            r1.A04(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "spamManager/setCallNotSpamProp/true: "
            r1.append(r0)
            r1.append(r2)
        L_0x011f:
            X.C36411kG.A1P(r1)
            goto L_0x0314
        L_0x0124:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "spamManager/setCallNotSpamProp/false/already contains jid in size: "
            X.C36341k9.A1N(r0, r1, r3)
            goto L_0x011f
        L_0x012e:
            java.util.ArrayList r3 = X.C36441kJ.A15(r0)
            goto L_0x00ef
        L_0x0133:
            java.lang.Object r1 = r11.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r1 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r1
            X.6pD r4 = r1.A0M
            java.lang.Object r3 = r11.A01
            X.544 r3 = (X.AnonymousClass544) r3
            boolean r2 = r3.A01
            X.6Eo r0 = r1.A0O
            java.lang.Integer r5 = r0.A03()
            r0 = 2
            if (r2 == 0) goto L_0x0149
            r0 = 3
        L_0x0149:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r8 = 1
            r9 = 16
            r10 = 1
            r4.A08(r5, r6, r7, r8, r9, r10)
            r1.A02 = r3
            r1.A00 = r8
            X.6PX r0 = r1.A0S
            java.lang.String r5 = r3.A01
            java.lang.String r6 = r3.A00
            java.lang.String r7 = r3.A00
            long r3 = java.lang.System.currentTimeMillis()
            X.6cC r2 = new X.6cC
            r2.<init>(r3, r5, r6, r7)
            r0.A02(r2)
            X.1Rs r1 = r1.A0d
            goto L_0x01ae
        L_0x0170:
            java.lang.Object r0 = r11.A01
            X.2Xk r0 = (X.C46432Xk) r0
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r5 = r0.A01
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0182
            r0 = 2
            if (r2 != r0) goto L_0x06f2
            X.1Rs r1 = r5.A07
            r0 = 4
            goto L_0x0325
        L_0x0182:
            X.6pA r4 = r5.A01
            X.6Eo r3 = r5.A03
            java.lang.Integer r2 = r3.A03()
            X.593 r1 = new X.593
            r1.<init>()
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0C = r0
            r1.A09 = r2
            X.C142616pA.A01(r4, r1)
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x01ac
            X.5DR r1 = r5.A02
            r0 = 1
            r1.A02(r0)
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel.A01(r5)
            return
        L_0x01ac:
            X.1Rs r1 = r5.A07
        L_0x01ae:
            r0 = 0
            goto L_0x0325
        L_0x01b1:
            boolean r0 = r12 instanceof X.AnonymousClass2IS
            if (r0 == 0) goto L_0x00a6
            X.2IS r12 = (X.AnonymousClass2IS) r12
            X.3T1 r5 = r12.getFMessage()
            if (r5 == 0) goto L_0x0200
            long r3 = r5.A1N
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0200
            long r3 = r5.A1N
        L_0x01c7:
            long r1 = X.C66013Ui.A02(r5)
            X.190 r0 = new X.190
            r0.<init>()
            java.lang.Object r7 = r11.A01
            android.content.Context r7 = (android.content.Context) r7
            X.3Qa r8 = r5.A1J
            X.11F r5 = r8.A00
            r0 = 0
            android.content.Intent r6 = X.C36361kB.A08(r7, r5, r0)
            java.lang.String r5 = "primary_container_class"
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity"
            r6.putExtra(r5, r0)
            java.lang.String r5 = "secondary_container_class"
            java.lang.String r0 = "com.whatsapp.Conversation"
            r6.putExtra(r5, r0)
            java.lang.String r0 = "row_id"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "sort_id"
            r6.putExtra(r0, r1)
            X.AnonymousClass3UJ.A00(r6, r8)
            java.lang.Object r0 = r11.A00
            X.1Dv r0 = (X.C24801Dv) r0
            r0.A07(r7, r6)
            return
        L_0x0200:
            r3 = 1
            goto L_0x01c7
        L_0x0203:
            java.lang.Object r7 = r11.A00
            X.8Yv r7 = (X.C174888Yv) r7
            java.lang.Object r1 = r11.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<X.14u> r0 = X.C225314u.class
            android.app.Activity r6 = X.C18860tw.A01(r1, r0)
            X.14u r6 = (X.C225314u) r6
            X.3T1 r5 = r7.A0K
            X.2bw r5 = (X.C46952bw) r5
            if (r6 == 0) goto L_0x00a6
            com.whatsapp.jid.UserJid r0 = r5.A04
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r5.A09
            if (r0 == 0) goto L_0x00a6
            X.9Y1 r1 = r7.A0e
            r0 = 8
            r1.A01(r0)
            X.9gL r4 = r7.A03
            java.lang.String r3 = "received_cart"
            java.lang.String r2 = "from_cart"
            r0 = 1
            X.2Pf r1 = new X.2Pf
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r1.A01 = r3
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x0248
            r1.A02 = r2
        L_0x0248:
            X.0yW r0 = r4.A01
            r0.Bly(r1)
            X.1EV r0 = r7.A01
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0895
            X.3Qa r2 = r5.A1J
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0895
            X.39O r1 = r7.A02
            com.whatsapp.jid.UserJid r0 = r5.A04
            X.C18740tg.A06(r0)
            X.11F r0 = r2.A00
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)
            X.C18740tg.A06(r0)
            java.lang.String r0 = r5.A07
            X.C18740tg.A06(r0)
            java.lang.String r0 = r5.A09
            X.C18740tg.A06(r0)
            X.0v5 r0 = r1.A00
            r0.A02()
            java.lang.String r0 = "getCreateOrderActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0281:
            java.lang.Object r0 = r11.A01
            X.2IR r0 = (X.AnonymousClass2IR) r0
            X.17Y r0 = r0.A0R
            X.14r r3 = r0.A00
            if (r3 == 0) goto L_0x00a6
            java.lang.Object r2 = r11.A00
            X.2bT r2 = (X.AnonymousClass2bT) r2
            r1 = 0
            goto L_0x02a1
        L_0x0291:
            java.lang.Object r0 = r11.A01
            X.2IR r0 = (X.AnonymousClass2IR) r0
            X.17Y r0 = r0.A0R
            X.14r r3 = r0.A00
            if (r3 == 0) goto L_0x00a6
            java.lang.Object r2 = r11.A00
            X.2bT r2 = (X.AnonymousClass2bT) r2
            X.2o0 r1 = X.C51552o0.EDIT
        L_0x02a1:
            X.2nZ r0 = X.C51282nZ.NONE
            com.whatsapp.events.EventInfoBottomSheet r1 = X.C54242sd.A00(r2, r1, r0)
            java.lang.String r0 = "EVENT_INFO_BOTTOM_SHEET"
            r3.Btl(r1, r0)
            return
        L_0x02ad:
            java.lang.Object r0 = r11.A00
            X.2bT r0 = (X.AnonymousClass2bT) r0
            java.lang.String r2 = r0.A04
            if (r2 == 0) goto L_0x00a6
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r11.A01
            X.2IR r0 = (X.AnonymousClass2IR) r0
            X.1e2 r1 = r0.A0S
            android.content.Context r0 = X.C36371kC.A0B(r0)
            X.C36331k8.A0t(r0, r1, r2)
            return
        L_0x02c9:
            com.whatsapp.jid.UserJid r2 = com.whatsapp.voipcalling.Voip.getPeerJid()
            if (r2 == 0) goto L_0x00a6
            X.190 r1 = X.C36441kJ.A0j()
            java.lang.Object r3 = r11.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Boolean r0 = X.C36381kD.A0j()
            android.content.Intent r2 = r1.A1b(r3, r2, r0)
            r1 = 7
            java.lang.String r0 = "lobbyEntryPoint"
            r2.putExtra(r0, r1)
            r3.startActivity(r2)
            return
        L_0x02e9:
            java.lang.Object r0 = r11.A00
            X.1wT r0 = (X.C41011wT) r0
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r4 = r0.A01
            X.1ND r3 = r4.A03
            java.lang.Object r2 = r11.A01
            X.141 r2 = (X.AnonymousClass141) r2
            r1 = 20
            r0 = 1
            int r0 = r3.Bua(r4, r2, r1, r0)
            goto L_0x0312
        L_0x02fd:
            java.lang.Object r0 = r11.A00
            X.1wT r0 = (X.C41011wT) r0
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r4 = r0.A01
            X.1ND r3 = r4.A03
            java.lang.Object r2 = r11.A01
            X.141 r2 = (X.AnonymousClass141) r2
            r1 = 20
            X.1NE r3 = (X.AnonymousClass1NE) r3
            r0 = 0
            int r0 = r3.Bua(r4, r2, r1, r0)
        L_0x0312:
            if (r0 != 0) goto L_0x00a6
        L_0x0314:
            r4.finish()
            return
        L_0x0318:
            java.lang.Object r0 = r11.A01
            X.2Xk r0 = (X.C46432Xk) r0
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r1 = r0.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x00a6
            X.1Rs r1 = r1.A07
            r0 = 3
        L_0x0325:
            X.C36341k9.A17(r1, r0)
            return
        L_0x0329:
            java.lang.Object r4 = r11.A00
            X.3dG r4 = (X.C69273dG) r4
            java.lang.Object r3 = r11.A01
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            r0 = 13
            X.C69273dG.A02(r4, r0)
            X.3Km r1 = r4.A0d
            X.9uZ r0 = r4.A0I
            java.lang.String r2 = r1.A00(r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -839883634: goto L_0x0346;
                case 181990675: goto L_0x0349;
                case 476614193: goto L_0x0369;
                default: goto L_0x0345;
            }
        L_0x0345:
            return
        L_0x0346:
            java.lang.String r0 = "PERMANENT"
            goto L_0x036b
        L_0x0349:
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a6
            r0 = 4
            X.C69273dG.A03(r4, r0)
            X.9R0 r0 = r4.A15
            r0.A00()
            X.1Dv r5 = r4.A0V
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r4.A0k
            r1 = 0
            r0 = 9
            android.content.Intent r0 = X.AnonymousClass190.A0m(r2, r3, r1, r0)
        L_0x0365:
            r5.A06(r2, r0)
            return
        L_0x0369:
            java.lang.String r0 = "TEMPORARY"
        L_0x036b:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a6
            X.9fJ r1 = r4.A0h
            com.whatsapp.chatinfo.ContactInfoActivity r0 = r4.A0k
            r1.A02(r0, r2)
            return
        L_0x0379:
            java.lang.Object r1 = r11.A00
            X.3fk r1 = (X.C70803fk) r1
            X.0xE r4 = r1.A2E
            X.155 r3 = X.C70803fk.A0B(r1)
            java.lang.Object r0 = r11.A01
            X.3HD r0 = (X.AnonymousClass3HD) r0
            X.147 r2 = r0.A07
            X.155 r1 = X.C70803fk.A0B(r1)
            r0 = 2131430365(0x7f0b0bdd, float:1.8482429E38)
            android.view.View r0 = X.C03570Gk.A0B(r1, r0)
            r4.Bkv(r3, r0, r2)
            return
        L_0x0398:
            java.lang.Object r3 = r11.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r3 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment) r3
            java.lang.Object r0 = r11.A01
            com.whatsapp.StarRatingBar r0 = (com.whatsapp.StarRatingBar) r0
            int r0 = r0.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r5 = r3.A02
            X.11F r6 = r3.A03
            java.lang.String r9 = r3.A04
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            X.9su r8 = r3.A01
            X.0wU r0 = r5.A06
            r10 = 3
            X.74q r4 = new X.74q
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.Boy(r4)
            X.00s r0 = r5.A01
            r0.A0D(r7)
            r0 = 1
            r5.A00 = r0
            X.17Y r2 = r3.A00
            r1 = 2131891042(0x7f121362, float:1.9416793E38)
            r0 = 0
            r2.A06(r1, r0)
            r3.A1b()
            return
        L_0x03ce:
            java.lang.Object r3 = r11.A00
            X.2IR r3 = (X.AnonymousClass2IR) r3
            X.0wU r2 = r3.A21
            java.lang.Object r1 = r11.A01
            X.2bs r1 = (X.C46912bs) r1
            r0 = 48
            X.C80273v8.A00(r2, r11, r1, r0)
            X.2XH r2 = r3.A0I
            X.C18740tg.A06(r2)
            android.content.Context r3 = r3.getContext()
            double r6 = r1.A00
            double r8 = r1.A01
            java.lang.String r4 = r1.A01
            java.lang.String r5 = r1.A00
            r2.A08(r3, r4, r5, r6, r8)
            return
        L_0x03f2:
            java.lang.Object r0 = r11.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r2 = r0.A1J
            X.11F r5 = r2.A00
            X.C18740tg.A06(r5)
            boolean r1 = r2.A02
            java.lang.Object r0 = r11.A00
            X.2IS r0 = (X.AnonymousClass2IS) r0
            if (r1 == 0) goto L_0x0422
            android.app.Activity r4 = X.C36361kB.A06(r0)
            X.14u r4 = (X.C225314u) r4
            java.lang.String r3 = r2.A01
            com.whatsapp.location.StopLiveLocationDialogFragment r2 = new com.whatsapp.location.StopLiveLocationDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C36331k8.A07(r5)
            java.lang.String r0 = "id"
            r1.putString(r0, r3)
            r2.A17(r1)
            r4.Btm(r2)
            return
        L_0x0422:
            X.2XH r2 = r0.A0I
            X.C18740tg.A06(r2)
            android.content.Context r1 = r0.getContext()
            X.C18740tg.A06(r5)
            r0 = 0
            r2.A07(r1, r5, r0)
            return
        L_0x0433:
            java.lang.Object r0 = r11.A00
            X.3Rw r0 = (X.C65393Rw) r0
            X.C65393Rw.A01(r0)
            return
        L_0x043b:
            java.lang.Object r6 = r11.A00
            android.view.View r6 = (android.view.View) r6
            android.content.Context r1 = r6.getContext()
            java.lang.Object r0 = r11.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r0 = r0.A1J
            java.lang.String r5 = r0.A01
            X.11F r4 = r0.A00
            boolean r3 = r0.A02
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.invites.ViewGroupInviteActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "key_id"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x046c
            java.lang.String r1 = "key_remote_jid"
            java.lang.String r0 = r4.getRawString()
            r2.putExtra(r1, r0)
        L_0x046c:
            java.lang.String r0 = "from_me"
            r2.putExtra(r0, r3)
            X.C36371kC.A16(r2, r6)
            return
        L_0x0475:
            java.lang.Object r0 = r11.A01
            X.C36411kG.A1O(r0)
            return
        L_0x047b:
            java.lang.Object r0 = r11.A00
            X.2Gc r0 = (X.AnonymousClass2Gc) r0
            com.whatsapp.contact.picker.ContactPickerFragment r3 = r0.A05
            java.lang.Object r0 = r11.A01
            X.3ek r0 = (X.C70193ek) r0
            java.lang.String r1 = r0.A00
            android.content.Intent r2 = X.C36431kI.A0B()
            java.lang.String r0 = "android.intent.extra.TEXT"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            java.lang.String r0 = "text/plain"
            r1.setType(r0)
            r0 = 0
            android.content.Intent r0 = android.content.Intent.createChooser(r2, r0)
            r3.A1C(r0)
            return
        L_0x049f:
            java.lang.String r5 = "RegisterAsCompanionEnterNumberActivity/failed to parse phone number"
            java.lang.Object r9 = r11.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r9 = (com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity) r9
            X.3AK r0 = r9.A03
            java.lang.String r10 = "phoneNumberEntryViewHolder"
            if (r0 != 0) goto L_0x04b0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x04b0:
            android.widget.EditText r0 = r0.A02
            java.lang.String r8 = X.C36361kB.A0n(r0)
            int r7 = r8.length()
            r3 = 1
            int r7 = r7 - r3
            r6 = 0
            r4 = 0
            r2 = 0
        L_0x04bf:
            if (r4 > r7) goto L_0x04e1
            r0 = r7
            if (r2 != 0) goto L_0x04c5
            r0 = r4
        L_0x04c5:
            char r1 = r8.charAt(r0)
            r0 = 32
            int r1 = X.AnonymousClass00C.A00(r1, r0)
            r0 = 0
            if (r1 > 0) goto L_0x04d3
            r0 = 1
        L_0x04d3:
            if (r2 != 0) goto L_0x04dc
            if (r0 != 0) goto L_0x04d9
            r2 = 1
            goto L_0x04bf
        L_0x04d9:
            int r4 = r4 + 1
            goto L_0x04bf
        L_0x04dc:
            if (r0 == 0) goto L_0x04e1
            int r7 = r7 + -1
            goto L_0x04bf
        L_0x04e1:
            int r0 = r7 + 1
            java.lang.CharSequence r0 = r8.subSequence(r4, r0)
            java.lang.String r8 = r0.toString()
            X.3AK r0 = r9.A03
            if (r0 != 0) goto L_0x04f4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x04f4:
            android.widget.EditText r0 = r0.A03
            java.lang.String r1 = X.C36361kB.A0n(r0)
            java.lang.String r0 = "\\D"
            java.lang.String r2 = X.C36411kG.A0y(r1, r0)
            X.1N4 r0 = r9.A00
            if (r0 == 0) goto L_0x0577
            int r0 = X.AnonymousClass3U2.A00(r0, r8, r2)
            if (r0 == r3) goto L_0x0512
            java.lang.Object r0 = r11.A00
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            r0.A03(r6)
            return
        L_0x0512:
            java.lang.Object r4 = r11.A00
            X.1RJ r4 = (X.AnonymousClass1RJ) r4
            r0 = 8
            r4.A03(r0)
            X.1N4 r1 = r9.A00     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            if (r1 == 0) goto L_0x0563
            int r0 = java.lang.Integer.parseInt(r8)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            java.lang.String r7 = r1.A03(r0, r2)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            X.AnonymousClass00C.A08(r7)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r8, r7)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            java.lang.String r0 = "@s.whatsapp.net"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            com.whatsapp.jid.UserJid r3 = X.C222813r.A01(r0)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            X.0wU r2 = r9.A04     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            r1 = 46
            X.3v7 r0 = new X.3v7     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            r0.<init>(r9, r3, r1)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            r2.Bp1(r0)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            X.04e r3 = r9.A08     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            android.content.Intent r2 = X.C36431kI.A0D()     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            java.lang.String r1 = r9.getPackageName()     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            java.lang.String r0 = "com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity"
            r2.setClassName(r1, r0)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            java.lang.String r0 = "country_code"
            r2.putExtra(r0, r8)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            java.lang.String r0 = "phone_number"
            r2.putExtra(r0, r7)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            r3.A02(r2)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            return
        L_0x0563:
            java.lang.String r0 = "countryPhoneInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
            throw r0     // Catch:{ 0wR -> 0x056f, IOException -> 0x056a }
        L_0x056a:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
            return
        L_0x056f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
            r4.A03(r6)
            return
        L_0x0577:
            java.lang.String r0 = "countryPhoneInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x057e:
            java.lang.Object r0 = r11.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            android.content.Context r1 = r0.getContext()
            java.lang.Object r0 = r11.A00
            X.3Ja r0 = (X.C63173Ja) r0
            X.147 r3 = r0.A00
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.event.EventsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "chat_jid"
            r2.putExtra(r0, r1)
            r1 = 1
            java.lang.String r0 = "source"
            r2.putExtra(r0, r1)
            r4.startActivity(r2)
            return
        L_0x05b0:
            java.lang.Object r0 = r11.A01
            X.3Hz r0 = (X.C62903Hz) r0
            X.02t r1 = r0.A01
            X.3T1 r0 = r0.A00
            r1.invoke(r0)
            return
        L_0x05bc:
            java.lang.Object r0 = r11.A00
            X.1xX r0 = (X.C41641xX) r0
            X.1Sq r3 = r0.A00
            android.content.Context r1 = r12.getContext()
            java.lang.Class<X.01L> r0 = X.AnonymousClass01L.class
            android.app.Activity r2 = X.C24801Dv.A01(r1, r0)
            X.01L r2 = (X.AnonymousClass01L) r2
            java.lang.Object r1 = r11.A01
            X.147 r1 = (X.AnonymousClass147) r1
            r0 = 0
            r3.A02(r2, r1, r0)
            return
        L_0x05d7:
            java.lang.Object r3 = r11.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.2EI r2 = r3.A0h
            X.9uI r1 = r3.A0S
            r0 = 1
            r2.A0V(r1, r0)
            android.content.Context r1 = r3.getApplicationContext()
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass190.A0F(r1, r0)
            java.lang.Object r0 = r11.A01
            X.3Ni r0 = (X.C64273Ni) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "jid"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r2 = r1.addFlags(r0)
            X.1Dv r1 = r3.A01
            java.lang.String r0 = "ContactInfoActivity"
            r1.A08(r3, r2, r0)
            return
        L_0x060a:
            java.lang.Object r4 = r11.A01
            X.3PA r4 = (X.AnonymousClass3PA) r4
            X.12q r0 = r4.A09
            X.11F r5 = r4.A0A
            X.3Qp r0 = X.C36371kC.A0W(r0, r5)
            r1 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0633
            boolean r0 = r0.A0j
            if (r0 != r1) goto L_0x0633
            X.005 r0 = r4.A0B
            X.18z r3 = X.C36411kG.A0a(r0)
            java.lang.Object r2 = r11.A00
            X.155 r2 = (X.AnonymousClass155) r2
            X.2EK r1 = new X.2EK
            r1.<init>(r5)
            X.3MH r0 = r4.A05
            r3.A0A(r2, r1, r0, r6)
            return
        L_0x0633:
            X.005 r0 = r4.A0B
            X.18z r1 = X.C36411kG.A0a(r0)
            java.lang.Object r2 = r11.A00
            X.155 r2 = (X.AnonymousClass155) r2
            X.2EM r3 = new X.2EM
            r3.<init>(r5)
            X.3MH r4 = r4.A06
            r1.A0C(r2, r3, r4, r5, r6)
            return
        L_0x0648:
            java.lang.Object r2 = r11.A01
            X.6YT r2 = (X.AnonymousClass6YT) r2
            X.6Dz r0 = r2.A0g
            java.util.Set r1 = r0.A09
            int r0 = r1.size()
            if (r0 != 0) goto L_0x065d
            X.6WU r1 = r2.A0E
            r0 = 0
            r1.A05(r0, r0)
            return
        L_0x065d:
            r0 = 0
            X.AnonymousClass6YT.A0H(r2, r0, r1)
            return
        L_0x0662:
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r1 = new com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment
            r1.<init>()
            r0 = 0
            goto L_0x066f
        L_0x0669:
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r1 = new com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment
            r1.<init>()
            r0 = 1
        L_0x066f:
            r1.A0M = r0
            if (r0 == 0) goto L_0x0686
            java.lang.String r0 = "call_spam_dialog_report"
        L_0x0675:
            r1.A0K = r0
            java.lang.Object r0 = r11.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.A17(r0)
            java.lang.Object r0 = r11.A00
            X.01I r0 = (X.AnonymousClass01I) r0
            X.C36331k8.A12(r1, r0)
            return
        L_0x0686:
            java.lang.String r0 = "call_spam_dialog_block"
            goto L_0x0675
        L_0x0689:
            java.lang.Object r0 = r11.A01
            X.2DY r0 = (X.AnonymousClass2DY) r0
            X.4Nk r3 = r0.A00
            java.lang.Object r1 = r11.A00
            X.3e1 r1 = (X.C69743e1) r1
            X.00T r0 = r0.A03
            android.view.View r2 = X.C36401kF.A0F(r0)
            X.AnonymousClass00C.A08(r2)
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r3 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r3
            X.190 r0 = r3.A04
            if (r0 == 0) goto L_0x06b2
            X.3Jh r0 = r1.A01
            X.11F r1 = r0.A03
            java.lang.Integer r0 = X.C36381kD.A0n()
            X.3Pd r0 = X.C64713Pd.A00(r2, r1, r0)
            r0.A02(r3)
            return
        L_0x06b2:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x06b7:
            java.lang.Object r3 = r11.A01
            X.4o1 r3 = (X.C96864o1) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1de r2 = r3.A00
            if (r2 != 0) goto L_0x06c7
            java.lang.String r0 = "CallsHistoryContactItemViewHolder/onContactPhotoClicked event listener is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x06c7:
            java.lang.Object r1 = r11.A00
            X.3dw r1 = (X.C69693dw) r1
            X.00T r0 = r3.A04
            android.view.View r0 = X.C36401kF.A0F(r0)
            X.AnonymousClass00C.A08(r0)
            r2.A00(r0, r1)
            return
        L_0x06d8:
            java.lang.Object r0 = r11.A01
            X.3Fp r0 = (X.C62293Fp) r0
            X.6qh r4 = r0.A00
            X.544 r3 = r0.A01
            java.lang.Class<X.6qh> r2 = X.C143526qh.class
            monitor-enter(r2)
            X.5yM r1 = r4.A06     // Catch:{ all -> 0x06ef }
            r0 = 2
            r1.A02 = r0     // Catch:{ all -> 0x06ef }
            r1.A04 = r3     // Catch:{ all -> 0x06ef }
            r4.A0A()     // Catch:{ all -> 0x06ef }
            monitor-exit(r2)     // Catch:{ all -> 0x06ef }
            return
        L_0x06ef:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x06ef }
            throw r0
        L_0x06f2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LocationOptionPickerViewModel/onLocationOptionClicked option not handled: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0701:
            java.lang.Object r2 = r11.A00
            X.5uh r2 = (X.C122345uh) r2
            X.5w7 r1 = r2.A01
            r0 = 3
            r1.A01 = r0
            java.lang.Object r0 = r11.A01
            X.6bw r0 = (X.C134986bw) r0
            r1.A03 = r0
            X.00s r0 = r2.A00
            r0.A0D(r1)
            return
        L_0x0716:
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            r1 = 0
            java.lang.Object r0 = r11.A00
            X.141 r0 = (X.AnonymousClass141) r0
            com.whatsapp.jid.Jid r0 = X.C36431kI.A0h(r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.3Pd r2 = new X.3Pd
            r2.<init>((android.view.View) r12, (X.AnonymousClass11F) r0, (java.lang.Integer) r1)
            java.lang.Object r1 = r11.A01
            X.3dZ r1 = (X.C69463dZ) r1
            android.widget.ImageView r0 = r1.A00
            java.lang.String r0 = X.C011004s.A03(r0)
            r2.A04 = r0
            X.00T r0 = r1.A01
            java.lang.Object r0 = X.C36381kD.A0p(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r0 = X.C24801Dv.A00(r0)
            r2.A02(r0)
            return
        L_0x0746:
            java.lang.Object r0 = r11.A01
            X.6YL r0 = (X.AnonymousClass6YL) r0
            r0.A0N()
            return
        L_0x074e:
            X.190 r2 = X.C36441kJ.A0j()
            android.content.Context r1 = r12.getContext()
            java.lang.Object r0 = r11.A01
            X.141 r0 = (X.AnonymousClass141) r0
            android.content.Intent r3 = r2.A1W(r1, r0)
            java.lang.Object r0 = r11.A00
            X.4zl r0 = (X.C102334zl) r0
            X.1Dv r2 = r0.A04
            android.content.Context r1 = r12.getContext()
            java.lang.String r0 = "CatalogListAdapterFooterViewHolder"
            r2.A08(r1, r3, r0)
            return
        L_0x076e:
            java.lang.Object r4 = r11.A01
            com.whatsapp.biz.cart.view.fragment.CartFragment r4 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r4
            X.7yb r3 = r4.A0P
            int r2 = r4.A00
            r1 = 1
            if (r2 == r1) goto L_0x077d
            r0 = 4
            if (r2 == r0) goto L_0x077d
            r1 = 0
        L_0x077d:
            r3.A0S(r4, r1)
            return
        L_0x0781:
            java.lang.Object r6 = r11.A00
            X.3dG r6 = (X.C69273dG) r6
            com.whatsapp.chatinfo.ContactInfoActivity r5 = r6.A0k
            java.lang.Object r0 = r11.A01
            X.141 r0 = (X.AnonymousClass141) r0
            X.11F r4 = r0.A0H
            java.lang.Integer r3 = r6.A1D
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.biz.BusinessProfileExtraFieldsActivity"
            r2.setClassName(r1, r0)
            X.C18740tg.A06(r4)
            X.C36371kC.A17(r2, r4)
            java.lang.String r0 = "profile_entry_point"
            r2.putExtra(r0, r3)
            r5.startActivity(r2)
            r0 = 8
            X.C69273dG.A02(r6, r0)
            return
        L_0x07b0:
            java.lang.Object r2 = r11.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            android.view.LayoutInflater r1 = X.C36381kD.A0J(r2)
            r0 = 2131624770(0x7f0e0342, float:1.887673E38)
            r4 = 0
            android.view.View r1 = r1.inflate(r0, r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131889123(0x7f120be3, float:1.94129E38)
            r1.setText(r0)
            X.1qm r3 = X.AnonymousClass3LW.A05(r2)
            androidx.appcompat.app.AlertDialog$Builder r0 = r3.A00
            r0.A0Y(r1)
            r0.A0Y(r1)
            r0 = 2131889122(0x7f120be2, float:1.9412899E38)
            r3.A0c(r0)
            r2 = 2131889124(0x7f120be4, float:1.9412903E38)
            java.lang.Object r1 = r11.A01
            r0 = 19
            X.C39001qm.A0I(r3, r1, r0, r2)
            r0 = 2131889121(0x7f120be1, float:1.9412897E38)
            r3.A0f(r4, r0)
            X.C36341k9.A11(r3)
            return
        L_0x07ee:
            java.lang.Object r0 = r11.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r0
            r1 = 202(0xca, float:2.83E-43)
            goto L_0x07fb
        L_0x07f5:
            java.lang.Object r0 = r11.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r0
            r1 = 300(0x12c, float:4.2E-43)
        L_0x07fb:
            X.00s r0 = r0.A03
            X.C36341k9.A16(r0, r1)
            return
        L_0x0801:
            java.lang.Object r3 = r11.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r3 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r3
            X.0wU r2 = r3.A0G
            r1 = 46
            X.72k r0 = new X.72k
            r0.<init>(r3, r1)
            r2.Boy(r0)
            return
        L_0x0812:
            java.lang.Object r0 = r11.A01
            com.whatsapp.phonematching.CountryAndPhoneNumberFragment r0 = (com.whatsapp.phonematching.CountryAndPhoneNumberFragment) r0
            r0.A1a()
            return
        L_0x081a:
            java.lang.Object r1 = r11.A00
            X.3GE r1 = (X.AnonymousClass3GE) r1
            java.lang.Runnable r0 = r1.A02
            if (r0 == 0) goto L_0x0825
            r0.run()
        L_0x0825:
            X.4P5 r0 = r1.A01
            if (r0 == 0) goto L_0x082c
            r0.BOX()
        L_0x082c:
            java.lang.Object r0 = r11.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r12)
            return
        L_0x0834:
            java.lang.Object r3 = r11.A01
            com.whatsapp.RequestPermissionActivity r3 = (com.whatsapp.RequestPermissionActivity) r3
            java.lang.String r2 = r3.A07
            if (r2 == 0) goto L_0x0845
            X.3TX r1 = r3.A06
            if (r1 == 0) goto L_0x0865
            java.lang.String r0 = "continue"
            r1.A08(r2, r0)
        L_0x0845:
            java.lang.Object r2 = r11.A00
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0 = 1
            r3.A08 = r0
            X.0v0 r1 = r3.A04
            if (r1 == 0) goto L_0x085e
            r0 = 0
            X.AnonymousClass3US.A08(r1, r2)
            X.C03570Gk.A0C(r3, r2, r0)
            r0 = 2131432660(0x7f0b14d4, float:1.8487084E38)
            X.C36331k8.A11(r3, r0)
            return
        L_0x085e:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0865:
            java.lang.String r0 = "funnelLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x086c:
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            java.lang.Object r0 = r11.A01
            X.1pi r0 = (X.C38751pi) r0
            X.1Dv r3 = r0.getActivityUtils$app_product_community_community_non_modified()
            java.lang.Object r2 = r11.A00
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Context r1 = r12.getContext()
            X.147 r0 = r0.A02
            if (r0 != 0) goto L_0x088b
            java.lang.String r0 = "parentJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x088b:
            android.content.Intent r1 = X.C36401kF.A06(r1, r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.A09(r2, r1, r0)
            return
        L_0x0895:
            X.39O r0 = r7.A02
            X.0yC r1 = r0.A01
            r0 = 1107(0x453, float:1.551E-42)
            r1.A0E(r0)
            X.3Qa r4 = r5.A1J
            com.whatsapp.jid.UserJid r3 = r5.A04
            X.11F r0 = r4.A00
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r0)
            X.C18740tg.A06(r2)
            java.lang.String r1 = r5.A07
            java.lang.String r0 = r5.A09
            X.C36321k7.A18(r3, r2, r1, r0)
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r0 = com.whatsapp.biz.order.view.fragment.OrderDetailFragment.A03(r3, r2, r4, r1, r0)
            r6.Btm(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48812i6.A02(android.view.View):void");
    }
}
