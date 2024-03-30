package X;

import android.view.View;

/* renamed from: X.7OF  reason: invalid class name */
public final class AnonymousClass7OF extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ int $id;
    public final /* synthetic */ View $this_viewStubHolders;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OF(View view, int i) {
        super(0);
        this.$this_viewStubHolders = view;
        this.$id = i;
    }

    public static AnonymousClass00T A00(View view, C000800j r2, int i) {
        return C001400p.A00(r2, new AnonymousClass7OF(view, i));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return C90464aC.A0J(this.$this_viewStubHolders, this.$id);
    }
}
