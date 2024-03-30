package X;

/* renamed from: X.4LP  reason: invalid class name */
public final class AnonymousClass4LP extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C26911Lz $session;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LP(C26911Lz r2) {
        super(1);
        this.$session = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3T1 r6 = (AnonymousClass3T1) obj;
        AnonymousClass00C.A0D(r6, 0);
        C224114e r4 = ((AnonymousClass1M0) this.$session).A02;
        String[] A1R = C36441kJ.A1R();
        C36351kA.A1V(A1R, 0, r6.A1N);
        return Integer.valueOf(r4.A03("message", "_id=?", "deleteMessageInBackground/DELETE_MESSAGE", A1R));
    }
}
