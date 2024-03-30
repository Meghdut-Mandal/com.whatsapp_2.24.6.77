package X;

/* renamed from: X.Al6  reason: case insensitive filesystem */
public final class C22344Al6 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass9OE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22344Al6(AnonymousClass9OE r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Stopped gatt = ");
        AnonymousClass6YR.A06("lam:LinkedDeviceManager", C36421kH.A0d(A0u, AnonymousClass000.A1V(obj)));
        AnonymousClass9OE r0 = this.this$0;
        C198939eR r5 = r0.A02;
        C22343Al5 al5 = new C22343Al5(r0);
        C22548AoY aoY = new C22548AoY(r0);
        if (r5.A00 != null) {
            aoY.invoke(r5, AnonymousClass001.A09("already started"));
        } else {
            r5.A05.execute(new C1503374w(aoY, al5, r5, 23));
        }
        return AnonymousClass0AJ.A00;
    }
}
