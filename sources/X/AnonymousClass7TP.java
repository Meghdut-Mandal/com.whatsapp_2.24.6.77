package X;

/* renamed from: X.7TP  reason: invalid class name */
public final class AnonymousClass7TP extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass0AP $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TP(AnonymousClass0AP r2) {
        super(1);
        this.$continuation = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0e;
        C203399nx r4 = (C203399nx) obj;
        AnonymousClass00C.A0D(r4, 0);
        C203399nx A0c = r4.A0c("fbid");
        if (A0c == null || (A0e = A0c.A0e()) == null || A0e.length() == 0) {
            this.$continuation.resumeWith(new C106075Ig(AnonymousClass001.A09("Received empty identifier")));
        } else {
            this.$continuation.resumeWith(new C106085Ih(A0e));
        }
        return AnonymousClass0AJ.A00;
    }
}
