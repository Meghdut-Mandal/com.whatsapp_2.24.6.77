package com.whatsapp.registration.integritysignals;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3AJ;
import X.C009003v;
import X.C023509x;
import X.C12600iM;
import X.C36411kG;
import X.C68333bj;
import com.whatsapp.wamsys.JniBridge;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$getGpiaParameterAsync$2", f = "GpiaRegClient.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaRegClient$getGpiaParameterAsync$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ double $shaRetryDelay;
    public final /* synthetic */ String $token;
    public double D$0;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass3AJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaRegClient$getGpiaParameterAsync$2(AnonymousClass3AJ r2, String str, C023509x r4, double d, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$token = str;
        this.$errorCode = i;
        this.$shaRetryDelay = d;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new GpiaRegClient$getGpiaParameterAsync$2(this.this$0, this.$token, r9, this.$shaRetryDelay, this.$errorCode);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3AJ r0 = this.this$0;
            String str = this.$token;
            int i2 = this.$errorCode;
            double d = this.$shaRetryDelay;
            this.L$0 = r0;
            this.L$1 = str;
            this.I$0 = i2;
            this.D$0 = d;
            this.label = 1;
            C12600iM A16 = C36411kG.A16(this);
            long j = (long) i2;
            JniBridge.jvidispatchIIDOOOO(j, d, str, r0.A01.A00, new C68333bj(A16), ((JniBridge) r0.A05).wajContext.get());
            obj = A16.A00();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GpiaRegClient$getGpiaParameterAsync$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
