package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
/* renamed from: X.0kU  reason: invalid class name and case insensitive filesystem */
public final class C13810kU extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C13090j9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13810kU(C023509x r1, C13090j9 r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.B36(this, (AnonymousClass05G) null);
    }
}
