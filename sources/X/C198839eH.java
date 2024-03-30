package X;

/* renamed from: X.9eH  reason: invalid class name and case insensitive filesystem */
public class C198839eH {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public C198839eH(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
    }

    public String toString() {
        StringBuilder A0p = C90484aE.A0p();
        A0p.append(this.A01);
        A0p.append(" ");
        A0p.append(this.A02);
        A0p.append(" ");
        A0p.append(this.A03);
        A0p.append(" ");
        A0p.append(this.A00);
        return C90474aD.A0g(A0p);
    }

    public C198839eH(C198839eH r2) {
        this.A01 = r2.A01;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A00 = r2.A00;
    }
}
