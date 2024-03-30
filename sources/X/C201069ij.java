package X;

/* renamed from: X.9ij  reason: invalid class name and case insensitive filesystem */
public abstract class C201069ij {
    public final int A00;

    static {
        int length = "xml ".length();
        C200319h9.A01(C90504aG.A1U(length, 4));
        for (int i = 0; i < length; i++) {
            "xml ".charAt(i);
        }
    }

    public String toString() {
        return A00(this.A00);
    }

    public C201069ij(int i) {
        this.A00 = i;
    }

    public static String A00(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("");
        A0u.append((char) ((i >> 24) & 255));
        A0u.append((char) ((i >> 16) & 255));
        A0u.append((char) ((i >> 8) & 255));
        return AnonymousClass000.A0t(A0u, (char) (i & 255));
    }
}
