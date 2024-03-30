package X;

/* renamed from: X.7RD  reason: invalid class name */
public final class AnonymousClass7RD extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RD(C006302t r2) {
        super(1);
        this.$readObserver = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C1496472d r4 = (C1496472d) obj;
        synchronized (AnonymousClass6YQ.A07) {
            i = AnonymousClass6YQ.A00;
            AnonymousClass6YQ.A00 = i + 1;
        }
        return new C93884hI(r4, this.$readObserver, i);
    }
}
