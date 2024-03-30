package X;

/* renamed from: X.7R0  reason: invalid class name */
public final class AnonymousClass7R0 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C94454iF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7R0(C94454iF r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass72L r5 = (AnonymousClass72L) obj;
        C94454iF r2 = this.this$0;
        C161547n5 r3 = r2.A0D;
        C128276Bp r1 = (C128276Bp) r3.getValue();
        if (r1 == null) {
            C128276Bp r12 = new C128276Bp(r2.A03, r5);
            AnonymousClass6V8 r6 = r2.A04;
            C157027bi r7 = r2.A05;
            int i = r2.A02;
            boolean z = r2.A0A;
            AnonymousClass65H r4 = new AnonymousClass65H(r5, r6, r7, r2.A06, i, r2.A00, r2.A01, z);
            r4.A00(C94454iF.A00(r2).A09);
            r12.A00 = r4;
            r3.setValue(r12);
        } else if (!AnonymousClass00C.A0J(r5, r1.A01)) {
            r1.A01 = r5;
            AnonymousClass65H r0 = r1.A00;
            if (r0 != null) {
                C94454iF.A01(r0, r2, r5);
            }
        }
        AnonymousClass6VZ.A05(this.this$0);
        return C36371kC.A0m();
    }
}
