package com.whatsapp.spamreport;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$shouldHideCheckBoxContainer$2", f = "ReportSpamDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$shouldHideCheckBoxContainer$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $contact;
    public final /* synthetic */ AnonymousClass147 $contactGroupJid;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$shouldHideCheckBoxContainer$2(AnonymousClass141 r2, AnonymousClass147 r3, ReportSpamDialogFragment reportSpamDialogFragment, C023509x r5) {
        super(2, r5);
        this.this$0 = reportSpamDialogFragment;
        this.$contactGroupJid = r3;
        this.$contact = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
        return new ReportSpamDialogFragment$shouldHideCheckBoxContainer$2(this.$contact, this.$contactGroupJid, reportSpamDialogFragment, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r0 != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x00b7
            X.AnonymousClass0AN.A00(r7)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.12q r1 = r0.A0C
            if (r1 == 0) goto L_0x00b0
            X.147 r0 = r6.$contactGroupJid
            int r2 = r1.A05(r0)
            r1 = 3
            r5 = 0
            r4 = 1
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            if (r2 != r1) goto L_0x006d
            X.1LV r1 = r0.A02
            if (r1 == 0) goto L_0x009b
            X.147 r0 = r6.$contactGroupJid
            X.147 r3 = r1.A02(r0)
            if (r3 != 0) goto L_0x004b
            X.141 r0 = r6.$contact
            int r0 = r0.A03
            if (r0 == r4) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ReportSpamDialogFragment/nullParent/"
            r1.append(r0)
            X.147 r0 = r6.$contactGroupJid
            X.C36331k8.A1P(r0, r1)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.0wN r2 = r0.A00
            if (r2 == 0) goto L_0x0094
            X.00T r0 = r0.A0R
            java.lang.String r1 = X.C36431kI.A1E(r0)
            java.lang.String r0 = "ReportSpamDialogFragment/nullParent"
            r2.A0E(r0, r1, r4)
        L_0x004b:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.17X r1 = r0.A0D
            if (r1 == 0) goto L_0x008d
            X.147 r0 = r6.$contactGroupJid
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x0067
            if (r3 == 0) goto L_0x0068
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.17X r0 = r0.A0D
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.A0D(r3)
        L_0x0065:
            if (r0 == 0) goto L_0x0068
        L_0x0067:
            r5 = 1
        L_0x0068:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x006d:
            X.17X r1 = r0.A0D
            if (r1 == 0) goto L_0x00a9
            X.147 r0 = r6.$contactGroupJid
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0068
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.12q r1 = r0.A0C
            if (r1 == 0) goto L_0x00a2
            X.147 r0 = r6.$contactGroupJid
            boolean r0 = r1.A0S(r0)
            goto L_0x0065
        L_0x0086:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x008d:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0094:
            java.lang.String r0 = "crashLogs"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009b:
            java.lang.String r0 = "communityChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a2:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a9:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b0:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment$shouldHideCheckBoxContainer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$shouldHideCheckBoxContainer$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
