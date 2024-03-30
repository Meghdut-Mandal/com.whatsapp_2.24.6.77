package com.whatsapp.registration.integritysignals;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$calculateGpiaParameter$1", f = "GpiaRegClient.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaRegClient$calculateGpiaParameter$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ String $token;
    public int label;
    public final /* synthetic */ AnonymousClass3AJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaRegClient$calculateGpiaParameter$1(AnonymousClass3AJ r2, String str, C023509x r4, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$token = str;
        this.$errorCode = i;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new GpiaRegClient$calculateGpiaParameter$1(this.this$0, this.$token, r6, this.$errorCode);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3AJ r4 = this.this$0;
            String str = this.$token;
            int i2 = this.$errorCode;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r4.A06, new GpiaRegClient$getGpiaParameterAsync$2(r4, str, (C023509x) null, 0.0d, i2));
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GpiaRegClient$calculateGpiaParameter$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
