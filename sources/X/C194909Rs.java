package X;

/* renamed from: X.9Rs  reason: invalid class name and case insensitive filesystem */
public class C194909Rs {
    public final AnonymousClass11F A00;
    public final AnonymousClass11F A01;
    public final Long[] A02;
    public final String[] A03;

    public C194909Rs(AnonymousClass11F r1, AnonymousClass11F r2, Long[] lArr, String[] strArr) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = lArr;
        this.A03 = strArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("toJid=");
        A0u.append(this.A01);
        A0u.append("; participant=");
        A0u.append(this.A00);
        A0u.append("; rowIds=");
        C90514aH.A1T(A0u, this.A02);
        A0u.append("; ids=");
        C90514aH.A1T(A0u, this.A03);
        return A0u.toString();
    }
}
