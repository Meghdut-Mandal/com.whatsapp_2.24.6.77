package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2;

/* renamed from: X.7UZ  reason: invalid class name */
public final class AnonymousClass7UZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass040 $coroutineScope;
    public final /* synthetic */ AnonymousClass00S $itemProviderLambda;
    public final /* synthetic */ AnonymousClass7bG $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UZ(AnonymousClass7bG r2, AnonymousClass00S r3, AnonymousClass040 r4) {
        super(1);
        this.$itemProviderLambda = r3;
        this.$coroutineScope = r4;
        this.$state = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        C159827jz r2 = (C159827jz) this.$itemProviderLambda.invoke();
        if (A0I < 0 || A0I >= ((C136776ey) r2).A01.A00.A00) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Can't scroll to index ");
            A0u.append(A0I);
            A0u.append(", it is out of bounds [0, ");
            throw AnonymousClass001.A08(C36321k7.A0G(A0u, ((C136776ey) r2).A01.A00.A00));
        }
        C36331k8.A1T(new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2(this.$state, (C023509x) null, A0I), this.$coroutineScope);
        return true;
    }
}
