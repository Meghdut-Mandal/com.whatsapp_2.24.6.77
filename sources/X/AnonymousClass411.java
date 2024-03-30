package X;

/* renamed from: X.411  reason: invalid class name */
public class AnonymousClass411 implements C25711Hj {
    public Object A00;
    public final int A01;

    public AnonymousClass411(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x048f, code lost:
        r0.A0D(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0492, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0149, code lost:
        if (r5.A0M.A0C(r4) == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0154, code lost:
        r5.Btm(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ec, code lost:
        if (r2 == false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0208, code lost:
        if (r2 == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021e, code lost:
        if (r1 != 404) goto L_0x01ee;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r22
            r2 = r21
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x003a;
                case 2: goto L_0x01ce;
                case 3: goto L_0x0247;
                case 4: goto L_0x0058;
                case 5: goto L_0x026f;
                case 6: goto L_0x0277;
                case 7: goto L_0x02c4;
                case 8: goto L_0x007a;
                case 9: goto L_0x0090;
                case 10: goto L_0x00da;
                case 11: goto L_0x0102;
                case 12: goto L_0x03c8;
                case 13: goto L_0x0114;
                case 14: goto L_0x0158;
                case 15: goto L_0x03d4;
                case 16: goto L_0x016d;
                case 17: goto L_0x0450;
                case 18: goto L_0x048b;
                case 19: goto L_0x01ba;
                case 20: goto L_0x0493;
                case 21: goto L_0x049e;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r2.A00
            X.1GM r0 = (X.AnonymousClass1GM) r0
            r0.A08(r1)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r2.A00
            X.2iE r0 = (X.C48892iE) r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r5 = r0.A00
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            boolean r0 = r5.BLh()
            if (r0 != 0) goto L_0x0010
            X.0yC r4 = r5.A0D
            X.141 r0 = r5.A0z
            com.whatsapp.jid.UserJid r3 = X.C36351kA.A0k(r0)
            boolean r2 = r1.booleanValue()
            java.lang.String r1 = "account_info_report"
            X.3Pg r0 = new X.3Pg
            r0.<init>(r4, r3, r1, r2)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r0.A01()
            goto L_0x0154
        L_0x003a:
            java.lang.Object r2 = r2.A00
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r2 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.2Ec r0 = X.AnonymousClass2Ec.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0010
            com.google.android.material.textfield.TextInputEditText r0 = r2.A00
            if (r0 == 0) goto L_0x0010
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0010
            r0.clear()
            return
        L_0x0058:
            java.lang.Object r6 = r2.A00
            X.1oC r6 = (X.C38301oC) r6
            boolean r5 = X.AnonymousClass000.A1X(r1)
            r4 = 0
            X.14u r0 = r6.getActivity()
            boolean r0 = r0.BLh()
            if (r0 != 0) goto L_0x0010
            X.0yC r3 = r6.getAbProps$app_product_community_community_non_modified()
            X.147 r2 = r6.A03
            if (r2 != 0) goto L_0x04ac
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x007a:
            java.lang.Object r2 = r2.A00
            com.whatsapp.companiondevice.sync.HistorySyncWorker r2 = (com.whatsapp.companiondevice.sync.HistorySyncWorker) r2
            java.util.Map r1 = (java.util.Map) r1
            r2.A02 = r1
            java.lang.Boolean r0 = X.C36371kC.A0m()
            boolean r0 = r1.containsValue(r0)
            if (r0 == 0) goto L_0x0010
            com.whatsapp.companiondevice.sync.HistorySyncWorker.A01(r2)
            return
        L_0x0090:
            java.lang.Object r6 = r2.A00
            X.28f r6 = (X.AnonymousClass28f) r6
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            X.14r r3 = r6.A06
            boolean r0 = r3.BLh()
            if (r0 != 0) goto L_0x0010
            X.0yC r5 = r6.A0F
            X.11F r4 = r6.A0G
            boolean r1 = r1.booleanValue()
            java.lang.String r0 = "overflow_menu_report"
            X.3Pg r2 = new X.3Pg
            r2.<init>(r5, r4, r0, r1)
            X.141 r0 = r6.A00
            X.11F r1 = r0.A0H
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00c3
            X.12q r0 = r6.A0E
            X.3Qp r0 = X.C36371kC.A0W(r0, r1)
            X.C18740tg.A06(r0)
            X.2La r0 = (X.C44072La) r0
            r2.A02(r0)
        L_0x00c3:
            X.12q r1 = r6.A0E
            X.141 r0 = r6.A00
            X.11F r0 = r0.A0H
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x00d2
            r0 = 0
            r2.A07 = r0
        L_0x00d2:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r2.A01()
            r3.Btm(r0)
            return
        L_0x00da:
            java.lang.Object r4 = r2.A00
            X.8Yp r4 = (X.C174828Yp) r4
            X.39b r1 = (X.C607139b) r1
            X.3T1 r0 = r1.A01
            X.3Qa r2 = r0.A1J
            android.widget.TextView r0 = r4.A03
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            int r3 = r1.A00
            X.3Sx r0 = r1.A04
            if (r0 != 0) goto L_0x00fd
            r2 = 0
        L_0x00f7:
            java.util.List r0 = r1.A03
            X.C174828Yp.A0C(r4, r2, r0, r3)
            return
        L_0x00fd:
            java.lang.String r2 = r0.A03()
            goto L_0x00f7
        L_0x0102:
            java.lang.Object r2 = r2.A00
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0010
            r2.run()
            return
        L_0x0114:
            java.lang.Object r0 = r2.A00
            X.2hz r0 = (X.C48752hz) r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r5 = r0.A00
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            boolean r0 = r5.BLh()
            if (r0 != 0) goto L_0x0010
            X.141 r0 = r5.A0y
            com.whatsapp.jid.GroupJid r4 = X.C36421kH.A0P(r0)
            X.0yC r3 = r5.A0D
            X.C18740tg.A06(r4)
            boolean r1 = r1.booleanValue()
            java.lang.String r0 = "group_info_report"
            X.3Pg r2 = new X.3Pg
            r2.<init>(r3, r4, r0, r1)
            X.12q r0 = r5.A0J
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x014b
            X.17X r0 = r5.A0M
            boolean r1 = r0.A0C(r4)
            r0 = 1
            if (r1 != 0) goto L_0x014c
        L_0x014b:
            r0 = 0
        L_0x014c:
            r0 = r0 ^ 1
            r2.A07 = r0
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r2.A01()
        L_0x0154:
            r5.Btm(r0)
            return
        L_0x0158:
            java.lang.Object r2 = r2.A00
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.C36321k7.A0w(r2, r1)
            boolean r0 = r1 instanceof X.AnonymousClass2bU
            if (r0 != 0) goto L_0x0010
            X.3L1 r0 = r1.A0a
            if (r0 == 0) goto L_0x0010
            r2.add(r1)
            return
        L_0x016d:
            java.lang.Object r6 = r2.A00
            com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity r6 = (com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity) r6
            X.9ky r1 = (X.C202059ky) r1
            r0 = 0
            r6.A06 = r0
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0010
            X.9my r5 = r6.A01
            int r11 = r1.A00
            r0 = 2
            X.4Yj r7 = new X.4Yj
            r7.<init>(r6, r0)
            r10 = 0
            r9 = r7
            r8 = r7
            X.0FM r0 = r5.A06(r6, r7, r8, r9, r10, r11)
            r0.show()
            android.content.Intent r2 = r6.getIntent()
            java.lang.String r0 = "referral_screen"
            java.lang.String r5 = r2.getStringExtra(r0)
            X.AF7 r4 = r6.A04
            java.lang.Integer r3 = X.C36371kC.A0o()
            r0 = 51
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "payment_home"
            X.8cT r2 = r4.A04(r3, r2, r0, r5)
            int r0 = r1.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A0S = r0
            X.AF7 r0 = r6.A04
            r0.BOl(r2)
            return
        L_0x01ba:
            java.lang.Object r2 = r2.A00
            com.whatsapp.settings.SettingsUserProxyViewModel r2 = (com.whatsapp.settings.SettingsUserProxyViewModel) r2
            int r1 = X.AnonymousClass000.A0I(r1)
            r0 = 2
            if (r1 != r0) goto L_0x01c9
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0010
        L_0x01c9:
            r0 = 0
            r2.A0V(r1, r0)
            return
        L_0x01ce:
            java.lang.Object r5 = r2.A00
            X.1ue r5 = (X.C40041ue) r5
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r0 = r1 instanceof X.C52872qJ
            r4 = 0
            if (r0 == 0) goto L_0x020b
            X.2qJ r1 = (X.C52872qJ) r1
            X.2pc r0 = r1.error
            boolean r2 = r0.isRecoverable
            int r1 = r0.code
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0205
            r0 = 423(0x1a7, float:5.93E-43)
            if (r1 == r0) goto L_0x0205
            r3 = 2131890219(0x7f12102b, float:1.9415124E38)
            if (r2 != 0) goto L_0x01f7
        L_0x01ee:
            r3 = 2131890218(0x7f12102a, float:1.9415122E38)
        L_0x01f1:
            X.00s r1 = r5.A0E
            r0 = 7
            X.C36341k9.A17(r1, r0)
        L_0x01f7:
            X.00s r2 = r5.A0F
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131100377(0x7f0602d9, float:1.7813134E38)
            X.AnonymousClass36E.A00(r2, r1, r0, r3)
        L_0x0201:
            X.C40041ue.A04(r5, r4)
            return
        L_0x0205:
            r3 = 2131890220(0x7f12102c, float:1.9415126E38)
            if (r2 != 0) goto L_0x01f7
            goto L_0x01f1
        L_0x020b:
            boolean r0 = r1 instanceof X.C52882qK
            if (r0 == 0) goto L_0x0225
            X.2qK r1 = (X.C52882qK) r1
            X.2pO r0 = r1.error
            int r1 = r0.code
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0221
            r0 = 404(0x194, float:5.66E-43)
            r3 = 2131890222(0x7f12102e, float:1.941513E38)
            if (r1 == r0) goto L_0x01f1
            goto L_0x01ee
        L_0x0221:
            r3 = 2131890221(0x7f12102d, float:1.9415128E38)
            goto L_0x01f1
        L_0x0225:
            boolean r0 = r1 instanceof X.C52902qM
            if (r0 == 0) goto L_0x023d
            X.00s r1 = r5.A0E
            r0 = 7
            X.C36341k9.A17(r1, r0)
            X.00s r3 = r5.A0F
            r2 = 2131890218(0x7f12102a, float:1.9415122E38)
        L_0x0234:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131100377(0x7f0602d9, float:1.7813134E38)
            X.AnonymousClass36E.A00(r3, r1, r0, r2)
            goto L_0x0201
        L_0x023d:
            boolean r0 = r1 instanceof X.C52912qN
            if (r0 == 0) goto L_0x0201
            X.00s r3 = r5.A0F
            r2 = 2131890219(0x7f12102b, float:1.9415124E38)
            goto L_0x0234
        L_0x0247:
            java.lang.Object r4 = r2.A00
            X.1ue r4 = (X.C40041ue) r4
            X.00s r1 = r4.A0E
            r0 = 2
            X.C36341k9.A17(r1, r0)
            X.00s r3 = r4.A0F
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 2131886447(0x7f12016f, float:1.9407473E38)
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            X.AnonymousClass36E.A00(r3, r2, r0, r1)
            r0 = 1
            X.C40041ue.A04(r4, r0)
            X.1LV r2 = r4.A0J
            X.147 r1 = r4.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0B(r1, r0)
            return
        L_0x026f:
            java.lang.Object r0 = r2.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r0 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r0
            X.1Rs r0 = r0.A0U
            goto L_0x048f
        L_0x0277:
            java.lang.Object r4 = r2.A00
            X.3pg r4 = (X.C76933pg) r4
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sync-request-handler/sendRequest preparing request failed - "
            X.C36321k7.A1W(r0, r2, r1)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            boolean r0 = r1 instanceof X.C52852qH
            if (r0 == 0) goto L_0x02b8
            r0 = r1
            X.2qH r0 = (X.C52852qH) r0
            java.util.List r0 = r0.throwables
            r2.addAll(r0)
        L_0x0296:
            java.util.Iterator r3 = r2.iterator()
        L_0x029a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02bc
            java.lang.Object r2 = r3.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r0 = r2 instanceof X.C1032554o
            if (r0 != 0) goto L_0x02b2
            boolean r0 = r2 instanceof X.C1032654p
            if (r0 != 0) goto L_0x02b2
            boolean r0 = r2 instanceof X.AnonymousClass198
            if (r0 == 0) goto L_0x029a
        L_0x02b2:
            X.9nj r0 = r4.A02
            r0.A07(r2)
            return
        L_0x02b8:
            r2.add(r1)
            goto L_0x0296
        L_0x02bc:
            java.lang.String r2 = "sync-request-handler/sendRequest unexpected exception was caught! Only SyncdFailedException, SyncdRetriableException and SyncdFatalException are allowed here."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2, r1)
            throw r0
        L_0x02c4:
            java.lang.Object r15 = r2.A00
            X.3pg r15 = (X.C76933pg) r15
            java.util.List r1 = (java.util.List) r1
            X.19A r14 = r15.A07
            java.lang.String r0 = r14.A09()
            X.390 r5 = new X.390
            r5.<init>(r0)
            java.util.Iterator r13 = r1.iterator()
        L_0x02d9:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x035f
            java.lang.Object r2 = r13.next()
            X.37t r2 = (X.C604137t) r2
            if (r2 == 0) goto L_0x02d9
            java.lang.String r7 = r2.A01
            X.1IT r0 = r15.A06
            java.lang.Long r11 = r0.A01(r7)
            java.util.List r9 = r2.A02
            X.8Ro r10 = r2.A00
            byte[] r8 = r2.A03
            X.0wQ r0 = r15.A01
            boolean r4 = r0.A0L()
            java.lang.String r0 = "collection"
            X.6QB r6 = X.C36441kJ.A0q(r0)
            java.lang.String r0 = "critical_unblock_low"
            boolean r0 = r0.equals(r7)
            r3 = r0 ^ 1
            java.lang.String r0 = "name"
            X.C36331k8.A1D(r6, r0, r7)
            java.lang.String r2 = "order"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r2, (int) r3)
            r6.A04(r0)
            if (r11 == 0) goto L_0x0323
            long r2 = r11.longValue()
            java.lang.String r0 = "version"
            X.C36411kG.A1K(r6, r0, r2)
        L_0x0323:
            if (r4 == 0) goto L_0x0338
            if (r11 == 0) goto L_0x0331
            long r11 = r11.longValue()
            r2 = 0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0338
        L_0x0331:
            java.lang.String r2 = "return_snapshot"
            java.lang.String r0 = "true"
            X.C36331k8.A1D(r6, r2, r0)
        L_0x0338:
            if (r10 == 0) goto L_0x0353
            r4 = 0
            byte[] r3 = r10.A0o()
            java.lang.String r2 = "patch"
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r2, (byte[]) r3, (X.AnonymousClass1AL[]) r4)
            r6.A05(r0)
            java.util.Map r0 = r5.A03
            r0.put(r7, r9)
            java.util.Map r0 = r5.A02
            r0.put(r7, r8)
        L_0x0353:
            java.util.Set r0 = r5.A04
            r0.add(r7)
            X.6QB r0 = r5.A00
            X.C36361kB.A1H(r6, r0)
            goto L_0x02d9
        L_0x035f:
            X.6QB r6 = X.C36421kH.A0T()
            X.C36341k9.A1C(r6)
            java.lang.String r2 = "xmlns"
            java.lang.String r0 = "w:sync:app:state"
            X.C36331k8.A1D(r6, r2, r0)
            java.lang.String r2 = "type"
            java.lang.String r0 = "set"
            X.C36331k8.A1D(r6, r2, r0)
            java.lang.String r7 = r5.A01
            java.lang.String r0 = "id"
            X.C36331k8.A1D(r6, r0, r7)
            X.6QB r4 = r5.A00
            java.util.List r0 = r4.A02
            r0.clear()
            java.lang.String r3 = "data_namespace"
            r2 = 3
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r3, (int) r2)
            r4.A04(r0)
            X.C36361kB.A1H(r4, r6)
            java.util.Set r10 = r5.A04
            X.9nx r6 = r6.A03()
            java.util.Map r8 = r5.A03
            java.util.Map r9 = r5.A02
            X.3Gf r5 = new X.3Gf
            r5.<init>(r6, r7, r8, r9, r10)
            r15.A00 = r5
            X.1IZ r0 = r15.A05
            r0.A03(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sync-request-handler/sendIq iqId:"
            r1.append(r0)
            X.3Gf r0 = r15.A00
            java.lang.String r0 = r0.A02
            X.C36321k7.A1a(r1, r0)
            r18 = 238(0xee, float:3.34E-43)
            X.3Gf r0 = r15.A00
            java.lang.String r1 = r0.A02
            X.9nx r0 = r0.A01
            r19 = 32000(0x7d00, double:1.581E-319)
            r16 = r0
            r17 = r1
            r14.A0F(r15, r16, r17, r18, r19)
            return
        L_0x03c8:
            java.lang.Object r2 = r2.A00
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r2 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r2
            boolean r0 = X.AnonymousClass000.A1X(r1)
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity.A01(r2, r0)
            return
        L_0x03d4:
            java.lang.Object r4 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            android.net.Uri r1 = (android.net.Uri) r1
            X.17Y r0 = r4.A0H
            r0.A02()
            android.content.Intent r3 = X.C36431kI.A0C()
            java.lang.String r0 = "video/*"
            r3.setDataAndType(r1, r0)
            r0 = 1
            r3.setFlags(r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Sony"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x043f
            X.01I r0 = r4.A0i()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r0 = 0
            java.util.List r0 = r1.queryIntentActivities(r3, r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0407:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x043f
            java.lang.Object r5 = r6.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaViewFragment/launchExternalVideoPlayer/share"
            r2.append(r0)
            android.content.pm.ActivityInfo r1 = r5.activityInfo
            java.lang.String r0 = r1.packageName
            r2.append(r0)
            java.lang.String r0 = " | "
            r2.append(r0)
            java.lang.String r0 = r1.name
            X.C36321k7.A1a(r2, r0)
            android.content.pm.ActivityInfo r0 = r5.activityInfo
            java.lang.String r0 = r0.name
            java.lang.String r1 = "com.sonyericsson.gallery.MovieView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0407
            java.lang.String r0 = "com.sonyericsson.gallery"
            r3.setClassName(r0, r1)
            goto L_0x0407
        L_0x043f:
            android.content.Context r1 = r4.A0a()
            X.4Up r0 = r4.A1C
            if (r0 == 0) goto L_0x044a
            r0.BbL()
        L_0x044a:
            X.1Dv r0 = r4.A0D
            r0.A06(r1, r3)
            return
        L_0x0450:
            java.lang.Object r5 = r2.A00
            com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity r5 = (com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity) r5
            java.util.List r1 = (java.util.List) r1
            X.32b r4 = r5.A05
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            if (r1 == 0) goto L_0x0478
            java.util.Iterator r2 = r1.iterator()
        L_0x0462:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0478
            X.141 r1 = X.C36391kE.A0f(r2)
            X.1NG r0 = r4.A00
            boolean r0 = X.C36331k8.A1Y(r0, r1)
            if (r0 != 0) goto L_0x0462
            r3.add(r1)
            goto L_0x0462
        L_0x0478:
            X.171 r2 = r5.A0B
            X.0ts r1 = r5.A0I
            X.2Fh r0 = new X.2Fh
            r0.<init>(r2, r1)
            java.util.Collections.sort(r3, r0)
            r5.A45(r3)
            r0 = 0
            r5.A06 = r0
            return
        L_0x048b:
            java.lang.Object r0 = r2.A00
            X.00r r0 = (X.C001600r) r0
        L_0x048f:
            r0.A0D(r1)
            return
        L_0x0493:
            java.lang.Object r2 = r2.A00
            com.whatsapp.settings.SettingsUserProxyViewModel r2 = (com.whatsapp.settings.SettingsUserProxyViewModel) r2
            int r0 = X.AnonymousClass000.A0I(r1)
            r2.A01 = r0
            return
        L_0x049e:
            java.lang.Object r2 = r2.A00
            X.33E r2 = (X.AnonymousClass33E) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.3ty r0 = r2.A00
            r0.A0C(r1)
            return
        L_0x04ac:
            java.lang.String r1 = "group_info_report"
            X.3Pg r0 = new X.3Pg
            r0.<init>(r3, r2, r1, r5)
            r0.A07 = r4
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r0.A01()
            X.14u r0 = r6.getActivity()
            r0.Btm(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass411.accept(java.lang.Object):void");
    }
}
