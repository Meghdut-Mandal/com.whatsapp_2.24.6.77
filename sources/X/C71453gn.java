package X;

/* renamed from: X.3gn  reason: invalid class name and case insensitive filesystem */
public class C71453gn implements C159417jK {
    public final C19630wG A00;
    public final C21010yW A01;
    public final AnonymousClass1CR A02;

    public void BV1() {
        if (new C007203c(this.A00.A00).A01()) {
            AnonymousClass2TB r2 = new AnonymousClass2TB();
            AnonymousClass1CR r0 = this.A02;
            AnonymousClass3LI A0R = r0.A0R();
            AnonymousClass3LI A0Q = r0.A0Q();
            r2.A01 = Boolean.valueOf(A0Q.A0B());
            int i = 1;
            r2.A00 = C36441kJ.A0x(A0Q.A02().A0H);
            r2.A04 = Integer.valueOf(C36391kE.A00(A0Q.A02().A0D.equals(A0Q.A0D) ? 1 : 0));
            r2.A03 = Boolean.valueOf(A0R.A0B());
            r2.A02 = C36441kJ.A0x(A0R.A02().A0H);
            if (!A0R.A02().A0D.equals(A0R.A0D)) {
                i = 2;
            }
            r2.A05 = Integer.valueOf(i);
            this.A01.Blv(r2);
        }
    }

    public C71453gn(C19630wG r1, C21010yW r2, AnonymousClass1CR r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
