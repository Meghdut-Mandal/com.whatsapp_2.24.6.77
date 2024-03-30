package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1, 1}, l = {223, 248}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
/* renamed from: X.7AR  reason: invalid class name */
public final class AnonymousClass7AR extends AnonymousClass0A0 {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AR(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C023509x r2) {
        super(r2);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.B1L(this, (C009003v) null, 0);
    }
}
