package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass52S;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C07570Yj;
import X.C1511278i;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onNewCallActive$1", f = "CallAvatarViewModel.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$onNewCallActive$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$onNewCallActive$1(CallAvatarViewModel callAvatarViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = callAvatarViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CallAvatarViewModel$onNewCallActive$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallAvatarViewModel$onNewCallActive$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C007403e r0 = this.this$0.A01;
            if (r0 != null) {
                r0.BL7();
            }
            C007403e r02 = this.this$0.A01;
            if (r02 != null) {
                this.label = 1;
                if (C07570Yj.A00(this, r02) == r2) {
                    return r2;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.this$0.A0F.A0D(new AnonymousClass52S((C1511278i) null, false, false));
        return AnonymousClass0AJ.A00;
    }
}
