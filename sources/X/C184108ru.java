package X;

/* renamed from: X.8ru  reason: invalid class name and case insensitive filesystem */
public class C184108ru extends C118095nK {
    public Object A00;

    public C184108ru(C203399nx r3, int i) {
        C22993Azj azj;
        String str;
        if (i != 0) {
            C203399nx.A0A(r3, "pay");
            azj = C21403AKd.A00;
            str = "merchant";
        } else {
            C203399nx.A0A(r3, "pay");
            azj = C21400AKa.A00;
            str = "card";
        }
        this.A00 = C203539oF.A03(r3, azj, str);
        this.A00 = r3;
    }
}
