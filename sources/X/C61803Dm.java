package X;

import java.util.List;

/* renamed from: X.3Dm  reason: invalid class name and case insensitive filesystem */
public final class C61803Dm {
    public int A00;
    public final String A01;
    public final List A02 = AnonymousClass001.A0I();

    public final String A00() {
        List list = this.A02;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder A0v = AnonymousClass000.A0v((String) C007103b.A0L(list));
        A0v.append(", throttled=");
        return C36381kD.A10(A0v, this.A00);
    }

    public C61803Dm(String str) {
        this.A01 = str;
    }
}
