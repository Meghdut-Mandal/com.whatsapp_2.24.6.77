package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
/* renamed from: X.0kZ  reason: invalid class name and case insensitive filesystem */
public final class C13860kZ extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C18480tE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13860kZ(C18480tE r1, C023509x r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.B6N((Object) null, this);
    }
}
