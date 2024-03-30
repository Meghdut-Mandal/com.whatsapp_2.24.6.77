package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
/* renamed from: X.0kM  reason: invalid class name and case insensitive filesystem */
public final class C13730kM extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C12960iw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13730kM(C023509x r1, C12960iw r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A02 = C12960iw.A02(this, this.this$0);
        if (A02 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return new AnonymousClass0X8(A02);
        }
        return A02;
    }
}
