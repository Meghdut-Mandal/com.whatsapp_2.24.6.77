package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.C009003v;
import X.C023509x;
import X.C36381kD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogViewModel$getContactNameToDisplay$2", f = "ReportSpamDialogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogViewModel$getContactNameToDisplay$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $contactToDisplay;
    public int label;
    public final /* synthetic */ ReportSpamDialogViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogViewModel$getContactNameToDisplay$2(AnonymousClass141 r2, ReportSpamDialogViewModel reportSpamDialogViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = reportSpamDialogViewModel;
        this.$contactToDisplay = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ReportSpamDialogViewModel$getContactNameToDisplay$2(this.$contactToDisplay, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return C36381kD.A0v(this.this$0.A04, this.$contactToDisplay);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogViewModel$getContactNameToDisplay$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
