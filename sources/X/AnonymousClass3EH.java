package X;

/* renamed from: X.3EH  reason: invalid class name */
public class AnonymousClass3EH {
    public CharSequence A00 = "";
    public Runnable A01;
    public final AnonymousClass17Y A02;
    public final C95494lK A03;

    public void A00(CharSequence charSequence) {
        CharSequence charSequence2 = this.A00;
        AnonymousClass00C.A0D(charSequence, 1);
        if (charSequence2.length() <= 20 || charSequence.length() <= 20) {
            Runnable runnable = this.A01;
            if (runnable != null) {
                this.A02.A0G(runnable);
            }
            this.A00 = charSequence;
            C81203wd r3 = new C81203wd(this, charSequence, 21);
            this.A01 = r3;
            this.A02.A0I(r3, (long) 200);
        }
    }

    public AnonymousClass3EH(AnonymousClass17Y r2, C95494lK r3) {
        this.A02 = r2;
        this.A03 = r3;
    }
}
