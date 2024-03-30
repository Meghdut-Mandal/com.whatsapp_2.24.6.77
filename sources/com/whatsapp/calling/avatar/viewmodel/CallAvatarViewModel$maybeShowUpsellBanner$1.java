package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6X5;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C1258761r;
import X.C19970wo;
import X.C36341k9;
import X.C36351kA;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$maybeShowUpsellBanner$1", f = "CallAvatarViewModel.kt", i = {}, l = {650}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$maybeShowUpsellBanner$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$maybeShowUpsellBanner$1(CallAvatarViewModel callAvatarViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = callAvatarViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CallAvatarViewModel$maybeShowUpsellBanner$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallAvatarViewModel$maybeShowUpsellBanner$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            if (C07330Xf.A00(this, AnonymousClass6X5.A0L) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (CallAvatarViewModel.A08(this.this$0)) {
            this.this$0.A0G.A0D((Object) null);
            CallAvatarViewModel callAvatarViewModel = this.this$0;
            C1258761r r1 = callAvatarViewModel.A0A;
            C36341k9.A0w(C36351kA.A0A(r1.A01), "pref_last_upsell_banner_shown_time", C19970wo.A00(callAvatarViewModel.A0E));
        }
        this.this$0.A02 = null;
        return AnonymousClass0AJ.A00;
    }
}
