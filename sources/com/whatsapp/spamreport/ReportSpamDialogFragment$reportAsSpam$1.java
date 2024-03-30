package com.whatsapp.spamreport;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass141;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1", f = "ReportSpamDialogFragment.kt", i = {}, l = {466, 468, 481}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$reportAsSpam$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $contact;
    public final /* synthetic */ AnonymousClass141 $contactToDisplay;
    public final /* synthetic */ boolean $extraActionChecked;
    public final /* synthetic */ AnonymousClass3T1 $selectedMessage;
    public final /* synthetic */ AnonymousClass141 $senderContact;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$reportAsSpam$1(AnonymousClass141 r2, AnonymousClass141 r3, AnonymousClass141 r4, AnonymousClass3T1 r5, ReportSpamDialogFragment reportSpamDialogFragment, C023509x r7, boolean z) {
        super(2, r7);
        this.$selectedMessage = r5;
        this.this$0 = reportSpamDialogFragment;
        this.$contact = r2;
        this.$extraActionChecked = z;
        this.$contactToDisplay = r3;
        this.$senderContact = r4;
    }

    public final C023509x create(Object obj, C023509x r10) {
        AnonymousClass3T1 r4 = this.$selectedMessage;
        ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
        return new ReportSpamDialogFragment$reportAsSpam$1(this.$contact, this.$contactToDisplay, this.$senderContact, r4, reportSpamDialogFragment, r10, this.$extraActionChecked);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dd, code lost:
        if (X.C36421kH.A1Z(r0) != false) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r12.label
            r8 = 0
            r5 = 3
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L_0x013f
            if (r0 == r6) goto L_0x017c
            if (r0 == r2) goto L_0x017c
            if (r0 != r5) goto L_0x0258
            X.AnonymousClass0AN.A00(r13)
        L_0x0013:
            X.141 r0 = r12.$contact
            X.11F r0 = r0.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00b6
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r12.this$0
            X.0yC r1 = r0.A02
            r0 = 6145(0x1801, float:8.611E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00b6
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r12.this$0
            java.lang.ref.WeakReference r0 = r0.A0N
            if (r0 == 0) goto L_0x0034
            android.view.View r0 = X.AnonymousClass000.A0Y(r0)
            X.C36331k8.A0y(r0)
        L_0x0034:
            com.whatsapp.spamreport.ReportSpamDialogFragment r4 = r12.this$0
            X.00T r0 = r4.A0Z
            android.view.View r3 = X.C36361kB.A0J(r0)
            X.AnonymousClass00C.A08(r3)
            r5 = 0
            r3.setVisibility(r5)
            r0 = 2131433325(0x7f0b176d, float:1.8488433E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 44
            X.AnonymousClass3Y8.A00(r1, r4, r0)
            r0 = 2131433326(0x7f0b176e, float:1.8488435E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r3, r0)
            r2 = 2131893592(0x7f121d58, float:1.9421965E38)
            X.1e1 r6 = r4.A0L
            if (r6 == 0) goto L_0x0244
            android.content.Context r7 = r4.A1D()
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            java.lang.String r10 = "learn-more"
            java.lang.String r9 = X.C36401kF.A0q(r4, r10, r0, r5, r2)
            android.content.Context r0 = r4.A1D()
            int r11 = X.C36341k9.A05(r0)
            X.74v r8 = new X.74v
            r8.<init>((com.whatsapp.spamreport.ReportSpamDialogFragment) r4)
            android.text.SpannableStringBuilder r0 = r6.A03(r7, r8, r9, r10, r11)
            r1.setText(r0)
            X.0yC r0 = r4.A02
            X.C36331k8.A10(r1, r0)
            android.graphics.Rect r0 = X.AnonymousClass0BN.A0A
            X.0yb r0 = r4.A08
            if (r0 == 0) goto L_0x023f
            X.C36371kC.A1I(r1, r0)
            r0 = 2131433327(0x7f0b176f, float:1.8488437E38)
            android.view.View r2 = r3.findViewById(r0)
            X.AnonymousClass00C.A0B(r2)
            X.0yC r1 = r4.A02
            r0 = 6297(0x1899, float:8.824E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x00a3
            r5 = 8
        L_0x00a3:
            r2.setVisibility(r5)
            r0 = 45
            X.AnonymousClass3Y8.A00(r2, r4, r0)
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            r0 = 6
            X.C90204Zm.A00(r1, r3, r4, r0)
        L_0x00b3:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00b6:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r12.this$0
            r0.A1b()
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = r12.this$0
            X.141 r2 = r12.$contact
            X.141 r1 = r12.$contactToDisplay
            boolean r4 = r12.$extraActionChecked
            if (r4 == 0) goto L_0x0101
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x0101
            X.00T r0 = r3.A0W
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x00df
            X.0yC r0 = r3.A02
            X.AnonymousClass00C.A07(r0)
            boolean r0 = X.C36421kH.A1Z(r0)
            r9 = 1
            if (r0 == 0) goto L_0x00e0
        L_0x00df:
            r9 = 0
        L_0x00e0:
            X.190 r0 = r3.A0G
            if (r0 == 0) goto L_0x024e
            android.content.Context r4 = r3.A0a()
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = X.C36411kG.A0k(r1)
            if (r5 == 0) goto L_0x0249
            X.00T r0 = r3.A0R
            java.lang.String r6 = X.C36431kI.A1E(r0)
            r7 = 1
            r8 = 0
            r10 = r9
            android.content.Intent r1 = X.AnonymousClass190.A0x(r4, r5, r6, r7, r8, r9, r10)
        L_0x00fd:
            r3.A1C(r1)
            goto L_0x00b3
        L_0x0101:
            X.00T r0 = r3.A0X
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x00b3
            boolean r1 = com.whatsapp.spamreport.ReportSpamDialogFragment.A08(r2, r3)
            X.190 r0 = r3.A0G
            if (r0 == 0) goto L_0x0253
            android.content.Context r0 = r3.A0a()
            if (r1 == 0) goto L_0x013a
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.HomeActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = X.AnonymousClass1RI.A04
            android.content.Intent r1 = r1.setAction(r0)
            java.lang.String r0 = "report_and_exit_group"
            android.content.Intent r1 = r1.putExtra(r0, r4)
        L_0x0131:
            X.AnonymousClass00C.A0B(r1)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r1.addFlags(r0)
            goto L_0x00fd
        L_0x013a:
            android.content.Intent r1 = X.AnonymousClass190.A03(r0)
            goto L_0x0131
        L_0x013f:
            X.AnonymousClass0AN.A00(r13)
            X.3T1 r0 = r12.$selectedMessage
            if (r0 == 0) goto L_0x014a
            java.util.List r8 = X.C36371kC.A11(r0)
        L_0x014a:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r12.this$0
            X.0yC r1 = r0.A02
            r0 = 7811(0x1e83, float:1.0946E-41)
            boolean r0 = r1.A0E(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r7 = r12.this$0
            if (r0 == 0) goto L_0x016b
            com.whatsapp.reportinfra.repo.SpamReportRepo r2 = r7.A0I
            if (r2 == 0) goto L_0x0290
            X.141 r1 = r12.$contact
            java.lang.String r0 = X.C36371kC.A0x(r7)
            r12.label = r6
            java.lang.Object r13 = r2.A00(r1, r0, r8, r12)
        L_0x0168:
            if (r13 != r4) goto L_0x017f
            return r4
        L_0x016b:
            X.141 r3 = r12.$contact
            r12.label = r2
            X.02m r2 = X.AnonymousClass19R.A01
            r1 = 0
            com.whatsapp.spamreport.ReportSpamDialogFragment$triggerReportAction$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogFragment$triggerReportAction$2
            r0.<init>(r3, r7, r8, r1)
            java.lang.Object r13 = X.AnonymousClass0A2.A00(r12, r2, r0)
            goto L_0x0168
        L_0x017c:
            X.AnonymousClass0AN.A00(r13)
        L_0x017f:
            com.whatsapp.spamreport.ReportSpamDialogFragment r2 = r12.this$0
            boolean r0 = r12.$extraActionChecked
            X.141 r7 = r12.$contact
            X.141 r1 = r12.$contactToDisplay
            java.lang.String r8 = "Required value was null."
            if (r0 != 0) goto L_0x01b2
            X.3Os r3 = r2.A1k()
            java.lang.String r1 = X.C36371kC.A0x(r2)
            X.11F r0 = r7.A0H
            if (r0 == 0) goto L_0x0262
            X.AnonymousClass3Os.A00(r3, r0, r1, r6)
        L_0x019a:
            boolean r1 = r13 instanceof X.AnonymousClass2dI
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r12.this$0
            if (r1 == 0) goto L_0x021d
            X.17Y r1 = r0.A01
            if (r1 == 0) goto L_0x025d
            r0 = 2131893586(0x7f121d52, float:1.9421953E38)
            r1.A06(r0, r6)
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r12.this$0
            r0 = 0
            com.whatsapp.spamreport.ReportSpamDialogFragment.A07(r1, r0)
            goto L_0x00b3
        L_0x01b2:
            X.11F r0 = r1.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x01c9
            X.3Os r3 = r2.A1k()
            java.lang.String r2 = X.C36371kC.A0x(r2)
            X.11F r1 = r7.A0H
            if (r1 == 0) goto L_0x0267
            r0 = 6
        L_0x01c5:
            X.AnonymousClass3Os.A00(r3, r1, r2, r0)
            goto L_0x019a
        L_0x01c9:
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x020f
            X.147 r1 = X.C36431kI.A0j(r7)
            if (r1 == 0) goto L_0x0201
            X.1LV r0 = r2.A02
            if (r0 == 0) goto L_0x027f
            X.147 r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0201
            X.12q r0 = r2.A0C
            if (r0 == 0) goto L_0x0278
            boolean r0 = r0.A0O(r1)
            if (r0 == 0) goto L_0x0201
            X.17X r0 = r2.A0D
            if (r0 == 0) goto L_0x0271
            boolean r0 = r0.A0C(r1)
            if (r0 == 0) goto L_0x0201
            X.3Os r3 = r2.A1k()
            java.lang.String r2 = X.C36371kC.A0x(r2)
            X.11F r1 = r7.A0H
            if (r1 == 0) goto L_0x026c
            r0 = 4
            goto L_0x01c5
        L_0x0201:
            X.3Os r3 = r2.A1k()
            java.lang.String r2 = X.C36371kC.A0x(r2)
            X.11F r1 = r7.A0H
            if (r1 == 0) goto L_0x0286
            r0 = 5
            goto L_0x01c5
        L_0x020f:
            X.3Os r3 = r2.A1k()
            java.lang.String r2 = X.C36371kC.A0x(r2)
            X.11F r1 = r7.A0H
            if (r1 == 0) goto L_0x028b
            r0 = 3
            goto L_0x01c5
        L_0x021d:
            X.4Rl r0 = r0.A0J
            if (r0 == 0) goto L_0x0224
            r0.Bem()
        L_0x0224:
            com.whatsapp.spamreport.ReportSpamDialogFragment r9 = r12.this$0
            boolean r11 = r12.$extraActionChecked
            X.141 r6 = r12.$contact
            X.141 r8 = r12.$senderContact
            X.141 r7 = r12.$contactToDisplay
            r12.label = r5
            X.02m r0 = X.AnonymousClass19R.A01
            r10 = 0
            com.whatsapp.spamreport.ReportSpamDialogFragment$triggerExtraAction$2 r5 = new com.whatsapp.spamreport.ReportSpamDialogFragment$triggerExtraAction$2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r12, r0, r5)
            if (r0 != r4) goto L_0x0013
            return r4
        L_0x023f:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x0244:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x0249:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x024e:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0253:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0258:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x025d:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0262:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r8)
            throw r0
        L_0x0267:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r8)
            throw r0
        L_0x026c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r8)
            throw r0
        L_0x0271:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0278:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x027f:
            java.lang.String r0 = "communityChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0286:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r8)
            throw r0
        L_0x028b:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r8)
            throw r0
        L_0x0290:
            java.lang.String r0 = "spamReportRepo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$reportAsSpam$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
