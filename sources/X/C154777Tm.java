package X;

/* renamed from: X.7Tm  reason: invalid class name and case insensitive filesystem */
public final class C154777Tm extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $readObserver;
    public final /* synthetic */ C006302t $writeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154777Tm(C006302t r2, C006302t r3) {
        super(1);
        this.$readObserver = r2;
        this.$writeObserver = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C1496472d r5 = (C1496472d) obj;
        synchronized (AnonymousClass6YQ.A07) {
            i = AnonymousClass6YQ.A00;
            AnonymousClass6YQ.A00 = i + 1;
        }
        return new C93904hK(r5, this.$readObserver, this.$writeObserver, i);
    }
}
