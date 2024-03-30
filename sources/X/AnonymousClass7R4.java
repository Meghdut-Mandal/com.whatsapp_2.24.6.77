package X;

/* renamed from: X.7R4  reason: invalid class name */
public final class AnonymousClass7R4 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C94444iE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7R4(C94444iE r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C94444iE r4 = this.this$0;
        String str = ((AnonymousClass72L) obj).A00;
        C161547n5 r2 = r4.A0A;
        C128286Bq r1 = (C128286Bq) r2.getValue();
        if (r1 == null) {
            C128286Bq r12 = new C128286Bq(r4.A05, str);
            AnonymousClass6NV r5 = new AnonymousClass6NV(r4.A03, r4.A04, str, r4.A02, r4.A00, r4.A01, r4.A07);
            r5.A01(C94444iE.A00(r4).A0A);
            r12.A00 = r5;
            r2.setValue(r12);
        } else if (!AnonymousClass00C.A0J(str, r1.A01)) {
            r1.A01 = str;
            AnonymousClass6NV r7 = r1.A00;
            if (r7 != null) {
                AnonymousClass6V8 r6 = r4.A03;
                C157027bi r52 = r4.A04;
                int i = r4.A02;
                boolean z = r4.A07;
                int i2 = r4.A00;
                int i3 = r4.A01;
                r7.A0C = str;
                r7.A08 = r6;
                r7.A09 = r52;
                r7.A02 = i;
                r7.A0E = z;
                r7.A00 = i2;
                r7.A01 = i3;
                AnonymousClass6NV.A00(r7);
            }
        }
        AnonymousClass6VZ.A05(this.this$0);
        return C36371kC.A0m();
    }
}
