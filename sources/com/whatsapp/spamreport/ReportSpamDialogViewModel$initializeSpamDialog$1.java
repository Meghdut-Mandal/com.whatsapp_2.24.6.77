package com.whatsapp.spamreport;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass11F;
import X.C009003v;
import X.C023509x;
import X.C64933Qa;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogViewModel$initializeSpamDialog$1", f = "ReportSpamDialogViewModel.kt", i = {1, 2, 2, 3, 3, 3, 3}, l = {83, 84, 85, 87}, m = "invokeSuspend", n = {"contact", "contact", "senderContact", "contact", "senderContact", "selectedMessage", "contactToDisplay"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
public final class ReportSpamDialogViewModel$initializeSpamDialog$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $contactJid;
    public final /* synthetic */ String $entryPoint;
    public final /* synthetic */ boolean $hasLoggedInPairedDevices;
    public final /* synthetic */ C64933Qa $selectedMessageKey;
    public final /* synthetic */ UserJid $senderJid;
    public final /* synthetic */ boolean $shouldDeleteChatOnBlock;
    public final /* synthetic */ int $upsellAction;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ ReportSpamDialogViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogViewModel$initializeSpamDialog$1(AnonymousClass11F r2, UserJid userJid, C64933Qa r4, ReportSpamDialogViewModel reportSpamDialogViewModel, String str, C023509x r7, int i, boolean z, boolean z2) {
        super(2, r7);
        this.this$0 = reportSpamDialogViewModel;
        this.$contactJid = r2;
        this.$senderJid = userJid;
        this.$selectedMessageKey = r4;
        this.$entryPoint = str;
        this.$upsellAction = i;
        this.$shouldDeleteChatOnBlock = z;
        this.$hasLoggedInPairedDevices = z2;
    }

    public final C023509x create(Object obj, C023509x r12) {
        return new ReportSpamDialogViewModel$initializeSpamDialog$1(this.$contactJid, this.$senderJid, this.$selectedMessageKey, this.this$0, this.$entryPoint, r12, this.$upsellAction, this.$shouldDeleteChatOnBlock, this.$hasLoggedInPairedDevices);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0297, code lost:
        if (r0 == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r0 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0148, code lost:
        if (X.C36401kF.A1Z(r7) == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015a, code lost:
        if (r1 != false) goto L_0x015c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x034a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r3 = r20
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r4 = r19
            int r0 = r4.label
            r9 = 4
            r10 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x02a8
            if (r0 == r2) goto L_0x02c1
            if (r0 == r5) goto L_0x02da
            if (r0 == r10) goto L_0x0301
            if (r0 != r9) goto L_0x0350
            java.lang.Object r13 = r4.L$3
            X.141 r13 = (X.AnonymousClass141) r13
            java.lang.Object r14 = r4.L$2
            X.3T1 r14 = (X.AnonymousClass3T1) r14
            java.lang.Object r12 = r4.L$1
            X.141 r12 = (X.AnonymousClass141) r12
            java.lang.Object r11 = r4.L$0
            X.141 r11 = (X.AnonymousClass141) r11
            X.AnonymousClass0AN.A00(r3)
        L_0x0029:
            java.lang.String r3 = (java.lang.String) r3
            com.whatsapp.spamreport.ReportSpamDialogViewModel r6 = r4.this$0
            android.app.Application r2 = r6.A00
            int r7 = r4.$upsellAction
            boolean r1 = r4.$shouldDeleteChatOnBlock
            X.11F r8 = r11.A0H
            X.0yC r0 = r6.A0A
            boolean r0 = X.C36421kH.A1Z(r0)
            if (r0 == 0) goto L_0x0244
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0045
            boolean r0 = r8 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0244
        L_0x0045:
            boolean r0 = r11.A0C()
            if (r0 == 0) goto L_0x0054
            boolean r0 = r11.A0E()
            r5 = 2131893582(0x7f121d4e, float:1.9421945E38)
            if (r0 == 0) goto L_0x0057
        L_0x0054:
            r5 = 2131893583(0x7f121d4f, float:1.9421947E38)
        L_0x0057:
            java.lang.String r17 = X.C36361kB.A0m(r2, r5)
            com.whatsapp.spamreport.ReportSpamDialogViewModel r6 = r4.this$0
            X.00s r2 = r6.A02
            X.11F r5 = r11.A0H
            X.0yC r1 = r6.A0A
            r0 = 6186(0x182a, float:8.668E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01db
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0073
            boolean r0 = r5 instanceof X.C177528dw
            if (r0 == 0) goto L_0x01db
        L_0x0073:
            android.app.Application r1 = r6.A00
            r0 = 2131893595(0x7f121d5b, float:1.942197E38)
        L_0x0078:
            java.lang.String r15 = X.C36361kB.A0m(r1, r0)
        L_0x007c:
            com.whatsapp.spamreport.ReportSpamDialogViewModel r6 = r4.this$0
            boolean r5 = r4.$hasLoggedInPairedDevices
            java.lang.String r4 = r4.$entryPoint
            X.11F r1 = r11.A0H
            X.0yC r7 = r6.A0A
            r0 = 6186(0x182a, float:8.668E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0096
            boolean r0 = r1 instanceof X.C177528dw
            if (r0 == 0) goto L_0x01d8
        L_0x0096:
            r8 = 1
        L_0x0097:
            java.lang.String r0 = "status_post_report"
            boolean r0 = X.AnonymousClass00C.A0J(r4, r0)
            if (r0 == 0) goto L_0x00d8
            if (r12 == 0) goto L_0x00d6
            boolean r4 = r12.A0C()
        L_0x00a5:
            if (r8 == 0) goto L_0x00c4
            r0 = 2131893589(0x7f121d55, float:1.9421959E38)
            if (r4 == 0) goto L_0x00af
            r0 = 2131893581(0x7f121d4d, float:1.9421943E38)
        L_0x00af:
            android.text.SpannableStringBuilder r0 = com.whatsapp.spamreport.ReportSpamDialogViewModel.A01(r6, r0)
        L_0x00b3:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L_0x00b5:
            X.2eb r10 = new X.2eb
            r18 = r3
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r2.A0C(r10)
            X.0AJ r6 = X.AnonymousClass0AJ.A00
            return r6
        L_0x00c4:
            android.app.Application r1 = r6.A00
            r0 = 2131893640(0x7f121d88, float:1.9422062E38)
            if (r4 == 0) goto L_0x00ce
            r0 = 2131893641(0x7f121d89, float:1.9422064E38)
        L_0x00ce:
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass00C.A0B(r0)
            goto L_0x00b3
        L_0x00d6:
            r4 = 0
            goto L_0x00a5
        L_0x00d8:
            if (r14 == 0) goto L_0x0139
            if (r12 == 0) goto L_0x0139
            boolean r5 = r12.A0C()
            if (r8 != 0) goto L_0x012c
            X.3Ku r0 = r6.A05
            X.1Fz r0 = r0.A02
            boolean r0 = r0.A02(r14)
            if (r0 == 0) goto L_0x0121
            int r1 = r14.A1I
            boolean r0 = X.C66013Ui.A0K(r1)
            if (r0 != 0) goto L_0x00fc
            r0 = 78
            if (r1 == r0) goto L_0x00fc
            r0 = 82
            if (r1 != r0) goto L_0x010d
        L_0x00fc:
            java.lang.String r0 = "media_viewer"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x010d
            r0 = r14
            X.4TX r0 = (X.AnonymousClass4TX) r0
            int r0 = r0.BJ8()
            if (r0 != 0) goto L_0x0121
        L_0x010d:
            android.app.Application r1 = r6.A00
            r0 = 2131893638(0x7f121d86, float:1.9422058E38)
            if (r5 == 0) goto L_0x0117
            r0 = 2131893639(0x7f121d87, float:1.942206E38)
        L_0x0117:
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass00C.A0B(r0)
        L_0x011e:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x00b5
        L_0x0121:
            android.app.Application r1 = r6.A00
            r0 = 2131893643(0x7f121d8b, float:1.9422068E38)
            if (r5 == 0) goto L_0x0117
            r0 = 2131893642(0x7f121d8a, float:1.9422066E38)
            goto L_0x0117
        L_0x012c:
            r0 = 2131893588(0x7f121d54, float:1.9421957E38)
            if (r5 == 0) goto L_0x0134
            r0 = 2131893580(0x7f121d4c, float:1.942194E38)
        L_0x0134:
            android.text.SpannableStringBuilder r0 = com.whatsapp.spamreport.ReportSpamDialogViewModel.A01(r6, r0)
            goto L_0x011e
        L_0x0139:
            X.12q r1 = r6.A08
            X.11F r0 = r11.A0H
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x014a
            boolean r0 = X.C36401kF.A1Z(r7)
            r9 = 1
            if (r0 != 0) goto L_0x014b
        L_0x014a:
            r9 = 0
        L_0x014b:
            if (r8 == 0) goto L_0x0167
            boolean r0 = r11.A0C()
            if (r0 == 0) goto L_0x015c
            boolean r1 = r11.A0E()
            r0 = 2131893579(0x7f121d4b, float:1.9421939E38)
            if (r1 == 0) goto L_0x015f
        L_0x015c:
            r0 = 2131893587(0x7f121d53, float:1.9421955E38)
        L_0x015f:
            android.text.SpannableStringBuilder r0 = com.whatsapp.spamreport.ReportSpamDialogViewModel.A01(r6, r0)
        L_0x0163:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x00b5
        L_0x0167:
            boolean r0 = r11.A0G()
            if (r0 == 0) goto L_0x01a3
            java.lang.Integer r8 = X.C36371kC.A0p()
            r7 = 0
            r4 = 1
            r0 = 5
            if (r5 == 0) goto L_0x0191
            if (r9 == 0) goto L_0x018b
            X.0ts r6 = r6.A06
            r5 = 2131755306(0x7f10012a, float:1.9141488E38)
        L_0x017e:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r8
            java.lang.String r0 = r6.A0L(r4, r5, r0)
        L_0x0186:
            X.AnonymousClass00C.A0B(r0)
            goto L_0x00b5
        L_0x018b:
            android.app.Application r1 = r6.A00
            r0 = 2131893636(0x7f121d84, float:1.9422054E38)
            goto L_0x019e
        L_0x0191:
            if (r9 == 0) goto L_0x0199
            X.0ts r6 = r6.A06
            r5 = 2131755307(0x7f10012b, float:1.914149E38)
            goto L_0x017e
        L_0x0199:
            android.app.Application r1 = r6.A00
            r0 = 2131893637(0x7f121d85, float:1.9422056E38)
        L_0x019e:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0186
        L_0x01a3:
            X.11F r0 = r11.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x01b6
            android.app.Application r1 = r6.A00
            r0 = 2131893644(0x7f121d8c, float:1.942207E38)
        L_0x01ae:
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass00C.A0B(r0)
            goto L_0x0163
        L_0x01b6:
            boolean r0 = r11.A0C()
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r11.A0E()
            if (r0 != 0) goto L_0x01cd
            android.app.Application r1 = r6.A00
            r0 = 2131893632(0x7f121d80, float:1.9422046E38)
            if (r5 == 0) goto L_0x01ae
            r0 = 2131893631(0x7f121d7f, float:1.9422044E38)
            goto L_0x01ae
        L_0x01cd:
            android.app.Application r1 = r6.A00
            r0 = 2131893629(0x7f121d7d, float:1.942204E38)
            if (r5 == 0) goto L_0x01ae
            r0 = 2131893628(0x7f121d7c, float:1.9422038E38)
            goto L_0x01ae
        L_0x01d8:
            r8 = 0
            goto L_0x0097
        L_0x01db:
            if (r14 != 0) goto L_0x01ea
            boolean r0 = r11.A0G()
            if (r0 == 0) goto L_0x01ea
            android.app.Application r1 = r6.A00
            r0 = 2131893598(0x7f121d5e, float:1.9421977E38)
            goto L_0x0078
        L_0x01ea:
            X.11F r0 = r11.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0203
            android.app.Application r1 = r6.A00
            r0 = 2131893600(0x7f121d60, float:1.9421981E38)
            if (r14 == 0) goto L_0x01fa
            r0 = 2131893601(0x7f121d61, float:1.9421983E38)
        L_0x01fa:
            java.lang.String r15 = r1.getString(r0)
        L_0x01fe:
            X.AnonymousClass00C.A0B(r15)
            goto L_0x007c
        L_0x0203:
            r8 = 0
            r5 = 1
            if (r3 == 0) goto L_0x020d
            boolean r0 = X.AnonymousClass098.A06(r3)
            if (r0 == 0) goto L_0x0215
        L_0x020d:
            X.1Jb r7 = r6.A07
            X.8zz r1 = X.C188648zz.A0X
            r0 = 0
            r7.A00(r1, r0)
        L_0x0215:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = X.C36411kG.A0k(r13)
            boolean r0 = X.AnonymousClass143.A0H(r0)
            if (r0 == 0) goto L_0x023a
            android.app.Application r7 = r6.A00
            r6 = 2131893646(0x7f121d8e, float:1.9422074E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.whatsapp.jid.UserJid r1 = X.C36411kG.A0k(r11)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid"
            X.AnonymousClass00C.A0E(r1, r0)
            X.AnonymousClass00C.A0D(r1, r8)
            r0 = 0
            java.lang.String r15 = X.C36391kE.A0v(r7, r0, r5, r8, r6)
            goto L_0x01fe
        L_0x023a:
            android.app.Application r1 = r6.A00
            r0 = 2131893645(0x7f121d8d, float:1.9422072E38)
            java.lang.String r15 = X.C36351kA.A0w(r1, r3, r5, r0)
            goto L_0x01fe
        L_0x0244:
            X.11F r0 = r11.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0251
            if (r7 != r5) goto L_0x0251
            r5 = 2131893626(0x7f121d7a, float:1.9422034E38)
            goto L_0x0057
        L_0x0251:
            boolean r0 = r11.A0G()
            if (r0 == 0) goto L_0x0271
            if (r12 == 0) goto L_0x027c
            if (r7 != 0) goto L_0x027c
            boolean r0 = r12.A0C()
            if (r0 == 0) goto L_0x029e
            boolean r0 = r12.A0E()
        L_0x0265:
            if (r0 != 0) goto L_0x029e
            r5 = 2131893571(0x7f121d43, float:1.9421922E38)
            if (r1 == 0) goto L_0x0057
            r5 = 2131893570(0x7f121d42, float:1.942192E38)
            goto L_0x0057
        L_0x0271:
            boolean r0 = r11.A0C()
            if (r0 == 0) goto L_0x029e
            boolean r0 = r11.A0E()
            goto L_0x0265
        L_0x027c:
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r1 = r11.A06(r0)
            if (r1 == 0) goto L_0x034b
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.12q r0 = r6.A08
            boolean r0 = r0.A0O(r1)
            if (r0 == 0) goto L_0x0299
            X.17X r0 = r6.A09
            boolean r0 = r0.A0C(r1)
            r5 = 2131889441(0x7f120d21, float:1.9413546E38)
            if (r0 != 0) goto L_0x0057
        L_0x0299:
            r5 = 2131893596(0x7f121d5c, float:1.9421973E38)
            goto L_0x0057
        L_0x029e:
            r5 = 2131893569(0x7f121d41, float:1.9421918E38)
            if (r1 == 0) goto L_0x0057
            r5 = 2131896942(0x7f122a6e, float:1.942876E38)
            goto L_0x0057
        L_0x02a8:
            X.AnonymousClass0AN.A00(r3)
            com.whatsapp.spamreport.ReportSpamDialogViewModel r0 = r4.this$0
            X.00s r1 = r0.A02
            X.2ec r0 = X.C47452ec.A00
            r1.A0C(r0)
            com.whatsapp.spamreport.ReportSpamDialogViewModel r1 = r4.this$0
            X.11F r0 = r4.$contactJid
            r4.label = r2
            java.lang.Object r3 = com.whatsapp.spamreport.ReportSpamDialogViewModel.A02(r0, r1, r4)
            if (r3 != r6) goto L_0x02c4
            return r6
        L_0x02c1:
            X.AnonymousClass0AN.A00(r3)
        L_0x02c4:
            r11 = r3
            X.141 r11 = (X.AnonymousClass141) r11
            com.whatsapp.jid.UserJid r1 = r4.$senderJid
            if (r1 == 0) goto L_0x02d8
            com.whatsapp.spamreport.ReportSpamDialogViewModel r0 = r4.this$0
            r4.L$0 = r11
            r4.label = r5
            java.lang.Object r3 = com.whatsapp.spamreport.ReportSpamDialogViewModel.A02(r1, r0, r4)
            if (r3 != r6) goto L_0x02e1
            return r6
        L_0x02d8:
            r12 = 0
            goto L_0x02e4
        L_0x02da:
            java.lang.Object r11 = r4.L$0
            X.141 r11 = (X.AnonymousClass141) r11
            X.AnonymousClass0AN.A00(r3)
        L_0x02e1:
            r12 = r3
            X.141 r12 = (X.AnonymousClass141) r12
        L_0x02e4:
            com.whatsapp.spamreport.ReportSpamDialogViewModel r8 = r4.this$0
            X.3Qa r7 = r4.$selectedMessageKey
            java.lang.String r2 = r4.$entryPoint
            r4.L$0 = r11
            r4.L$1 = r12
            r4.label = r10
            r3 = 0
            if (r7 == 0) goto L_0x030c
            X.02l r1 = r8.A0D
            com.whatsapp.spamreport.ReportSpamDialogViewModel$getSelectedMessage$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogViewModel$getSelectedMessage$2
            r0.<init>(r7, r8, r2, r3)
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r4, r1, r0)
            if (r3 != r6) goto L_0x030c
            return r6
        L_0x0301:
            java.lang.Object r12 = r4.L$1
            X.141 r12 = (X.AnonymousClass141) r12
            java.lang.Object r11 = r4.L$0
            X.141 r11 = (X.AnonymousClass141) r11
            X.AnonymousClass0AN.A00(r3)
        L_0x030c:
            r14 = r3
            X.3T1 r14 = (X.AnonymousClass3T1) r14
            com.whatsapp.spamreport.ReportSpamDialogViewModel r3 = r4.this$0
            r13 = r11
            if (r14 == 0) goto L_0x0317
            if (r12 == 0) goto L_0x0317
            r13 = r12
        L_0x0317:
            r4.L$0 = r11
            r4.L$1 = r12
            r4.L$2 = r14
            r4.L$3 = r13
            r4.label = r9
            X.11F r1 = r13.A0H
            X.0yC r0 = r3.A0A
            boolean r0 = X.C36421kH.A1Z(r0)
            if (r0 == 0) goto L_0x033c
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0333
            boolean r0 = r1 instanceof X.C177528dw
            if (r0 == 0) goto L_0x033c
        L_0x0333:
            X.11F r0 = r13.A0H
            boolean r1 = r0 instanceof com.whatsapp.jid.UserJid
            java.lang.String r0 = "Contact must be a user"
            X.C18740tg.A0D(r1, r0)
        L_0x033c:
            X.02l r2 = r3.A0D
            r1 = 0
            com.whatsapp.spamreport.ReportSpamDialogViewModel$getContactNameToDisplay$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogViewModel$getContactNameToDisplay$2
            r0.<init>(r13, r3, r1)
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r4, r2, r0)
            if (r3 != r6) goto L_0x0029
            return r6
        L_0x034b:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x0350:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogViewModel$initializeSpamDialog$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogViewModel$initializeSpamDialog$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
