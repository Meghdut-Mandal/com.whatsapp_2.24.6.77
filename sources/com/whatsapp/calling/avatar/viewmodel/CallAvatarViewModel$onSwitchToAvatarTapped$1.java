package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass52L;
import X.AnonymousClass52P;
import X.AnonymousClass5TV;
import X.AnonymousClass6WJ;
import X.C009003v;
import X.C023509x;
import X.C1042058r;
import X.C1258761r;
import X.C188448zb;
import X.C19970wo;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onSwitchToAvatarTapped$1", f = "CallAvatarViewModel.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$onSwitchToAvatarTapped$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $productSessionId;
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$onSwitchToAvatarTapped$1(CallAvatarViewModel callAvatarViewModel, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = callAvatarViewModel;
        this.$productSessionId = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CallAvatarViewModel$onSwitchToAvatarTapped$1(this.this$0, this.$productSessionId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            CallAvatarViewModel callAvatarViewModel = this.this$0;
            C1258761r r1 = callAvatarViewModel.A0A;
            C36341k9.A0w(C36351kA.A0A(r1.A01), "pref_last_avatar_calling_use_time", C19970wo.A00(callAvatarViewModel.A0E));
            this.this$0.A0F.A0D(AnonymousClass52P.A00);
            ArEffectsFlmConsentManager arEffectsFlmConsentManager = this.this$0.A04;
            this.label = 1;
            if (arEffectsFlmConsentManager.A03(this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (C36361kB.A1a(this.this$0.A04.A01(), C188448zb.DISABLED) || AnonymousClass00C.A0J(this.this$0.A04.A00, true)) {
            CallAvatarViewModel.A07(this.this$0, this.$productSessionId, false);
        } else {
            AnonymousClass6WJ r2 = this.this$0.A06;
            synchronized (r2) {
                C1042058r r12 = r2.A01;
                if (r12 != null && AnonymousClass6WJ.A03(AnonymousClass5TV.METADATA_FETCHED_OR_CONSENT_REQUESTED, r12)) {
                    r12.A00 = true;
                }
            }
            this.this$0.A0F.A0D(new AnonymousClass52L(this.$productSessionId));
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallAvatarViewModel$onSwitchToAvatarTapped$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
