package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass3Os;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import X.C36371kC;
import X.C36421kH;
import X.C47442eb;
import X.C55372uW;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$observeState$1$1", f = "ReportSpamDialogFragment.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$observeState$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C55372uW $it;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$observeState$1$1(ReportSpamDialogFragment reportSpamDialogFragment, C55372uW r3, C023509x r4) {
        super(2, r4);
        this.this$0 = reportSpamDialogFragment;
        this.$it = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ReportSpamDialogFragment$observeState$1$1(this.this$0, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
            AnonymousClass141 r0 = ((C47442eb) this.$it).A00;
            this.label = 1;
            obj = ReportSpamDialogFragment.A03(r0, reportSpamDialogFragment, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        boolean A1X = AnonymousClass000.A1X(obj);
        ReportSpamDialogFragment.A07(this.this$0, false);
        ReportSpamDialogFragment reportSpamDialogFragment2 = this.this$0;
        C47442eb r02 = (C47442eb) this.$it;
        AnonymousClass141 r1 = r02.A00;
        AnonymousClass141 r2 = r02.A02;
        AnonymousClass3T1 r4 = r02.A03;
        ReportSpamDialogFragment.A05(r1, r2, r02.A01, r4, reportSpamDialogFragment2, r02.A06, r02.A05, r02.A04, r02.A07, A1X);
        AnonymousClass3Os A1k = this.this$0.A1k();
        String A0x = C36371kC.A0x(this.this$0);
        AnonymousClass11F A0O = C36421kH.A0O(this.this$0.A0Q);
        AnonymousClass3Os.A00(A1k, A0O, A0x, C36371kC.A1V(A0O) ? 1 : 0);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$observeState$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
