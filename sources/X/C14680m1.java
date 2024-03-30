package X;

/* renamed from: X.0m1  reason: invalid class name and case insensitive filesystem */
public final class C14680m1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Runnable $block;
    public final /* synthetic */ AnonymousClass03R this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14680m1(Runnable runnable, AnonymousClass03R r3) {
        super(1);
        this.this$0 = r3;
        this.$block = runnable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A00.removeCallbacks(this.$block);
        return AnonymousClass0AJ.A00;
    }
}
