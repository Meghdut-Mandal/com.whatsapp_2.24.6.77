package androidx.compose.foundation.lazy;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass64S;
import X.AnonymousClass6SC;
import X.AnonymousClass7e0;
import X.C009003v;
import X.C023509x;
import X.C161167mI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LazyListState$scrollToItem$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public int label;
    public final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(LazyListState lazyListState, C023509x r3, int i, int i2) {
        super(2, r3);
        this.this$0 = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new LazyListState$scrollToItem$2(this.this$0, r6, this.$index, this.$scrollOffset);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            LazyListState lazyListState = this.this$0;
            int i = this.$index;
            int i2 = this.$scrollOffset;
            AnonymousClass6SC r1 = lazyListState.A0G;
            AnonymousClass6SC.A00(r1, i, i2);
            r1.A00 = null;
            AnonymousClass64S r12 = lazyListState.A0F;
            r12.A01.clear();
            r12.A00 = C161167mI.A00;
            AnonymousClass7e0 r0 = lazyListState.A06;
            if (r0 != null) {
                r0.B7Y();
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LazyListState$scrollToItem$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
