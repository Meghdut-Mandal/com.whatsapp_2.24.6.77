package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import X.C188648zz;
import X.C64933Qa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogViewModel$getSelectedMessage$2", f = "ReportSpamDialogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogViewModel$getSelectedMessage$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $entryPoint;
    public final /* synthetic */ C64933Qa $selectedMessageKey;
    public int label;
    public final /* synthetic */ ReportSpamDialogViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogViewModel$getSelectedMessage$2(C64933Qa r2, ReportSpamDialogViewModel reportSpamDialogViewModel, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = reportSpamDialogViewModel;
        this.$selectedMessageKey = r2;
        this.$entryPoint = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ReportSpamDialogViewModel$getSelectedMessage$2(this.$selectedMessageKey, this.this$0, this.$entryPoint, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3T1 A03 = this.this$0.A0C.A03(this.$selectedMessageKey);
            if (A03 == null) {
                this.this$0.A07.A00(C188648zz.A0Y, this.$entryPoint);
            }
            return A03;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogViewModel$getSelectedMessage$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
