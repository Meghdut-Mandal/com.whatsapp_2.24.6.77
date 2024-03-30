package X;

/* renamed from: X.Ahl  reason: case insensitive filesystem */
public final class C22162Ahl extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C193839Nb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22162Ahl(C193839Nb r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C193839Nb r0 = this.this$0;
        C197769cL r1 = r0.A02;
        C019108d r2 = r0.A04;
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass004 r02 = (AnonymousClass004) C90514aH.A16(r1.A02).get(r2);
        if (r02 != null) {
            return r02.get();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Subsystem ");
        A0u.append(r2.BGN());
        throw new C176688cW(AnonymousClass000.A0q(" was not registered.", A0u));
    }
}
