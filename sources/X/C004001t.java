package X;

/* renamed from: X.01t  reason: invalid class name and case insensitive filesystem */
public final class C004001t extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass016 $viewModelStoreOwner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C004001t(AnonymousClass016 r2) {
        super(0);
        this.$viewModelStoreOwner = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass016 r4 = this.$viewModelStoreOwner;
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass08Y r3 = new AnonymousClass08Y();
        Class<C018808a> cls = C018808a.class;
        r3.A01(AnonymousClass08Z.A00, new C019308f(cls));
        return new AnonymousClass04H(r3.A00(), r4).A01(cls, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
