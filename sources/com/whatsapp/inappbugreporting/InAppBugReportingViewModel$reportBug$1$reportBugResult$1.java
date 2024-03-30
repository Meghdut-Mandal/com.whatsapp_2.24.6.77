package com.whatsapp.inappbugreporting;

import X.AnonymousClass000;
import X.AnonymousClass02R;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappbugreporting.InAppBugReportingViewModel$reportBug$1$reportBugResult$1", f = "InAppBugReportingViewModel.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
public final class InAppBugReportingViewModel$reportBug$1$reportBugResult$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $bugCategory;
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $title;
    public int label;
    public final /* synthetic */ InAppBugReportingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppBugReportingViewModel$reportBug$1$reportBugResult$1(InAppBugReportingViewModel inAppBugReportingViewModel, String str, String str2, String str3, C023509x r6) {
        super(2, r6);
        this.this$0 = inAppBugReportingViewModel;
        this.$title = str;
        this.$description = str2;
        this.$bugCategory = str3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new InAppBugReportingViewModel$reportBug$1$reportBugResult$1(this.this$0, this.$title, this.$description, this.$bugCategory, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            InAppBugReportingViewModel inAppBugReportingViewModel = this.this$0;
            ReportBugProtocolHelper reportBugProtocolHelper = inAppBugReportingViewModel.A0E;
            String str = this.$title;
            String str2 = this.$description;
            String str3 = inAppBugReportingViewModel.A03;
            String str4 = inAppBugReportingViewModel.A04;
            List A0Y = C007103b.A0Y(AnonymousClass02R.A0C(inAppBugReportingViewModel.A05));
            String str5 = this.$bugCategory;
            this.label = 1;
            obj = reportBugProtocolHelper.A00(str, str2, str3, str4, str5, A0Y, this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InAppBugReportingViewModel$reportBug$1$reportBugResult$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
