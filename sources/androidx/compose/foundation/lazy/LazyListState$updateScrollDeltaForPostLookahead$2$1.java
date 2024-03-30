package androidx.compose.foundation.lazy;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass7bL;
import X.C009003v;
import X.C023509x;
import X.C136286e8;
import X.C136306eA;
import X.C137126fd;
import X.C155267Vk;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$1", f = "LazyListState.kt", i = {}, l = {495}, m = "invokeSuspend", n = {}, s = {})
public final class LazyListState$updateScrollDeltaForPostLookahead$2$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListState$updateScrollDeltaForPostLookahead$2$1(LazyListState lazyListState, C023509x r3) {
        super(2, r3);
        this.this$0 = lazyListState;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new LazyListState$updateScrollDeltaForPostLookahead$2$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new LazyListState$updateScrollDeltaForPostLookahead$2$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            LazyListState lazyListState = this.this$0;
            AnonymousClass7bL r0 = LazyListState.A0R;
            C137126fd r9 = lazyListState.A03;
            Float f = new Float(0.0f);
            C136306eA r4 = new C136306eA(new Float(0.5f), 400.0f);
            this.label = 1;
            C155267Vk r11 = C155267Vk.A00;
            Object value = r9.A05.getValue();
            if (SuspendAnimationKt.A01(new C136286e8(r4, r9.A02, r9.A04, value, f), r9, this, r11, r9.A01) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
