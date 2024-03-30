package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass528;
import X.AnonymousClass52Q;
import X.AnonymousClass52S;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C07570Yj;
import X.C1511278i;
import X.C18740tg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onSwitchToVideoTapped$1", f = "CallAvatarViewModel.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$onSwitchToVideoTapped$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$onSwitchToVideoTapped$1(CallAvatarViewModel callAvatarViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = callAvatarViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CallAvatarViewModel$onSwitchToVideoTapped$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallAvatarViewModel$onSwitchToVideoTapped$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
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
        this.this$0.A06.A04(1);
        if (this.this$0.A0F.A04() instanceof AnonymousClass52Q) {
            try {
                if (this.this$0.A07.A00.disableAREffect()) {
                    this.this$0.A0F.A0D(new AnonymousClass52S((C1511278i) null, false, false));
                } else {
                    throw AnonymousClass528.A00;
                }
            } catch (C1511278i e) {
                this.this$0.A0F.A0D(new AnonymousClass52S(e, false, false));
            }
        }
        C18740tg.A0D(this.this$0.A0F.A04() instanceof AnonymousClass52S, "Avatar view state is expected to be Disabled");
        return AnonymousClass0AJ.A00;
    }
}
