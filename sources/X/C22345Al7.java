package X;

/* renamed from: X.Al7  reason: case insensitive filesystem */
public final class C22345Al7 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass9OE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22345Al7(AnonymousClass9OE r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9U8 r5 = (AnonymousClass9U8) obj;
        StringBuilder A0i = C36341k9.A0i(r5);
        A0i.append("Started l2cap (");
        AnonymousClass6YR.A06("lam:LinkedDeviceManager", AnonymousClass000.A0m(r5.A00(), A0i));
        AnonymousClass9OE r2 = this.this$0;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("startGattServer for nextUuid=");
        AnonymousClass6YR.A06("lam:LinkedDeviceManager", AnonymousClass000.A0o(r2.A00.A02, A0u));
        r2.A02.A00(new C22344Al6(r2));
        return AnonymousClass0AJ.A00;
    }
}
