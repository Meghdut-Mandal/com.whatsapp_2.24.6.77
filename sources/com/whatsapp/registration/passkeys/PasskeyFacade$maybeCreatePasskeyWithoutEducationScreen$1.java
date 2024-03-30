package com.whatsapp.registration.passkeys;

import X.AnonymousClass000;
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

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1", f = "PasskeyFacade.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass01L $activity;
    public final /* synthetic */ C006302t $callback;
    public int label;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1(AnonymousClass01L r2, PasskeyFacade passkeyFacade, C023509x r4, C006302t r5) {
        super(2, r4);
        this.this$0 = passkeyFacade;
        this.$activity = r2;
        this.$callback = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1(this.$activity, this.this$0, r6, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            PasskeyFacade passkeyFacade = this.this$0;
            AnonymousClass01L r0 = this.$activity;
            this.label = 1;
            obj = passkeyFacade.A00(r0, this);
            if (obj == r3) {
                return r3;
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
        return ((PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
