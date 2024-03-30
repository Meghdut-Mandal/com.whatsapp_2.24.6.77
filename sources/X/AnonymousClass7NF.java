package X;

/* renamed from: X.7NF  reason: invalid class name */
public final class AnonymousClass7NF extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C140336lQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NF(C140336lQ r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6E4 A00 = C130366Ku.A00();
        A00.A05 = true;
        A00.A00(0.0d);
        C140336lQ r1 = this.this$0;
        if (r1 != null) {
            A00.A04.add(r1);
            return A00;
        }
        throw AnonymousClass001.A08("newListener is required");
    }
}
