package X;

/* renamed from: X.9RD  reason: invalid class name */
public class AnonymousClass9RD {
    public AnonymousClass9QC A00;
    public AUW A01;
    public Integer A02;

    public AnonymousClass9RD(AnonymousClass9QC r1, AUW auw, Integer num) {
        this.A00 = r1;
        this.A01 = auw;
        this.A02 = num;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(String.valueOf(this.A00));
        A0u.append(" {...} (src=");
        if (this.A02.intValue() != 0) {
            str = "RenderOptions";
        } else {
            str = "Document";
        }
        A0u.append(str);
        return C90474aD.A0f(A0u);
    }
}
