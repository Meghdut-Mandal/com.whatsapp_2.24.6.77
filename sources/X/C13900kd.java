package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {431, 434}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
/* renamed from: X.0kd  reason: invalid class name and case insensitive filesystem */
public final class C13900kd extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C15200mr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13900kd(C023509x r1, C15200mr r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C15200mr.A02(this, this.this$0);
    }
}
