package X;

/* renamed from: X.624  reason: invalid class name */
public class AnonymousClass624 {
    public final String A00;
    public final String A01;

    public AnonymousClass624(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EncFileInfo{remotePath='");
        char A002 = C90484aE.A00(this.A01, A0u);
        A0u.append(", ivBase64='");
        A0u.append(this.A00);
        A0u.append(A002);
        return AnonymousClass000.A0s(A0u);
    }
}
