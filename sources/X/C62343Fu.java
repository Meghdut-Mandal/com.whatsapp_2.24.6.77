package X;

/* renamed from: X.3Fu  reason: invalid class name and case insensitive filesystem */
public class C62343Fu {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C62343Fu r5 = (C62343Fu) obj;
            if (this.A00 != r5.A00 || !C1901797e.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C62343Fu(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A00);
        return AnonymousClass000.A0L(this.A01, A0M);
    }
}
