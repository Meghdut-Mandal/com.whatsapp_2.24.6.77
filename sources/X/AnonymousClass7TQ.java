package X;

/* renamed from: X.7TQ  reason: invalid class name */
public final class AnonymousClass7TQ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass0AP $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TQ(AnonymousClass0AP r2) {
        super(1);
        this.$continuation = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5V6 A0d = C90514aH.A0d(obj);
        this.$continuation.resumeWith(new C106095Ii(A0d, AnonymousClass3ME.A00(A0d.node)));
        return AnonymousClass0AJ.A00;
    }
}
