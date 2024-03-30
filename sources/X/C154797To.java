package X;

/* renamed from: X.7To  reason: invalid class name and case insensitive filesystem */
public final class C154797To extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $parentObserver;
    public final /* synthetic */ C006302t $readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154797To(C006302t r2, C006302t r3) {
        super(1);
        this.$readObserver = r2;
        this.$parentObserver = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$readObserver.invoke(obj);
        this.$parentObserver.invoke(obj);
        return AnonymousClass0AJ.A00;
    }
}
