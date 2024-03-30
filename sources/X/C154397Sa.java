package X;

/* renamed from: X.7Sa  reason: invalid class name and case insensitive filesystem */
public final class C154397Sa extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass0AP $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154397Sa(AnonymousClass0AP r2) {
        super(1);
        this.$continuation = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        AnonymousClass0AP r2 = this.$continuation;
        if (th == null) {
            th = AnonymousClass001.A09("Unknown error during cancellation");
        }
        r2.resumeWith(new AnonymousClass0AK(C90524aI.A0t(th)));
        return AnonymousClass0AJ.A00;
    }
}
