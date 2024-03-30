package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00S;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onFlmConsentBottomSheetPrimaryButtonClicked$1", f = "CallAvatarViewModel.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$onFlmConsentBottomSheetPrimaryButtonClicked$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass00S $onFailure;
    public final /* synthetic */ AnonymousClass00S $onSuccess;
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$onFlmConsentBottomSheetPrimaryButtonClicked$1(CallAvatarViewModel callAvatarViewModel, C023509x r3, AnonymousClass00S r4, AnonymousClass00S r5) {
        super(2, r3);
        this.this$0 = callAvatarViewModel;
        this.$onSuccess = r4;
        this.$onFailure = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new CallAvatarViewModel$onFlmConsentBottomSheetPrimaryButtonClicked$1(this.this$0, r6, this.$onSuccess, this.$onFailure);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                ArEffectsFlmConsentManager arEffectsFlmConsentManager = this.this$0.A04;
                this.label = 1;
                if (arEffectsFlmConsentManager.A02(true, this) == r3) {
                    return r3;
                }
            } catch (IOException unused) {
                this.$onFailure.invoke();
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.$onSuccess.invoke();
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallAvatarViewModel$onFlmConsentBottomSheetPrimaryButtonClicked$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
