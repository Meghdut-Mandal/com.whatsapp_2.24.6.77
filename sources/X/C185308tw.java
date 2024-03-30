package X;

/* renamed from: X.8tw  reason: invalid class name and case insensitive filesystem */
public class C185308tw extends C118095nK implements C22837Awm {
    public Object A00;
    public Object A01;

    public C185308tw(C203399nx r3, int i) {
        int i2;
        C22993Azj azj;
        switch (i) {
            case 0:
                C203399nx.A0A(r3, "participant");
                i2 = 0;
                this.A00 = C203539oF.A02(r3, C21500ANw.A00, 0);
                azj = C21501ANx.A00;
                break;
            case 1:
                C203399nx.A0A(r3, "participant");
                i2 = 0;
                this.A00 = C203539oF.A02(r3, C21502ANy.A00, 0);
                azj = C21503ANz.A00;
                break;
            default:
                C203399nx.A0A(r3, "participant");
                this.A01 = C203539oF.A02(r3, AO1.A00, 0);
                this.A00 = C203539oF.A02(r3, AO2.A00, 0);
                break;
        }
        this.A01 = C203539oF.A02(r3, azj, i2);
        this.A00 = r3;
    }
}
