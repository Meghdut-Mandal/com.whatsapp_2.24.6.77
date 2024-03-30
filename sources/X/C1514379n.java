package X;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {221}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {})
/* renamed from: X.79n  reason: invalid class name and case insensitive filesystem */
public final class C1514379n extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1514379n(NestedScrollDispatcher nestedScrollDispatcher, C023509x r2) {
        super(r2);
        this.this$0 = nestedScrollDispatcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this, 0, 0);
    }
}
