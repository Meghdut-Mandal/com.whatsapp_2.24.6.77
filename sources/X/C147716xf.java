package X;

/* renamed from: X.6xf  reason: invalid class name and case insensitive filesystem */
public class C147716xf implements C236119d {
    public final /* synthetic */ C1256260q A00;
    public final /* synthetic */ C25711Hj A01;
    public final /* synthetic */ C25711Hj A02;

    public C147716xf(C1256260q r1, C25711Hj r2, C25711Hj r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BVN(String str) {
        this.A02.accept(C90494aF.A0U());
    }

    public void BWw(C203399nx r3, String str) {
        this.A02.accept(Integer.valueOf(r3.A0d("error").A0R("code")));
    }

    public void BiM(C203399nx r3, String str) {
        this.A01.accept(r3.A0d("link_code_companion_reg").A0d("link_code_pairing_ref").A0e());
    }
}
