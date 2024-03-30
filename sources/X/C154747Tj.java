package X;

/* renamed from: X.7Tj  reason: invalid class name and case insensitive filesystem */
public final class C154747Tj extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass0AP $co;
    public final /* synthetic */ C122035uC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154747Tj(C122035uC r2, AnonymousClass0AP r3) {
        super(1);
        this.this$0 = r2;
        this.$co = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122035uC r0 = this.this$0;
        Object obj2 = r0.A03;
        AnonymousClass0AP r1 = this.$co;
        synchronized (obj2) {
            r0.A00.remove(r1);
        }
        return AnonymousClass0AJ.A00;
    }
}
