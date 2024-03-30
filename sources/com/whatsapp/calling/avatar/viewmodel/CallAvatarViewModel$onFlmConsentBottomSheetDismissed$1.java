package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass52L;
import X.AnonymousClass52S;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C07570Yj;
import X.C110285aQ;
import X.C1511278i;
import X.C36371kC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onFlmConsentBottomSheetDismissed$1", f = "CallAvatarViewModel.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$onFlmConsentBottomSheetDismissed$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C110285aQ $currentState;
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$onFlmConsentBottomSheetDismissed$1(CallAvatarViewModel callAvatarViewModel, C110285aQ r3, C023509x r4) {
        super(2, r4);
        this.this$0 = callAvatarViewModel;
        this.$currentState = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CallAvatarViewModel$onFlmConsentBottomSheetDismissed$1(this.this$0, this.$currentState, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C007403e r0 = this.this$0.A00;
            if (r0 != null) {
                this.label = 1;
                if (C07570Yj.A00(this, r0) == r2) {
                    return r2;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        boolean A1X = C36371kC.A1X(this.this$0.A04.A00, true);
        CallAvatarViewModel callAvatarViewModel = this.this$0;
        if (A1X) {
            CallAvatarViewModel.A07(callAvatarViewModel, ((AnonymousClass52L) this.$currentState).A00, false);
        } else {
            callAvatarViewModel.A06.A05(5);
            this.this$0.A0F.A0D(new AnonymousClass52S((C1511278i) null, false, true));
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallAvatarViewModel$onFlmConsentBottomSheetDismissed$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
