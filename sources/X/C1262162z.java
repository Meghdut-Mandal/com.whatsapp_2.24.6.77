package X;

/* renamed from: X.62z  reason: invalid class name and case insensitive filesystem */
public class C1262162z {
    public final String A00;
    public final String A01;
    public final String A02;

    public C1262162z(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("KeyInfo{version='");
        char A002 = C90484aE.A00(this.A02, A0u);
        A0u.append(", accountHashBase64='");
        A0u.append(this.A00);
        A0u.append(A002);
        A0u.append(", serverSaltBase64='");
        A0u.append(this.A01);
        A0u.append(A002);
        return AnonymousClass000.A0s(A0u);
    }
}
