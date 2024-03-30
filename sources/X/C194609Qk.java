package X;

/* renamed from: X.9Qk  reason: invalid class name and case insensitive filesystem */
public class C194609Qk {
    public byte[] A00;
    public C199829g5 A01;

    public C194609Qk(C199829g5 r1, byte[] bArr) {
        this.A00 = bArr;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WtCertificateEntry{certData=");
        A0u.append(C203439o1.A04(this.A00));
        A0u.append(", wtExtensions=");
        return C90464aC.A0X(this.A01, A0u);
    }
}
