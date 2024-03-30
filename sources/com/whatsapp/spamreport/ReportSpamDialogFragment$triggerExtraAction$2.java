package com.whatsapp.spamreport;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass141;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$triggerExtraAction$2", f = "ReportSpamDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$triggerExtraAction$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $contact;
    public final /* synthetic */ AnonymousClass141 $contactToDisplay;
    public final /* synthetic */ boolean $extraActionChecked;
    public final /* synthetic */ AnonymousClass141 $senderContact;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$triggerExtraAction$2(AnonymousClass141 r2, AnonymousClass141 r3, AnonymousClass141 r4, ReportSpamDialogFragment reportSpamDialogFragment, C023509x r6, boolean z) {
        super(2, r6);
        this.$contact = r2;
        this.this$0 = reportSpamDialogFragment;
        this.$contactToDisplay = r3;
        this.$extraActionChecked = z;
        this.$senderContact = r4;
    }

    public final C023509x create(Object obj, C023509x r9) {
        AnonymousClass141 r1 = this.$contact;
        ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
        return new ReportSpamDialogFragment$triggerExtraAction$2(r1, this.$contactToDisplay, this.$senderContact, reportSpamDialogFragment, r9, this.$extraActionChecked);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r1.A0C() == false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            if (r0 != 0) goto L_0x01a5
            X.AnonymousClass0AN.A00(r15)
            X.141 r0 = r14.$contact
            X.147 r2 = X.C36431kI.A0j(r0)
            r4 = 1
            if (r2 == 0) goto L_0x003d
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            X.12q r0 = r0.A0C
            if (r0 == 0) goto L_0x019e
            int r0 = r0.A05(r2)
            if (r0 != r4) goto L_0x003d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ReportSpamDialogFragment/sendingParent/"
            r1.append(r0)
            X.141 r0 = r14.$contact
            X.11F r0 = r0.A0H
            X.C36331k8.A1P(r0, r1)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            X.0wN r3 = r0.A00
            if (r3 == 0) goto L_0x0197
            X.00T r0 = r0.A0R
            java.lang.String r1 = X.C36431kI.A1E(r0)
            java.lang.String r0 = "ReportSpamDialogFragment/sendingParent"
            r3.A0E(r0, r1, r4)
        L_0x003d:
            X.141 r1 = r14.$contactToDisplay
            boolean r0 = r14.$extraActionChecked
            if (r0 == 0) goto L_0x004a
            boolean r0 = r1.A0C()
            r6 = 1
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            com.whatsapp.spamreport.ReportSpamDialogFragment r5 = r14.this$0
            X.17Y r3 = r5.A01
            if (r3 == 0) goto L_0x0192
            X.0wG r1 = r5.A09
            if (r1 == 0) goto L_0x018b
            X.171 r0 = r5.A05
            if (r0 == 0) goto L_0x0186
            X.3f3 r4 = new X.3f3
            r4.<init>(r3, r0, r1, r5)
            X.00T r0 = r5.A0Y
            int r1 = X.C36331k8.A02(r0)
            r0 = 2
            r5 = 0
            if (r1 != r0) goto L_0x009c
            boolean r0 = r14.$extraActionChecked
            if (r0 == 0) goto L_0x0081
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            X.3Ku r2 = r0.A07
            if (r2 == 0) goto L_0x0150
            X.141 r1 = r14.$contact
            java.lang.Class<X.1Uw> r0 = X.C28981Uw.class
            com.whatsapp.jid.Jid r1 = X.C36381kD.A0e(r1, r0)
            X.1Uw r1 = (X.C28981Uw) r1
            X.1Zi r0 = r2.A03
            r0.A0A(r1)
        L_0x0081:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r4.A03
            X.0yC r1 = r0.A02
            r0 = 6145(0x1801, float:8.611E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0099
            X.0wG r1 = r4.A01
            r0 = 2131888336(0x7f1208d0, float:1.9411304E38)
            java.lang.String r0 = X.C36371kC.A0v(r1, r0)
            X.C70373f3.A00(r4, r0)
        L_0x0099:
            X.0AJ r5 = X.AnonymousClass0AJ.A00
        L_0x009b:
            return r5
        L_0x009c:
            if (r6 != 0) goto L_0x0149
            boolean r0 = r14.$extraActionChecked
            if (r0 == 0) goto L_0x0149
            X.141 r0 = r14.$senderContact
            if (r0 == 0) goto L_0x00e8
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            X.00T r0 = r0.A0Y
            int r0 = X.C36331k8.A02(r0)
            if (r0 != 0) goto L_0x00e8
            X.141 r8 = r14.$senderContact
        L_0x00b2:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            X.3Ku r2 = r0.A07
            if (r2 == 0) goto L_0x0157
            X.01I r6 = r0.A0i()
            X.C18740tg.A06(r8)
            r7 = 0
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            X.00T r0 = r0.A0W
            boolean r1 = X.C36331k8.A1b(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            X.00T r0 = r0.A0R
            java.lang.String r13 = X.C36431kI.A1E(r0)
            com.whatsapp.jid.UserJid r9 = X.C36351kA.A0k(r8)
            X.1NG r5 = r2.A01
            r11 = r7
            r12 = r7
            r10 = r7
            r5.A0F(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 == 0) goto L_0x00e4
            X.1X4 r1 = r2.A00
            r0 = 1
            r1.A0P(r9, r0)
        L_0x00e4:
            r4.BkA(r8)
            goto L_0x0099
        L_0x00e8:
            X.141 r0 = r14.$contact
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x00f3
            X.141 r8 = r14.$contact
            goto L_0x00b2
        L_0x00f3:
            if (r2 == 0) goto L_0x0132
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r14.this$0
            X.1LV r0 = r1.A02
            if (r0 == 0) goto L_0x0178
            X.147 r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x0132
            X.12q r0 = r1.A0C
            if (r0 == 0) goto L_0x0171
            boolean r0 = r0.A0O(r2)
            if (r0 == 0) goto L_0x0132
            X.17X r0 = r1.A0D
            if (r0 == 0) goto L_0x016a
            boolean r0 = r0.A0C(r2)
            if (r0 == 0) goto L_0x0132
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            com.whatsapp.spamreport.ReportSpamDialogFragment.A06(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            X.1LV r0 = r0.A02
            if (r0 == 0) goto L_0x0163
            X.147 r3 = r0.A02(r2)
            if (r3 == 0) goto L_0x009b
            com.whatsapp.spamreport.ReportSpamDialogFragment r2 = r14.this$0
            X.17Y r1 = r2.A01
            if (r1 == 0) goto L_0x015e
            r0 = 5
            X.C81203wd.A00(r1, r2, r3, r0)
            goto L_0x0099
        L_0x0132:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            X.3Ku r3 = r0.A07
            if (r3 == 0) goto L_0x017f
            X.141 r2 = r14.$contact
            X.00T r0 = r0.A0W
            boolean r1 = X.C36331k8.A1b(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            boolean r0 = r0.A0O
            r3.A00(r4, r2, r1, r0)
            goto L_0x0099
        L_0x0149:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r14.this$0
            com.whatsapp.spamreport.ReportSpamDialogFragment.A06(r0)
            goto L_0x0099
        L_0x0150:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0157:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x015e:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0163:
            java.lang.String r0 = "communityChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x016a:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0171:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0178:
            java.lang.String r0 = "communityChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x017f:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0186:
            java.lang.RuntimeException r0 = X.C36331k8.A0c()
            throw r0
        L_0x018b:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0192:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0197:
            java.lang.String r0 = "crashLogs"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x019e:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment$triggerExtraAction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$triggerExtraAction$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
