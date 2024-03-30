package X;

/* renamed from: X.9Ql  reason: invalid class name and case insensitive filesystem */
public class C194619Ql {
    public short A00;
    public byte[] A01;

    public C194619Ql(byte[] bArr, short s) {
        this.A00 = s;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WtExtension{extensionType=");
        A0u.append(this.A00);
        A0u.append(", extensionData=");
        A0u.append(C203439o1.A04(this.A01));
        return AnonymousClass000.A0s(A0u);
    }
}
