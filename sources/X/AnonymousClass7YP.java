package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1;

/* renamed from: X.7YP  reason: invalid class name */
public final class AnonymousClass7YP extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ AnonymousClass040 $coroutineScope;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ AnonymousClass7bG $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YP(AnonymousClass7bG r2, AnonymousClass040 r3, boolean z) {
        super(2);
        this.$isVertical = z;
        this.$coroutineScope = r3;
        this.$state = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float A03 = C36441kJ.A03(obj);
        float A032 = C36441kJ.A03(obj2);
        if (this.$isVertical) {
            A03 = A032;
        }
        C36331k8.A1T(new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1(this.$state, (C023509x) null, A03), this.$coroutineScope);
        return C36371kC.A0m();
    }
}
