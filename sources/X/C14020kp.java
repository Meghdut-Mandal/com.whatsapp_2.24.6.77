package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* renamed from: X.0kp  reason: invalid class name and case insensitive filesystem */
public final class C14020kp extends AnonymousClass0A0 {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C12960iw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14020kp(C023509x r1, C12960iw r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A03 = C12960iw.A03(this, this.this$0, (C15560nX) null, 0, 0);
        if (A03 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return new AnonymousClass0X8(A03);
        }
        return A03;
    }
}
