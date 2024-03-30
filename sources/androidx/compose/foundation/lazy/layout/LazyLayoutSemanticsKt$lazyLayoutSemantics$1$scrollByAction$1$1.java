package androidx.compose.foundation.lazy.layout;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass7bG;
import X.C009003v;
import X.C023509x;
import X.C136306eA;
import X.C136856f6;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ float $delta;
    public final /* synthetic */ AnonymousClass7bG $state;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1(AnonymousClass7bG r2, C023509x r3, float f) {
        super(2, r3);
        this.$state = r2;
        this.$delta = f;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1(this.$state, r5, this.$delta);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass7bG r0 = this.$state;
            float f = this.$delta;
            this.label = 1;
            if (ScrollExtensionsKt.A00(new C136306eA((Object) null, 1500.0f), ((C136856f6) r0).A00, this, f) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
