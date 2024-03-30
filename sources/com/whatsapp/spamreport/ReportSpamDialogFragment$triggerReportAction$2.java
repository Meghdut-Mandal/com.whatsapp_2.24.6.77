package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.AnonymousClass2dJ;
import X.C009003v;
import X.C023509x;
import X.C36331k8;
import X.C36431kI;
import X.C63633Ku;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$triggerReportAction$2", f = "ReportSpamDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$triggerReportAction$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $contact;
    public final /* synthetic */ List $selectedMessages;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$triggerReportAction$2(AnonymousClass141 r2, ReportSpamDialogFragment reportSpamDialogFragment, List list, C023509x r5) {
        super(2, r5);
        this.this$0 = reportSpamDialogFragment;
        this.$contact = r2;
        this.$selectedMessages = list;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ReportSpamDialogFragment$triggerReportAction$2(this.$contact, this.this$0, this.$selectedMessages, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
            C63633Ku r3 = reportSpamDialogFragment.A07;
            if (r3 != null) {
                r3.A01(this.$contact, C36431kI.A1E(reportSpamDialogFragment.A0R), this.$selectedMessages);
                return AnonymousClass2dJ.A00;
            }
            throw C36331k8.A0d("spamReportManager");
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$triggerReportAction$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
