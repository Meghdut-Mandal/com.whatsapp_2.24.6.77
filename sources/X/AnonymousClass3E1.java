package X;

/* renamed from: X.3E1  reason: invalid class name */
public class AnonymousClass3E1 {
    public final int A00;
    public final C604037s A01;
    public final String A02;
    public final String A03;

    public AnonymousClass3E1(C604037s r1, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CollectionError{code=");
        A0u.append(this.A00);
        A0u.append(", text='");
        A0u.append(this.A03);
        A0u.append(", collection='");
        A0u.append(this.A02);
        return AnonymousClass000.A0s(A0u);
    }
}
