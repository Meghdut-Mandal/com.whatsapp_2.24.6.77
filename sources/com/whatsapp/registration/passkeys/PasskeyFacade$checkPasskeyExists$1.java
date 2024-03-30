package com.whatsapp.registration.passkeys;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyFacade$checkPasskeyExists$1", f = "PasskeyFacade.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyFacade$checkPasskeyExists$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $callback;
    public int label;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyFacade$checkPasskeyExists$1(PasskeyFacade passkeyFacade, C023509x r3, C006302t r4) {
        super(2, r3);
        this.this$0 = passkeyFacade;
        this.$callback = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new PasskeyFacade$checkPasskeyExists$1(this.this$0, r5, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            PasskeyFacade passkeyFacade = this.this$0;
            this.label = 1;
            obj = passkeyFacade.A01(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.$callback.invoke(obj);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PasskeyFacade$checkPasskeyExists$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
