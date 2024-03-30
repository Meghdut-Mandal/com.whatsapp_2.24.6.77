package com.whatsapp.registration.passkeys;

import X.AnonymousClass000;
import X.AnonymousClass00S;
import X.AnonymousClass01L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyFacade$passkeyCreate$1", f = "PasskeyFacade.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyFacade$passkeyCreate$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass01L $activity;
    public final /* synthetic */ C006302t $onFinishRegisterResponse;
    public final /* synthetic */ AnonymousClass00S $onStartRegisterResponse;
    public int label;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyFacade$passkeyCreate$1(AnonymousClass01L r2, PasskeyFacade passkeyFacade, C023509x r4, AnonymousClass00S r5, C006302t r6) {
        super(2, r4);
        this.this$0 = passkeyFacade;
        this.$activity = r2;
        this.$onStartRegisterResponse = r5;
        this.$onFinishRegisterResponse = r6;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new PasskeyFacade$passkeyCreate$1(this.$activity, this.this$0, r8, this.$onStartRegisterResponse, this.$onFinishRegisterResponse);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            PasskeyFacade passkeyFacade = this.this$0;
            AnonymousClass01L r1 = this.$activity;
            AnonymousClass00S r0 = this.$onStartRegisterResponse;
            this.label = 1;
            obj = passkeyFacade.A02(r1, this, r0);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.$onFinishRegisterResponse.invoke(obj);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PasskeyFacade$passkeyCreate$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
