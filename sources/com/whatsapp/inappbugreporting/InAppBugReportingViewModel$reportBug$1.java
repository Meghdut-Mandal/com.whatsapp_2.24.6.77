package com.whatsapp.inappbugreporting;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass2W2;
import X.AnonymousClass2W3;
import X.AnonymousClass2WV;
import X.AnonymousClass2WW;
import X.AnonymousClass3DD;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C54602tD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappbugreporting.InAppBugReportingViewModel$reportBug$1", f = "InAppBugReportingViewModel.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
public final class InAppBugReportingViewModel$reportBug$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $bugCategory;
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $title;
    public int label;
    public final /* synthetic */ InAppBugReportingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppBugReportingViewModel$reportBug$1(InAppBugReportingViewModel inAppBugReportingViewModel, String str, String str2, String str3, C023509x r6) {
        super(2, r6);
        this.this$0 = inAppBugReportingViewModel;
        this.$title = str;
        this.$description = str2;
        this.$bugCategory = str3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new InAppBugReportingViewModel$reportBug$1(this.this$0, this.$title, this.$description, this.$bugCategory, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass3DD r0;
        short s;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            InAppBugReportingViewModel inAppBugReportingViewModel = this.this$0;
            C005502l r02 = inAppBugReportingViewModel.A0H;
            InAppBugReportingViewModel$reportBug$1$reportBugResult$1 inAppBugReportingViewModel$reportBug$1$reportBugResult$1 = new InAppBugReportingViewModel$reportBug$1$reportBugResult$1(inAppBugReportingViewModel, this.$title, this.$description, this.$bugCategory, (C023509x) null);
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r02, inAppBugReportingViewModel$reportBug$1$reportBugResult$1);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C54602tD r10 = (C54602tD) obj;
        if (r10 instanceof AnonymousClass2WW) {
            this.this$0.A09.A0D(new AnonymousClass2W3(((AnonymousClass2WW) r10).A00));
            r0 = this.this$0.A0D;
            s = 2;
        } else {
            if (r10 instanceof AnonymousClass2WV) {
                this.this$0.A09.A0D(new AnonymousClass2W2(((AnonymousClass2WV) r10).A00));
                r0 = this.this$0.A0D;
                s = 87;
            }
            return AnonymousClass0AJ.A00;
        }
        r0.A00.markerEnd(476715896, s);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InAppBugReportingViewModel$reportBug$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
