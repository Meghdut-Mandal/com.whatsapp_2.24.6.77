package X;

/* renamed from: X.7Tp  reason: invalid class name and case insensitive filesystem */
public final class C154807Tp extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $parentObserver;
    public final /* synthetic */ C006302t $writeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154807Tp(C006302t r2, C006302t r3) {
        super(1);
        this.$writeObserver = r2;
        this.$parentObserver = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$writeObserver.invoke(obj);
        this.$parentObserver.invoke(obj);
        return AnonymousClass0AJ.A00;
    }
}
