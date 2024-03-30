package X;

import androidx.compose.ui.platform.WrappedComposition;

/* renamed from: X.7Tv  reason: invalid class name and case insensitive filesystem */
public final class C154867Tv extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C009003v $content;
    public final /* synthetic */ WrappedComposition this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154867Tv(WrappedComposition wrappedComposition, C009003v r3) {
        super(1);
        this.this$0 = wrappedComposition;
        this.$content = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C118345nj r6 = (C118345nj) obj;
        if (!this.this$0.A02) {
            AnonymousClass01M lifecycle = r6.A00.getLifecycle();
            WrappedComposition wrappedComposition = this.this$0;
            wrappedComposition.A01 = this.$content;
            if (wrappedComposition.A00 == null) {
                wrappedComposition.A00 = lifecycle;
                lifecycle.A04(wrappedComposition);
            } else if (((AnonymousClass01N) lifecycle).A02.compareTo(AnonymousClass01P.CREATED) >= 0) {
                WrappedComposition wrappedComposition2 = this.this$0;
                wrappedComposition2.A03.Bqa(new C1509977p(-2000640158, new AnonymousClass7YK(wrappedComposition2, this.$content), true));
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
