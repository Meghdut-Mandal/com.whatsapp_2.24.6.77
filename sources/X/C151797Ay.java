package X;

import com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit", f = "GpiaRegClientAsyncInit.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {52, 55}, m = "initPrepare", n = {"this", "retryDelay", "maxAttempts", "attempt", "this", "retryDelay", "maxAttempts", "attempt"}, s = {"L$0", "I$0", "I$1", "I$2", "L$0", "I$0", "I$1", "I$2"})
/* renamed from: X.7Ay  reason: invalid class name and case insensitive filesystem */
public final class C151797Ay extends AnonymousClass0A0 {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GpiaRegClientAsyncInit this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151797Ay(GpiaRegClientAsyncInit gpiaRegClientAsyncInit, C023509x r2) {
        super(r2);
        this.this$0 = gpiaRegClientAsyncInit;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GpiaRegClientAsyncInit.A00(this.this$0, this);
    }
}
